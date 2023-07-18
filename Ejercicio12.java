/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, 
validando que el primer numero múltiplo del segundo y e imprima si el primer numero 
es múltiplo del segundo, sino informe que no lo son.
 */
package ejercicio.pkg12;

//@author Lapasta

import java.util.Scanner;


public class Ejercicio12 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
     int num1;
     int num2;
     
        System.out.println("Decime el primer numero");
        num1=leer.nextInt();
        
        System.out.println("Decime el segundo numero");
        num2=leer.nextInt();
    
        esMultiplo(num1, num2);
    }
    
    public static void esMultiplo(int num1, int num2){
  
    if (num2%num1==0){
        System.out.println("Son multiplos");
    } else {
     System.out.println("No son multiplos");
    }
    }
}
