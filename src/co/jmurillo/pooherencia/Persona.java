package co.jmurillo.pooherencia;

public class Persona {
    //Atributos para cualquier subclase que herede de Persona()
    private String nombre;
    private String apellido;
    private int edad;
    private String email;

    // Inicializando constructor vacio de la clase persona
    public Persona() {
        System.out.println("Persona: Inicializando constructor...");
    }

    // Inicializamos un constructor con parametros
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String nombre, String apellido, int edad){
        this(nombre, apellido);
        this.edad = edad;
    }

    // Métodos de control Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
