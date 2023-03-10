/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Vaccine;

import Vaccination.Enterprise.Enterprise;
import Vaccination.Organization.Vaccine;
import Vaccination.UserAccount.UserAcc;
import Vaccination.WorkQueue.VaccineWorkRequest;
import Vaccination.WorkQueue.SampleWorkRequest;
import Vaccination.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
import userinterface.PharmacyRole.PharmacyMainJPanel;

/**
 *
 * @author tiyashasen
 */
public class GetRequestsSampleJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewRequestsJPanel
     */
    private JPanel userProcessContainer;
    private UserAcc userAccount;
    private Enterprise enterprise;
    private Vaccine drugOrganization;
     private static Logger log = Logger.getLogger(GetRequestsSampleJPanel.class);
    private static final String CLASS_NAME = GetRequestsSampleJPanel.class.getName();
    public GetRequestsSampleJPanel(JPanel userProcessContainer, UserAcc userAccount, Enterprise enterprise, Vaccine vaccineOrganization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.drugOrganization = vaccineOrganization;
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)drugRequestsTable.getModel();
        
        model.setRowCount(0);

        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[5];
            row[0] = ((SampleWorkRequest) request);
            row[1] = ((SampleWorkRequest) request).getQty();
            row[2] = request.getReceiver();
            String result = ((SampleWorkRequest) request).getStatus();
            row[3] = result == null ? "Waiting" : result;
            if(((SampleWorkRequest) request).getTOD()==null){
                row[4]="Details yet to be updated by supplier";
            }
            else{
            row[4]  = "Expected delivery time " +((SampleWorkRequest) request).getQty();
                    }
            
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

        jScrollPane = new javax.swing.JScrollPane();
        drugRequestsTable = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(233, 235, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane.setForeground(new java.awt.Color(255, 255, 255));

        drugRequestsTable.setBackground(new java.awt.Color(102, 102, 102));
        drugRequestsTable.setForeground(new java.awt.Color(255, 255, 255));
        drugRequestsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SAMPLE NAME", "REQUIRED QUANTITY", "RECIEVER", "STATUS", "DELIVERY DATE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        drugRequestsTable.setRowHeight(30);
        jScrollPane.setViewportView(drugRequestsTable);

        add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 700, 260));

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
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 30));

        jLabel1.setBackground(new java.awt.Color(0, 0, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VIEW STATUS OF REQUEST");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 655, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/statusofrequest_1_64.jpeg"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 70, 470, 520));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        GetSampleRequestsJPanel dw = (GetSampleRequestsJPanel) component;
        dw.reorderTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTable drugRequestsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane;
    // End of variables declaration//GEN-END:variables
}
