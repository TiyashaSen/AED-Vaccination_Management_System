/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccination.Role;

import Vaccination.Configuration.EcoSystem;
import Vaccination.Enterprise.Enterprise;
import Vaccination.Network.Network;
import Vaccination.Organization.Laboratory;
import Vaccination.Organization.Organization;
import Vaccination.UserAccount.UserAccount;
import userinterface.LabAssistant.LabAssistantMainWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author abhaydeshpande
 */
public class LabRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new LabAssistantMainWorkAreaJPanel(userProcessContainer,account,(Laboratory)organization,enterprise,business,network);
    }
    
}
