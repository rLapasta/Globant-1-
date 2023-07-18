/*
ISBN, Título, Autor,
Número de páginas
 */
package Servicios;

import Entidades.Libro;
import java.util.Scanner;

public class LibroServicios {
    
    private Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    public Libro crearLibro(){
        
        System.out.println("Te pido el ISBN");  
        int ISBN = leer.nextInt();
        
        System.out.println("Te pido el título");  
        String titulo = leer.next();
        
        System.out.println("Te pido el autor");  
        String autor = leer.next();
        
        System.out.println("Te pido la cantidad de pag");  
        int numPaginas = leer.nextInt();
        
        return new Libro(ISBN, titulo, autor, numPaginas);
    }
    
}
