/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Admin;

import Vaccination.Worker.Worker;
import Vaccination.Organization.Organization;
import Vaccination.Organization.OrganizationList;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
/**
 *
 * @author prakruthisomashekar
 */
public class AddEmployeeJpanel extends javax.swing.JPanel {

    /**
     * Creates new form AddEmployeeJpanel
     */
    private OrganizationList organizationDir;
    private JPanel userProcessContainer;
    private static Logger log = Logger.getLogger(AddEmployeeJpanel.class);
    private static final String CLASS_NAME = AddEmployeeJpanel.class.getName();

    public AddEmployeeJpanel(JPanel userProcessContainer, OrganizationList organizationDir) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;
        populateOrganizationEmpComboBox();
        populateOrganizationComboBox();
        this.setSize(1920, 1080);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        orglbl = new javax.swing.JLabel();
        organizationComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationTbl = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        organizationEmpComboBox = new javax.swing.JComboBox();
        nameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        addJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(233, 235, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ADD EMPLOYEE");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 454, -1));

        orglbl.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        orglbl.setText("ORGANIZATION:");
        add(orglbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        organizationComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationComboBoxActionPerformed(evt);
            }
        });
        add(organizationComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 161, -1));

        organizationTbl.setBackground(new java.awt.Color(102, 102, 102));
        organizationTbl.setForeground(new java.awt.Color(255, 255, 255));
        organizationTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        organizationTbl.setRowHeight(25);
        organizationTbl.getTableHeader().setResizingAllowed(false);
        organizationTbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(organizationTbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 187, 317, 290));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setText("SELECT ORGANIZATION:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, -1, -1));

        organizationEmpComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationEmpComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationEmpComboBoxActionPerformed(evt);
            }
        });
        add(organizationEmpComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 144, -1));
        add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 530, 144, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setText("ADD NAME:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, -1, -1));

        backJButton.setBackground(new java.awt.Color(0, 0, 0));
        backJButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("BACK");
        backJButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 570, 60, 31));

        addJButton.setBackground(new java.awt.Color(0, 0, 0));
        addJButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        addJButton.setForeground(new java.awt.Color(255, 255, 255));
        addJButton.setText("CREATE EMPLOYEE");
        addJButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        add(addJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 570, 150, 31));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/division.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 640, 390));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        // TODO add your handling code here:
        Organization organization = (Organization) organizationEmpComboBox.getSelectedItem();
        String name = nameTextField.getText().trim();
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a valid input");
            return;
        }
        ArrayList<String> namecheck = new ArrayList<>();
        for (Worker o : organization.getEmployeeDirectory().getWorkerArray()) {
            namecheck.add(o.getName().toLowerCase());

        }
        if (namecheck.contains(name.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Employee already exists");
            return;
        }
        log.debug("Enterprise admin adding following employee \t" + name + "in following Organization \t" + organization + "\t" + CLASS_NAME);
        organization.getEmployeeDirectory().createEmployee(name);
        populateTable(organization);
        nameTextField.setText("");
    }//GEN-LAST:event_addJButtonActionPerformed

    private void organizationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationComboBoxActionPerformed
        // TODO add your handling code here:
        Organization organization = (Organization) organizationComboBox.getSelectedItem();
        if (organization != null) {
            populateTable(organization);
        }
    }//GEN-LAST:event_organizationComboBoxActionPerformed

    private void organizationEmpComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationEmpComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationEmpComboBoxActionPerformed
    public void populateOrganizationComboBox() {
        organizationComboBox.removeAllItems();

        for (Organization organization : organizationDir.getOrganizationList()) {
            organizationComboBox.addItem(organization);
        }
    }

    public void populateOrganizationEmpComboBox() {
        organizationEmpComboBox.removeAllItems();

        for (Organization organization : organizationDir.getOrganizationList()) {
            organizationEmpComboBox.addItem(organization);
        }
    }

    private void populateTable(Organization organization) {
        DefaultTableModel model = (DefaultTableModel) organizationTbl.getModel();

        model.setRowCount(0);

        for (Worker worker : organization.getEmployeeDirectory().getWorkerArray()) {
            Object[] row = new Object[2];
            row[0] = worker.getId();
            row[1] = worker.getName();
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JComboBox organizationComboBox;
    private javax.swing.JComboBox organizationEmpComboBox;
    private javax.swing.JTable organizationTbl;
    private javax.swing.JLabel orglbl;
    // End of variables declaration//GEN-END:variables
}
