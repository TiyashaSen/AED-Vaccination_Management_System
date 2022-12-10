/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccine.Organization;

import Vaccination.Worker.WorkersList;
import Vaccination.Role.Role;
import Vaccination.UserAccount.UserAccList;
import Vaccination.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author tiyashasen
 */
public abstract class Organization {

    private String name;
    private WorkQueue WQ;
    private WorkersList ED;
    private UserAccList UAD;
    private int OrgID;
    private static int counter = 0;

    public enum Type {
        Admin("Admin Organization"),
        Doctor("Doctor Organization"),
        Lab("Lab Organization"),
        Pharmacy("Pharmacy Organization"),
        Medicine("Medicine Organization"),
        Vaccine("Vaccine Organization"),
        Sample("Sample Organization"),
        Clinic("Clinic Organization");

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
        WQ = new WorkQueue();
        ED = new WorkersList();
        UAD = new UserAccList();
        OrgID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserAccList getUAD() {
        return UAD;
    }

    public int getOrgID() {
        return OrgID;
    }

    public WorkersList getED() {
        return ED;
    }

    public String getName() {
        return name;
    }

    public WorkQueue getWQ() {
        return WQ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWQ(WorkQueue WQ) {
        this.WQ = WQ;
    }

    @Override
    public String toString() {
        return name;
    }


}
