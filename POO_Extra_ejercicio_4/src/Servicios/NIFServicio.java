

package Servicios;

import Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author Lapasta
 */
public class NIFServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public NIF crearNIF() {

        System.out.println("Decime tu DNI");
        long DNI = leer.nextLong();

        String[] vector = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        long i = (DNI % 23);

       String letra= vector[(int)i];
        
        return new NIF (DNI, letra);
    }

    public void mostrar(NIF x){
    
        System.out.println(x.getDNI()+ "-" + x.getLetra());
    }
    
    
}
