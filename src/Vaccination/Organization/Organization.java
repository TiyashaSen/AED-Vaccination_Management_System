/*
 * To change this template, choose Tools | Templates and open the template in the editor.
 */
package Vaccination.Organization;

import Vaccination.Worker.WorkersList;
import Vaccination.Role.Role;
import Vaccination.UserAccount.UserAccList;
import Vaccination.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author prakruthisomashekar
 */
public abstract class Organization {

    private String name;
    private WorkQueue wq;
    private WorkersList employeeDirectory;
    private UserAccList userAccDirectory;
    private int organizationId;
    private static int counter = 0;

    public enum Type {
        Admin("Admin Organization"), Doctor("Doctor Organization"), Laboratory(
                "Laboratory Organization"), Pharmacy("Pharmacy Organization"), Medicine(
                        "Medicine Organization"), Vaccine("Vaccine Organization"), Sample(
                                "Sample Organization"), Clinic("Clinic Organization");

        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        wq = new WorkQueue();
        employeeDirectory = new WorkersList();
        userAccDirectory = new UserAccList();
        organizationId = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserAccList getUserAccDirectory() {
        return userAccDirectory;
    }

    public int getOrganizationIdID() {
        return organizationId;
    }

    public WorkersList getEmployeeDirectory() {
        return employeeDirectory;
    }

    public String getName() {
        return name;
    }

    public WorkQueue getWq() {
        return wq;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWq(WorkQueue wq) {
        this.wq = wq;
    }

    @Override
    public String toString() {
        return name;
    }

}
