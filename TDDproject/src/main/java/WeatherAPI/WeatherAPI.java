package WeatherAPI;

import javax.print.DocFlavor;
import java.net.HttpURLConnection;
import java.io.IOException;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.net.URL;


public class WeatherAPI {
    final String apiKey="078b6a44477c3731ef8f22b87cd35f26";
    String requesturl="http://api.openweathermap.org/geo/1.0/direct?q=Tokyo,jp&limit=5&appid=078b6a44477c3731ef8f22b87cd35f26";
    String urlWeather;
    URL url;
    HttpURLConnection con;
    int reseponseCode;
    StringBuilder response;
    InputStreamReader isr;
    BufferedReader br;
    String inputLine = null;
    String APIkey;

     public  WeatherAPI () throws IOException {
         urlWeather ="https://api.openweathermap.org/data/2.5/weather?lat=35.709674&lon=139.454224&"+APIkey;
         url = new URL(urlWeather);
         con= (HttpURLConnection) url.openConnection();
         con.setRequestMethod("GET");
         con.connect(); }

    public String getData() throws IOException {
        reseponseCode = con.getResponseCode();

        if(reseponseCode == HttpURLConnection.HTTP_OK){
            isr = new InputStreamReader(con.getInputStream());
            br = new BufferedReader(isr);
            response= new StringBuilder();

            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine);
            }
        }
        else{
            System.out.println("false");
        }
        String data = String.valueOf(new StringBuilder(response));
        return data;
    }




}
