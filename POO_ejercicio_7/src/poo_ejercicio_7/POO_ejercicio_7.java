/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:

 Un constructor por defecto.

 Un constructor con todos los atributos como parámetro.

 Métodos getters y setters de cada atributo.

 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje

 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.

 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.

A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas

cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 */
package poo_ejercicio_7;

import Entidades.Persona;
import Servicios.PersonaServicio;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class POO_ejercicio_7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.getDefault());
        symbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", symbols);

        PersonaServicio servicio = new PersonaServicio();

        Persona persona1 = servicio.crearPersona();
        Persona persona2 = servicio.crearPersona();
        Persona persona3 = servicio.crearPersona();
        Persona persona4 = servicio.crearPersona();

        /*
        Persona persona1 = new Persona("Persona 1", 25, "m", 70, 1.75);
        Persona persona2 = new Persona("Persona 2", 30, "H", 65, 1.68);
        Persona persona3 = new Persona("Persona 3", 20, "O", 60, 1.72);
        Persona persona4 = new Persona("Persona 4", 17, "M", 75, 1.80);
         */
        
        int contadorDebajoPeso = 0;
        int contadorPesoIdeal = 0;
        int contadorEncimaPeso = 0;
        int contadorMayoresEdad = 0;
        int contadorMenoresEdad = 0;

        switch (servicio.calcularIMC(persona1)) {
            case -1:
                contadorDebajoPeso++;
                break;
            case 0:
                contadorPesoIdeal++;
                break;
            default:
                contadorEncimaPeso++;
                break;
        }

        switch (servicio.calcularIMC(persona2)) {
            case -1:
                contadorDebajoPeso++;
                break;
            case 0:
                contadorPesoIdeal++;
                break;
            default:
                contadorEncimaPeso++;
                break;
        }

        switch (servicio.calcularIMC(persona3)) {
            case -1:
                contadorDebajoPeso++;
                break;
            case 0:
                contadorPesoIdeal++;
                break;
            default:
                contadorEncimaPeso++;
                break;
        }

        switch (servicio.calcularIMC(persona4)) {
            case -1:
                contadorDebajoPeso++;
                break;
            case 0:
                contadorPesoIdeal++;
                break;
            default:
                contadorEncimaPeso++;
                break;
        }

        if (servicio.esMayorDeEdad(persona1)) {
            contadorMayoresEdad++;
        } else {
            contadorMenoresEdad++;
        }

        if (servicio.esMayorDeEdad(persona2)) {
            contadorMayoresEdad++;
        } else {
            contadorMenoresEdad++;
        }
        if (servicio.esMayorDeEdad(persona3)) {
            contadorMayoresEdad++;
        } else {
            contadorMenoresEdad++;
        }
        if (servicio.esMayorDeEdad(persona4)) {
            contadorMayoresEdad++;
        } else {
            contadorMenoresEdad++;
        }

        double porcentajeDebajoPeso = (double) contadorDebajoPeso / 4 * 100;
        double porcentajePesoIdeal = (double) contadorPesoIdeal / 4 * 100;
        double porcentajeEncimaPeso = (double) contadorEncimaPeso / 4 * 100;
        double porcentajeMayoresEdad = (double) contadorMayoresEdad / 4 * 100;
        double porcentajeMenoresEdad = (double) contadorMenoresEdad / 4 * 100;

        System.out.println("Porcentaje de personas por debajo del peso: " + porcentajeDebajoPeso + "%");
        System.out.println("Porcentaje de personas en su peso ideal: " + porcentajePesoIdeal + "%");
        System.out.println("Porcentaje de personas por encima del peso: " + porcentajeEncimaPeso + "%");
        System.out.println("Porcentaje de personas mayores de edad: " + porcentajeMayoresEdad + "%");
        System.out.println("Porcentaje de personas menores de edad: " + porcentajeMenoresEdad + "%");

    }

}

