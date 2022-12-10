/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccination.Role;

import Vaccination.Configuration.EcoSystem;
import Vaccination.Enterprise.Enterprise;
import Vaccination.Network.Network;
import Vaccination.Organization.Organization;
import Vaccination.UserAccount.UserAcc;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author abhaydeshpande
 */
public class SystemAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAcc account, Organization organization, Enterprise enterprise, EcoSystem system, Network network) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
    }

}
