package uf3juny;


import java.util.ArrayList;

public class Instituto {

    private String nombre;

    private ArrayList clases;

    public Instituto(String nombre, ArrayList clases) {
        this.nombre = nombre;
        this.clases = clases;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList getClases() {
        return clases;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClases(ArrayList clases) {
        this.clases = clases;
    }

    @Override
    public String toString() {
        return "Instituto{" + "nombre=" + nombre + ", clases=" + clases + '}';
    }
    
}
