/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccination.Organization;

import Vaccination.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author prakruthisomashekar
 */

public class OrganizationList {

    private ArrayList<Organization> organizationList;

    public OrganizationList() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrg(Type type) {
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())) {
            organization = new DoctorOrg();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Laboratory.getValue())) {
            organization = new Laboratory();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Pharmacy.getValue())) {
            organization = new Pharmacy();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Medicine.getValue())) {
            organization = new Medicine();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Vaccine.getValue())) {
            organization = new Vaccine();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Sample.getValue())) {
            organization = new Sample();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Clinic.getValue())) {
            organization = new Clinic();
            organizationList.add(organization);
        }
        return organization;
    }
}
