
package Entidades;


public class Operacion {

    private int numero1;
    private int numero2;
    
    //------------------------ Constructor

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    //------------------------ Set

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    //------------------------ Get

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    @Override
    public String toString() {
        return "Operacion{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }

   
    
    
}

