/*
 método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.

 Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos

 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
 */
package Servicios;

import Entidades.Curso;
import java.util.Scanner;

public class CursoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //-------------------------------------------------------- Cargar Alumnos
    public String[] cargarAlumnos() {
        String[] alumnos = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Decime el nombre del alumno " + (i + 1));
            String nombreAlumno = leer.next();
            alumnos[i] = nombreAlumno;
        }

        return alumnos;
    }

    //-------------------------------------------------------- Mostrar Alumnos 
    public void mostrarAlumnos(Curso x) {
        
        for (int i = 0; i < 5; i++) {
            System.out.println(x.getAlumnos()[i]);
        }
    }

    //-------------------------------------------------------- Crear Curso
    public Curso crearCurso() {
        System.out.println("Nombre del curso");
        String nombreCurso = leer.next();

        System.out.println("Cantidad de horas por día");
        int cantidadHorasPorDia = leer.nextInt();

        System.out.println("cantidad de días por semana");
        int cantidadDiasPorSemana = leer.nextInt();

        System.out.println("turno");
        String turno = leer.next();

        System.out.println("Precio por hora");
        int precioPorHora = leer.nextInt();

        String[] vector = cargarAlumnos();

        return new Curso(nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno, precioPorHora, vector);

    }

    //-------------------------------------------------------- Calcular Ganancia Semana
    public int calcularGananciaSemana(Curso x) {
        String[] alumnos = new String[5];

        int gananciaTotal = x.getPrecioPorHora() * x.getCantidadHorasPorDia() * x.getCantidadDiasPorSemana() * x.getAlumnos().length;

        return gananciaTotal;
    }

}
