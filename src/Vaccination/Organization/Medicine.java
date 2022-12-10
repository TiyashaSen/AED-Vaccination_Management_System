/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccination.Organization;

import Vaccination.VaccineInventory.VaccineMixture;
import Vaccination.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author prakruthisomashekar
 */
public class Medicine extends Organization {

    private ArrayList<VaccineMixture> vaccineArray;

    public Medicine() {

        super(Organization.Type.Medicine.getValue());
        vaccineArray = new ArrayList<VaccineMixture>();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Vaccination.Role.MedicineRole());
        return roles;
    }

    public ArrayList<VaccineMixture> getVaccineArray() {
        return vaccineArray;
    }

    public void setVaccineArray(ArrayList<VaccineMixture> vaccineArray) {
        this.vaccineArray = vaccineArray;
    }

    public void addVaccineMix(VaccineMixture v) {
        vaccineArray.add(v);
    }

}
