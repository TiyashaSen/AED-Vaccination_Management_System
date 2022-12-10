/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccination.Role;

import Vaccination.Configuration.EcoSystem;
import Vaccination.Enterprise.Enterprise;
import Vaccination.Network.Network;
import Vaccination.Organization.Organization;
import Vaccination.Organization.Medicine;
import Vaccination.UserAccount.UserAcc;
import javax.swing.JPanel;
//import userinterface.MedicineManufactureResearch.MedicineManufactureWorkArea;

/**
 *
 * @author tiyashasen
 */
public class MedicineRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAcc account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new MedicineManufactureWorkArea(userProcessContainer, business, account, (Medicine) organization, enterprise, network);
    }

}
