/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccination.Organization;


import Vaccination.Role.Role;
import Vaccination.SampleInventory.SampleCompound;
import Vaccination.VaccineInventory.VaccineMixture;
import java.util.ArrayList;

/**
 *
 * @author tiyashasen
 */
public class Vaccine extends Organization {

    private ArrayList<SampleCompound> sampleList;

    public Vaccine() {
        super(Organization.Type.Vaccine.getValue());
        this.sampleList = new ArrayList<SampleCompound>();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Vaccination.Role.VaccineRole());
        return roles;
    }

    public ArrayList<SampleCompound> getSampleList() {
        return sampleList;
    }

    public void setSampleList(ArrayList<SampleCompound> sampleList) {
        this.sampleList = sampleList;
    }

    public void addSample(SampleCompound vm) {

        sampleList.add(vm);

    }
}
