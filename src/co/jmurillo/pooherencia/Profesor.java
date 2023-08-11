package co.jmurillo.pooherencia;

public class Profesor extends Persona{
    //Atributos de la clase Alumno
    private String asignatura;

    // Inicializando constructor vacio
    public Profesor() {
        System.out.println("Profesor: Inicializando constructor....");
    }

    // Sobrecarga de constructores
    public Profesor(String nombre, String apellido){
        super(nombre, apellido);
    }

    public Profesor(String nombre, String apellido, String asignatura){
        this(nombre, apellido);
        this.asignatura = asignatura;
    }

    // Métodos de control Getters and Setters
    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String saludar() { // Sobre escritura de métodos en la herencia
        return "Hola buenos dias, soy el profesor de "
                + getAsignatura() + ", y mi nombre es "
                + getNombre();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nasignatura='" + asignatura;
    }
}
