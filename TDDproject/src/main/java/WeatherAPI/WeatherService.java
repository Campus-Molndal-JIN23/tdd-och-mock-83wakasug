package WeatherAPI;

import java.io.IOException;

public class WeatherService {
    WeatherAPI api;
    public WeatherService(WeatherAPI api){
        this.api = api;
    }

    public String getData() throws IOException {
        return api.getData();
    }


}
