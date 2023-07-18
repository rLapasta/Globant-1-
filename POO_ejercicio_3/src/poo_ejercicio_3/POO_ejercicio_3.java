/*
3. Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
package poo_ejercicio_3;

import Entidades.Operacion;
import Servicios.OperacionServicio;
import java.util.Scanner;

/**
 *
 * @author Lapasta
 */
public class POO_ejercicio_3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        OperacionServicio servicio = new OperacionServicio();

        Operacion operacion1 = servicio.crearOperacion();
        
        int flag = 1;

        do {
            System.out.println("Qué operación desea realizar? 1-Sumar 2-Restar 3-Multiplicar 4-Dividir");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(servicio.Sumar(operacion1));
                    System.out.println("Desea realizar otra operación? 1-Si 2-No");
                    flag = leer.nextInt();
                    break;
                case 2:
                    System.out.println(servicio.Restar(operacion1));
                    System.out.println("Desea realizar otra operación? 1-Si 2-No");
                    flag = leer.nextInt();
                    break;
                case 3:
                    System.out.println(servicio.Multiplicar(operacion1));
                    System.out.println("Desea realizar otra operación? 1-Si 2-No");
                    flag = leer.nextInt();
                    break;
                case 4:
                    System.out.println(servicio.Dividir(operacion1));
                    System.out.println("Desea realizar otra operación? 1-Si 2-No");
                    flag = leer.nextInt();
                    break;
                default:
                    System.out.println("La opción seleccionada no es correcta");
            }
        } while (flag == 1);
    }

}
