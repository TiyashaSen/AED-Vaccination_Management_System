/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccination.WorkQueue;

import Vaccination.UserAccount.UserAcc;
import java.util.Date;

/**
 *
 * @author abhaydeshpande
 */
public class DoctorWorkRequest extends WorkRequest {

    private String hospitalName;
    private String paitentName;
    private String test;
    private int quantity;
    private String sex;
    private UserAcc startUser;
    private UserAcc endUser;
    private String medName;
    private Date reqDate;
    private String status;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public UserAcc getStartUser() {
        return startUser;
    }

    public void setStartUser(UserAcc startUser) {
        this.startUser = startUser;
    }

    public UserAcc getEndUser() {
        return endUser;
    }

    public void setEndUser(UserAcc endUser) {
        this.endUser = endUser;
    }

    public String getMedName() {
        return medName;
    }

    public void setMedName(String medName) {
        this.medName = medName;
    }

    public Date getReqDate() {
        return reqDate;
    }

    public void setReqDate(Date reqDate) {
        this.reqDate = reqDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getPaitentName() {
        return paitentName;
    }

    public void setPaitentName(String paitentName) {
        this.paitentName = paitentName;
    }

}
