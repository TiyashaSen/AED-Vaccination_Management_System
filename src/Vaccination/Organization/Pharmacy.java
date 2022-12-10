/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccination.Organization;

import Vaccination.MedicalInventory.MedicalInventory;
import Vaccination.Role.PharmacyRole;
import Vaccination.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author tiyashasen
 */
public class Pharmacy extends Organization {

    private ArrayList<MedicalInventory> medList;

    public Pharmacy() {

        super(Organization.Type.Pharmacy.getValue());
        medList = new ArrayList<MedicalInventory>();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PharmacyRole());
        return roles;
    }

    public ArrayList<MedicalInventory> getMedList() {
        return medList;
    }

    public void setMedList(ArrayList<MedicalInventory> medList) {
        this.medList = medList;
    }

    public void addMedicine(MedicalInventory mi) {

        medList.add(mi);

    }

}
