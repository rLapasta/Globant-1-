/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package poo_ejercicio_1;

import Entidades.Libro;
import Servicios.LibroServicios;

/**
 *
 * @author lapasta
 */
public class POO_ejercicio_1 {

   
    public static void main(String[] args) {
      
      LibroServicios ls = new LibroServicios();   
        
      Libro l1 = ls.crearLibro();
      
        System.out.println(l1.toString());
        
        
        
        
    }
    
}
