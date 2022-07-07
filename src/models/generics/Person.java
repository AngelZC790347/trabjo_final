/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.generics;

/**
 *
 * @author O16233
 */
public class Person {
    public int dni;
    public String nombre;
    public String apellido;

    public Person(int dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    @Override
    public String toString() {
        return String.format("%s %s (%d)", nombre,apellido,dni);
    }
    
}
