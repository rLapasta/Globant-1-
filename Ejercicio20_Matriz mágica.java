/*
20. Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package ejercicio.pkg20;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio20 {


    
public static void main(String[] args) { 
     
Scanner leer = new Scanner(System.in); 

int[][] matriz = new int[3][3]; 
llenarArray(matriz); 

mostrarMatriz(matriz); 

System.out.println("La suma de sus filas son iguales? : ");
    System.out.println(compruebaFilas(matriz)); 
System.out.println("La suma de sus columnas son iguales? : ");
    System.out.println(compruebaColumnas(matriz));
System.out.println("La suma de sus diagonales es igual? : ");
    System.out.println(compruebaDiagonales(matriz));
   
     System.out.println(" ");
    
if (compruebaDiagonales(matriz) & compruebaColumnas(matriz) & compruebaFilas(matriz)){
    System.out.println("La matriz es mágica!");
} else {
    System.out.println("La matriz NO es mágica :(");
}
    
} 
 
 
 //----------------------------------------------------------Llenar Matriz
 public static void llenarArray(int[][] array) { 
     Scanner leer = new Scanner(System.in); 
     for (int i = 0; i < 3; i++) { 
         for (int j = 0; j < 3; j++) { 
             do { System.out.println("Ingrese el valor de la fila " + i + " , columna " + j + "(de 1 a 9)"); 
             array[i][j] = leer.nextInt(); 
             if (array[i][j] < 1 || array[i][j] > 9) { 
                 System.out.println("Ingresó un número inválido"); 
             } 
             } 
             while (array[i][j] < 1 || array[i][j] > 9); 
         } 
     } 
 } 

  //----------------------------------------------------------Mostrar Matriz
public static void mostrarMatriz(int[][] array) { 
    for (int i = 0; i < 3; i++) { 
        for (int j = 0; j < 3; j++) { 
            System.out.print("[ " + array[i][j] + " ] "); 
        } 
            System.out.println(""); 
    } 
} 

 //----------------------------------------------------------Comprobar Filas
public static boolean compruebaFilas(int[][] array) { 
    boolean retorno = true; 
    int constante; 
    int suma; 
    for (int i=0; i < 3; i++) { 
        suma = 0;
        constante=0;
        for (int j=0; j < 3 ; j++) { 
            suma += array[i][j]; 
            constante += array[0][j]; 
        } 
        if (suma != constante) { 
            retorno = false; 
            i = 3; 
        } 
    } 
    return retorno; 
    }

   //----------------------------------------------------------Comprobar Columnas
    public static boolean compruebaColumnas(int[][] array) { 
    boolean retorno = true; 
    int constante; 
    int suma; 
    for (int i=0; i < 3; i++) { 
        suma = 0; 
        constante=0;
        for (int j=0; j < 3 ; j++) { 
            suma += array[i][j]; 
            constante += array[j][0]; 
        } 
        if (suma != constante) { 
            retorno = false; 
            i = 3; 
        } 
    } 
    return retorno; 
    } 
    
       //----------------------------------------------------------Comprobar Columnas
    public static boolean compruebaDiagonales(int[][] array) { 
    boolean retorno = true; 
    int diagonal1=0; 
    int diagonal2=0; 
    
    for (int i=0; i < 3; i++) { 
       
        for (int j=0; j < 3 ; j++) { 
           
        if (i==j){
            diagonal2 += array[i][2-j]; 
            diagonal1 += array[i][j]; 
                 
             }
        
        }
    }
    
    if (diagonal2 != diagonal1) { 
                    retorno = false; 
                   
                } 
    
    return retorno; 
    } 

}

