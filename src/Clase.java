
import java.util.ArrayList;

public class Clase {

    private String nombre;

    private int capacidadAlumnos;

    private int numOrdenadores;

    private ArrayList alumnos;

    private Object profesor;

    public Clase() {
    }

    public Clase(String nombre, int capacidadAlumnos, ArrayList alumnos, Object profesor) {
        this.nombre = nombre;
        this.capacidadAlumnos = capacidadAlumnos;
        this.alumnos = alumnos;
        this.profesor = profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidadAlumnos() {
        return capacidadAlumnos;
    }

    public int getNumOrdenadores() {
        return numOrdenadores;
    }

    public ArrayList getAlumnos() {
        return alumnos;
    }

    public Object getProfesor() {
        return profesor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        
    }

    public void setCapacidadAlumnos(int capacidadAlumnos) {
        this.capacidadAlumnos = capacidadAlumnos;
    }

    public void setNumOrdenadores(int numOrdenadores) {
        this.numOrdenadores = numOrdenadores;
    }

    public void setAlumnos(ArrayList alumnos) {
        this.alumnos = alumnos;
    }

    public void setProfesor(Object profesor) {
        this.profesor = profesor;
    }
    
    

    public void ordeandoresAlumnos() {
           
    }

    @Override
    public String toString() {
        return "Clases{" + "nombre=" + nombre + ", capacidadAlumnos=" + capacidadAlumnos + ", numOrdenadores=" + numOrdenadores + ", alumnos=" + alumnos + ", profesor=" + profesor + '}';
    }
    
    
}
