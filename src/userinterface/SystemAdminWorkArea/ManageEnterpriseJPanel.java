/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Vaccination.Configuration.EcoSystem;
import Vaccination.Enterprise.Enterprise;
import Vaccination.Connection.Connection;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author tiyashasen
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private static Logger log = Logger.getLogger(ManageEnterpriseJPanel.class);
    private static final String CLASS_NAME = ManageEnterpriseJPanel.class.getName();

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateTable();
        populateComboBox();
    }

    private void populateTable() {
        try {

            DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

            model.setRowCount(0);
            for (Connection network : system.getNetworkArray()) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    Object[] row = new Object[3];
                    row[0] = enterprise.getName();
                    row[1] = network.getName();
                    row[2] = enterprise.getEnterpriseType().getValue();

                    model.addRow(row);
                }
            }
        } catch (Exception e) {
            System.out.println("manage enterprise table is yet to get data");
        }
    }

    private void populateComboBox() {
        networkJComboBox.removeAllItems();
        enterpriseTypeJComboBox.removeAllItems();

        for (Connection network : system.getNetworkArray()) {
            networkJComboBox.addItem(network);
        }

        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            enterpriseTypeJComboBox.addItem(type);
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
        enterpriseJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        enterpriseTypeJComboBox = new javax.swing.JComboBox();
        submitJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(233, 235, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseJTable.setBackground(new java.awt.Color(102, 102, 102));
        enterpriseJTable.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ENTERPRISE NAME", "NETWORK", "TYPE OF ENTERPRISE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        enterpriseJTable.setRowHeight(25);
        jScrollPane1.setViewportView(enterpriseJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 220, 560, 170));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 255));
        jLabel1.setText("NETWORK:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, -1, -1));

        networkJComboBox.setBackground(new java.awt.Color(102, 51, 255));
        networkJComboBox.setForeground(new java.awt.Color(255, 255, 255));
        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 166, 30));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 51, 255));
        jLabel2.setText("NAME:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, -1, -1));

        nameJTextField.setBackground(new java.awt.Color(102, 51, 255));
        nameJTextField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nameJTextField.setForeground(new java.awt.Color(255, 255, 255));
        nameJTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        nameJTextField.setBorder(null);
        nameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameJTextFieldActionPerformed(evt);
            }
        });
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, 166, 30));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 51, 255));
        jLabel3.setText("ENTERPRISE TYPE:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, -1, -1));

        enterpriseTypeJComboBox.setBackground(new java.awt.Color(102, 51, 255));
        enterpriseTypeJComboBox.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(enterpriseTypeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 480, 166, 30));

        submitJButton.setBackground(new java.awt.Color(102, 102, 255));
        submitJButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        submitJButton.setForeground(new java.awt.Color(255, 255, 255));
        submitJButton.setText("SUBMIT");
        submitJButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 590, 86, 26));

        backJButton.setBackground(new java.awt.Color(102, 102, 255));
        backJButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("BACK");
        backJButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 86, 26));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MANAGE ENTERPRISE");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 413, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/lab.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 166));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/clinic.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 523, 175, 166));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/vaccine.png"))); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 588, 160, 166));

        jLabel4.setIcon(new javax.swing.ImageIcon("/Users/tiyashasen/Desktop/images/covid-enterprise.jpeg")); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 290, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("/Users/tiyashasen/Desktop/images/pill-emoji_1_80_1_256x256.png")); // NOI18N
        jLabel9.setText("jLabel9");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 260, 220));
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        Connection network = (Connection) networkJComboBox.getSelectedItem();
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) enterpriseTypeJComboBox.getSelectedItem();

        if (network == null || type == null) {
            JOptionPane.showMessageDialog(null, "Invalid Input!");
            return;
        }
        if (nameJTextField.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a valid input");
            return;
        }
        String name = nameJTextField.getText().trim();
        ArrayList<String> enterpriseCheck = new ArrayList<>();
        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
            enterpriseCheck.add(e.getName());

        }
        if (enterpriseCheck.contains(name)) {
            JOptionPane.showMessageDialog(null, "Enterprise already exists with the same name");
            return;

        }
        Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise(name, type);

        log.debug("name of the Enterpise is: \t" + name + "name of Network in which the enterprise is: \t" + network + "\t" + CLASS_NAME);
        populateTable();
        nameJTextField.setText("");

    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void nameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameJTextFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JComboBox enterpriseTypeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
