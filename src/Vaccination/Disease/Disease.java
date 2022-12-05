/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package Vaccination.Disease;

import Vaccination.Variant.Variant;
import java.util.List;

/**
 *
 * @author prakruthisomashekar
 */

public class Disease {

    private int disId;
    private String disName;
    private List<Variant> disGene;

    public int getDisId() {
        return disId;
    }

    public void setDisId(int diseaseId) {
        this.disId = disId;
    }

    public String getDisName() {
        return disName;
    }

    public void setDisName(String disName) {
        this.disName = disName;
    }

    public List<Variant> getDisGene() {
        return disGene;
    }

    public void setDisGene(List<Variant> disGene) {
        this.disGene = disGene;
    }

}
