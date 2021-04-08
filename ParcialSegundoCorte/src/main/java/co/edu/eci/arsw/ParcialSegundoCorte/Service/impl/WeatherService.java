package co.edu.eci.arsw.ParcialSegundoCorte.Service.impl;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.exceptions.UnirestException;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.eci.arsw.ParcialSegundoCorte.Model.City;
import co.edu.eci.arsw.ParcialSegundoCorte.Model.Cloud;
import co.edu.eci.arsw.ParcialSegundoCorte.Model.Coord;
import co.edu.eci.arsw.ParcialSegundoCorte.Model.Main;
import co.edu.eci.arsw.ParcialSegundoCorte.Model.Sys;
import co.edu.eci.arsw.ParcialSegundoCorte.Model.Weather;
import co.edu.eci.arsw.ParcialSegundoCorte.Model.Wind;
import co.edu.eci.arsw.ParcialSegundoCorte.Service.IHttpConnection;
import co.edu.eci.arsw.ParcialSegundoCorte.Service.IWeatherService;
import co.edu.eci.arsw.ParcialSegundoCorte.Service.WeatherException;


@Service
public class WeatherService implements IWeatherService{

    @Autowired
    IHttpConnection hc;

    @Override
    public City getWeatherByCity(String city) throws WeatherException, UnirestException, IOException{
        JSONObject cityJson = hc.getWeatherByCity(city);
        ObjectMapper parse = new ObjectMapper();

        JSONObject coordJson = cityJson.getJSONObject("coord");
        Coord coord = parse.readValue(coordJson.toString(), Coord.class);
        JSONObject weatherJson = cityJson.getJSONArray("weather").getJSONObject(0);
        Weather weather = parse.readValue(weatherJson.toString(), Weather.class);
        String base = cityJson.getString("base");
        JSONObject mainJson = cityJson.getJSONObject("main");
        Main main = parse.readValue(mainJson.toString(), Main.class);
        int visibility = cityJson.getInt("visibility");
        JSONObject windJson = cityJson.getJSONObject("wind");
        Wind wind = parse.readValue(windJson.toString(), Wind.class);
        JSONObject cloudJson = cityJson.getJSONObject("clouds");
        Cloud cloud = parse.readValue(cloudJson.toString(), Cloud.class);
        int dt = cityJson.getInt("dt");
        JSONObject sysJson = cityJson.getJSONObject("sys");
        Sys sys = parse.readValue(sysJson.toString(), Sys.class);
        int timezone = cityJson.getInt("timezone");
        int id = cityJson.getInt("id");
        String name = cityJson.getString("name");
        int cod = cityJson.getInt("cod");

        return new City(coord,weather,base,main,visibility,wind,cloud,dt,sys,timezone,id,name,cod);
    }
}
