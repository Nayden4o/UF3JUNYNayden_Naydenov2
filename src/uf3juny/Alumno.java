package uf3juny;

public class Alumno extends Persona {

    private String fechaNacimiento;

    private String codigoCiclo;

    public Alumno(String fechaNacimiento, String codigoCiclo, String nombre, String apellidos, String email) {
        super(nombre, apellidos, email);
        this.fechaNacimiento = fechaNacimiento;
        this.codigoCiclo = codigoCiclo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getCodigoCiclo() {
        return codigoCiclo;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setCodigoCiclo(String codigoCiclo) {
        this.codigoCiclo = codigoCiclo;
    }

    @Override
    public String toString() {
        return "Alumno{" + "fechaNacimiento=" + fechaNacimiento + ", codigoCiclo=" + codigoCiclo + '}';
    }
    
    


    
    
    
}
