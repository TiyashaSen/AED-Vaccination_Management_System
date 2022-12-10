/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SampleSupplier;

import userinterface.VaccineRole.VaccineWorkArea;
import Vaccination.WorkQueue.SampleWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.apache.log4j.Logger;

/**
 *
 * @author tiyashasen
 */
public class SampleProcessRequestJpanel extends javax.swing.JPanel {

    /**
     * Creates new form SampleProcessRequestJpanel
     */
    JPanel userProcessContainer;
    SampleWorkRequest request;
    private static Logger log = Logger.getLogger(SampleProcessRequestJpanel.class);
    private static final String CLASS_NAME = SampleProcessRequestJpanel.class.getName();
    public SampleProcessRequestJpanel(JPanel userprocessContainer, SampleWorkRequest request) {
        initComponents();
        this.userProcessContainer = userprocessContainer;
        this.request = request;
        dateFld.setMinSelectableDate(new Date());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        processlbl = new javax.swing.JLabel();
        datedeliveryBtn = new javax.swing.JLabel();
        dateTxt = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dateFld = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(233, 235, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        processlbl.setBackground(new java.awt.Color(153, 153, 255));
        processlbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        processlbl.setForeground(new java.awt.Color(255, 255, 255));
        processlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        processlbl.setText("PROCESSING SAMPLE REQUEST ");
        add(processlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 400, 50));

        datedeliveryBtn.setForeground(new java.awt.Color(255, 255, 255));
        datedeliveryBtn.setText("SELECT DATE OF DELIVERY : ");
        add(datedeliveryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, -1, -1));

        dateTxt.setEditable(false);
        dateTxt.setBackground(new java.awt.Color(102, 102, 255));
        dateTxt.setForeground(new java.awt.Color(255, 255, 255));
        add(dateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, 140, 40));

        backBtn.setBackground(new java.awt.Color(0, 0, 255));
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("BACK");
        backBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 89, 36));

        updateBtn.setBackground(new java.awt.Color(0, 0, 255));
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("UPDATE STATUS ");
        updateBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 142, 36));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bacteria.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 43, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/biology.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 344, -1, 296));

        dateFld.setBackground(new java.awt.Color(102, 102, 255));
        add(dateFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 130, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SampleWorkArea dwjp = (SampleWorkArea) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        request.setStatus("Completed");
        try{
        int year = dateFld.getCalendar().get(Calendar.YEAR);
        int month = dateFld.getCalendar().get(Calendar.MONTH);
        int day = dateFld.getCalendar().get(Calendar.DAY_OF_MONTH);
        String result = year + "-" + month + "-" + day;
        ((SampleWorkRequest) request).setTOD(result);
        dateTxt.setText(result);
        JOptionPane.showMessageDialog(null, "Request updated successfully!");
        log.debug("request updated successfully");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null , "please enter the valid date");
            return;
        }
    }//GEN-LAST:event_updateBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private com.toedter.calendar.JDateChooser dateFld;
    private javax.swing.JTextField dateTxt;
    private javax.swing.JLabel datedeliveryBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel processlbl;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
