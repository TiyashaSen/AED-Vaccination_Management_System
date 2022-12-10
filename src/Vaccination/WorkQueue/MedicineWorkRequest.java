/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccination.WorkQueue;

import Vaccination.Vaccine.Vaccine;
import Vaccination.Doctor.Patient;
import Vaccination.Medicine.Drug;
import Vaccination.Variant.Variant;
import java.util.List;
import java.util.Map;

/**
 *
 * @author prakruthisomashekar
 */
public class MedicineWorkRequest extends WorkRequest {

    private String medName;
    private int qty;
    private String TOD;
    private Patient patient;
    private Map<Variant, Vaccine> geneChemical;
    private Map<Drug, List<Vaccine>> drugChemical;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getMedName() {
        return medName;
    }

    public void setMedName(String medName) {
        this.medName = medName;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getTOD() {
        return TOD;
    }

    public void setTOD(String TOD) {
        this.TOD = TOD;
    }

    public Map<Variant, Vaccine> getGeneChemical() {
        return geneChemical;
    }

    public void setGeneChemical(Map<Variant, Vaccine> geneChemical) {
        this.geneChemical = geneChemical;
    }

    public Map<Drug, List<Vaccine>> getDrugChemical() {
        return drugChemical;
    }

    public void setDrugChemical(Map<Drug, List<Vaccine>> drugChemical) {
        this.drugChemical = drugChemical;
    }

    @Override
    public String toString() {
        return this.medName;
    }

}
