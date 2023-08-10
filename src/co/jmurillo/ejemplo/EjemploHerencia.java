package co.jmurillo.ejemplo;

import co.jmurillo.pooherencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {

        System.out.println("======== Creando la instancia de la clase Alumno ========");
        Alumno alumno = new Alumno();
        alumno.setNombre("Jefferson");
        alumno.setApellido("Murillo");
        alumno.setInstitucion("Udemy");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(4.5);
        alumno.setNotaMatematica(5.5);

        System.out.println("======== Creando la instancia de la clase AlumnoInternacional ========");
        AlumnoInternacional alumnoInter = new AlumnoInternacional();
        alumnoInter.setNombre("Michael");
        alumnoInter.setApellido("B Jordan");
        alumnoInter.setPais("Francia");
        alumnoInter.setEdad(23);
        alumnoInter.setInstitucion("Instituto Colombiano De Arte y Tecnología");
        alumnoInter.setNotaIdiomas(6.8);
        alumnoInter.setNotaCastellano(6.5);
        alumnoInter.setNotaHistoria(5.8);
        alumnoInter.setNotaMatematica(8.0);

        System.out.println("======== Creando la instancia de la clase Profesor ========");
        Profesor profesor = new Profesor();
        profesor.setNombre("Andres");
        profesor.setApellido("Guzman");
        profesor.setAsignatura("Matemáticas");


        System.out.println("======== - ========");
        System.out.println("Alumno: " + alumno.getNombre() + " " + alumno.getApellido());
        System.out.println("Alumno Internacional: " + alumnoInter.getNombre()
                + " " + alumnoInter.getApellido()
                + " " + alumnoInter.getInstitucion()
                + " " + alumnoInter.getPais());

        System.out.println("Profesor " + profesor.getAsignatura()
                + ": " + profesor.getNombre()
                + " " + profesor.getApellido());

        //Mostrar todo la información de una clase
        Class clase = alumnoInter.getClass();
        while (clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();

            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }

    }
}
