/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccination.Role;

import Vaccination.Configuration.EcoSystem;
import Vaccination.Enterprise.Enterprise;
import Vaccination.Network.Network;
import Vaccination.Organization.Clinic;
import Vaccination.Organization.Organization;
import Vaccination.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.ClinicalTrial.ClinicAssistantWorkAreaJPanel;

/**
 *
 * @author abhaydeshpande
 */
public class ClinicRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new ClinicAssistantWorkAreaJPanel(userProcessContainer, account, (Clinic) organization, enterprise, business, network);
    }

}
