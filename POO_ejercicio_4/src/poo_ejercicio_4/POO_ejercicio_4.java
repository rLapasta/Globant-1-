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
package poo_ejercicio_4;

import Entidades.Rectangulo;
import Servicios.RectanguloServicio;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class POO_ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        RectanguloServicio servicio = new RectanguloServicio();
        
        Rectangulo rectangulo1= servicio.crearRectangulo();
        
        int flag=1;
        
        do {
            System.out.println("Que desea obtener: 1-Area 2-Perimetro 3-Dibujo del rectangulo");
            int opcion=leer.nextInt();
        switch (opcion) {
            case 1: 
                System.out.println("El area es " + servicio.areaRectangulo(rectangulo1));
                System.out.println("Desea realizar otra acción? 1-Si 2-No");
                flag=leer.nextInt();
                break;
            case 2:
                System.out.println("El perimetro es " + servicio.perimetroRectangulo(rectangulo1));
                System.out.println("Desea realizar otra acción? 1-Si 2-No");
                flag=leer.nextInt();
                break;
            case 3:
                servicio.dibujoRectangulo(rectangulo1);
                System.out.println("Desea realizar otra acción? 1-Si 2-No");
                flag=leer.nextInt();
                break;
            default:
               System.out.println("La opción seleccionada es incorrecta. Desea realizar otra acción? 1-Si 2-No");
               flag=leer.nextInt();
               break; 
        }
        } while (flag==1);
    }
    
}
