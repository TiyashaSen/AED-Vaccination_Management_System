/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccination.Configuration;

import Vaccine.Medicine.Medicine;
import Vaccine.Vaccine.VaccineDirectory;
import Vaccine.Medicine.MedicinesDirectory;
import Vaccine.Variant.VariantHistory;
import Vaccine.Network.Network;
import Vaccine.Organization.Organization;
import Vaccine.Role.Role;
import Vaccine.Role.SystemAdminRole;
import Vaccine.Vaccine.Vaccine;
import Vaccine.Variant.Variant;
import java.util.ArrayList;

/**
 *
 * @author prakruthisomashekar
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> networkArray;
    private VaccineDirectory vaccineArray;
    private MedicinesDirectory medArray;
    private VariantHistory variantArray;
    private Medicine medicine;
    private Vaccine vaccine;
    private Variant variant;
    private ArrayList<Medicine> listofMedicine = new ArrayList<Medicine>();

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkArray.add(network);
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    private EcoSystem() {
        super(null);
        networkArray = new ArrayList<Network>();

    }

    public ArrayList<Network> getNetworkArray() {
        return networkArray;
    }

    public void setNetworkList(ArrayList<Network> networkArray) {
        this.networkArray = networkArray;
    }

    public boolean UniqueUserCheck(String userName) {
        if (!this.getUAD().UniqueUsernameCheck(userName)) {
            return false;
        }
        for (Network network : networkArray) {

        }
        return true;
    }

    public MedicinesDirectory getMedArray() {
        if (medArray == null) {
            MedicinesDirectory mL = new MedicinesDirectory();
            return mL;
        }

        return medArray;
    }

    public void setMediList(MedicinesDirectory medArray) {
        this.medArray = medArray;
    }

    public VaccineDirectory getVaccineArray() {
        return vaccineArray;
    }

    public void setVaccineListvaccineArray(VaccineDirectory vaccineArray) {
        this.vaccineArray = vaccineArray;
    }

    public VariantHistory getVariantArray() {
        return variantArray;
    }

    public void setVariantArray(VariantHistory variantArray) {
        this.variantArray = variantArray;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public Variant getVariant() {
        return variant;
    }

    public void setVariant(Variant variant) {
        this.variant = variant;
    }

    public ArrayList<Medicine> getListofMedicine() {
        return listofMedicine;
    }

    public void setListofMedicine(ArrayList<Medicine> listofMedicine) {
        this.listofMedicine = listofMedicine;
    }

    public ArrayList<Medicine> addtoListofM(Medicine m) {
        if (m == null) {
            ArrayList<Medicine> listofMedicine = new ArrayList<Medicine>();
            listofMedicine.add(m);
            return listofMedicine;
        } else {
            listofMedicine.add(m);
            return listofMedicine;
        }
    }
}
