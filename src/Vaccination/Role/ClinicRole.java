/*
 * To change this template, choose Tools | Templates and open the template in the editor.
 */
package Vaccination.Role;

import Vaccination.Configuration.EcoSystem;
import Vaccination.Enterprise.Enterprise;
import Vaccination.Connection.Connection;
import Vaccination.Organization.Clinic;
import Vaccination.Organization.Organization;
import Vaccination.UserAccount.UserAcc;
import javax.swing.JPanel;
import userinterface.ClinicTestCenter.AssistantWorkJPanel;

/**
 *
 * @author abhaydeshpande
 */
public class ClinicRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAcc account,
            Organization organization, Enterprise enterprise, EcoSystem business, Connection network) {
        return new AssistantWorkJPanel(userProcessContainer, account, (Clinic) organization,
                enterprise, business, network);
    }

}
