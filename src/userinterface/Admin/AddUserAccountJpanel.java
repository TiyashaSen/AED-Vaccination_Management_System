/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Admin;

import Vaccination.Worker.Worker;
import Vaccination.Enterprise.Enterprise;
import Vaccination.Organization.Organization;
import Vaccination.Role.Role;
import Vaccination.UserAccount.UserAcc;
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
public class AddUserAccountJpanel extends javax.swing.JPanel {

    private JPanel container;
    private Enterprise enterprise;
    private static Logger log = Logger.getLogger(AddUserAccountJpanel.class);
    private static final String CLASS_NAME = AddUserAccountJpanel.class.getName();

    /**
     * Creates new form ManageUserAccountJpanel
     */
    public AddUserAccountJpanel(JPanel container, Enterprise enterprise) {
        initComponents();
        this.container = container;
        this.enterprise = enterprise;
        populateData();
        populateOrganizationComboBox();

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
        userTbl = new javax.swing.JTable();
        manageuserLbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        organizationComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        employeeComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        roleComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        createUserbtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(233, 235, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userTbl.setBackground(new java.awt.Color(102, 102, 102));
        userTbl.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        userTbl.setForeground(new java.awt.Color(255, 255, 255));
        userTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userTbl.setRowHeight(22);
        jScrollPane1.setViewportView(userTbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 387, 258));

        manageuserLbl.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        manageuserLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageuserLbl.setText("ADD USER ACCOUNT");
        add(manageuserLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 20, 430, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel5.setText("ORGANIZATION:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, -1, -1));

        organizationComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationComboBoxActionPerformed(evt);
            }
        });
        add(organizationComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 176, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setText("EMPLOYEE:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, -1, -1));

        employeeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(employeeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 440, 176, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setText("ROLE:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, -1, -1));

        roleComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(roleComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 480, 176, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setText("USERNAME:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 510, -1, -1));
        add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 510, 176, -1));
        add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 540, 176, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setText("PASSWORD:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 540, -1, -1));

        backBtn.setBackground(new java.awt.Color(0, 0, 0));
        backBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("BACK");
        backBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 73, 31));

        createUserbtn.setBackground(new java.awt.Color(0, 0, 0));
        createUserbtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        createUserbtn.setForeground(new java.awt.Color(255, 255, 255));
        createUserbtn.setText("CREATE USER ACCOUNT");
        createUserbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        createUserbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserbtnActionPerformed(evt);
            }
        });
        add(createUserbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 580, 176, 31));

        jLabel6.setBackground(new java.awt.Color(245, 245, 245));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/organization_2_500x500.jpeg"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 510, 440));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel7.setText("ADD USER ACCOUNT");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 230, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backBtnActionPerformed

    private void organizationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationComboBoxActionPerformed
        // TODO add your handling code here:
        Organization organization = (Organization) organizationComboBox.getSelectedItem();
        if (organization != null) {
            populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);
        }

    }//GEN-LAST:event_organizationComboBoxActionPerformed

    private void createUserbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserbtnActionPerformed
        // TODO add your handling code here:
        String userName = nametxt.getText().trim();
        String password = passwordTxt.getText();
        Organization organization = (Organization) organizationComboBox.getSelectedItem();
        Worker employee = (Worker) employeeComboBox.getSelectedItem();
        Role role = (Role) roleComboBox.getSelectedItem();
        ArrayList<String> usernamecheck = new ArrayList<>();
        for (UserAcc e : organization.getUserAccDirectory().getUserAccountList()) {
            usernamecheck.add(e.getUsername());

        }
        if (usernamecheck.contains(userName)) {
            JOptionPane.showMessageDialog(null, "UserName already exists");
            return;
        }
        if (userName.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a Valid input");
            return;
        }
        log.debug("Enterprise admin creating user with name \t" + userName + "Role" + role + "In Organization" + organization + "\t" + CLASS_NAME);
        organization.getUserAccDirectory().createUserAccount(userName, password, employee, role);

        populateData();
        nametxt.setText("");
        passwordTxt.setText("");
    }//GEN-LAST:event_createUserbtnActionPerformed
    public void populateEmployeeComboBox(Organization organization) {
        employeeComboBox.removeAllItems();

        for (Worker worker : organization.getEmployeeDirectory().getWorkerArray()) {
            employeeComboBox.addItem(worker);
        }
    }

    public void populateOrganizationComboBox() {
        organizationComboBox.removeAllItems();

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            organizationComboBox.addItem(organization);
        }
    }

    private void populateRoleComboBox(Organization organization) {
        roleComboBox.removeAllItems();
        for (Role role : organization.getSupportedRole()) {
            roleComboBox.addItem(role);
        }
    }

    public void populateData() {

        DefaultTableModel model = (DefaultTableModel) userTbl.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAcc ua : organization.getUserAccDirectory().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();
                ((DefaultTableModel) userTbl.getModel()).addRow(row);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createUserbtn;
    private javax.swing.JComboBox employeeComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel manageuserLbl;
    private javax.swing.JTextField nametxt;
    private javax.swing.JComboBox organizationComboBox;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JComboBox roleComboBox;
    private javax.swing.JTable userTbl;
    // End of variables declaration//GEN-END:variables
}
