/*
13. Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
programa para organizar la información de cada curso. Para ello, crearemos una clase
entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno. A continuación, se implementarán los siguientes métodos:

 Un constructor por defecto.

 Un constructor con todos los atributos como parámetro.

 Métodos getters y setters de cada atributo.

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
package poo_ejercicio_13;

import Entidades.Curso;
import Servicios.CursoServicio;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Lapasta
 */
public class POO_ejercicio_13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CursoServicio servicio = new CursoServicio();

        boolean flag = false;
        ArrayList<Curso> arreglo = new ArrayList<>();
        int i = 0;
        int k = 0;

        do {
            System.out.println("------------------------------------------------------------------");
            System.out.println("Bienvenido a un nuevo curso! Te pediremos los datos a continuación");
            System.out.println("------------------------------------------------------------------");
            System.out.println(""); // salto de linea 

            arreglo.add(servicio.crearCurso());

            System.out.println("Los datos del curso son: ");
            System.out.println(arreglo.get(i).toString());
            System.out.println("Los alumnos de este curso son: ");
            servicio.mostrarAlumnos(arreglo.get(i));
            System.out.println("Las ganancia total por semana es: " + servicio.calcularGananciaSemana(arreglo.get(i)));

            System.out.println(""); // salto de linea 

            System.out.println("Quiere cargar otro curso? 1-Si 2-No");
            k = leer.nextInt();

            if (k == 1) {
                flag = true;
            } else if (k == 2) {
                flag = false;
            } else {
                System.out.println("Respuesta no válida");
                flag = false;
            }
            i++;

        } while (flag);

    }

}
