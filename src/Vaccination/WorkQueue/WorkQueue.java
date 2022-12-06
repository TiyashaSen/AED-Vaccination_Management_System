/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccination.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author tiyasha
 */
public class WorkQueue {

    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList<WorkRequest>();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
}
