/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Vaccine;

import Vaccination.SampleInventory.SampleCompound;
import Vaccination.Configuration.EcoSystem;
import Vaccination.Enterprise.Enterprise;
import Vaccination.Connection.Connection;
import Vaccination.Organization.Vaccine;
import Vaccination.Organization.Organization;
import Vaccination.UserAccount.UserAcc;
import Vaccination.WorkQueue.SampleWorkRequest;
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
public class GetSampleRequestsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAcc userAccount;
    private Vaccine drugOrganization;
    private Enterprise enterprise;
    private Connection network;
    private static Logger log = Logger.getLogger(GetSampleRequestsJPanel.class);
    private static final String CLASS_NAME = GetSampleRequestsJPanel.class.getName();

    /**
     * Creates new form ViewSampleRequestsJPanel
     */
    public GetSampleRequestsJPanel(JPanel userProcessContainer, UserAcc userAccount, Enterprise enterprise, Organization drugOrganization, Connection network, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.drugOrganization = (Vaccine) drugOrganization;
        this.enterprise = enterprise;
        this.network = network;
        this.business = business;
        reorderTable();
    }

    public void reorderTable() {
        try {
            int rowCount = reorderTable.getRowCount();
            DefaultTableModel model = (DefaultTableModel) reorderTable.getModel();
            for (int i = rowCount - 1; i >= 0; i--) {
                model.removeRow(i);
            }
            for (SampleCompound mi : drugOrganization.getSampleList()) {
                Object row[] = new Object[6];
                row[0] = mi;
                row[1] = mi.getSerialNumber();
                row[2] = mi.getAvailQuantity();
                row[3] = mi.getRequiredQuantity();
                row[4] = mi.getReorderStatus();
                model.addRow(row);
            }
        } catch (Exception e) {
            System.out.println("view sample work area is yet to get data");
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
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(233, 235, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reorderTable.setBackground(new java.awt.Color(102, 102, 102));
        reorderTable.setBorder(new javax.swing.border.MatteBorder(null));
        reorderTable.setForeground(new java.awt.Color(255, 255, 255));
        reorderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SAMPLE NAME", "SERIAL NUMBER ", "AVAILABILE QUANTITY", "REQUIRED QUANTITY", "REORDER STATUS"
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 703, 263));

        addMedicineButton.setBackground(new java.awt.Color(0, 0, 0));
        addMedicineButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        addMedicineButton.setForeground(new java.awt.Color(255, 255, 255));
        addMedicineButton.setText("ADD SAMPLE");
        addMedicineButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        addMedicineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMedicineButtonActionPerformed(evt);
            }
        });
        add(addMedicineButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 600, 96, 33));

        viewRequestsButton.setBackground(new java.awt.Color(102, 102, 255));
        viewRequestsButton.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        viewRequestsButton.setForeground(new java.awt.Color(255, 255, 255));
        viewRequestsButton.setText("VIEW REQUEST STATUS");
        viewRequestsButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        viewRequestsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRequestsButtonActionPerformed(evt);
            }
        });
        add(viewRequestsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, 170, 39));

        viewDetailsButton1.setBackground(new java.awt.Color(102, 102, 255));
        viewDetailsButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        viewDetailsButton1.setForeground(new java.awt.Color(255, 255, 255));
        viewDetailsButton1.setText("VIEW SAMPLE DETAILS");
        viewDetailsButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        viewDetailsButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsButton1ActionPerformed(evt);
            }
        });
        add(viewDetailsButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 360, 170, 39));

        statusCheckButton.setBackground(new java.awt.Color(102, 102, 255));
        statusCheckButton.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        statusCheckButton.setForeground(new java.awt.Color(255, 255, 255));
        statusCheckButton.setText("RE-ORDER SAMPLES");
        statusCheckButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        statusCheckButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusCheckButtonActionPerformed(evt);
            }
        });
        add(statusCheckButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 230, 170, 34));

        serialNumLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        serialNumLabel.setText("SERIAL NUMBER: ");
        add(serialNumLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, -1, -1));
        add(serialNumberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 100, 30));

        medicineNameLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        medicineNameLabel.setText("SAMPLE NAME: ");
        add(medicineNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, -1, -1));
        add(chemicalNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 530, 100, 30));

        availQuantityLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        availQuantityLabel.setText("AVAILABLE QUANTITY:");
        add(availQuantityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, -1, -1));
        add(availQuantityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, 96, 30));

        reqQuantityLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        reqQuantityLabel.setText("REQUIRED QUANTITY:");
        add(reqQuantityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 540, -1, -1));

        reqQuantityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqQuantityTextFieldActionPerformed(evt);
            }
        });
        add(reqQuantityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 530, 96, 30));

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
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 82, 30));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SAMPLE REQUESTS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 703, -1));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 440, 120, 180));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/statusofrequest.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1040, 650));
    }// </editor-fold>//GEN-END:initComponents

    private void addMedicineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMedicineButtonActionPerformed
        // TODO add your handling code here:
        try{
        SampleCompound m = new SampleCompound();
        String name = chemicalNameTextField.getText().trim();
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Sample Name is empty");
            return;
        }
        m.setSampleName(chemicalNameTextField.getText());
        try {
            int availableQuantity = Integer.parseInt(availQuantityTextField.getText());
            m.setAvailQuantity(availableQuantity);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "available quantity must be a integer");
            return;
        }
        try {
            int serialNumber = Integer.parseInt(serialNumberTextField.getText());
            m.setSerialNumber(serialNumber);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Serial number  must be a integer");
            return;
        }
        try {
            int requiredQuantity = Integer.parseInt(reqQuantityTextField.getText());
            m.setRequiredQuantity(requiredQuantity);
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Required quantity must be integer!");
            return;
        }

        drugOrganization.addSample(m);
        m.setReorderStatus("N");

        DefaultTableModel dtm = (DefaultTableModel) reorderTable.getModel();

        dtm.setRowCount(0);
        for (SampleCompound mi : drugOrganization.getSampleList()) {
            Object row[] = new Object[5];
            row[0] = mi;
            row[1] = mi.getSerialNumber();
            row[2] = mi.getAvailQuantity();
            row[3] = mi.getRequiredQuantity();
            row[4] = mi.getReorderStatus();
            dtm.addRow(row);
        }

        JOptionPane.showMessageDialog(null, "Sample Added Successfully", "Warning", JOptionPane.INFORMATION_MESSAGE);
        serialNumberTextField.setText("");
        chemicalNameTextField.setText("");
        availQuantityTextField.setText("");
        reqQuantityTextField.setText("");
        log.debug(userAccount + " " + "added chemical" + name);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Check the data. Value cannot be added", "Warning", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_addMedicineButtonActionPerformed

    private void viewRequestsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRequestsButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewRequestsSampleJPanel", new GetRequestsSampleJPanel(userProcessContainer, userAccount, enterprise, drugOrganization));
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
        SampleCompound mi = (SampleCompound) reorderTable.getValueAt(row, 0);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("UpdateEntryJPanel", new GetSampleDetailsJPanel(userProcessContainer, userAccount, enterprise, mi));
        layout.next(userProcessContainer);
        log.debug(userAccount + " " + "entering view vaccine details page");
    }//GEN-LAST:event_viewDetailsButton1ActionPerformed

    private void statusCheckButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusCheckButtonActionPerformed
        // TODO add your handling code here:
        int i = 0;
        for (SampleCompound mi : drugOrganization.getSampleList()) {
            i++;

        }
        if (i <= 0) {
            JOptionPane.showMessageDialog(null, "No vaccine are present for invetory check  ");
            return;
        }
        for (SampleCompound mi : drugOrganization.getSampleList()) {

            if (mi.getAvailQuantity() <= mi.getRequiredQuantity()) {
                if (!mi.getReorderStatus().equals("Y")) {
                    SampleWorkRequest request = new SampleWorkRequest();

                    mi.setReorderStatus("Y");
                    request.setSampleName(mi.getSampleName());
                    request.setQty(mi.getRequiredQuantity());
                    request.setEndUser(userAccount);

                    userAccount.getWorkQueue().getWorkRequestList().add(request);
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                        System.out.println("***** Organization Name:" + enterprise.getName());
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            System.out.println("***** Organization Name:" + organization.getName());
                            if (organization.getName().equals("Sample Organization")) {
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
        VaccineMainJPanel dwjp = (VaccineMainJPanel) component;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
