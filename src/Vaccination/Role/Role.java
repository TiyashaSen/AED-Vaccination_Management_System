/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccination.Role;

import Vaccination.Configuration.EcoSystem;
import Vaccination.Enterprise.Enterprise;
import Vaccination.Connection.Connection;
import Vaccination.Organization.Organization;
import Vaccination.UserAccount.UserAcc;
import javax.swing.JPanel;

/**
 *
 * @author abhaydeshpande
 */
public abstract class Role {

    public enum RoleType {
        Admin("Admin"),
        Doctor("Doctor"),
        LabAssistant("Lab Assistant");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            UserAcc account,
            Organization organization,
            Enterprise enterprise,
            EcoSystem business, Connection network);

    @Override
    public String toString() {
        return this.getClass().getName();
    }

}
