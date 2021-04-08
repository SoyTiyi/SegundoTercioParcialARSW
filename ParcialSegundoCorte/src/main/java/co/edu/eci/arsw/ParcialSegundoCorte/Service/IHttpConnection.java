package co.edu.eci.arsw.ParcialSegundoCorte.Service;

import org.json.JSONObject;

public interface IHttpConnection {
    JSONObject getWeatherByCity(String city) throws WeatherException;
}
