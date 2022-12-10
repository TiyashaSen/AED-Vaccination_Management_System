/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccination.Organization;

import Vaccination.Doctor.Order;
import Vaccination.Role.DoctorRole;
import Vaccination.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author abhaydeshpande
 */
public class DoctorOrg extends Organization {

    private ArrayList<Order> orderList;

    public DoctorOrg() {
        super(Organization.Type.Doctor.getValue());

        orderList = new ArrayList<Order>();
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DoctorRole());
        return roles;
    }

    public void addPrescription(Order o) {

        orderList.add(o);

    }

}
