/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccination.Role;

import Vaccination.Configuration.EcoSystem;
import Vaccination.Enterprise.Enterprise;
import Vaccination.Network.Network;
import Vaccination.Organization.DoctorOrg;
import Vaccination.Organization.Organization;
import Vaccination.UserAccount.UserAccount;
import userinterface.Doctor.DoctorMainAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author abhaydeshpande
 */
public class DoctorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new DoctorMainAreaJPanel(userProcessContainer,account,(DoctorOrg)organization,enterprise,business,network);
    }
    
    
}
