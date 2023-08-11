package co.jmurillo.ejemplo;

import co.jmurillo.pooherencia.Alumno;
import co.jmurillo.pooherencia.AlumnoInternacional;
import co.jmurillo.pooherencia.Persona;
import co.jmurillo.pooherencia.Profesor;

public class EjemploHerenciaToString {
    public static void main(String[] args) {

        System.out.println("======== Creando la instancia de la clase Alumno ========");
        Alumno alumno = new Alumno("Jefferson", "Murillo", 23, "Udemy");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(4.5);
        alumno.setNotaMatematica(5.5);
        alumno.setEmail("murillo@email.com");

        System.out.println("======== Creando la instancia de la clase AlumnoInternacional ========");
        AlumnoInternacional alumnoInter = new AlumnoInternacional("Michael", "B Jordan", "Ghana");
        alumnoInter.setEdad(23);
        alumnoInter.setInstitucion("Instituto Colombiano De Arte y Tecnología");
        alumnoInter.setNotaIdiomas(6.8);
        alumnoInter.setNotaCastellano(6.5);
        alumnoInter.setNotaHistoria(5.8);
        alumnoInter.setNotaMatematica(8.0);
        alumnoInter.setEmail("Bjordan@email.com");

        System.out.println("======== Creando la instancia de la clase Profesor ========");
        Profesor profesor = new Profesor("Andres", "Guzman", "Matemáticas");
        profesor.setEdad(37);
        profesor.setEmail("profesor.andres@email.com");

        System.out.println("======== - ========");
        imprimir(alumno);
        imprimir(alumnoInter);
        imprimir(profesor);

    }

    public static void imprimir(Persona persona){
        System.out.println("=========================================");
        System.out.println(persona);
    }
}
