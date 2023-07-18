/*
8. Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */

package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class CadenaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

//  ---------------------------------------------------------------- Crear
    public Cadena crearCadena() {

        System.out.println("Decime la frase");
        String frase = leer.next();

        return new Cadena(frase, frase.length());

    }

//  ---------------------------------------------------------------- Vocales
    public int mostrarvocales(Cadena c) {
        int contador = 0;

        String frase = c.getFrase().toLowerCase();

        for (int i = 0; i < c.getLongitud(); i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
                contador++;
            }
        }
        return contador;
    }

//  ---------------------------------------------------------------- Frase Invertida
    public void invertirFrase(Cadena c) {

        String frase = c.getFrase().toLowerCase();

        for (int i = c.getLongitud() - 1; i > -1; i--) {
            System.out.print(frase.charAt(i));
        }
        System.out.println("");
    }

//  ---------------------------------------------------------------- Veces Repetido
    public int vecesRepetido(Cadena c) {

        System.out.println("Que letra queres encontrar");
        char letra = leer.next().charAt(0);

        int contador = 0;

        String frase = c.getFrase().toLowerCase();

        for (int i = 0; i < c.getLongitud(); i++) {
            if (frase.charAt(i) == letra) {
                contador++;
            }
        }
        return contador;
    }

//  ---------------------------------------------------------------- Comparar Longitud
    public void compararLongitud(Cadena c) {

        System.out.println("Decime la frase con la que queres comparar");
        String fraseNueva = leer.next();

        String frase = c.getFrase().toLowerCase();

        if (frase.length() > fraseNueva.length()) {
            System.out.println("La frase vieja es más larga que la nueva");
        } else if (frase.length() < fraseNueva.length()) {
            System.out.println("La frase vieja es más corta que la nueva");
        } else {
            System.out.println("tienen la misma longitud");
        }

    }

//  ---------------------------------------------------------------- Unir Frases
    public String unirFrases(Cadena c) {

        System.out.println("Decime la frase que queres agregar");
        String fraseNueva = leer.next();

        String frase = c.getFrase().toLowerCase();

        String fraseCompleta = frase.concat(fraseNueva);

        return fraseCompleta;

    }

    //  ---------------------------------------------------------------- Reemplazar
    public String reemplazar(Cadena c) {

        System.out.println("Por cuál letra la queres cambiar");
        String letraCambiar = leer.next();

        String frase = c.getFrase().toLowerCase();
        String fraseNueva = frase.replace("a", letraCambiar);

        return fraseNueva;
    }

    //  ---------------------------------------------------------------- Vocales
    public boolean contiene(Cadena c) {
        boolean contiene = false;

        String frase = c.getFrase().toLowerCase();

        System.out.println("Cuál letra queres saber si contiene");
        char letra = leer.next().charAt(0);

        for (int i = 0; i < c.getLongitud(); i++) {
            if (frase.charAt(i) == letra) {
                contiene = true;
                break;
            }
        }
        return contiene;
    }
}
