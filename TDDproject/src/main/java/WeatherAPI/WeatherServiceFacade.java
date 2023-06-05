package WeatherAPI;

import java.io.IOException;

public class WeatherServiceFacade {
    WeatherAPI api;
    GetWeatherData getWeatherData;
    public WeatherServiceFacade(WeatherAPI api) throws IOException {
        this.api = api;
        showData();
    }

   public GetWeatherData showData() throws IOException {
        getWeatherData = new GetWeatherData();
        getWeatherData= getWeatherData.fromJson(api.getData());
        return getWeatherData;
    }

    public String getWeather(){
        return getWeatherData.getWeather();
    }

    public double getWind(){
        return getWeatherData.getWind();
    }

    public int getHumidity(){
         return getWeatherData.getHumidity();
    }

    public int getClouds(){
        return getWeatherData.getClouds();
    }

    public String getCity(){
        return getWeatherData.getCity();
    }

    public String getCountry(){
        return getCountry();
    }

}
