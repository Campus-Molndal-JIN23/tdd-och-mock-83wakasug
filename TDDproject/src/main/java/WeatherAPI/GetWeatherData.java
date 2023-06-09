package WeatherAPI;

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
    public GetWeatherData(String weather, double wind, int clouds, String country, String city,int humidity) {
     this.weather = weather;
     this.wind = wind;
     this.clouds = clouds;
     this.country = country;
     this.city = city;
     this.humidity = humidity;

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
        var humidity = obj.getJSONObject("main");
        JSONObject weather2 = weather.getJSONObject(0);
        GetWeatherData weatherdata = new GetWeatherData(
                weather2.getString("main"),
                wind.getDouble("speed"),
                clouds.getInt("all"),
                sys.getString("country"),
                obj.getString("name"),
                humidity.getInt("humidity"));

        return weatherdata;
    }



}
