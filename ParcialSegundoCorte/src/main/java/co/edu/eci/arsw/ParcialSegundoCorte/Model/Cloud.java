package co.edu.eci.arsw.ParcialSegundoCorte.Model;

import java.io.Serializable;

public class Cloud implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private int all;

    public Cloud(int all){
        this.all = all;
    }

    public Cloud(){
        
    }

    public int getAll(){
        return all;
    }

    public void setAll(int all){
        this.all = all;
    }
}
