/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccination.Connection;

import Vaccination.Enterprise.EnterpriseList;

/**
 *
 * @author tiyashasen
 */
public class Connection {

    private String name;
    private EnterpriseList enterpriseDirectory;

    public Connection() {
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
