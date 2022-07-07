/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import models.generics.Person;

/**
 *
 * @author O16233
 */
public class Client extends Person{
    
    public Client(int dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
    }
    
}
