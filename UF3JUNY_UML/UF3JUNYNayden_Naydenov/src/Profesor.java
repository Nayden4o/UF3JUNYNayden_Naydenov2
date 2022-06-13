public class Profesor extends Persona {

    private String departament;

    private String cargo;


    public Profesor(String departament, String cargo, String nombre, String apellidos, String email) {
        super(nombre, apellidos, email);
        this.departament = departament;
        this.cargo = cargo;
    }

    public String getDepartament() {
        return departament;
    }

    public String getCargo() {
        return cargo;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Profesor{" + "departament=" + departament + ", cargo=" + cargo + '}';
    }
    
    

}
