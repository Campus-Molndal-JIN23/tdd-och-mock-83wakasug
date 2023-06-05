package Test;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;

import WeatherAPI.GetWeatherData;
import WeatherAPI.WeatherAPI;
import WeatherAPI.WeatherServiceFacade;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;



public class WeatherServiceTest {
    private WeatherServiceFacade weatherServiceFacade;
    private GetWeatherData getWeatherDataMock;
    private WeatherAPI mockWeatherAPI;
    private String mockResponse;


    @BeforeEach
    void setUP() throws IOException {

        //Mock WeatherService

        getWeatherDataMock = Mockito.mock(GetWeatherData.class);
        mockWeatherAPI = Mockito.mock(WeatherAPI.class);


        //Mock API response

        mockResponse = "{\n" +
                "  \"coord\": {\n" +
                "    \"lon\": 11.97,\n" +
                "    \"lat\": 57.71\n" +
                "  },\n" +
                "  \"weather\": [\n" +
                "    {\n" +
                "      \"id\": 804,\n" +
                "      \"main\": \"Clouds\",\n" +
                "      \"description\": \"overcast clouds\",\n" +
                "      \"icon\": \"04d\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"base\": \"stations\",\n" +
                "  \"main\": {\n" +
                "    \"temp\": 20.59,\n" +
                "    \"feels_like\": 20.13,\n" +
                "    \"temp_min\": 18.89,\n" +
                "    \"temp_max\": 21.74,\n" +
                "    \"pressure\": 1013,\n" +
                "    \"humidity\": 67\n" +
                "  },\n" +
                "  \"visibility\": 10000,\n" +
                "  \"wind\": {\n" +
                "    \"speed\": 5.14,\n" +
                "    \"deg\": 210,\n" +
                "    \"gust\": 7.2\n" +
                "  },\n" +
                "  \"clouds\": {\n" +
                "    \"all\": 90\n" +
                "  },\n" +
                "  \"dt\": 1599478913,\n" +
                "  \"sys\": {\n" +
                "    \"type\": 1,\n" +
                "    \"id\": 1752,\n" +
                "    \"country\": \"SE\",\n" +
                "    \"sunrise\": 1599457990,\n" +
                "    \"sunset\": 1599510755\n" +
                "  },\n" +
                "  \"timezone\": 7200,\n" +
                "  \"id\": 2711537,\n" +
                "  \"name\": \"Gothenburg\",\n" +
                "  \"cod\": 200\n" +
                "} ";
        when(mockWeatherAPI.getData()).thenReturn(mockResponse);
        weatherServiceFacade = new WeatherServiceFacade(mockWeatherAPI);

    }

    @Test
    public void getWeather(){
        assertNotNull(weatherServiceFacade, "WeatherServiceFacade is null");
        String expected = "Clouds";
        String actual = weatherServiceFacade.getWeather();
        assertEquals(expected,actual);

    }

}
