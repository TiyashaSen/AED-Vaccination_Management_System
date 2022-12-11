/*
 * To change this template, choose Tools | Templates and open the template in the editor.
 */
package Vaccination.Role;

import Vaccination.Configuration.EcoSystem;
import Vaccination.Enterprise.Enterprise;
import Vaccination.Connection.Connection;
import Vaccination.Organization.Laboratory;
import Vaccination.Organization.Organization;
import Vaccination.UserAccount.UserAcc;
import userinterface.LabTechnician.LabTechnicianMainJPanel;
import javax.swing.JPanel;

/**
 *
 * @author abhaydeshpande
 */
public class Lab extends Role {

    @Override

    public JPanel createWorkArea(JPanel userProcessContainer, UserAcc account,
            Organization organization, Enterprise enterprise, EcoSystem business, Connection network) {
        return new LabTechnicianMainJPanel(userProcessContainer, account, (Laboratory) organization,
                enterprise, business, network);
    }

}
