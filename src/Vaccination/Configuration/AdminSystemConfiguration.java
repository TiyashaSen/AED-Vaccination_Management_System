package Vaccination.Configuration;

import Vaccination.Worker.Worker;
import Vaccination.Role.SystemAdminRole;
import Vaccination.UserAccount.UserAcc;

/**
 *
 * @author prakruthisomashekar
 */

public class AdminSystemConfiguration {

    public static EcoSystem configure() {

        EcoSystem system = EcoSystem.getInstance();

        Worker employee = system.getEmployeeDirectory().createEmployee("RRH");

        UserAcc ua = system.getUserAccDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());

        return system;
    }

}
