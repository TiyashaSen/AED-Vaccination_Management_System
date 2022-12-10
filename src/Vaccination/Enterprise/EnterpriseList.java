/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccination.Enterprise;

import Vaccination.Organization.OrganizationList;
import java.util.ArrayList;

/**
 *
 * @author abhaydeshpande
 */
public class EnterpriseList {

    private ArrayList<Enterprise> enterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public EnterpriseList() {
        enterpriseList = new ArrayList<Enterprise>();
    }

    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Hospital) {
            enterprise = new Hospital(name);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.Pharmacy) {
            enterprise = new Pharmacy(name);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.Medicine) {
            enterprise = new Medicine(name);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.Vaccine) {

            enterprise = new Vaccine(name);
            enterpriseList.add(enterprise);

        } else if (type == Enterprise.EnterpriseType.Sample) {

            enterprise = new Sample(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
