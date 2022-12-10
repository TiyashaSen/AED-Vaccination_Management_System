/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Clinic;

import Vaccination.Doctor.Patient;
import Vaccination.Enterprise.Enterprise;
import Vaccination.Variant.Variant;
import Vaccination.Connection.Connection;
import Vaccination.Organization.Clinic;

import Vaccination.Organization.Organization;
import Vaccination.UserAccount.UserAcc;
import Vaccination.WorkQueue.ClinicalTrialWorkRequest;
import Vaccination.WorkQueue.MedicineWorkRequest;

import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.apache.log4j.Logger;

/**
 *
 * @author prakruthisomashekar
 */
public class ProcessWorkRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private ClinicalTrialWorkRequest request;
    private Clinic clinicOrganization;
    private UserAcc userAccount;
    private Connection network;
    private static Logger log = Logger.getLogger(ProcessWorkRequestJPanel.class);
    private static final String CLASS_NAME = ProcessWorkRequestJPanel.class.getName();

    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public ProcessWorkRequestJPanel(JPanel userProcessContainer, ClinicalTrialWorkRequest request, Organization organization, UserAcc userAccount, Connection network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.userAccount = userAccount;
        this.network = network;
        this.clinicOrganization = (Clinic) organization;
        patientTxtField.setText(request.getPatientName());
        this.setSize(1920, 1080);
        System.out.println(request.getStatus());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitBtn = new javax.swing.JButton();
        resultLbl = new javax.swing.JLabel();
        patientTxtField = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        patientNameLbl = new javax.swing.JLabel();
        addSampleBtn = new javax.swing.JButton();
        geneLbl = new javax.swing.JLabel();
        genetxtField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(233, 235, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submitBtn.setBackground(new java.awt.Color(0, 0, 0));
        submitBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(255, 255, 255));
        submitBtn.setText("UPDATE THE PATIENT RECORD");
        submitBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 224, -1, 35));

        resultLbl.setBackground(new java.awt.Color(0, 0, 0));
        resultLbl.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        resultLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultLbl.setText("CLINICAL TRIAL RESULTS FOR SAMPLE DETECTION");
        add(resultLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 80, 474, -1));

        patientTxtField.setEditable(false);
        add(patientTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 128, 134, -1));

        backBtn.setBackground(new java.awt.Color(0, 0, 0));
        backBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("BACK");
        backBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 224, 64, 35));

        patientNameLbl.setBackground(new java.awt.Color(0, 0, 0));
        patientNameLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        patientNameLbl.setText("PATIENT NAME:");
        add(patientNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 131, -1, -1));

        addSampleBtn.setBackground(new java.awt.Color(0, 0, 0));
        addSampleBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        addSampleBtn.setForeground(new java.awt.Color(255, 255, 255));
        addSampleBtn.setText("ADD SAMPLE");
        addSampleBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        addSampleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSampleBtnActionPerformed(evt);
            }
        });
        add(addSampleBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 188, 194, 30));

        geneLbl.setBackground(new java.awt.Color(0, 0, 0));
        geneLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        geneLbl.setText("NEW SAMPLE DETECTED:");
        add(geneLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 160, -1, -1));

        genetxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genetxtFieldActionPerformed(evt);
            }
        });
        add(genetxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 157, 134, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/chemical-reaction.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 308, 233, -1));
    }// </editor-fold>//GEN-END:initComponents


    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AssistantWorkAreaJPanel dwjp = (AssistantWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        submitBtn.setEnabled(true);
        String sampleCheck;
        Variant v = ((ClinicalTrialWorkRequest) request).getPatient().getVariantHistory().getVariantHistory();
        sampleCheck = v.getVariantName();

        if (sampleCheck == null) {
            JOptionPane.showMessageDialog(null, "no variant has been added to submit ");
            return;
        }
        request.setStatus("Completed");
        MedicineWorkRequest medReq = new MedicineWorkRequest();

        medReq.setPatient(((ClinicalTrialWorkRequest) request).getPatient());

        medReq.setEndUser(userAccount);

        userAccount.getWorkQueue().getWorkRequestList().add(medReq);
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            System.out.println("***** Organization Name:" + enterprise.getName());
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                System.out.println("***** Organization Name:" + organization.getName());
                if (organization.getName().equals("Medicine Organization") || organization.getName().equals("Lab Organization")| organization.getName().equals("Clinic Organization")) {
                    System.out.println("True");

                    System.out.println("***** organization Name" + organization.getName());

                    organization.getWq().getWorkRequestList().add(medReq);
                }
            }

        }
        JOptionPane.showMessageDialog(null, "Result has been succesfully submited");
        submitBtn.setEnabled(false);


    }//GEN-LAST:event_submitBtnActionPerformed

    private void genetxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genetxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genetxtFieldActionPerformed

    private void addSampleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSampleBtnActionPerformed
        // TODO add your handling code here:
        Patient patient = ((ClinicalTrialWorkRequest) request).getPatient();
        String sampleName = genetxtField.getText().trim();
        if (sampleName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please add a variant");
            return;
        }

        ArrayList<String> sampleCheck = new ArrayList<>();

        patient.getVariantHistory().getVariantHistory().setVariantName(sampleName);

        Variant v = patient.getVariantHistory().getVariantHistory();
        v.setVariantName(sampleName);
        request.setPatient(patient);

        genetxtField.setText("");
    }//GEN-LAST:event_addSampleBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSampleBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel geneLbl;
    private javax.swing.JTextField genetxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel patientNameLbl;
    private javax.swing.JTextField patientTxtField;
    private javax.swing.JLabel resultLbl;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables

}
