/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccination.Role;

import Vaccination.Configuration.EcoSystem;
import Vaccination.Enterprise.Enterprise;
import Vaccination.Connection.Connection;
import Vaccination.Organization.Organization;
import Vaccination.Organization.Pharmacy;
import Vaccination.UserAccount.UserAcc;
import javax.swing.JPanel;
import userinterface.PharmacyRole.PharmacyWorkArea;

/**
 *
 * @author prakruthisomashekar
 */
public class PharmacyRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAcc account, Organization organization, Enterprise enterprise, EcoSystem business, Connection network) {
        return new PharmacyWorkArea(userProcessContainer, account, (Pharmacy) organization, enterprise, network);

    }
}
