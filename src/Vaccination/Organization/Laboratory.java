/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccination.Organization;

import Vaccination.Role.LabRole;
import Vaccination.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author prakruthisomashekar
 */
public class Laboratory extends Organization {

    public Laboratory() {
        super(Organization.Type.Laboratory.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LabRole());
        return roles;
    }
}
