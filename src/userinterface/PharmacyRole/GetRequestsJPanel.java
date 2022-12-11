/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package userinterface.PharmacyRole;

import Vaccination.Configuration.EcoSystem;
import Vaccination.Enterprise.Enterprise;
import Vaccination.Organization.Organization;
import Vaccination.UserAccount.UserAcc;
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
public class GetRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form GetRequestsJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAcc userAccount;
    private Organization organization;
    private Enterprise enterprise;
    private static Logger log = Logger.getLogger(GetRequestsJPanel.class);
    private static final String CLASS_NAME = GetRequestsJPanel.class.getName();

<<<<<<< HEAD
    public GetRequestsJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, Organization organization) {
=======
    public GetRequestsJPanel(JPanel userProcessContainer, UserAcc userAccount,
            Enterprise enterprise, Organization organization) {
>>>>>>> 7a02d3000f345dd2ac9bff2e10b2b70de3cbb597
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
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT
     * modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        drugRequestsTable = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        reqmedicineLbl = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(233, 235, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        drugRequestsTable.setBackground(new java.awt.Color(102, 102, 102));
        drugRequestsTable.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

        }, new String[] {"MEDICINE NAME", "REQUIRED QUANTITY", "RECIEVER", "STATUS",
                "DELIVERY DATE"}) {
            boolean[] canEdit = new boolean[] {true, false, false, false, false};

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        drugRequestsTable.setRowHeight(25);
        jScrollPane.setViewportView(drugRequestsTable);

        add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 726, 209));

        backBtn.setBackground(new java.awt.Color(0, 0, 0));
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText(" BACK");
        backBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1,
                new java.awt.Color(255, 255, 255)));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 78, 28));

        reqmedicineLbl.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        reqmedicineLbl.setForeground(new java.awt.Color(51, 0, 51));
        reqmedicineLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reqmedicineLbl.setText("RE-ORDER STATUS");
        add(reqmedicineLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 726, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/truck.png"))); // NOI18N
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1078, 498, -1, 124));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/truck.png"))); // NOI18N
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1211, 498, -1, 124));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/truck.png"))); // NOI18N
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1352, 498, -1, 124));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/truck.png"))); // NOI18N
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 498, -1, 124));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PharmacyMainJPanel dw = (PharmacyMainJPanel) component;
        dw.reorderTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }// GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTable drugRequestsTable;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel reqmedicineLbl;
    // End of variables declaration//GEN-END:variables
}