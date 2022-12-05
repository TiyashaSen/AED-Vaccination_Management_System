package Vaccination.Configuration;

import Vaccination.Worker.Worker;
import Vaccination.Role.SystemAdminRole;
import Vaccination.UserAccount.UserAccount;

/**
 *
 * @author prakruthisomashekar
 */

public class AdminSystemConfigure {

    public static EcoSystem configure() {

        EcoSystem system = EcoSystem.getInstance();

        Worker employee = system.getEmployeeDirectory().createEmployee("RRH");

        UserAccount ua = system.getUserAccDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());

        return system;
    }

}
