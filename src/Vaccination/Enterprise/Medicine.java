/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vaccination.Enterprise;

import Vaccination.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author abhaydeshpande
 */
public class Medicine extends Enterprise {

    public Medicine(String name) {
        super(name, Enterprise.EnterpriseType.Medicine);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
