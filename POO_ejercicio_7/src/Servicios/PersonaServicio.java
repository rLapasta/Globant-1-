package Servicios;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Lapasta
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {

        System.out.println("Te pido el nombre");
        String nombre = leer.next();

        System.out.println("Edad");
        int edad = leer.nextInt();

        String sexo = "a";
        do {
            System.out.println("Sexo. Opciones: M-Mujer H-Hombre O-Otros");
            sexo = leer.next();
            sexo = sexo.toUpperCase();
        } while (!sexo.equals("M") && !sexo.equals("H") && !sexo.equals("O"));

        System.out.println("Peso en kg");
        int peso = leer.nextInt();

        System.out.println("Altura en metros (con punto , )");
        double altura = leer.nextDouble();

        return new Persona(nombre, edad, sexo, peso, altura);
    }

    //---------------------------- Calcular IMC
    public int calcularIMC(Persona x) {

        double imc = (x.getPeso() / (x.getAltura() * x.getAltura()));
        int retorno;
        if (imc > 20) {
            retorno = -1;
        } else if (imc > 19 && imc < 26) {
            retorno = 0;
        } else {
            retorno = 1;
        }

        System.out.println("El imc es " + imc);
        return retorno;
    }

    //---------------------------- Es mayor de edad
    public boolean esMayorDeEdad(Persona x) {
        boolean flag;
        flag = x.getEdad() > 17;
        return flag;
    }

}
