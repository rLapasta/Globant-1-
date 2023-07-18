/*
----------------------------------------------
Ingrese una letra:
z
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 3
---------------------------------------------
 */

package Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Lapasta
 */
public class AhorcadoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    String letra;
    String aux;

    //--------------------------------------------------------------------- Crear Juego
    public Ahorcado crearJuego() {
        System.out.println("II BIENVENIDO AL AHORCADO II");

        System.out.println("Decime la palabra:");
        aux = leer.next();
        String[] palabra = new String[aux.length()];

        for (int i = 0; i < aux.length(); i++) {
            palabra[i] = aux.substring(i, i + 1);
        }

        int letrasEncontradas = 0;

        System.out.println("Decime el máximo de errores: ");
        int intentos = leer.nextInt();

        return new Ahorcado(palabra, letrasEncontradas, intentos);
    }

    //--------------------------------------------------------------------- Longitud
    public int longitud(Ahorcado x) {
        int longitud = x.getPalabra().length;

        return longitud;
    }

    //--------------------------------------------------------------------- Boolean Buscar
    public boolean buscar(Ahorcado x) {
        boolean buscar = false;

        System.out.println("Que letra queres bucar?:");
        letra = leer.next();

        for (int i = 0; i < x.getPalabra().length; i++) {
            if (x.getPalabra()[i].equals(letra)) {
                buscar = true;
                break;
            }
        }

        if (buscar) {
            System.out.println("La letra " + letra + " está en la palabra.");
            System.out.println("Numero de intentos: " + x.getIntentos());
        } else {
            System.out.println("La letra " + letra + " no está en la palabra.");
            x.setIntentos(x.getIntentos() - 1); //------------------------------ SET * INTENTOS *
            System.out.println("Numero de intentos: " + x.getIntentos());
        }

        // cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
        return buscar;
    }

    //--------------------------------------------------------------------- Encontradas y Faltantes
    public int encontradas(Ahorcado x) {

        int encontradas = 0;

        for (int i = 0; i < x.getPalabra().length; i++) {
            if (x.getPalabra()[i].equals(letra)) {
                encontradas++;
            }
        }

        return encontradas;
    }

    //--------------------------------------------------------------------- JUEGO COMPLETO
    public void juego() {

        Ahorcado juegoBase = crearJuego();
        int longitud = longitud(juegoBase);
        juegoBase.setFaltantes(longitud);

        System.out.println("La longitud de la palabra es de: " + longitud);
        int intentos = juegoBase.getIntentos();

        for (int i = intentos; i > 0; i--) {
            System.out.println("");
            boolean flag = buscar(juegoBase);

            if (flag) {
                i++;
                encontradas(juegoBase);
                juegoBase.setFaltantes(juegoBase.getFaltantes() - encontradas(juegoBase));
                System.out.println("La cantidad de letras encontradas es: " + encontradas(juegoBase));
                System.out.println("La cantidad de letras faltantes es: " + juegoBase.getFaltantes());
            }
            System.out.println("");

            if (juegoBase.getIntentos() == 0) {
                i = longitud;
            }

            if (juegoBase.getFaltantes() == 0) {
                System.out.println("¡GANASTE! La palabra era " + aux);
                break;
            } else if (intentos == 0) {
                System.out.println("Perdiste :( ");
            }
        }

    }

}
