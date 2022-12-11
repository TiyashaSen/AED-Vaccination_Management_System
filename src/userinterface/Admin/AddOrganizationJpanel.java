/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Admin;

import Vaccination.Enterprise.Vaccine;
import Vaccination.Enterprise.Medicine;
import Vaccination.Enterprise.Enterprise;
import Vaccination.Enterprise.Hospital;
import Vaccination.Enterprise.Pharmacy;
import Vaccination.Enterprise.Sample;
import Vaccination.Organization.Organization;
import Vaccination.Organization.Organization.Type;
import Vaccination.Organization.OrganizationList;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author prakruthisomashekar
 */
public class AddOrganizationJpanel extends javax.swing.JPanel {

    private OrganizationList organizationDir;
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private static Logger log = Logger.getLogger(AddOrganizationJpanel.class);
    private static final String CLASS_NAME = AddOrganizationJpanel.class.getName();

    /**
     * Creates new form ManageOrganizationJpanel
     */
    public AddOrganizationJpanel(JPanel userProcessContainer, OrganizationList organizationDir, Enterprise enterprise) {
        initComponents();
        this.organizationDir = organizationDir;
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        populateTable();
        populateComboBox();

    }

    private void populateComboBox() {
        organizationComboBox.removeAllItems();
        for (Organization.Type type : Organization.Type.values()) {

            if (!type.getValue().equals(Organization.Type.Admin.getValue())) {
                if (enterprise instanceof Hospital) {

                    organizationComboBox.addItem(Organization.Type.Doctor);
                    organizationComboBox.addItem(Organization.Type.Laboratory);
                    organizationComboBox.addItem(Organization.Type.Clinic);
                    break;
                } else if (enterprise instanceof Pharmacy) {

                    organizationComboBox.addItem(Organization.Type.Pharmacy);
                    break;

                } else if (enterprise instanceof Medicine) {
                    organizationComboBox.addItem(Organization.Type.Medicine);
                    break;
                } else if (enterprise instanceof Vaccine) {
                    organizationComboBox.addItem(Organization.Type.Vaccine);
                    break;
                } else if (enterprise instanceof Sample) {
                    organizationComboBox.addItem(Organization.Type.Sample);
                    break;
                }

            }
        }
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) organizationtbl.getModel();

        model.setRowCount(0);

        for (Organization organization : organizationDir.getOrganizationList()) {
            Object[] row = new Object[2];
            row[0] = organization.getOrganizationIdID();
            row[1] = organization.getName();

            model.addRow(row);
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

        manageorglbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationtbl = new javax.swing.JTable();
        orglbl = new javax.swing.JLabel();
        organizationComboBox = new javax.swing.JComboBox();
        backbtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(233, 235, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageorglbl.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        manageorglbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageorglbl.setText("MANAGE ORGANIZATION");
        add(manageorglbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 454, -1));

        organizationtbl.setBackground(new java.awt.Color(102, 102, 102));
        organizationtbl.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        organizationtbl.setForeground(new java.awt.Color(255, 255, 255));
        organizationtbl.setModel(new javax.swing.table.DefaultTableModel(
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
        organizationtbl.setRowHeight(22);
        organizationtbl.getTableHeader().setResizingAllowed(false);
        organizationtbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(organizationtbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 90, 390, 269));

        orglbl.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        orglbl.setText("ORGANIZATION TYPE:");
        add(orglbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, -1, -1));

        organizationComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationComboBoxActionPerformed(evt);
            }
        });
        add(organizationComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, 129, -1));

        backbtn.setBackground(new java.awt.Color(0, 0, 0));
        backbtn.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("BACK");
        backbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, 70, 32));

        addBtn.setBackground(new java.awt.Color(0, 0, 0));
        addBtn.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("ADD ORGANIZATION");
        addBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, -1, 32));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/partners.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 460, 530));
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed

        Type type = (Type) organizationComboBox.getSelectedItem();
        organizationDir.createOrg(type);
        log.debug("Enterprise admin adding the following Organization" + type);
        populateTable();

    }//GEN-LAST:event_addBtnActionPerformed

    private void organizationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel manageorglbl;
    private javax.swing.JComboBox organizationComboBox;
    private javax.swing.JTable organizationtbl;
    private javax.swing.JLabel orglbl;
    // End of variables declaration//GEN-END:variables
}