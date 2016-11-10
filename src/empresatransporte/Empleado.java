/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresatransporte;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Empleado {
    private String nombre;
    private int edad;
    
    public void mostrar(){
        System.out.println(this.nombre);
        System.out.println(this.edad);
    }     

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
