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
    Client currentClient;
    ORDER_STATE stateOfOrder;
    private int contador =0;
    public OrderController(int cantOrder, Client currentClient) {
        this.listOfOrder = new Order[cantOrder];
        this.currentClient = currentClient;
        this.stateOfOrder = ORDER_STATE.RECIVED;
    }
    public void insertnewOrder(Order o) throws Exception{
        if (contador< listOfOrder.length) {
            listOfOrder[contador]= o;
            contador++;
        }else{
            throw  new Exception("Imposible to aggregate new order");
        }
    }
    public  String getInformation(){
        String msg = "";
        for (int i = 0; i < listOfOrder.length; i++) {
            msg += listOfOrder[i].toString();
        }
        return String.format("....PEDIDO.....\n%s\ncliente:%s\n,Estado:%s",msg,currentClient.toString(),stateOfOrder);
    }
    
}
