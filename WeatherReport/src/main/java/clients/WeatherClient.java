package clients;

import models.Weather;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

public class WeatherClient {

    public Weather get(CityWeatherURL cityWeatherURL){
        return ClientBuilder.newClient().target(cityWeatherURL.getURL()).request(MediaType.APPLICATION_JSON).get().readEntity(Weather.class);
    }

}
