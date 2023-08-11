package co.jmurillo.pooherencia;

public class AlumnoInternacional extends Alumno{
    //Atributos de la clase Alumno
    private String pais;
    private double notaIdiomas;

    // Inicializando constructor vacio
    public AlumnoInternacional () {
        System.out.println("AlumnoInter: Inicializando constructor...");
    }

    // Sobrecarga de constructores
    public AlumnoInternacional(String nombre, String apellido){
        super(nombre, apellido);
    }

    public AlumnoInternacional(String nombre, String apellido, String pais){
        this(nombre, apellido);
        this.pais = pais;
    }

    // Métodos de control Getters and Setters
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    @Override
    public String saludar() {
        return super.saludar() + ", soy un alumno extranjero del país " + getPais();
    }

    @Override
    public double calcularPromedio() {
        //System.out.println("calcularPromedio " + AlumnoInternacional.class.getCanonicalName());
        return ((super.calcularPromedio()*3) + notaIdiomas) / 4;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\npais='" + pais + '\'' +
                ", notaIdiomas=" + notaIdiomas;
    }
}
