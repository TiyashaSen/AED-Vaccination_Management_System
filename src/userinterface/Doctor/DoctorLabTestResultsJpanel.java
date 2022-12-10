/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Doctor;

import Vaccination.WorkQueue.LabTestWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import org.apache.log4j.Logger;

/**
 *
 * @author prakruthisomashekar
 */
public class DoctorLabTestResultsJpanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorLabTestResultsJpanel
     */
    private JPanel userProcessContainer;
    private LabTestWorkRequest request;
    private static Logger log = Logger.getLogger(DoctorLabTestResultsJpanel.class);
    private static final String CLASS_NAME = DoctorLabTestResultsJpanel.class.getName();

    public DoctorLabTestResultsJpanel(JPanel userProcessContainer, LabTestWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        patientTxtField.setText(request.getPatientName());
        txtGene.setText(request.getPatient().getVariantHistory().getVariantHistory().getVariantName());
    

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabTestLbl = new javax.swing.JLabel();
        patientTxtField = new javax.swing.JTextField();
        patientLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtGene = new javax.swing.JTextField();
        patientLbl1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(233, 235, 204));
        setPreferredSize(new java.awt.Dimension(2000, 1200));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabTestLbl.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        LabTestLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabTestLbl.setText("COVID-19 VARIANT DETECTED");
        add(LabTestLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 334, -1));

        patientTxtField.setEditable(false);
        add(patientTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 179, -1));

        patientLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        patientLbl.setText("PATIENT NAME:");
        add(patientLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 161, -1, -1));

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
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 59, 27));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/images.jpeg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 400, 310));
        add(txtGene, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 179, -1));

        patientLbl1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        patientLbl1.setText("VARIANT NAME:");
        add(patientLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/coronavirus.png"))); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 683, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/coronavirus.png"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 847, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/stay-at-home.png"))); // NOI18N
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 72, 525, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorRequestJpanel dwjp = (DoctorRequestJpanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabTestLbl;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel patientLbl;
    private javax.swing.JLabel patientLbl1;
    private javax.swing.JTextField patientTxtField;
    private javax.swing.JTextField txtGene;
    // End of variables declaration//GEN-END:variables
}
