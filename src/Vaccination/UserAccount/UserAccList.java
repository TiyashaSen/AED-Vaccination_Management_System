/*
 * To change this template, choose Tools | Templates and open the template in the editor.
 */
package Vaccination.UserAccount;

import Vaccination.Worker.Worker;
import Vaccination.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author abhaydeshpande
 */
public class UserAccList {

    private ArrayList<UserAcc> userAccountList;

    public UserAccList() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAcc> getUserAccountList() {
        return userAccountList;
    }

    public UserAcc authenticateUser(String username, String password) {

        for (UserAcc ua : userAccountList) {
            System.out.println("the user account details" + ua.getUsername() + "---"
                    + ua.getPassword() + userAccountList.size());
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }

    public UserAcc createUserAccount(String username, String password, Worker employee,
            Role role) {
        UserAcc userAccount = new UserAcc();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }

    public boolean UniqueUsernameCheck(String username) {
        for (UserAcc ua : userAccountList) {
            if (ua.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }
}
