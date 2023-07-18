
package Entidades;

/**
 *
 * @author User
 */
public class Cadena {

    private String frase;
    private int longitud;

//----------------------------------------------------- Set
    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

//---------------------------------------------------- Get 
    public String getFrase() {
        return frase;
    }

    public int getLongitud() {
        return longitud;
    }

//---------------------------------------------------- Constructor
    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

}
