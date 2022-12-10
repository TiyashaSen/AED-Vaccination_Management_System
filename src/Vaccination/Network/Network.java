/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccination.Network;

import Vaccination.Enterprise.EnterpriseList;

/**
 *
 * @author abhaydeshpande
 */
public class Network {

    private String name;
    private EnterpriseList enterpriseDirectory;

    public Network() {
        enterpriseDirectory = new EnterpriseList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseList getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    @Override
    public String toString() {
        return name;
    }

}
