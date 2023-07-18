
package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;


public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {

        System.out.println("Decime el nombre");
        String nombre = leer.next();

        System.out.println("Tu año de nacimiento");
        int anio = leer.nextInt() - 1900;

        System.out.println("Tu mes de nacimiento");
        int mes = leer.nextInt() - 1;

        System.out.println("Tu dia de nacimiento");
        int dia = leer.nextInt();

        Date fechaDeNacimiento = new Date(anio, mes, dia);

        return new Persona(nombre, fechaDeNacimiento);
    }

//-------------------------------------------------------------------------
    
    public int calcularEdad(Persona x) {

        Date fechaActual = new Date();
 
        int edad;

        if (x.getFechaDeNacimiento().getMonth() < fechaActual.getMonth()) {
            edad = fechaActual.getYear() - x.getFechaDeNacimiento().getYear();
        } else {
            edad = fechaActual.getYear() - x.getFechaDeNacimiento().getYear() - 1;
        }

        return edad;
    }

 //-------------------------------------------------------------------------
    
    public boolean menorQue(Persona x){
        
        System.out.println("Decime la edad que queres comparar");
        int nuevaEdad=leer.nextInt();
        
        boolean flag = false;
        
        if (nuevaEdad<calcularEdad(x)){
        flag=true;
        } 
        
        return flag;
    }
    
    
}
