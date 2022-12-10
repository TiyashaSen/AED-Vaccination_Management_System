/*
 * To change this template, choose Tools | Templates and open the template in the editor.
 */
package Vaccination.UserAccount;

import Vaccination.Worker.Worker;
import Vaccination.Role.Role;
import Vaccination.WorkQueue.WorkQueue;

/**
 *
 * @author abhaydeshpande
 */
public class UserAcc {

    private String username;
    private String password;
    private Worker employee;
    private Role role;
    private WorkQueue workQueue;

    public UserAcc() {
        workQueue = new WorkQueue();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Worker employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Worker getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    @Override
    public String toString() {
        return username;
    }

}