//ArrayList<Integer> imcAvg = new ArrayList<>();
//  ArrayList<Boolean> edadAvg = new ArrayList<>();
//  ServicePersona sp = new ServicePersona();
//  
//  Persona p1 = sp.crearPersona();
//  Persona p2 = sp.crearPersona();
//  Persona p3 = sp.crearPersona();
//  Persona p4 = sp.crearPersona();
//  
//  imcAvg.add(sp.calcularIMC(p1));
//  edadAvg.add(sp.esMayorDeEdad(p1));
//  System.out.println(sp.esMayorDeEdad(p1));
//  imcAvg.add(sp.calcularIMC(p2));
//  edadAvg.add(sp.esMayorDeEdad(p2));
//  System.out.println(sp.esMayorDeEdad(p2));
//  imcAvg.add(sp.calcularIMC(p3));
//  edadAvg.add(sp.esMayorDeEdad(p3));
//  System.out.println(sp.esMayorDeEdad(p3));
//  imcAvg.add(sp.calcularIMC(p4));
//  edadAvg.add(sp.esMayorDeEdad(p4));
//  System.out.println(sp.esMayorDeEdad(p4));
//  
//  
//  averageImc(imcAvg);

//public static void averageImc(ArrayList <Integer> li) {
//  int sobre = 0 , ok = 0 , bajo = 0;
//  for (Integer e : li) {
//            if(e == 1) {
//              sobre = sobre + 1;
//            } else if(e == 0) {
//              ok = ok + 1;
//            } else {
//              bajo =bajo + 1;
//            }
//        }
//  System.out.println(sobre + "," + ok + "," + bajo);
//  System.out.println(li.size());
//  
//  System.out.println("hay un " + (sobre/(li.size()))*100 + "% de personas con sobrepeso");
//  System.out.println("hay un " + (ok/(li.size()))*100 + "% de personas con ok");
//  System.out.println("hay un " + (bajo/(li.size()))*100 + "% de personas con bajopeso");
//  
// }

//---------------------------------------------------------------------------------- FOR

//
//package pooej07;
//
//import Entidad.Persona;
//
///**
// *
// * @author 57315
// */
//
///*
//Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
//los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
//tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
//persona es mayor de edad.
//*/
//public class POOEj07 {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        int sobrepeso=0;
//        int ideal=0;
//        int bajo=0;
//        
//        int menor=0;
//        int mayor=0;
//        
//        for (int i = 1; i <= 4; i++) {
//        Persona personai=new Persona();
//        System.out.println("persona:"+i);
//        personai.crearPersona();
//        
//        if (personai.calcularIMC() == -1) {
//            System.out.println("la persona: " + personai.getNombre() + " está por debajo de su peso ideal");
//            bajo += 1;
//        } else if (personai.calcularIMC() == 0) {
//            System.out.println("la persona: " + personai.getNombre() + " está en su peso ideal");
//            ideal += 1;
//        } else if (personai.calcularIMC() == 1) {
//            System.out.println("la persona: " + personai.getNombre() + " tiene sobrepeso");
//            sobrepeso += 1;
//        }
//
//        if (personai.esMayorDeEdad() == true) {
//            System.out.println("La persona tiene " + personai.getEdad() + " años, es mayor de edad");
//            mayor += 1;
//        } else if (personai.esMayorDeEdad() == false) {
//            System.out.println("La persona tiene " + personai.getEdad() + " años,es menor de edad");
//            menor += 1;
//        }
//        }
//        
//        System.out.println("El porcentaje de personas por debajo del peso ideal es: "+ ((bajo*100)/4));
//        System.out.println("El porcentaje de personas que están en su peso ideal es: "+ ((ideal*100)/4));
//        System.out.println("El porcentaje de personas con sobrepeso es: "+ ((sobrepeso*100)/4));
//        
//        System.out.println("El porcentaje de personas mayores de edad es: "+ ((mayor*100)/4));
//        System.out.println("El porcentaje de personas menores de edad es: "+ ((menor*100)/4));
//        
//    }
//    
//}
