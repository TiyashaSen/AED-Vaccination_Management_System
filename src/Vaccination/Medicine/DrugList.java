/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccination.Medicine;

import java.util.ArrayList;

/**
 *
 * @author abhaydeshpande
 */

public class DrugList {

    private ArrayList<Drug> medList;

    public DrugList() {
        this.medList = new ArrayList<Drug>();
    }

    public ArrayList<Drug> getMedList() {
        if (medList == null) {
            ArrayList<Drug> medList = new ArrayList<Drug>();
            return medList;
        }
        return medList;
    }

    public void setMedList(ArrayList<Drug> medList) {
        this.medList = medList;
    }

    public Drug addMedList(Drug med1) {
        if (med1 == null) {
            Drug med = new Drug();
            medList.add(med);
            return med;
        }
        medList.add(med1);
        return med1;

    }

}
