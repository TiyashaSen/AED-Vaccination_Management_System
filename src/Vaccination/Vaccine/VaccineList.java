/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vaccination.Vaccine;

import java.util.ArrayList;

/**
 *
 * @author tiyashasen
 */
public class VaccineList {
     private ArrayList<Vaccine> vaccinationList;
    private ArrayList<Vaccine> vaccinationDirectory;
    private Vaccine newvaccine;

    public VaccineList() {
        this.vaccinationList = new ArrayList<Vaccine>();
    }

    public Vaccine getNewVaccine() {
        return newvaccine;
    }

    public void setNewVaccine(Vaccine newvaccine) {
        this.newvaccine = newvaccine;
    }

    public ArrayList<Vaccine> getVaccinationList() {
        return vaccinationList;
    }

    public void setVaccinationList(ArrayList<Vaccine> vaccinationList) {
        this.vaccinationList = vaccinationList;
    }

    public ArrayList<Vaccine> getVaccinationDirectory() {
        return vaccinationDirectory;
    }

    public void setVaccinationDirectory(ArrayList<Vaccine> vaccinationDirectory) {
        this.vaccinationDirectory = vaccinationDirectory;
    }

    public Vaccine getNewvaccine() {
        return newvaccine;
    }

    public void setNewvaccine(Vaccine newvaccine) {
        this.newvaccine = newvaccine;
    }
    
    

    

    public ArrayList<Vaccine> addVaccineDirectory(Vaccine c) {
        ArrayList<Vaccine> vaccineDirectory = new ArrayList<Vaccine>();
        vaccineDirectory.add(c);
        return vaccineDirectory;
    }

    public Vaccine addVaccineToList() {
        Vaccine c = new Vaccine();
        vaccinationList.add(c);
        return c;

    }
}
