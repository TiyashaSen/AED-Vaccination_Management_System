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
public class Sample extends Enterprise {

    public Sample(String name) {
        super(name, EnterpriseType.Sample);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
