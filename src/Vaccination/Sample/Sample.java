/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vaccination.Sample;

/**
 *
 * @author tiyashasen
 */

    public class Sample {

    private String sampleName;
    private int sampleId;
    private static int sampleCount = 1;

    public Sample() {
        sampleId = sampleCount;
        sampleCount++;
    }

    public String getSampleName() {
        return sampleName;
    }

    public void setSampleName(String sampleName) {
        this.sampleName = sampleName;
    }

    public int getSampleId() {
        return sampleId;
    }

    public void setSampleId(int sampleId) {
        this.sampleId = sampleId;
    }

    public static int getSampleCount() {
        return sampleCount;
    }

    public static void setSampleCount(int sampleCount) {
        Sample.sampleCount = sampleCount;
    }

    

    public static int getCount() {
        return sampleCount;
    }

    public static void setCount(int count) {
        Sample.sampleCount = count;
    }

   

    @Override
    public String toString() {
        return "Sample{" + "samplename=" + sampleName + ", id=" + sampleId + '}';
    }
}
