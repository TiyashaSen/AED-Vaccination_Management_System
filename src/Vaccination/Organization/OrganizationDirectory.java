/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccination.Organization;

import Vaccination.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author deepa
 */
public class OrganizationDirectory {

    private ArrayList<Organization> orgList;

    public OrganizationDirectory() {
        orgList = new ArrayList();
    }

    public ArrayList<Organization> getOrgList() {
        return orgList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())) {
            organization = new Doctor();
            orgList.add(organization);
        } else if (type.getValue().equals(Type.Lab.getValue())) {
            organization = new Lab();
            orgList.add(organization);
        } else if (type.getValue().equals(Type.Pharmacy.getValue())) {
            organization = new Pharmacy();
            orgList.add(organization);
        } else if (type.getValue().equals(Type.Medicine.getValue())) {
            organization = new Medicine();
            orgList.add(organization);
        } else if (type.getValue().equals(Type.Vaccine.getValue())) {
            organization = new Vaccine();
            orgList.add(organization);
        } else if (type.getValue().equals(Type.Sample.getValue())) {
            organization = new Sample();
            orgList.add(organization);
        } else if (type.getValue().equals(Type.Clinic.getValue())) {
            organization = new Clinic();
            orgList.add(organization);
        }
        return organization;
    }
}
