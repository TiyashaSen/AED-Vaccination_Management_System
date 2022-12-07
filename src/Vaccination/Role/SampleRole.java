/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccination.Role;


import Vaccination.Configuration.EcoSystem;
import Vaccination.Enterprise.Enterprise;
import Vaccination.Network.Network;
import Vaccination.Organization.Sample;
import Vaccination.Organization.Organization;
import Vaccination.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.SampleSupplier.SampleWorkArea;

/**
 *
 * @author abhaydeshpande
 */
public class SampleRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new SampleWorkArea(userProcessContainer, account, (Sample) organization, enterprise, business, network);

    }

}
