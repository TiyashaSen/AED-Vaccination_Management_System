/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Vaccination.Configuration.EcoSystem;
import Vaccination.Worker.Worker;
import Vaccination.Enterprise.Enterprise;
import Vaccination.Network.Network;
import Vaccination.Role.AdministrationRole;
import Vaccination.UserAccount.UserAccount;
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
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private static Logger log = Logger.getLogger(ManageEnterpriseAdminJPanel.class);
    private static final String CLASS_NAME = ManageEnterpriseAdminJPanel.class.getName();

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, EcoSystem system) {
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
            for (Network network : system.getNetworkArray()) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    for (UserAccount userAccount : enterprise.getUserAccDirectory().getUserAccountList()) {
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

        for (Network network : system.getNetworkArray()) {
            networkJComboBox.addItem(network);
        }
    }

    private void populateEnterpriseComboBox(Network network) {
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
        jLabel8 = new javax.swing.JLabel();

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 530, 220));

        jLabel1.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("NETWORK:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(666, 410, 80, -1));

        networkJComboBox.setBackground(new java.awt.Color(204, 204, 255));
        networkJComboBox.setForeground(new java.awt.Color(102, 0, 0));
        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 410, 220, -1));

        jLabel2.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("USERNAME:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 490, -1, 20));

        usernameJTextField.setBackground(new java.awt.Color(204, 204, 255));
        usernameJTextField.setForeground(new java.awt.Color(102, 0, 0));
        add(usernameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 490, 220, 20));

        jLabel3.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("ENTERPRISE:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 450, -1, -1));

        enterpriseJComboBox.setBackground(new java.awt.Color(204, 204, 255));
        enterpriseJComboBox.setForeground(new java.awt.Color(102, 0, 0));
        enterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(enterpriseJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 450, 220, -1));

        submitJButton.setBackground(new java.awt.Color(102, 0, 255));
        submitJButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        submitJButton.setForeground(new java.awt.Color(255, 255, 255));
        submitJButton.setText("SUBMIT");
        submitJButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 620, 127, 31));

        jLabel4.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setText("PASSWORD:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 530, -1, -1));

        nameJTextField.setBackground(new java.awt.Color(204, 204, 255));
        nameJTextField.setForeground(new java.awt.Color(102, 0, 0));
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 570, 220, -1));

        jLabel5.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 0));
        jLabel5.setText("NAME:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 570, -1, -1));

        passwordJPasswordField.setBackground(new java.awt.Color(204, 204, 255));
        passwordJPasswordField.setForeground(new java.awt.Color(102, 0, 0));
        add(passwordJPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 530, 220, -1));

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
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 40));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ENTERPRISE ADMIN");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 530, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon("/Users/tiyashasen/Desktop/images/icons8-administrator-male-skin-type-7-96.png")); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 90, 90));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon("/Users/tiyashasen/Desktop/images/download.jpeg")); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 340, 170));
    }// </editor-fold>//GEN-END:initComponents

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed

        Network network = (Network) networkJComboBox.getSelectedItem();
        if (network != null) {
            populateEnterpriseComboBox(network);
        }


    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        if (usernameJTextField.getText().isEmpty() || nameJTextField.getText().isEmpty() || passwordJPasswordField.getPassword().length <= 0) {
            JOptionPane.showMessageDialog(null, "please enter all mandatory fields");
            return;
        }

        Network network = (Network) networkJComboBox.getSelectedItem();
        log.debug("system admin creating enterprise admin\t" + CLASS_NAME);
        Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();

        String username = usernameJTextField.getText().trim();
        String password = String.valueOf(passwordJPasswordField.getPassword());
        String name = nameJTextField.getText();
        ArrayList<String> userNameChck = new ArrayList<String>();
        for (UserAccount u : enterprise.getUserAccDirectory().getUserAccountList()) {
            userNameChck.add(u.getUsername());

        }
        if (userNameChck.contains(username)) {
            JOptionPane.showMessageDialog(null, "User Name Already exists please enter a new name");
            return;
        }

        log.debug("name of the USER is: \t" + username + "name of the enterprise is: \t" + name + "name of network is\t" + network + "\t" + CLASS_NAME);
        Worker worker = enterprise.getEmployeeDirectory().createEmployee(name);

        UserAccount account = enterprise.getUserAccDirectory().createUserAccount(username, password, worker, new AdministrationRole());
        populateTable();
        usernameJTextField.setText("");
        passwordJPasswordField.setText("");
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
