package co.edu.eci.arsw.ParcialSegundoCorte.Model;

import java.io.Serializable;

public class Coord implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private double lon;
    private double lat;

    public Coord(double lon, double lat){
        this.lon = lon;
        this.lat = lat;
    }

    public double getLat(){
        return lat;
    }

    public void setLat(double lat){
        this.lat = lat;
    }

    public double getLon(){
        return lon;
    }

    public void setLon(double lon){
        this.lon = lon;
    }
}
