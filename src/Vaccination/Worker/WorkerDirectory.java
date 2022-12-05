/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccination.Worker;

import java.util.ArrayList;

/**
 *
 * @author prakruthisomashekar
 */
public class WorkerDirectory {

    private ArrayList<Worker> workerArray;

    public WorkerDirectory() {
        workerArray = new ArrayList();
    }

    public ArrayList<Worker> getWorkerArray() {
        return workerArray;
    }

    public Worker createEmployee(String name) {
        Worker worker = new Worker();
        worker.setName(name);
        workerArray.add(worker);
        return worker;
    }
}
