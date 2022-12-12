/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PharmacyRole;

import Vaccination.Enterprise.Enterprise;
import Vaccination.MedicalInventory.MedicalInventory;
import Vaccination.MedicalInventory.MedicalInventoryList;
import Vaccination.Connection.Connection;
import Vaccination.Organization.Organization;
import Vaccination.Organization.Pharmacy;
import Vaccination.UserAccount.UserAcc;
import Vaccination.WorkQueue.MedicineWorkRequest;
import Vaccination.WorkQueue.PharmacyWorkRequest;
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
public class PharmacyMainJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PharmacyMainJPanel
     */
    JPanel userProcessContainer;
    private UserAcc userAccount;
    private Enterprise enterprise;
    private MedicalInventoryList medInvList;
    private Organization org;
    private Pharmacy pharmorg;
    private Connection network;
    private static Logger log = Logger.getLogger(PharmacyMainJPanel.class);
    private static final String CLASS_NAME = PharmacyMainJPanel.class.getName();

    public PharmacyMainJPanel(JPanel userProcessContainer, UserAcc userAccount, Pharmacy organization, Enterprise enterprise, Connection network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.pharmorg = organization;
        this.network = network;
        reorderTable();
        populateDocTable();
        log.debug(userAccount + " " + "logged in");
    }

    public void reorderTable() {
        try {
            int rowCount = reorderTable.getRowCount();
            DefaultTableModel model = (DefaultTableModel) reorderTable.getModel();
            for (int i = rowCount - 1; i >= 0; i--) {
                model.removeRow(i);
            }
            for (MedicalInventory mi : pharmorg.getMedList()) {
                Object row[] = new Object[6];
                row[0] = mi;
                row[1] = mi.getRollNum();
                row[2] = mi.getQtyAvail();
                row[3] = mi.getNeededQty();
                row[4] = mi.getRePurchaseStatus();
                model.addRow(row);
            }
        } catch (Exception e) {
            System.out.println("pharmacy work area table is yet to get data");
        }
    }

    public void populateDocTable() {
        try {

            DefaultTableModel model = (DefaultTableModel) docrequestTable.getModel();

            model.setRowCount(0);

            for (WorkRequest request : pharmorg.getWq().getWorkRequestList()) {
                System.out.println("entering medication");

                if (request instanceof PharmacyWorkRequest) {
                    Object[] row = new Object[3];
                    row[0] = ((PharmacyWorkRequest) request).getMedName();
                    row[1] = ((PharmacyWorkRequest) request).getQty();
                    row[2] = ((PharmacyWorkRequest) request).getStatus();

                    model.addRow(row);
                }
            }
        } catch (Exception e) {
            System.out.println("pharmacy work area table yet ot get data");
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
        docrequestTable = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        reorderTable = new javax.swing.JTable();
        serialNumLbl = new javax.swing.JLabel();
        serialNumberTxtField = new javax.swing.JTextField();
        medicineNameLbl = new javax.swing.JLabel();
        medicineNameTxtField = new javax.swing.JTextField();
        availQuantityLbl = new javax.swing.JLabel();
        availQuantityTxtField = new javax.swing.JTextField();
        reqQuantityLbl = new javax.swing.JLabel();
        reqQuantityTxtField = new javax.swing.JTextField();
        viewRequestsBtn = new javax.swing.JButton();
        addMedicineBtn = new javax.swing.JButton();
        viewDetailsBtn = new javax.swing.JButton();
        statusCheckBtn = new javax.swing.JButton();
        pharmacyLbl = new javax.swing.JLabel();
        btnDeliver = new javax.swing.JButton();
        btnPending = new javax.swing.JButton();

        setBackground(new java.awt.Color(233, 235, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        docrequestTable.setBackground(new java.awt.Color(102, 102, 102));
        docrequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MEDICINE NAME", "QUANTITY", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        docrequestTable.setRowHeight(25);
        jScrollPane.setViewportView(docrequestTable);

        add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 714, 154));

        reorderTable.setBackground(new java.awt.Color(102, 102, 102));
        reorderTable.setBorder(new javax.swing.border.MatteBorder(null));
        reorderTable.setForeground(new java.awt.Color(255, 255, 255));
        reorderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MEDICINE NAME", "SERIAL NUMBER ", "AVAILABILE QUANTITY", "REQUIRED QUANTITY", "REORDER STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reorderTable.setRowHeight(25);
        jScrollPane1.setViewportView(reorderTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 708, 181));

        serialNumLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        serialNumLbl.setText("SERIAL NUMBER: ");
        add(serialNumLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, -1, -1));
        add(serialNumberTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 141, -1));

        medicineNameLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        medicineNameLbl.setText("MEDICINE NAME: ");
        add(medicineNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, -1));
        add(medicineNameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 141, -1));

        availQuantityLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        availQuantityLbl.setText("AVAILABLE QUANTITY:");
        add(availQuantityLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, -1));
        add(availQuantityTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 141, -1));

        reqQuantityLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        reqQuantityLbl.setText("REQUIRED QUANTITY:");
        add(reqQuantityLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, -1, -1));

        reqQuantityTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqQuantityTxtFieldActionPerformed(evt);
            }
        });
        add(reqQuantityTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 141, -1));

        viewRequestsBtn.setBackground(new java.awt.Color(0, 0, 0));
        viewRequestsBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        viewRequestsBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewRequestsBtn.setText("REQUEST STATUS");
        viewRequestsBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        viewRequestsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRequestsBtnActionPerformed(evt);
            }
        });
        add(viewRequestsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 200, 206, 33));

        addMedicineBtn.setBackground(new java.awt.Color(0, 0, 0));
        addMedicineBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        addMedicineBtn.setForeground(new java.awt.Color(255, 255, 255));
        addMedicineBtn.setText("ADD MEDICINE");
        addMedicineBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        addMedicineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMedicineBtnActionPerformed(evt);
            }
        });
        add(addMedicineBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 141, 32));

        viewDetailsBtn.setBackground(new java.awt.Color(0, 0, 0));
        viewDetailsBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        viewDetailsBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewDetailsBtn.setText("UPDATE MEDICINE INFO");
        viewDetailsBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        viewDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsBtnActionPerformed(evt);
            }
        });
        add(viewDetailsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 160, 206, 32));

        statusCheckBtn.setBackground(new java.awt.Color(0, 0, 0));
        statusCheckBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        statusCheckBtn.setForeground(new java.awt.Color(255, 255, 255));
        statusCheckBtn.setText("RE-ORDER MEDICINE");
        statusCheckBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        statusCheckBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusCheckBtnActionPerformed(evt);
            }
        });
        add(statusCheckBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 120, 206, 30));

        pharmacyLbl.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        pharmacyLbl.setForeground(new java.awt.Color(0, 0, 102));
        pharmacyLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pharmacyLbl.setText("PHARMACY CENTER ");
        add(pharmacyLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 708, -1));

        btnDeliver.setBackground(new java.awt.Color(0, 0, 0));
        btnDeliver.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnDeliver.setForeground(new java.awt.Color(255, 255, 255));
        btnDeliver.setText("SUPPLIED TO HOSPITAL");
        btnDeliver.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        btnDeliver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliverActionPerformed(evt);
            }
        });
        add(btnDeliver, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 520, 200, 31));

        btnPending.setBackground(new java.awt.Color(0, 0, 0));
        btnPending.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnPending.setForeground(new java.awt.Color(255, 255, 255));
        btnPending.setText("ASSIGN");
        btnPending.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        btnPending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPendingActionPerformed(evt);
            }
        });
        add(btnPending, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 560, 200, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void reqQuantityTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqQuantityTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reqQuantityTxtFieldActionPerformed

    private void viewRequestsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRequestsBtnActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewRequestJPanel", new GetRequestsJPanel(userProcessContainer, userAccount, enterprise, org));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewRequestsBtnActionPerformed

    private void addMedicineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMedicineBtnActionPerformed
        // TODO add your handling code here:
        MedicalInventory m = new MedicalInventory();
        String name = medicineNameTxtField.getText().trim();
        String error_message = "";
        String avail = availQuantityTxtField.getText();
        try {
            Integer.parseInt(avail);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Available quantity must be integer");
            return;

        }
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter the name ");
            return;
        }

        m.setMedName(medicineNameTxtField.getText());
        try {
            int availableQuantity = Integer.parseInt(availQuantityTxtField.getText());
            m.setQtyAvail(availableQuantity);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "serial number must be integer!");
            return;
        }
        try {
            int serialNumber = Integer.parseInt(serialNumberTxtField.getText());
            m.setRollNum(serialNumber);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "serial number must be integer!");
            return;
        }
        String req = reqQuantityTxtField.getText();
        try {

            m.setNeededQty(Integer.parseInt(req));
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Required quantity must be integer!");
            return;
        }

        pharmorg.addMedicine(m);
        m.setRePurchaseStatus("N");

        reorderTable();

        JOptionPane.showMessageDialog(null, "Medicine Added Successfully", "Warning", JOptionPane.INFORMATION_MESSAGE);
        log.debug("medicine added successfully");
        serialNumberTxtField.setText("");
        medicineNameTxtField.setText("");
        availQuantityTxtField.setText("");
        reqQuantityTxtField.setText("");

    }//GEN-LAST:event_addMedicineBtnActionPerformed

    private void viewDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsBtnActionPerformed
        // TODO add your handling code here:
        int row = reorderTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        MedicalInventory mi = (MedicalInventory) reorderTable.getValueAt(row, 0);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("UpdateEntryJPanel", new GetMedicineDetailsJPanel(userProcessContainer, userAccount, enterprise, mi));
        log.debug(userAccount + " " + "entering view details page");
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewDetailsBtnActionPerformed

    private void statusCheckBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusCheckBtnActionPerformed
        // TODO add your handling code here:
        int medicinecheck = 0;
        for (MedicalInventory mi : pharmorg.getMedList()) {
            medicinecheck++;
        }

        if (medicinecheck <= 0) {
            JOptionPane.showMessageDialog(null, "No medicines are present for invetory check  ");
            return;
        }
        for (MedicalInventory mi : pharmorg.getMedList()) {

            if (mi.getQtyAvail() <= mi.getNeededQty()) {
                if (!mi.getRePurchaseStatus().equals("Y")) {
                    MedicineWorkRequest request = new MedicineWorkRequest();

                    mi.setRePurchaseStatus("Y");
                    request.setMedName(mi.getMedName());
                    request.setQty(mi.getNeededQty());
                    request.setEndUser(userAccount);

                    userAccount.getWorkQueue().getWorkRequestList().add(request);

                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                        System.out.println("***** Organization Name:" + enterprise.getName());
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            System.out.println("***** Organization Name:" + organization.getName());
                            if (organization.getName().equals("Medicine Organization")) {
                                System.out.println("True");

                                System.out.println("***** organization Name" + organization.getName());

                                System.out.println(organization);
                                System.out.println(organization.getWq());
                                System.out.println(organization.getWq().getWorkRequestList());
                                organization.getWq().getWorkRequestList().add(request);
                                System.out.println(organization.getWq().getWorkRequestList());
                                log.debug(userAccount + " " + "sending request to Medicine Organization");
                            }
                        }

                    }

                }

            }
        }
        JOptionPane.showMessageDialog(this, "Inventory status checked and updated!", "Warning", JOptionPane.INFORMATION_MESSAGE);
        reorderTable();
    }//GEN-LAST:event_statusCheckBtnActionPerformed

    private void btnDeliverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliverActionPerformed
        // TODO add your handling code here:
   try{
        int selectedDocReqTblRow = docrequestTable.getSelectedRow();
        int selectedReorderTblRow = reorderTable.getSelectedRow();
        for (MedicalInventory mi : pharmorg.getMedList()) {
            if (mi.getMedName() == String.valueOf(reorderTable.getValueAt(selectedReorderTblRow, 0))) {
                for (WorkRequest request : pharmorg.getWq().getWorkRequestList()) {
                    if ((request instanceof PharmacyWorkRequest)
                            && ((((PharmacyWorkRequest) request).getMedName()) == (String.valueOf(docrequestTable.getValueAt(selectedDocReqTblRow, 0))))
                            && (mi.getMedName().equals(((PharmacyWorkRequest) request).getMedName()))) {
                        if (((PharmacyWorkRequest) request).getStatus().equals("Pending")) {
                            if ((mi.getQtyAvail() >= ((PharmacyWorkRequest) request).getQty())) {

                                int availableQuantity = mi.getQtyAvail();
                                int requestedQuantity = Integer.parseInt(String.valueOf(((PharmacyWorkRequest) request).getQty()));
                                availableQuantity = availableQuantity - requestedQuantity;
                                mi.setQtyAvail(availableQuantity);
                                if (mi.getQtyAvail() <= 10) {
                                    JOptionPane.showMessageDialog(null, "The medicine" + mi.getMedName() + "is very low. Kindly re-stock");
                                }
                                ((PharmacyWorkRequest) request).setStatus("Delivered");
                            } else {
                                JOptionPane.showMessageDialog(null, "The availability quantity is less than required quantity");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "The current staus is " + ((PharmacyWorkRequest) request).getStatus());
                        }
                    }else{
                        System.out.println("the name in both the table is not ");
                    }
                }
            }
        }
        reorderTable();
        populateDocTable();
        
   }
       catch (Exception e){
        JOptionPane.showMessageDialog(null, "Please select the row in both tables.");
        }
    }//GEN-LAST:event_btnDeliverActionPerformed

    private void btnPendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPendingActionPerformed
        // TODO add your handling code here:
        int selectedRow = docrequestTable.getSelectedRow();
        if (selectedRow >= 0) {
            for (WorkRequest request : pharmorg.getWq().getWorkRequestList()) {
                if ((request instanceof PharmacyWorkRequest) && (((PharmacyWorkRequest) request).getMedName() == docrequestTable.getValueAt(selectedRow, 0))) {
                    if (((PharmacyWorkRequest) request).getStatus().equals("Sent")) {
                        ((PharmacyWorkRequest) request).setStatus("Pending");
                    } else {
                        JOptionPane.showMessageDialog(this, "Request is at " + ((PharmacyWorkRequest) request).getStatus());
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to proceed");
        }
        populateDocTable();
    }//GEN-LAST:event_btnPendingActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMedicineBtn;
    private javax.swing.JLabel availQuantityLbl;
    private javax.swing.JTextField availQuantityTxtField;
    private javax.swing.JButton btnDeliver;
    private javax.swing.JButton btnPending;
    private javax.swing.JTable docrequestTable;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel medicineNameLbl;
    private javax.swing.JTextField medicineNameTxtField;
    private javax.swing.JLabel pharmacyLbl;
    private javax.swing.JTable reorderTable;
    private javax.swing.JLabel reqQuantityLbl;
    private javax.swing.JTextField reqQuantityTxtField;
    private javax.swing.JLabel serialNumLbl;
    private javax.swing.JTextField serialNumberTxtField;
    private javax.swing.JButton statusCheckBtn;
    private javax.swing.JButton viewDetailsBtn;
    private javax.swing.JButton viewRequestsBtn;
    // End of variables declaration//GEN-END:variables
}
