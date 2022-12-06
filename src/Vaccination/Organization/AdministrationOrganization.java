/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccination.Organization;

import Vaccination.Role.AdministrationRole;
import Vaccination.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author abhaydeshpande
 */
public class AdministrationOrganization extends Organization {

    private String orgName;

    public AdministrationOrganization() {
        super(Organization.Type.Admin.getValue());
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AdminRole());
        return roles;
    }

}
