/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccination.Worker;

/**
 *
 * @author prakruthisomashekar
 */
public class Worker {

    private String name;
    private int id;
    private static int count = 1;

    public Worker() {
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

}
