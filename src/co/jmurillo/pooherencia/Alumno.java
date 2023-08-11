package co.jmurillo.pooherencia;

public class Alumno extends Persona{
    //Atributos de la clase Alumno
    private String institucion;
    private double notaMatematica;
    private double notaCastellano;
    private double notaHistoria;

    // Inicializando constructor vacio
    public Alumno() {
        System.out.println("Alumno: Inicializando constructor...");
    }

    // Sobrecarga de constructores
    public Alumno(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Alumno(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad, String institucion){
        super(nombre, apellido, edad);
        this.institucion = institucion;
    }

    public Alumno(String nombre, String apellido, int edad,
                  String institucion, double notaMatematica,
                  double notaCastellano, double notaHistoria) {
        this(nombre, apellido, edad, institucion);
        this.notaMatematica = notaMatematica;
        this.notaCastellano = notaCastellano;
        this.notaHistoria = notaHistoria;
    }

    // Métodos de control Getters and Setters
    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaCastellano() {
        return notaCastellano;
    }

    public void setNotaCastellano(double notaCastellano) {
        this.notaCastellano = notaCastellano;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    @Override
    public String saludar() {
        String saludar = super.saludar();
        return saludar + " soy un alumno y mi nombre es " + getNombre();
    }

    public double calcularPromedio() {
        System.out.println("calcularPromedio " + this.getClass().getCanonicalName());
        return (notaMatematica + notaCastellano + notaHistoria) / 3;
    }
}
