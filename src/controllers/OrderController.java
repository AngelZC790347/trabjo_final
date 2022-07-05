/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.*;

/**
 *
 * @author O16233
 */
enum ORDER_STATE{ 
    RECIVED,
    PREPARING,
    IN_COMMING,
    DELIVERED,
    CANCELLED
}
public class OrderController {
    Order []listOfOrder;
    Client ccurrentClient;
    ORDER_STATE stateOfOrder;

    public OrderController(Order[] listOfOrder, Client ccurrentClient) {
        this.listOfOrder = listOfOrder;
        this.ccurrentClient = ccurrentClient;
        this.stateOfOrder = ORDER_STATE.RECIVED;
    }
  //  public  String getInformation(){
    //    return StringString.format("....PEDIDO.....\n%s\ncliente:%s",);
    ///}
    
}
