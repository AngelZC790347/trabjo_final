/*
 * To change this license header, choose License Headers in Project Properties. * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author O16233
 */
public class Order {
    private Product producto;
    private int cantidad;
    public String getOrderInfo(){
       return String.format("producto:%s\ncantidad:%d\n",producto,cantidad);
    }

    public Order(Product producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }
    @Override
    public String toString() {
        return String.format("%s\t%f\t%d,%f",producto.toString(),producto.price,cantidad,cantidad*producto.price);// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
