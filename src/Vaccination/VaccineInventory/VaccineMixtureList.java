/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccination.VaccineInventory;

import java.util.ArrayList;

/**
 *
 * @author abhaydeshpande
 */
public class VaccineMixtureList {

    private ArrayList<VaccineMixture> vaccineList;

    public VaccineMixtureList() {
        vaccineList = new ArrayList<VaccineMixture>();
    }

    public ArrayList<VaccineMixture> getVaccineList() {
        return vaccineList;
    }

    public void setVaccineList(ArrayList<VaccineMixture> vaccineList) {
        this.vaccineList = vaccineList;
    }

    public VaccineMixture addVaccine() {
        VaccineMixture vm = new VaccineMixture();
        vaccineList.add(vm);
        return vm;
    }

    public void deleteVaccine(VaccineMixture vid) {
        vaccineList.remove(vid);
    }

}
