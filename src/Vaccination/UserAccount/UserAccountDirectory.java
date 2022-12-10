/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccination.UserAccount;

import Vaccination.Employee.Employee;
import Vaccination.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author tiyashasen
 */
public class UserAccountDirectory {

    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public UserAccount authenticateUser(String username, String password) {
    
        for (UserAccount ua : userAccountList) {
            System.out.println("the user account details"+ ua.getUsername()+"---"+ua.getPassword()+userAccountList.size());
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }

    public UserAccount createUserAccount(String username, String password, Employee employee, Role role) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }

    public boolean UniqueUsernameCheck(String username) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }
}
