/*
4. Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. 
La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. 

También incluirá un método para calcular la superficie del rectángulo y 

un método para calcular el perímetro del rectángulo. 

Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. 

Se deberán además definir los métodos getters,
setters y constructores correspondientes.

Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Servicios;

import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class RectanguloServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //------------------------------------------------------------- Crear   
    public Rectangulo crearRectangulo() {
        System.out.println("Te pido la altura del rectángulo");
        int altura = leer.nextInt();

        System.out.println("Ahora la base");
        int base = leer.nextInt();

        return new Rectangulo(base, altura);
    }

    //------------------------------------------------------------- Area
    public int areaRectangulo(Rectangulo x) {
        return x.getBase() * x.getAltura();
    }

    //------------------------------------------------------------- Perimetro
    public int perimetroRectangulo(Rectangulo x) {
        return (x.getBase() + x.getAltura()) * 2;
    }

    //------------------------------------------------------------- Dibujo
    public void dibujoRectangulo(Rectangulo x) {
        for (int i = 0; i < x.getAltura(); i++) {
            for (int j = 0; j < x.getBase(); j++) {

                if (i == 0 || i == x.getAltura() - 1) {
                    System.out.print("* ");
                } else if (j == 0 || j == x.getBase() - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

    }

}
