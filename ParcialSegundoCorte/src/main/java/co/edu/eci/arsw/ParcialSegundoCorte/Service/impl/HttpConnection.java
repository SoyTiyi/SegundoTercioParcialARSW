package co.edu.eci.arsw.ParcialSegundoCorte.Service.impl;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import co.edu.eci.arsw.ParcialSegundoCorte.Service.IHttpConnection;
import co.edu.eci.arsw.ParcialSegundoCorte.Service.WeatherException;

@Service
public class HttpConnection implements IHttpConnection{

    @Override
    public JSONObject getWeatherByCity(String city) throws WeatherException {
        try {
            HttpResponse<String> request = Unirest.get("http://api.openweathermap.org/data/2.5/weather?q="+city+"&appid=e09c070df3b6eed4ea42bcb1c548f062").asString();
            return new JSONObject(request.getBody());
        } catch (Exception e) {
            throw new WeatherException("Error to make request to the API");
        }
        
    }
    
}
