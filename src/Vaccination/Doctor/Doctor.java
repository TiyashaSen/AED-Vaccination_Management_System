/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccination.Doctor;

/**
 *
 * @author prakruthisomashekar
 */
public class Doctor {

    private String docName;
    private OrderArray orderArray;

    public Doctor() {
        orderArray = new OrderArray();
    }

    public String getDocName() {
        return docName;
    }

    public void setDocotrName(String docName) {
        this.docName = docName;
    }

    public OrderArray getOrderArray() {
        return orderArray;
    }

    public void setOrderArray(OrderArray orderArray) {
        this.orderArray = orderArray;
    }

}
