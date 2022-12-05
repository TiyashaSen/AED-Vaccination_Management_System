/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccination.Doctor;

import java.util.ArrayList;

/**
 *
 * @author prakruthisomashekar
 */
public class OrderArray {

    private ArrayList<Order> orderArray;

    public OrderArray() {
        orderArray = new ArrayList<Order>();
    }

    public ArrayList<Order> getOrderArray() {
        return orderArray;
    }

    public void setoList(ArrayList<Order> orderArray) {
        this.orderArray = orderArray;
    }

    public Order addPrescription() {
        Order ord = new Order();
        orderArray.add(ord);
        return ord;
    }
}
