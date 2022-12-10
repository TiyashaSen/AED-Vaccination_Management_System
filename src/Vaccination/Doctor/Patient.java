/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccination.Doctor;

import Vaccination.Vaccine.VaccineList;
import Vaccination.Medicine.Drug;
import Vaccination.Variant.Variant;
import Vaccination.Variant.VariantHistory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author prakruthisomashekar
 */
public class Patient {

    private int pId;
    private String pName;
    private int age;
    private String mail;
    private String Test;
    private VariantHistory variantHistory;
    private String sex;
    private String med;
    private VariantHistory newVariantHistory;
    private VaccineList newVaccineArray;

    public Patient() {

        variantHistory = new VariantHistory();
        newVariantHistory = new VariantHistory();
        newVaccineArray = new VaccineList();
    }

    public String getMed() {
        return med;
    }

    public void setMedicine(String med) {
        this.med = med;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTest() {
        return Test;
    }

    public void setTest(String Test) {
        this.Test = Test;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getPId() {
        return pId;
    }

    public void setPId(int pId) {
        this.pId = pId;
    }

    public String getPName() {
        return pName;
    }

    public void setPName(String pName) {
        this.pName = pName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public VariantHistory getVariantHistory() {
        return variantHistory;
    }

    public void setVariantHistory(VariantHistory variantHistory) {
        this.variantHistory = variantHistory;
    }

    public VariantHistory getNewVariantHistory() {
        return newVariantHistory;
    }

    public void setNewVariantHistory(VariantHistory newVariantHistory) {
        this.newVariantHistory = newVariantHistory;
    }

    @Override
    public String toString() {
        return this.pName;
    }

}
