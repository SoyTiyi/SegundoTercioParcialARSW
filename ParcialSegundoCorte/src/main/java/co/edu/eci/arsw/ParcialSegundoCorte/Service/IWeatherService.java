package co.edu.eci.arsw.ParcialSegundoCorte.Service;

import java.io.IOException;

import com.mashape.unirest.http.exceptions.UnirestException;

import co.edu.eci.arsw.ParcialSegundoCorte.Model.City;


public interface IWeatherService {
    City getWeatherByCity(String city) throws WeatherException, UnirestException, IOException;
}
