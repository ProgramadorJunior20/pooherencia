package co.jmurillo.ejemplo;

import co.jmurillo.pooherencia.*;

public class EjemploHerenciaConstructores {
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
        System.out.println("Imprimiendo datos en común del tipo persona");
        System.out.println("Nombre: " + persona.getNombre()
                + ", apellido: " + persona.getApellido()
                + ", edad: " + persona.getEdad()
                + ", email: " + persona.getEmail());
        if(persona instanceof Alumno){
            System.out.println("Imprimiendo los datos del tipo Alumno: ");
            System.out.println("Institución: " + ((Alumno) persona).getInstitucion()); // Hacemos un cast de alumno
            System.out.println("Nota Matemáticas: " + ((Alumno) persona).getNotaMatematica());
            System.out.println("Nota Historia: " + ((Alumno) persona).getNotaHistoria());
            System.out.println("Nota Castellano: " + ((Alumno) persona).getNotaCastellano());

            // Vamos a anidar otra instacia dentro de esta
            if(persona instanceof AlumnoInternacional){
                System.out.println("Imprimiendo los datos del tipo AlumnoInternacional: ");
                System.out.println("Nota Idioma: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());
            }
        }
        if(persona instanceof Profesor){
            System.out.println("Imprimiendo los datos del tipo profesor: ");
            //System.out.println("Nombre: " + persona.getNombre());
            //System.out.println("Apellido: " + persona.getApellido());
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
        }
        System.out.println("==========================================");
    }
}
