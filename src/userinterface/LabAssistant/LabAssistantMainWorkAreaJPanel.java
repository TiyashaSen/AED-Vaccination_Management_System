/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LabAssistant;

import Vaccination.Configuration.EcoSystem;
import Vaccination.Enterprise.Enterprise;
import Vaccination.Network.Network;
import Vaccination.Organization.Laboratory;
import Vaccination.Organization.Organization;
import Vaccination.UserAccount.UserAccount;
import Vaccination.WorkQueue.LabTestWorkRequest;
import Vaccination.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author tiyashasen
 */
public class LabAssistantMainWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private Laboratory labOrganization;
    private Network network;
    private Enterprise enterprise;
    private static Logger log = Logger.getLogger(LabAssistantMainWorkAreaJPanel.class);
    private static final String CLASS_NAME = LabAssistantMainWorkAreaJPanel.class.getName();

    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public LabAssistantMainWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.business = business;
        this.labOrganization = (Laboratory) organization;
        this.enterprise = enterprise;
        this.network = network;
        log.debug(userAccount + " " + "logged in");
        populateTable();
        this.setSize(1920, 1080);
    }

    public void populateTable() {
        try {
            DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

            model.setRowCount(0);

            for (WorkRequest request : labOrganization.getWq().getWorkRequestList()) {
                if (request instanceof LabTestWorkRequest) {
                    Object[] row = new Object[8];
                    row[0] = ((LabTestWorkRequest) request);
                    row[1] = ((LabTestWorkRequest) request).getPatient().getAge();
                    row[2] = ((LabTestWorkRequest) request).getPatient().getSex();
                    row[3] = request.getMessage();
                    row[4] = request.getEndUser().getEmployee().getName();
                    row[5] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
                    row[6] = request.getStatus();
                    if (request.getReceiver() == null || request.getReceiver().equals("Processing")) {
                        row[7] = null;
                    } else {
                        row[7] = ((LabTestWorkRequest) request).getPatient().getVariantHistory().getVariantHistory().getVariantName();
                    }
                    model.addRow(row);
                }
            }
        } catch (Exception e) {
            System.out.println("lab assistant table is yet to get data");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        assignBtn = new javax.swing.JButton();
        processBtn = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        LabLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(233, 235, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setBackground(new java.awt.Color(102, 102, 102));
        workRequestJTable.setForeground(new java.awt.Color(255, 255, 255));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PATIENT NAME", "AGE", "SEX", "MESSAGE", "SENDER", "RECEIVER", "STATUS", "VARIANT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestJTable.setRowHeight(30);
        jScrollPane.setViewportView(workRequestJTable);

        add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 111, 752, 234));

        assignBtn.setBackground(new java.awt.Color(0, 0, 0));
        assignBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        assignBtn.setForeground(new java.awt.Color(255, 255, 255));
        assignBtn.setText("ASSIGN TO ME");
        assignBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });
        add(assignBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 351, 115, 32));

        processBtn.setBackground(new java.awt.Color(0, 0, 0));
        processBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        processBtn.setForeground(new java.awt.Color(255, 255, 255));
        processBtn.setText("PROCESS");
        processBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        processBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processBtnActionPerformed(evt);
            }
        });
        add(processBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 351, 78, 32));

        refreshJButton.setBackground(new java.awt.Color(0, 0, 0));
        refreshJButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        refreshJButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshJButton.setText("REFRESH");
        refreshJButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 351, 88, 32));

        LabLbl.setBackground(new java.awt.Color(0, 0, 0));
        LabLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        LabLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabLbl.setText("LAB ASSISTANT PANEL");
        add(LabLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 51, 752, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        //to check task is  already completed
        if (workRequestJTable.getValueAt(selectedRow, 6) != null) {
            if (((workRequestJTable.getValueAt(selectedRow, 6).equals("Completed")))) {

                JOptionPane.showMessageDialog(null, "Task is already completed");
                return;
            }
        }

        //to check task is already assigned        
        if (workRequestJTable.getValueAt(selectedRow, 6) != null) {
            if (workRequestJTable.getValueAt(selectedRow, 5) != null) {
                if (userAccount.getUsername().equalsIgnoreCase(workRequestJTable.getValueAt(selectedRow, 5).toString())) {

                    if (workRequestJTable.getValueAt(selectedRow, 6).equals("Pending")) {
                        JOptionPane.showMessageDialog(null, "Task is already assigned");
                        return;
                    }
                }
            }
        }
        //to check the task is assigned to some one else 
        if (workRequestJTable.getValueAt(selectedRow, 6) != null) {
            if (workRequestJTable.getValueAt(selectedRow, 5) != null) {
                if (workRequestJTable.getValueAt(selectedRow, 6).equals("Processing")) {
                    JOptionPane.showMessageDialog(null, "Task is already assigned");
                    return;
                }
            }
        }

        //to check whether task is already assigined 
        if (workRequestJTable.getValueAt(selectedRow, 5) != null) {
            if (!userAccount.getUsername().equalsIgnoreCase(workRequestJTable.getValueAt(selectedRow, 5).toString())) {
                JOptionPane.showMessageDialog(null, "Task is already assigned");
                return;
            }
        }
        int flag = 0;

        for (WorkRequest request : labOrganization.getWq().getWorkRequestList()) {

            if (request.getStatus() == null) {
                continue;
            }
            if (request.getStatus().equals("Pending")) {

                if (request.getReceiver() != null) {

                    if (userAccount.getUsername().equalsIgnoreCase(request.getReceiver().toString())) {
                        flag = 1;
                    }
                }
            }
        }
        if (flag == 1) {
            JOptionPane.showMessageDialog(null, "Please complete the existing request before taking a new request");
            return;

        }
        int flag1 = 0;
        for (WorkRequest request : labOrganization.getWq().getWorkRequestList()) {

            if (request.getStatus() == null) {
                continue;
            }
            if (workRequestJTable.getValueAt(selectedRow, 5) != null) {
                if (request.getStatus().equals("Processing") && userAccount.getUsername().equalsIgnoreCase(workRequestJTable.getValueAt(selectedRow, 5).toString())) {
                    flag1 = 1;
                }
            }
        }
        if (flag1 == 1) {
            JOptionPane.showMessageDialog(null, "Please complete the existing request before taking a new request");
            return;

        }

        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        log.debug(userAccount + " " + "has assigned the request");
        log.debug("status has been set to pending");
        populateTable();

    }//GEN-LAST:event_assignBtnActionPerformed

    private void processBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processBtnActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        //to check whether the task is completed 
        LabTestWorkRequest request = (LabTestWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        if (workRequestJTable.getValueAt(selectedRow, 6) != null) {
            if (((workRequestJTable.getValueAt(selectedRow, 6).equals("Completed")))) {

                JOptionPane.showMessageDialog(null, "Task is already completed");
                return;
            }
        }
        //to check whether task is assigned forr process
        if (workRequestJTable.getValueAt(selectedRow, 5) != null) {
            if (workRequestJTable.getValueAt(selectedRow, 6) == null || !userAccount.getUsername().equalsIgnoreCase(workRequestJTable.getValueAt(selectedRow, 5).toString())) {
                JOptionPane.showMessageDialog(null, "Task is not assigned to you for process");
                return;
            }
        }
        int flag = 0;
        if (workRequestJTable.getValueAt(selectedRow, 5) != null) {
            if (workRequestJTable.getValueAt(selectedRow, 6).equals("Processing")) {

                flag = 1;
            }
        }
        if (flag != 1) {
            if (workRequestJTable.getValueAt(selectedRow, 6) != null) {

                if ((!(workRequestJTable.getValueAt(selectedRow, 6).equals("Pending")))) {
                    JOptionPane.showMessageDialog(null, "Task is not assigned to you for process");
                    return;
                }
            }
        }

        request.setStatus("Processing");

        LabProcessWorkRequestJPanel processWorkRequestJPanel = new LabProcessWorkRequestJPanel(userProcessContainer, request, labOrganization, userAccount, network);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        log.debug("entering process request page");
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_processBtnActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
        log.debug("refreshed the table");
    }//GEN-LAST:event_refreshJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabLbl;
    private javax.swing.JButton assignBtn;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JButton processBtn;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
