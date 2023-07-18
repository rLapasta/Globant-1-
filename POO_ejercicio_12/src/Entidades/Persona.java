
package Entidades;

import java.util.Date;


public class Persona {

    private String nombre;
    private Date fechaDeNacimiento;

    public Persona(String nombre, Date fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Persona() {
    }

    //---------------------------- Set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    //---------------------------- Get 

    public String getNombre() {
        return nombre;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechaDeNacimiento=" + fechaDeNacimiento + '}';
    }
    
    

}
