/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package Vaccination.Role;

import Vaccination.Configuration.EcoSystem;
import Vaccination.Enterprise.Enterprise;
import Vaccination.Connection.Connection;
import Vaccination.Organization.Organization;
import Vaccination.Organization.Medicine;
import Vaccination.UserAccount.UserAcc;
import javax.swing.JPanel;
import userinterface.MedicineManufactureResearch.MedicineManufactureMainJpanel;

/**
 *
 * @author tiyashasen
 */
public class MedicineRole extends Role {

    @Override

    public JPanel createWorkArea(JPanel userProcessContainer, UserAcc account,
            Organization organization, Enterprise enterprise, EcoSystem business, Connection network) {
        return new MedicineManufactureMainJpanel(userProcessContainer, business, account,
                (Medicine) organization, enterprise, network);
    }

}
