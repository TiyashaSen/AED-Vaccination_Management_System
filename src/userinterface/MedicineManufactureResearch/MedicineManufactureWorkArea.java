/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package userinterface.MedicineManufactureResearch;

import Vaccination.Configuration.EcoSystem;
import Vaccination.Enterprise.Enterprise;
import Vaccination.Network.Network;
import Vaccination.Organization.Medicine;
import Vaccination.Organization.Organization;
import Vaccination.UserAccount.UserAcc;
import Vaccination.WorkQueue.MedicineWorkRequest;
import Vaccination.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author abhaydeshpande
 */
public class MedicineManufactureWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form MedicineManufactureWorkArea
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAcc userAccount;
    private Medicine medicineOrganization;
    private Enterprise enterprise;
    private Network network;
    private static Logger log = Logger.getLogger(MedicineManufactureWorkArea.class);
    private static final String CLASS_NAME = MedicineManufactureWorkArea.class.getName();

    public MedicineManufactureWorkArea(JPanel userProcessContainer, EcoSystem business,
            UserAcc userAccount, Organization medicineOrganization, Enterprise enterprise,
            Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.business = business;
        this.enterprise = enterprise;
        this.network = network;
        this.medicineOrganization = (Medicine) medicineOrganization;
        log.debug(userAccount + " " + "logged in drug work area");
        populateTable();

    }

    public void populateTable() {
        try {
            DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
            model.setRowCount(0);
            for (WorkRequest request : medicineOrganization.getWq().getWorkRequestList()) {
                if (((MedicineWorkRequest) request).getPatient() == null) {
                    System.out.println("came even further");
                    Object[] row = new Object[6];
                    row[0] = ((MedicineWorkRequest) request);
                    row[1] = ((MedicineWorkRequest) request).getQty();
                    row[2] = request.getEndUser().getEmployee().getName();
                    row[3] = request.getReceiver() == null ? null
                            : request.getReceiver().getEmployee().getName();
                    row[4] = request.getStatus();
                    row[5] = ((MedicineWorkRequest) request).getTOD();

                    model.addRow(row);
                }
            }
        } catch (Exception e) {
            System.out.println("medicine manufacturer panel yet to get data into the table");
        }

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT
     * modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        assignBtn = new javax.swing.JButton();
        reqChemButton = new javax.swing.JButton();
        processBtn = new javax.swing.JButton();
        labRequestButton = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MEDICINE MANUFACTURE AND RESEARCH CENTER");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 132, 675, -1));

        workRequestJTable.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

        }, new String[] {"MEDICINE NAME", "QUANTITY", "SENDER", "RECEIVER", "STATUS",
                "DELIVERY TIME"}) {
            Class[] types = new Class[] {java.lang.Object.class, java.lang.String.class,
                    java.lang.String.class, java.lang.String.class, java.lang.Object.class,
                    java.lang.Object.class};
            boolean[] canEdit = new boolean[] {false, false, false, false, false, false};

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        workRequestJTable.setRowHeight(30);
        jScrollPane2.setViewportView(workRequestJTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 174, 675, 196));

        assignBtn.setBackground(new java.awt.Color(0, 0, 255));
        assignBtn.setForeground(new java.awt.Color(255, 255, 255));
        assignBtn.setText("ASSIGN");
        assignBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1,
                new java.awt.Color(255, 255, 255)));
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });
        add(assignBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 388, 100, 37));

        reqChemButton.setBackground(new java.awt.Color(0, 0, 255));
        reqChemButton.setForeground(new java.awt.Color(255, 255, 255));
        reqChemButton.setText("REQUEST VACCINES");
        reqChemButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1,
                new java.awt.Color(255, 255, 255)));
        reqChemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqChemButtonActionPerformed(evt);
            }
        });
        add(reqChemButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 443, 182, 33));

        processBtn.setBackground(new java.awt.Color(0, 0, 255));
        processBtn.setForeground(new java.awt.Color(255, 255, 255));
        processBtn.setText("PROCESS");
        processBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1,
                new java.awt.Color(255, 255, 255)));
        processBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processBtnActionPerformed(evt);
            }
        });
        add(processBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 443, 100, 33));

        labRequestButton.setBackground(new java.awt.Color(0, 0, 255));
        labRequestButton.setForeground(new java.awt.Color(255, 255, 255));
        labRequestButton.setText("VIEW LAB TEST AND CLINICAL TRIAL RESULTS");
        labRequestButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1,
                new java.awt.Color(255, 255, 255)));
        labRequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labRequestButtonActionPerformed(evt);
            }
        });
        add(labRequestButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 390, 306, 32));

        refreshBtn.setBackground(new java.awt.Color(0, 0, 255));
        refreshBtn.setForeground(new java.awt.Color(255, 255, 255));
        refreshBtn.setText("REFRESH");
        refreshBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1,
                new java.awt.Color(255, 255, 255)));
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });
        add(refreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 100, 33));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/research-2.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 513, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/chemistry.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 14, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/research.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 518, -1, -1));

        jLabel5.setIcon(
                new javax.swing.ImageIcon(getClass().getResource("/Image/pharmaceutical.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 513, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_assignBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "please select a row ");
            return;
        }
        // to check whether the the task is already assigned list
        if (workRequestJTable.getValueAt(selectedRow, 4) != null) {

            if (workRequestJTable.getValueAt(selectedRow, 4).equals("Assigned")) {
                JOptionPane.showMessageDialog(null, "Task is already assigned");
                return;
            }
        }
        if (workRequestJTable.getValueAt(selectedRow, 4) != null) {

            if (workRequestJTable.getValueAt(selectedRow, 4).equals("Completed")) {
                JOptionPane.showMessageDialog(null, "Task is already Completed");
                return;
            }
        }
        // to set the falg if already theere existing job
        int flag = 0;
        for (WorkRequest request : medicineOrganization.getWq().getWorkRequestList()) {

            if (request.getStatus() == null) {
                continue;
            }
            if (request.getStatus().equals("Assigned")) {
                if (request.getReceiver() != null) {
                    if (userAccount.getUsername()
                            .equalsIgnoreCase(request.getReceiver().toString())) {
                        flag = 1;
                    }
                }
            }
        }
        if (flag == 1) {
            JOptionPane.showMessageDialog(null,
                    "Please complete the existing request before taking a new request");
            return;

        }
        int flag1 = 0;
        for (WorkRequest request : medicineOrganization.getWq().getWorkRequestList()) {

            if (request.getStatus() == null) {
                continue;
            }
            if (request.getStatus().equals("Processing")) {
                if (request.getReceiver() != null) {
                    if (userAccount.getUsername()
                            .equalsIgnoreCase(request.getReceiver().toString())) {
                        flag1 = 1;
                    }
                }
            }
        }
        if (flag1 == 1) {
            JOptionPane.showMessageDialog(null,
                    "Please complete the existing request before taking a new request");
            return;

        }

        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Assigned");
        log.debug(userAccount + " " + "assigned himself a task");
        populateTable();
    }// GEN-LAST:event_assignBtnActionPerformed

    private void reqChemButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_reqChemButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        log.debug(userAccount + " " + "entering Vaccine requests page");
        userProcessContainer.add("ViewChemicalsRequestJPanel", new PlaceVaccineRequestsJPanel(
                userProcessContainer, userAccount, enterprise, medicineOrganization, network));
        layout.next(userProcessContainer);
    }// GEN-LAST:event_reqChemButtonActionPerformed

    private void processBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_processBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "please select a row");
            return;
        }

        MedicineWorkRequest request =
                (MedicineWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        if (workRequestJTable.getValueAt(selectedRow, 4) == null) {
            JOptionPane.showMessageDialog(null, "Task is not assigned to you for process");
            return;
        }
        int flag = 0;

        if (workRequestJTable.getValueAt(selectedRow, 4).equals("Processing")
                && userAccount.getUsername().equalsIgnoreCase(request.getReceiver().toString())) {

            flag = 1;
        }
        if (flag != 1) {
            if (workRequestJTable.getValueAt(selectedRow, 4) != null) {

                if (!(((workRequestJTable.getValueAt(selectedRow, 4).equals("Assigned")))
                        && (userAccount.getUsername()
                                .equalsIgnoreCase(request.getReceiver().toString())))) {
                    JOptionPane.showMessageDialog(null, "Task is not assigned to you for process");
                    return;
                }
            }
        }

        request.setStatus("Processing");

        ProcessMedicineWorkRequest processWorkRequestJPanel =
                new ProcessMedicineWorkRequest(userProcessContainer, request);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        log.debug(userAccount + " " + "entering processing page");
        layout.next(userProcessContainer);
    }// GEN-LAST:event_processBtnActionPerformed

    private void labRequestButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_labRequestButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        log.debug(userAccount + " " + "entering lab requests page");
        userProcessContainer.add("LabResultsJPanel", new TestLabResultsJpanel(userProcessContainer,
                userAccount, enterprise, medicineOrganization, network, business));
        layout.next(userProcessContainer);

    }// GEN-LAST:event_labRequestButtonActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
        populateTable();
    }// GEN-LAST:event_refreshBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton labRequestButton;
    private javax.swing.JButton processBtn;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton reqChemButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
