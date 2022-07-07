/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 *
 * @author O16233
 */
public class TotalOrdersController {
    private Queue<OrderController> queveOfOrders;
    public void insertNewOrder(OrderController newclientOrder){
        this.queveOfOrders.add(newclientOrder);
    }

    public TotalOrdersController() {
        this.queveOfOrders = new ArrayDeque<OrderController>();
    }
    
    public Queue<OrderController> getQueveOfOrders() {
        return queveOfOrders;
    }
    
}
