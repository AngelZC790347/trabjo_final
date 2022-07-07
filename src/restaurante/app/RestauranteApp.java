/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.app;

import controllers.OrderController;
import controllers.TotalOrdersController;
import java.util.Queue;
import models.Client;
import models.Order;
import models.Product;

/**
 *
 * @author O16233
 */
public class RestauranteApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here\
        TotalOrdersController atecion = new TotalOrdersController();
        OrderController cOrder = new OrderController(1, new Client(76608998, "Angel Gabriel", "Zuñiga"));
        Order o=new Order(new Product(1,"Parrilla",20.4f),2);
        cOrder.insertnewOrder(o);
        atecion.insertNewOrder(cOrder);
        Queue <OrderController> cola =atecion.getQueveOfOrders();
//        for (int i = 0; i < cola.size(); i++) {
//            OrderController da = cola.remove();
//            System.out.println(da.getInformation());
//            
//        }
        for (OrderController orderController : cola) {
            System.out.println(cola.remove().getInformation());
        }
       
             
    }
    
}
