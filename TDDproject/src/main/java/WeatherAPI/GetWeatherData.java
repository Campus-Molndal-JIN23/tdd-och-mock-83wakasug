package WeatherAPI;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;

import java.io.IOException;

public class GetWeatherData {

String weather;
    int humidity;
    double wind;
    int clouds;
    String city;
    String country;

    public GetWeatherData() {
    }
    public GetWeatherData(String weather, double wind, int clouds, String country, String city) {
     this.weather = weather;
     this.wind = wind;
     this.clouds = clouds;
     this.country = country;
     this.city = city;

    }


    public String getWeather() {
        return weather;
    }

    public int getHumidity() {
        return humidity;
    }

    public double getWind() {
        return wind;
    }

    public int getClouds() {
        return clouds;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public GetWeatherData fromJson (String json){
        //System.out.println("object"+json);
        var obj = new JSONObject(json);
        var weather = obj.getJSONArray("weather");
        var wind = obj.getJSONObject("wind");
        var clouds = obj.getJSONObject("clouds");
        var sys = obj.getJSONObject("sys");
        JSONObject weather2 = weather.getJSONObject(0);
        GetWeatherData weatherdata = new GetWeatherData(
                weather2.getString("main"),
                wind.getInt("speed"),
                clouds.getInt("all"),
                sys.getString("country"),
                obj.getString("name"));

        return weatherdata;
    }



}
