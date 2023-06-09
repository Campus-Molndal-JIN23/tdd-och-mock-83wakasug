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

/**
 *  test class for the WeatherServiceFacade class.
 */

public class WeatherServiceTest {
    private WeatherServiceFacade weatherServiceFacade;
    private WeatherAPI mockWeatherAPI;
    private GetWeatherData getWeatherDataMock;
    private String mockResponse;



    /**
     * Set up the test environment before each test case.
     * @throws IOException if an error occurs
     */

    @BeforeEach
    void setUP() throws IOException {

        //Mock WeatherService
        //getWeatherDataMock = Mockito.mock(GetWeatherData.class);
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

    /**
     * Test case to verify that the WeatherServiceFacade object is not null.
     */
    @Test
    public void testWeatherServiceFacadeNotNull(){
        assertNotNull(weatherServiceFacade, "WeatherServiceFacade is null");
    }

    /**
     * Test case to get the weather information
     */
    @Test
    public void testGetWeather(){

        String expected = "Clouds";
        String actual = weatherServiceFacade.getWeather();
        assertEquals(expected,actual);

    }
    /**
     * Test case to get the wind information.
     */
    @Test
    public void testGetWind(){

        double expected = 5.14;
        double actual = weatherServiceFacade.getWind();
        assertEquals(expected,actual);

    }

    /**
     * Test case to get the humidity information.
     */
    @Test
    public void testGetHumidity(){

        int expected = 67;
        int actual = weatherServiceFacade.getHumidity();
        assertEquals(expected,actual);

    }

    /**
     * Test case to get the cloud information.
     */

    @Test
    public void testGetClouds(){

        int expected = 90;
        int actual = weatherServiceFacade.getClouds();
        assertEquals(expected,actual);

    }
    /**
     * Test case to get the City information.
     */
    @Test
    public void testGetCity(){

        String expected = "Gothenburg";
       String actual = weatherServiceFacade.getCity();
        assertEquals(expected,actual);

    }

    /**
     * Test case to get the Country information.
     */
    @Test
    public void  testGetCountry(){
        String expected = "SE";
        String actual = weatherServiceFacade.getCountry();
        assertEquals(expected,actual);
        
    }


}
