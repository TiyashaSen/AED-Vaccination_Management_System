/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PharmacyRole;

import Vaccination.Configuration.EcoSystem;
import Vaccination.Enterprise.Enterprise;
import Vaccination.Organization.Organization;
import Vaccination.UserAccount.UserAccount;
import Vaccination.WorkQueue.MedicineWorkRequest;
import Vaccination.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author tiyashasen
 */
public class ViewRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewRequestsJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private Organization organization;
    private Enterprise enterprise;
    private static Logger log = Logger.getLogger(ViewRequestsJPanel.class);
    private static final String CLASS_NAME = ViewRequestsJPanel.class.getName();

    public ViewRequestsJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, Organization organization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.organization = organization;
        populateTable();
        log.debug(userAccount + " " + "viewed the drug requests");
    }

    public void populateTable() {
        try {
            DefaultTableModel model = (DefaultTableModel) drugRequestsTable.getModel();

            model.setRowCount(0);

            for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
                Object[] row = new Object[5];
                row[0] = ((MedicineWorkRequest) request).getMedName();
                row[1] = ((MedicineWorkRequest) request).getQty();
                row[2] = request.getReceiver();
                String result = ((MedicineWorkRequest) request).getStatus();
                row[3] = result == null ? "Waiting" : result;
                if (((MedicineWorkRequest) request).getTOD() == null) {
                    row[4] = "Details yet to be updated by supplier";
                } else {
                    row[4] = "Expected delivery time " + ((MedicineWorkRequest) request).getTOD();
                }

                model.addRow(row);
            }
        } catch (Exception e) {
            System.out.println("view request panel is yet to get data");
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
        drugRequestsTable = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        reqmedicineLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(233, 235, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        drugRequestsTable.setBackground(new java.awt.Color(102, 102, 102));
        drugRequestsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MEDICINE NAME", "REQUIRED QUANTITY", "RECIEVER", "STATUS", "DELIVERY DATE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        drugRequestsTable.setRowHeight(25);
        jScrollPane.setViewportView(drugRequestsTable);

        add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 188, 726, 209));

        backBtn.setBackground(new java.awt.Color(51, 0, 51));
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText(" BACK");
        backBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 415, 78, 28));

        reqmedicineLbl.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        reqmedicineLbl.setForeground(new java.awt.Color(51, 0, 51));
        reqmedicineLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reqmedicineLbl.setText("RE-ORDER STATUS");
        add(reqmedicineLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 146, 726, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/truck.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 498, -1, 124));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cargo.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 16, -1, 124));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/truck.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 498, -1, 124));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/truck.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 498, -1, 124));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/truck.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 498, -1, 124));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/truck.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 498, -1, 124));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/truck.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(674, 498, -1, 124));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/truck.png"))); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(806, 498, -1, 124));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/truck.png"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(939, 498, -1, 124));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/truck.png"))); // NOI18N
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1078, 498, -1, 124));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/truck.png"))); // NOI18N
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1211, 498, -1, 124));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/truck.png"))); // NOI18N
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1352, 498, -1, 124));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/truck.png"))); // NOI18N
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 498, -1, 124));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PharmacyWorkArea dw = (PharmacyWorkArea) component;
        dw.reorderTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTable drugRequestsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel reqmedicineLbl;
    // End of variables declaration//GEN-END:variables
}
