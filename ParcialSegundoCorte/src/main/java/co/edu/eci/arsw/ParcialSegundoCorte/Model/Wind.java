package co.edu.eci.arsw.ParcialSegundoCorte.Model;

import java.io.Serializable;

public class Wind implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private double speed;
    private int deg;

    public Wind(double speed, int deg) {
        this.speed = speed;
        this.deg = deg;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getDeg() {
        return deg;
    }

    public void setDeg(int deg) {
        this.deg = deg;
    }
}
