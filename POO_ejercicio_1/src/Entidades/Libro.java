/*
ISBN, Título, Autor,
Número de páginas
 */
package Entidades;


public class Libro {
    public int ISBN;
    public String titulo;
    public String autor;
    public int numPaginas;
    
    
 //---------------------------- Constructores  

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numPaginas=" + numPaginas + '}';
    }
      
    
}



