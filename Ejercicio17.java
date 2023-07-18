/*
17. Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ejercicio.pkg17;

import java.util.Scanner;
/**
 *
 * @author lapasta 
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
    Scanner leer = new Scanner(System.in);   
    int n;
        System.out.println("Decime el tamaño del vector");
        n=leer.nextInt();
     
    int [] vector= new int [n];
    
     llenarVector(vector, n);
     mostrarVector(vector, n);
    
     
     //------------------------------------------------------Contabilizando
    int unDig=0, dosDig=0, tresDig=0, cuatroDig=0, cincoDig=0;
    
    for (int i=0; i<n; i++){
        
        if (vector[i]<10 ){
            unDig+=1;
        } else if (vector[i]<100){
            dosDig+=1;
        } else if (vector[i]<1000){
            tresDig+=1;
        }else if (vector[i]<10000){
            cuatroDig+=1;
        } else if (vector[i]<100000){
            cincoDig+=1;
        }
    }
        System.out.println(" ");
        System.out.println("La cantidad de indices de 1 digito son: "+unDig+" I Con 2: "+dosDig+" I Con 3: "+tresDig+" I Con 4: "+cuatroDig+" I Con 5: "+cincoDig);
    
    
    }
  
    
   //------------------------------------------------------Llenar Vector 
    public static void llenarVector(int[] vector, int n){ 
    Scanner leer = new Scanner(System.in); 
    for (int i=0; i<n; i++){
        System.out.println("Decime el indice "+i);
            vector[i]= leer.nextInt();

         } 
    }
    
    
    //------------------------------------------------------Mostrar Vector 
    public static void mostrarVector(int[] vector, int n){ 

    for (int i=0; i<n; i++){

         System.out.print(" ["+vector[i]+"] ");

         }  
    }
    
}

