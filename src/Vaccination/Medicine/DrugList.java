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
<<<<<<<< Updated upstream:src/Vaccination/Medicine/MedicinesList.java
public class MedicinesList {
========
public class DrugList {
>>>>>>>> Stashed changes:src/Vaccination/Medicine/DrugList.java

    private ArrayList<Drug> medList;

<<<<<<<< Updated upstream:src/Vaccination/Medicine/MedicinesList.java
    public MedicinesList() {
        this.medList = new ArrayList<Medicine>();
========
    public DrugList() {
        this.medList = new ArrayList<Drug>();
>>>>>>>> Stashed changes:src/Vaccination/Medicine/DrugList.java
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
