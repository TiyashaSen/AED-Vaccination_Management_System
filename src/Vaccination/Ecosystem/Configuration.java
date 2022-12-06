package Vaccination.Ecosystem;

import Vaccination.Employee.Employee;
import Vaccination.Roles.SystemAdminRole;
import Vaccination.UserAccount.UserAccount;

/**
 *
 * @author tiyashasen
 */
public class Configuration {

    public static EcoSystem configure() {

        EcoSystem system = EcoSystem.getInstance();

        Employee employee = system.getED().createEmployee("RRH");

        UserAccount ua = system.getUAD().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());

        return system;
    }

}
