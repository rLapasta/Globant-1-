
package Servicios;

import Entidades.Operacion;
import java.util.Scanner;

public class OperacionServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //------------------------------------------------------Crear
    public Operacion crearOperacion() {

        System.out.println("Decime el numero 1");
        int numero1 = leer.nextInt();

        System.out.println("Decime el numero 2");
        int numero2 = leer.nextInt();

        return new Operacion(numero1, numero2);
    }

    //------------------------------------------------------Sumar
    public int Sumar(Operacion x) {
        int num1 = x.getNumero1();
        int num2 = x.getNumero2();

        return num1 + num2;

    }
    
        //------------------------------------------------------Restar
    public int Restar(Operacion x) {
        int num1 = x.getNumero1();
        int num2 = x.getNumero2();

        return num1 - num2;

    }


    //------------------------------------------------------Multiplicar
    public int Multiplicar(Operacion x) {

        if (x.getNumero1() == 0 || x.getNumero2() == 0) {
            System.out.println("Error. Uno de los numeros es 0");
            return 0;
        } else {

            return x.getNumero1() * x.getNumero2();
        }
    }
    
    //------------------------------------------------------Dividir 
    public int Dividir(Operacion x) {

        if (x.getNumero1() == 0 || x.getNumero2() == 0) {
            System.out.println("Error. Uno de los numeros es 0");
            return 0;
        } else {

            return x.getNumero1()/x.getNumero2();
        }
    }
}
