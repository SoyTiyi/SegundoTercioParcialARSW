package co.edu.eci.arsw.ParcialSegundoCorte.Model;

import java.io.Serializable;

public class Main implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private double temp;
    private double feelsLike;
    private double tempMin;
    private double tempMax;
    private int pressure;
    private int humidity;

    public Main(double temp, double feels_like, double temp_min, double temp_max, int pressure, int humidity){
        this.temp = temp;
        this.feelsLike = feels_like;
        this.tempMin = temp_min;
        this.tempMax = temp_max;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public Main(){
        
    }

    public double getTemp(){
        return temp;
    }

    public void setTemp(double temp){
        this.temp = temp;
    }

    public double getFeelsLike(){
        return feelsLike;
    }

    public void setFeelsLike(double feelsLike){
        this.feelsLike = feelsLike;
    }

    public double getTempMin(){
        return tempMin;
    }

    public void setTempMin(double tempMin){
        this.tempMin = tempMin;
    }

    public double getTempMax(){
        return tempMax;
    }

    public void setTempMax(double tempMax){
        this.tempMax = tempMax;
    }

    public int getPressure(){
        return pressure;
    }

    public void setPressure(int pressure){
        this.pressure = pressure;
    }

    public int getHumidity(){
        return humidity;
    }

    public void setHumidity(int humidity){
        this.humidity = humidity;
    }
}


