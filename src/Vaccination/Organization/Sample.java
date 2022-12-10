/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccination.Organization;

import Vaccination.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author tiyashasen
 */
public class Sample extends Organization {

    public Sample() {
        super(Organization.Type.Sample.getValue());

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Vaccination.Role.SampleRole());
        return roles;
    }

}
