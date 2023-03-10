/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.MedicineManufactureResearch;

import Vaccination.VaccineInventory.VaccineMixture;
import Vaccination.Configuration.EcoSystem;
import Vaccination.Enterprise.Enterprise;
import Vaccination.Connection.Connection;
import Vaccination.Organization.Medicine;
import Vaccination.Organization.Organization;
import Vaccination.UserAccount.UserAcc;
import Vaccination.WorkQueue.VaccineWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author prakruthisomashekar
 */
public class AddVaccineRequestsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAcc userAccount;
    private Medicine drugOrganization;
    private Enterprise enterprise;
    private Connection network;
    private static Logger log = Logger.getLogger(AddVaccineRequestsJPanel.class);
    private static final String CLASS_NAME = AddVaccineRequestsJPanel.class.getName();

    /**
     * Creates new form ViewChemicalRequestsJPanel
     */
    public AddVaccineRequestsJPanel(JPanel userProcessContainer, UserAcc userAccount, Enterprise enterprise, Medicine drugOrganization, Connection network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.drugOrganization = drugOrganization;
        this.enterprise = enterprise;
        this.network = network;
        reorderTable();
     
    }

    public void reorderTable() {
        try {
            int rowCount = reorderTable.getRowCount();
            DefaultTableModel model = (DefaultTableModel) reorderTable.getModel();
            for (int i = rowCount - 1; i >= 0; i--) {
                model.removeRow(i);
            }
            for (VaccineMixture mi : drugOrganization.getVaccineArray()) {
                Object row[] = new Object[6];
                row[0] = mi;
                row[1] = mi.getRollNum();
                row[2] = mi.getQtyAvail();
                row[3] = mi.getNeededQty();
                row[4] = mi.getPurchaseStatus();
                model.addRow(row);
            }
        } catch (Exception e) {
            System.out.println("place vacination table yet to get data");
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

        jScrollPane1 = new javax.swing.JScrollPane();
        reorderTable = new javax.swing.JTable();
        addMedicineButton = new javax.swing.JButton();
        viewRequestsButton = new javax.swing.JButton();
        viewDetailsButton1 = new javax.swing.JButton();
        statusCheckButton = new javax.swing.JButton();
        serialNumLabel = new javax.swing.JLabel();
        serialNumberTextField = new javax.swing.JTextField();
        medicineNameLabel = new javax.swing.JLabel();
        chemicalNameTextField = new javax.swing.JTextField();
        availQuantityLabel = new javax.swing.JLabel();
        availQuantityTextField = new javax.swing.JTextField();
        reqQuantityLabel = new javax.swing.JLabel();
        reqQuantityTextField = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(233, 235, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reorderTable.setBackground(new java.awt.Color(102, 102, 102));
        reorderTable.setBorder(new javax.swing.border.MatteBorder(null));
        reorderTable.setForeground(new java.awt.Color(255, 255, 255));
        reorderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "VACCINE NAME", "SERIAL NUMBER ", "AVAILABILE QUANTITY", "REQUIRED QUANTITY", "REORDER STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reorderTable.setRowHeight(30);
        jScrollPane1.setViewportView(reorderTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 703, 209));

        addMedicineButton.setBackground(new java.awt.Color(0, 0, 0));
        addMedicineButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        addMedicineButton.setForeground(new java.awt.Color(255, 255, 255));
        addMedicineButton.setText("ADD VACCINE");
        addMedicineButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        addMedicineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMedicineButtonActionPerformed(evt);
            }
        });
        add(addMedicineButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 530, 106, 33));

        viewRequestsButton.setBackground(new java.awt.Color(0, 0, 0));
        viewRequestsButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        viewRequestsButton.setForeground(new java.awt.Color(255, 255, 255));
        viewRequestsButton.setText("VACCINE REQUEST STATUS");
        viewRequestsButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        viewRequestsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRequestsButtonActionPerformed(evt);
            }
        });
        add(viewRequestsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, 200, 35));

        viewDetailsButton1.setBackground(new java.awt.Color(0, 0, 0));
        viewDetailsButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        viewDetailsButton1.setForeground(new java.awt.Color(255, 255, 255));
        viewDetailsButton1.setText("VIEW VACCINE DETAILS");
        viewDetailsButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        viewDetailsButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsButton1ActionPerformed(evt);
            }
        });
        add(viewDetailsButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 490, 170, 35));

        statusCheckButton.setBackground(new java.awt.Color(0, 0, 0));
        statusCheckButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        statusCheckButton.setForeground(new java.awt.Color(255, 255, 255));
        statusCheckButton.setText("RE-ORDER VACCINES");
        statusCheckButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        statusCheckButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusCheckButtonActionPerformed(evt);
            }
        });
        add(statusCheckButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 160, 36));

        serialNumLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        serialNumLabel.setText("SERIAL NUMBER: ");
        add(serialNumLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, -1, -1));
        add(serialNumberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 106, -1));

        medicineNameLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        medicineNameLabel.setText("VACCINE NAME: ");
        add(medicineNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, -1, -1));
        add(chemicalNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 106, -1));

        availQuantityLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        availQuantityLabel.setText("AVAILABLE QUANTITY:");
        add(availQuantityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, -1, -1));
        add(availQuantityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 106, -1));

        reqQuantityLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        reqQuantityLabel.setText("REQUIRED QUANTITY:");
        add(reqQuantityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, -1, -1));

        reqQuantityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqQuantityTextFieldActionPerformed(evt);
            }
        });
        add(reqQuantityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, 106, -1));

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
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 81, 30));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REQUEST FOR VACCINES");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 703, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addMedicineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMedicineButtonActionPerformed
        // TODO add your handling code here:

        VaccineMixture m = new VaccineMixture();
        String name = chemicalNameTextField.getText().trim();
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "variant Name is empty");
            return;
        }
        m.setVaccineName(chemicalNameTextField.getText());
        try {
            int availableQuantity = Integer.parseInt(availQuantityTextField.getText());
            m.setQtyAvail(availableQuantity);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "available quantity must be a integer");
            return;
        }
        try {
            int serialNumber = Integer.parseInt(serialNumberTextField.getText());
            m.setRollNum(serialNumber);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Serial number  must be a integer");
            return;
        }
        try {
            int requiredQuantity = Integer.parseInt(reqQuantityTextField.getText());
            m.setNeededQty(requiredQuantity);
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Required quantity must be integer!");
            return;
        }

        drugOrganization.addVaccineMix(m);
        m.setPurchaseStatus("N");

        DefaultTableModel dtm = (DefaultTableModel) reorderTable.getModel();

        dtm.setRowCount(0);
        for (VaccineMixture mi : drugOrganization.getVaccineArray()) {
            Object row[] = new Object[5];
            row[0] = mi;
            row[1] = mi.getRollNum();
            row[2] = mi.getQtyAvail();
            row[3] = mi.getNeededQty();
            row[4] = mi.getPurchaseStatus();
            dtm.addRow(row);
        }

        JOptionPane.showMessageDialog(null, "vaccine Added Successfully", "Warning", JOptionPane.INFORMATION_MESSAGE);
        serialNumberTextField.setText("");
        chemicalNameTextField.setText("");
        availQuantityTextField.setText("");
        reqQuantityTextField.setText("");
        log.debug(userAccount + " " + "added vaccine" + name);

    }//GEN-LAST:event_addMedicineButtonActionPerformed

    private void viewRequestsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRequestsButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewRequestJPanel", new GetVaccineRequestsJPanel(userProcessContainer, userAccount, enterprise, drugOrganization));
        layout.next(userProcessContainer);
        log.debug("entering view vaccine requests page");

    }//GEN-LAST:event_viewRequestsButtonActionPerformed

    private void viewDetailsButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsButton1ActionPerformed
        // TODO add your handling code here:
        int row = reorderTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        VaccineMixture mi = (VaccineMixture) reorderTable.getValueAt(row, 0);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("UpdateEntryJPanel", new GetVaccineDetailsJPanel(userProcessContainer, userAccount, enterprise, mi));
        layout.next(userProcessContainer);
        log.debug(userAccount + " " + "entering view vaccine details page");
    }//GEN-LAST:event_viewDetailsButton1ActionPerformed

    private void statusCheckButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusCheckButtonActionPerformed
        // TODO add your handling code here:
        int i = 0;
        for (VaccineMixture mi : drugOrganization.getVaccineArray()) {
            i++;

        }
        if (i <= 0) {
            JOptionPane.showMessageDialog(null, "No vaccine are present for invetory check  ");
            return;
        }
        for (VaccineMixture mi : drugOrganization.getVaccineArray()) {

            if (mi.getQtyAvail() <= mi.getNeededQty()) {
                if (!mi.getPurchaseStatus().equals("Y")) {
                    VaccineWorkRequest request = new VaccineWorkRequest();

                    mi.setPurchaseStatus("Y");
                    request.setVaccineName(mi.getVaccineName());
                    request.setQty(mi.getNeededQty());
                    request.setEndUser(userAccount);

                    userAccount.getWorkQueue().getWorkRequestList().add(request);
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                        System.out.println("***** Organization Name:" + enterprise.getName());
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            System.out.println("***** Organization Name:" + organization.getName());
                            if (organization.getName().equals("Vaccine Organization")) {
                                System.out.println("True");

                                System.out.println("***** organization Name" + organization.getName());

                                organization.getWq().getWorkRequestList().add(request);
                                log.debug("vaccine request has been sent to chemical organization");
                            }
                        }

                    }

                }

            }
        }
        JOptionPane.showMessageDialog(null, "Inventory status checked and updated!", "Warning", JOptionPane.INFORMATION_MESSAGE);
        reorderTable();
    }//GEN-LAST:event_statusCheckButtonActionPerformed

    private void reqQuantityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqQuantityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reqQuantityTextFieldActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        MedicineManufactureMainJpanel dwjp = (MedicineManufactureMainJpanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMedicineButton;
    private javax.swing.JLabel availQuantityLabel;
    private javax.swing.JTextField availQuantityTextField;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField chemicalNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel medicineNameLabel;
    private javax.swing.JTable reorderTable;
    private javax.swing.JLabel reqQuantityLabel;
    private javax.swing.JTextField reqQuantityTextField;
    private javax.swing.JLabel serialNumLabel;
    private javax.swing.JTextField serialNumberTextField;
    private javax.swing.JButton statusCheckButton;
    private javax.swing.JButton viewDetailsButton1;
    private javax.swing.JButton viewRequestsButton;
    // End of variables declaration//GEN-END:variables
}
