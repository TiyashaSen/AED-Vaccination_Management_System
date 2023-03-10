/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LabTechnician;

import Vaccination.Doctor.Patient;
import Vaccination.Enterprise.Enterprise;
import Vaccination.Variant.Variant;
import Vaccination.Connection.Connection;
import Vaccination.Organization.Laboratory;
import Vaccination.Organization.Organization;
import Vaccination.UserAccount.UserAcc;
import Vaccination.WorkQueue.MedicineWorkRequest;
import Vaccination.WorkQueue.LabTestWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.apache.log4j.Logger;

/**
 *
 * @author tiyashasen
 */
public class LabWorkRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private LabTestWorkRequest request;
    private Laboratory labOrganization;
    private UserAcc userAccount;
    private Connection network;
    String filePath = "./genes data.txt";
    private static Logger log = Logger.getLogger(LabWorkRequestJPanel.class);
    private static final String CLASS_NAME = LabWorkRequestJPanel.class.getName();

    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public LabWorkRequestJPanel(JPanel userProcessContainer, LabTestWorkRequest request, Organization organization, UserAcc userAccount, Connection network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.userAccount = userAccount;
        this.network = network;
        this.labOrganization = (Laboratory) organization;
        patientTxtField.setText(request.getPatientName());

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
        addGeneBtn = new javax.swing.JButton();
        geneLbl = new javax.swing.JLabel();
        genetxtField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(233, 235, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submitBtn.setBackground(new java.awt.Color(0, 0, 0));
        submitBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(255, 255, 255));
        submitBtn.setText("UPDATE PATIENT RECORD");
        submitBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 193, 30));

        resultLbl.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        resultLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultLbl.setText("VARIANT DETECTION LAB TEST");
        add(resultLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 551, -1));

        patientTxtField.setEditable(false);
        add(patientTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 134, -1));

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
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 30));

        patientNameLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        patientNameLbl.setText("PATIENT NAME:");
        add(patientNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 104, -1, 20));

        addGeneBtn.setBackground(new java.awt.Color(0, 0, 0));
        addGeneBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        addGeneBtn.setForeground(new java.awt.Color(255, 255, 255));
        addGeneBtn.setText("ADD VARIANT");
        addGeneBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        addGeneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGeneBtnActionPerformed(evt);
            }
        });
        add(addGeneBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 193, 29));

        geneLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        geneLbl.setText("VARIANT NAME:");
        add(geneLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 135, -1, -1));

        genetxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genetxtFieldActionPerformed(evt);
            }
        });
        add(genetxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 134, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LabTechnicianMainJPanel dwjp = (LabTechnicianMainJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        submitBtn.setEnabled(true);
        String genecheck;
        Variant g = ((LabTestWorkRequest) request).getPatient().getVariantHistory().getVariantHistory();
        genecheck = g.getVariantName();
        if (genecheck == null) {
            JOptionPane.showMessageDialog(null, "no variant has been added to submit ");
            return;
        }
        request.setStatus("Completed");
        MedicineWorkRequest requestDrug = new MedicineWorkRequest();

        requestDrug.setPatient(((LabTestWorkRequest) request).getPatient());

        requestDrug.setEndUser(userAccount);

        userAccount.getWorkQueue().getWorkRequestList().add(requestDrug);
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            System.out.println("***** Organization Name:" + enterprise.getName());
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                System.out.println("***** Organization Name:" + organization.getName());
                if (organization.getName().equals("Medicine Organization")) {
                    System.out.println("True");

                    System.out.println("***** organization Name" + organization.getName());

                    organization.getWq().getWorkRequestList().add(requestDrug);
                }
            }

        }
        JOptionPane.showMessageDialog(null, "Result has been succesfully submited");
        submitBtn.setEnabled(false);


    }//GEN-LAST:event_submitBtnActionPerformed

    private void genetxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genetxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genetxtFieldActionPerformed

    private void addGeneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGeneBtnActionPerformed
        // TODO add your handling code here:
        Patient patient = ((LabTestWorkRequest) request).getPatient();
        String variantName = genetxtField.getText().trim();
        if (variantName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please add a variant");
            return;
        }

        ArrayList<String> varientCheck = new ArrayList<>();

        patient.getVariantHistory().getVariantHistory().setVariantName(variantName);


        Variant g = patient.getVariantHistory().getVariantHistory();
        g.setVariantName(variantName);
        request.setPatient(patient);
        genetxtField.setText("");

    }//GEN-LAST:event_addGeneBtnActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addGeneBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel geneLbl;
    private javax.swing.JTextField genetxtField;
    private javax.swing.JLabel patientNameLbl;
    private javax.swing.JTextField patientTxtField;
    private javax.swing.JLabel resultLbl;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables

}
