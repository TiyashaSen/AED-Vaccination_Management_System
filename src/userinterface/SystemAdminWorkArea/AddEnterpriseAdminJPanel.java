/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Vaccination.Configuration.EcoSystem;
import Vaccination.Worker.Worker;
import Vaccination.Enterprise.Enterprise;
import Vaccination.Connection.Connection;
import Vaccination.Role.AdministrationRole;
import Vaccination.UserAccount.UserAcc;
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
public class AddEnterpriseAdminJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private static Logger log = Logger.getLogger(AddEnterpriseAdminJPanel.class);
    private static final String CLASS_NAME = AddEnterpriseAdminJPanel.class.getName();

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public AddEnterpriseAdminJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateTable();
        populateNetworkComboBox();
    }

    private void populateTable() {
        try {
            DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

            model.setRowCount(0);
            for (Connection network : system.getNetworkArray()) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    for (UserAcc userAccount : enterprise.getUserAccDirectory().getUserAccountList()) {
                        Object[] row = new Object[3];
                        row[0] = enterprise.getName();
                        row[1] = network.getName();
                        row[2] = userAccount.getUsername();

                        model.addRow(row);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("manage enterprise table is yet to get data");
        }
    }

    private void populateNetworkComboBox() {
        networkJComboBox.removeAllItems();

        for (Connection network : system.getNetworkArray()) {
            networkJComboBox.addItem(network);
        }
    }

    private void populateEnterpriseComboBox(Connection network) {
        enterpriseJComboBox.removeAllItems();

        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            enterpriseJComboBox.addItem(enterprise);
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
        usernameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        enterpriseJComboBox = new javax.swing.JComboBox();
        submitJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passwordJPasswordField = new javax.swing.JPasswordField();
        backJButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(233, 235, 204));
        setForeground(new java.awt.Color(0, 0, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseJTable.setBackground(new java.awt.Color(102, 102, 102));
        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "Network", "Username"
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 530, 220));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setText("NETWORK:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, 80, -1));

        networkJComboBox.setBackground(new java.awt.Color(102, 102, 102));
        networkJComboBox.setForeground(new java.awt.Color(255, 255, 255));
        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 230, 220, 30));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setText("USERNAME:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 350, -1, 30));

        usernameJTextField.setBackground(new java.awt.Color(102, 102, 102));
        usernameJTextField.setForeground(new java.awt.Color(255, 255, 255));
        add(usernameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 350, 220, 30));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setText("ENTERPRISE:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, -1, 30));

        enterpriseJComboBox.setBackground(new java.awt.Color(102, 102, 102));
        enterpriseJComboBox.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(enterpriseJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 290, 220, 30));

        submitJButton.setBackground(new java.awt.Color(102, 102, 102));
        submitJButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        submitJButton.setForeground(new java.awt.Color(255, 255, 255));
        submitJButton.setText("SUBMIT");
        submitJButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 550, 127, 31));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setText("PASSWORD:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, -1, -1));

        nameJTextField.setBackground(new java.awt.Color(102, 102, 102));
        nameJTextField.setForeground(new java.awt.Color(255, 255, 255));
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 470, 220, 30));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel5.setText("NAME:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 470, -1, 30));

        passwordJPasswordField.setBackground(new java.awt.Color(102, 102, 102));
        passwordJPasswordField.setForeground(new java.awt.Color(255, 255, 255));
        add(passwordJPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 410, 220, 30));

        backJButton.setBackground(new java.awt.Color(102, 102, 102));
        backJButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("BACK");
        backJButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 90, 30));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ENTERPRISE ADMIN");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 360, 50));
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 90, 90));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/enterprise-management.jpeg"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, -40, 1050, 540));
    }// </editor-fold>//GEN-END:initComponents

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed

        Connection network = (Connection) networkJComboBox.getSelectedItem();
        if (network != null) {
            populateEnterpriseComboBox(network);
        }


    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        if (usernameJTextField.getText().isEmpty() || nameJTextField.getText().isEmpty() || passwordJPasswordField.getPassword().length <= 0) {
            JOptionPane.showMessageDialog(null, "please enter all mandatory fields");
            return;
        }

        Connection network = (Connection) networkJComboBox.getSelectedItem();
        log.debug("system admin creating enterprise admin\t" + CLASS_NAME);
        Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();

        String username = usernameJTextField.getText().trim();
        String password = String.valueOf(passwordJPasswordField.getPassword());
        String name = nameJTextField.getText();
        ArrayList<String> userNameChck = new ArrayList<String>();
        for (UserAcc u : enterprise.getUserAccDirectory().getUserAccountList()) {
            userNameChck.add(u.getUsername());

        }
        if (userNameChck.contains(username)) {
            JOptionPane.showMessageDialog(null, "User Name Already exists please enter a new name");
            return;
        }

        log.debug("name of the USER is: \t" + username + "name of the enterprise is: \t" + name + "name of network is\t" + network + "\t" + CLASS_NAME);
        Worker worker = enterprise.getEmployeeDirectory().createEmployee(name);

        UserAcc account = enterprise.getUserAccDirectory().createUserAccount(username, password, worker, new AdministrationRole());
        populateTable();
        usernameJTextField.setText("");
        passwordJPasswordField.setText("");
        nameJTextField.setText("");


    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminMainJPanel sysAdminwjp = (SystemAdminMainJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
