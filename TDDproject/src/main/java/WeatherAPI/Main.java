package WeatherAPI;

import WeatherAPI.WeatherAPI;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {

        WeatherAPI api = new WeatherAPI();
        WeatherServiceFacade weather = new WeatherServiceFacade(api);
        GetWeatherData get = weather.showData();
        System.out.println(get.city);
    }
}

