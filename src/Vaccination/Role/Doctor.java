/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccination.Role;

import Vaccination.Configuration.EcoSystem;
import Vaccination.Enterprise.Enterprise;
import Vaccination.Connection.Connection;
import Vaccination.Organization.DoctorOrg;
import Vaccination.Organization.Organization;
import Vaccination.UserAccount.UserAcc;
import userinterface.Doctor.DoctorMainAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author abhaydeshpande
 */
public class Doctor extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAcc account, Organization organization, Enterprise enterprise, EcoSystem business,Connection network) {
        return new DoctorMainAreaJPanel(userProcessContainer,account,(DoctorOrg)organization,enterprise,business,network);
    }
    
    
}
