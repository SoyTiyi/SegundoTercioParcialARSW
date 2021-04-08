package co.edu.eci.arsw.ParcialSegundoCorte.Model;

import java.io.Serializable;

public class City implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Coord coord;
    private Weather weather;
    private String base;
    private Main main;
    private int visibility;
    private Wind wind;
    private Cloud cloud;
    private int dt;
    private Sys sys;
    private int timezone;
    private int id;
    private String name;
    private int cod;

    public City(Coord coord, Weather weather, String base,
    Main main, int visibility, Wind wind, Cloud cloud,
    int dt, Sys sys, int timezone, int id, String name, int cod){
        this.setCoord(coord);
        this.setWeather(weather);
        this.setBase(base);
        this.setMain(main);
        this.setVisibility(visibility);
        this.setWind(wind);
        this.setCloud(cloud);
        this.setDt(dt);
        this.setSys(sys);
        this.setTimezone(timezone);
        this.setId(id);
        this.setName(name);
        this.setCod(cod);
    }

    public City(){
        
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTimezone() {
        return timezone;
    }

    public void setTimezone(int timezone) {
        this.timezone = timezone;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public Cloud getCloud() {
        return cloud;
    }

    public void setCloud(Cloud cloud) {
        this.cloud = cloud;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }



}
