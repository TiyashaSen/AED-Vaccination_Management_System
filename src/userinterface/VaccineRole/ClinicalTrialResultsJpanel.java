/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VaccineRole;

import Vaccination.Vaccine.VaccineList;
import Vaccination.Medicine.MedicinesList;
import Vaccination.Configuration.EcoSystem;
import Vaccination.Enterprise.Enterprise;
import Vaccination.Variant.VariantDirect;
import Vaccination.Network.Network;
import Vaccination.Organization.Clinic;
import Vaccination.Organization.Medicine;
import Vaccination.Organization.Organization;
import Vaccination.Organization.Vaccine;

import Vaccination.UserAccount.UserAcc;
import Vaccination.WorkQueue.ClinicalTrialWorkRequest;
import Vaccination.WorkQueue.MedicineWorkRequest;
import Vaccination.WorkQueue.VaccineWorkRequest;
import Vaccination.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author tiyashasen
 */
public class ClinicalTrialResultsJpanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAcc userAccount;
    private Organization vaccineOrganization;
    private MedicinesList dl;
    private VariantDirect variantDirectory;
    private VaccineList vaccineDirectory;
    private Enterprise enterprise;
    private Network network;
    private static Logger log = Logger.getLogger(ClinicalTrialResultsJpanel.class);
    private static final String CLASS_NAME = ClinicalTrialResultsJpanel.class.getName();

    /**
     * Creates new form LabResultsJpanel
     */
    public ClinicalTrialResultsJpanel(JPanel userProcessContainer, UserAcc userAccount, Enterprise enterprise, Organization vaccineOrganization, Network network, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.vaccineOrganization = (Vaccine) vaccineOrganization;
        this.enterprise = enterprise;
        this.network = network;
        this.business = business;
        this.dl = dl;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        assignBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMessage1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(233, 235, 204));
        setForeground(new java.awt.Color(233, 235, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(233, 235, 204));

        workRequestJTable.setFont(new java.awt.Font("Helvetica", 1, 12)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Name", "Age", "Sex", "Message", "Sender", "Status", "Sample"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestJTable.setRowHeight(30);
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 620, 200));

        backBtn.setBackground(new java.awt.Color(51, 0, 51));
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("BACK");
        backBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 82, 31));

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("COVID-19 LAB TEST");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 585, -1));

        assignBtn.setBackground(new java.awt.Color(51, 0, 51));
        assignBtn.setForeground(new java.awt.Color(255, 255, 255));
        assignBtn.setText("SUBMIT");
        assignBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });
        add(assignBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 550, 80, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/tiyashasen/Documents/360_F_319635946_sOANESrjcrrUcC8HaYhljBvYYNi9Q5l8.jpeg")); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -30, 340, 690));

        txtMessage.setBackground(new java.awt.Color(51, 51, 51));
        txtMessage.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        txtMessage.setForeground(new java.awt.Color(255, 255, 255));
        txtMessage.setText("CLINICAL TRIAL RESULTS");
        add(txtMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 270, 70));

        jLabel3.setBackground(new java.awt.Color(51, 0, 51));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MORE INFORMATION ON VIRUS SAMPLE:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 500, -1, 30));

        txtMessage1.setBackground(new java.awt.Color(204, 204, 255));
        add(txtMessage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 550, 220, 30));
    }// </editor-fold>//GEN-END:initComponents

    public void populateTable() {
        try {
            DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
            model.setRowCount(0);

            for (WorkRequest request : vaccineOrganization.getWq().getWorkRequestList()) {

                if (request instanceof VaccineWorkRequest) {

                    Object[] row = new Object[8];
                    row[0] = ((VaccineWorkRequest) request);

                    row[1] = ((VaccineWorkRequest) request).getPatient().getAge();

                    row[2] = ((VaccineWorkRequest) request).getPatient().getSex();

                    row[3] = request.getMessage();

                    row[4] = request.getReceiver();

                    row[5] = request.getStatus();

                    String result = ((VaccineWorkRequest) request).getPatient().getNewVariantHistory().getVariantHistory().getVariantName();

                    if (request.getReceiver() == null || request.getReceiver().equals("Processing")) {
                        row[6] = null;
                    } else {
                        row[6] = ((VaccineWorkRequest) request).getPatient().getNewVariantHistory().getVariantHistory().getVariantName();
                    }

                    model.addRow(row);
                }

            }
        } catch (Exception e) {
            System.out.println("cliical trial result talble is yet to get data");
        }


    }

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        VaccineWorkArea dwjp = (VaccineWorkArea) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        } else if (txtMessage.getText() != null) {
            String message = txtMessage.getText();
            JOptionPane.showMessageDialog(null, "Information for " + workRequestJTable.getValueAt(selectedRow, 6) + " has been updated. ");
        }


    }//GEN-LAST:event_assignBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextField txtMessage1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables

}
