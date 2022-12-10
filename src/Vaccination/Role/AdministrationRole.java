/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccination.Role;

import Vaccination.Configuration.EcoSystem;
import Vaccination.Enterprise.Enterprise;
import Vaccination.Connection.Connection;
import Vaccination.Organization.Organization;
import Vaccination.UserAccount.UserAcc;
import javax.swing.JPanel;
import userinterface.AdministrativeRole.AdminWorkAreaJpanel;

/**
 *
 * @author abhaydeshpande
 */
public class AdministrationRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAcc account, Organization organization, Enterprise enterprise, EcoSystem business, Connection network) {
        return new AdminWorkAreaJpanel(userProcessContainer, enterprise);
    }

 

}
