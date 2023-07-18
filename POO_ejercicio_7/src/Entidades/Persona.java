package Entidades;

/**
 *
 * @author User
 */
public class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private int peso;
    private double altura;
    
    //---------------------------- Constructor

    public Persona(String nombre, int edad, String sexo, int peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona() {
    }
    
   //---------------------------- Set
    
     public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }   
    
   //---------------------------- Get

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public int getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }


}
