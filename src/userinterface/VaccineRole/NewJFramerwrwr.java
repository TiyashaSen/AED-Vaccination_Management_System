/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userinterface.VaccineRole;

import java.awt.Color;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import static userinterface.VaccineRole.ViewSampleDetailsJPanel.COVACCINE_QTY;
import static userinterface.VaccineRole.ViewSampleDetailsJPanel.COVISHIELD_QTY;
import static userinterface.VaccineRole.ViewSampleDetailsJPanel.SPUTNIK_QTY;

/**
 *
 * @author tiyashasen
 */
public class NewJFramerwrwr extends javax.swing.JFrame {

    /**
     * Creates new form NewJFramerwrwr
     */
    
        private HashMap dataHashMap=new HashMap();
    static float COVACCINE_QTY,COVISHIELD_QTY,SPUTNIK_QTY;
    
    public NewJFramerwrwr() {
        initComponents();
    }
    
     public void showBarChart(String chemicalNameField, int availableQuantityForBar) {
        if(chemicalNameField.equalsIgnoreCase("Covaccine")){
            COVACCINE_QTY=COVACCINE_QTY + availableQuantityForBar;
        }
         if(chemicalNameField.equalsIgnoreCase("Covishield")){
            COVISHIELD_QTY=COVISHIELD_QTY + availableQuantityForBar;
        }
          if(chemicalNameField.equalsIgnoreCase("Sputnik")){
            SPUTNIK_QTY=SPUTNIK_QTY + availableQuantityForBar;
        }
          
          dataHashMap.clear();
          dataHashMap.put("Covaccine", COVACCINE_QTY);
          dataHashMap.put("Covishield", COVISHIELD_QTY);
          dataHashMap.put("Sputnik", SPUTNIK_QTY);
          this.updateChart();
    }
    
    private void updateChart(){
        DefaultCategoryDataset dcd= new DefaultCategoryDataset();
        
        Set keys=dataHashMap.keySet();
        Iterator prodInfoLtr=keys.iterator();
        
        while(prodInfoLtr.hasNext()){
            String productName=(String)prodInfoLtr.next();
            int prodQty=(int) dataHashMap.get(dataHashMap);
            dcd.setValue(prodQty, "Sales", productName);
        }
        JFreeChart jchart=ChartFactory.createBarChart("Sales report", "Product name", "Total Sales", dcd, PlotOrientation.HORIZONTAL, true, true, true);
        
        CategoryPlot plot=jchart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.black);
        
        ChartPanel chartPanel=new ChartPanel(jchart);
        jPanelChart.removeAll();
        jPanelChart.add(chartPanel);
        jPanelChart.updateUI();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        serialNumLabel = new javax.swing.JLabel();
        drugLabel = new javax.swing.JLabel();
        availLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanelChart = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        serialNumTextField = new javax.swing.JTextField();
        chemicalNameTextField = new javax.swing.JTextField();
        availQuantityTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        serialNumLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        serialNumLabel.setForeground(new java.awt.Color(102, 0, 255));
        serialNumLabel.setText("SERIAL NUMBER:");
        getContentPane().add(serialNumLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 140, 30));

        drugLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        drugLabel.setForeground(new java.awt.Color(102, 0, 255));
        drugLabel.setText("VACCINE NAME:");
        getContentPane().add(drugLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 120, 30));

        availLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        availLabel.setForeground(new java.awt.Color(102, 0, 255));
        availLabel.setText("AVAILABILITY:");
        getContentPane().add(availLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 120, 30));

        saveButton.setBackground(new java.awt.Color(102, 51, 255));
        saveButton.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.setText("SAVE");
        saveButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, 100, 60));

        jLabel1.setBackground(new java.awt.Color(51, 153, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VACCINE DETAILS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 260, 30));

        jButton1.setText("SHOW CHART");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, -1, -1));

        jPanelChart.setBackground(new java.awt.Color(204, 204, 204));
        jPanelChart.setLayout(new javax.swing.BoxLayout(jPanelChart, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(jPanelChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 470, 430));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 90, 50));

        serialNumTextField.setEditable(false);
        serialNumTextField.setBackground(new java.awt.Color(102, 102, 255));
        serialNumTextField.setForeground(new java.awt.Color(255, 255, 255));
        serialNumTextField.setBorder(null);
        getContentPane().add(serialNumTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 130, 30));

        chemicalNameTextField.setEditable(false);
        chemicalNameTextField.setBackground(new java.awt.Color(102, 102, 255));
        chemicalNameTextField.setForeground(new java.awt.Color(255, 255, 255));
        chemicalNameTextField.setBorder(null);
        getContentPane().add(chemicalNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, 130, 30));

        availQuantityTextField.setEditable(false);
        availQuantityTextField.setBackground(new java.awt.Color(102, 102, 255));
        availQuantityTextField.setForeground(new java.awt.Color(255, 255, 255));
        availQuantityTextField.setBorder(null);
        availQuantityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availQuantityTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(availQuantityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, 130, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        try{
            int availableQuantityForBar = Integer.parseInt(availQuantityTextField.getText());
            String chemicalNameTextFieldReal=chemicalNameTextField.getText();
        this.showBarChart(chemicalNameTextFieldReal, availableQuantityForBar);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Bar not getting generated");
            return;
        }
        

    }//GEN-LAST:event_saveButtonActionPerformed

    private void availQuantityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availQuantityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availQuantityTextFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFramerwrwr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFramerwrwr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFramerwrwr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFramerwrwr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFramerwrwr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel availLabel;
    private javax.swing.JTextField availQuantityTextField;
    private javax.swing.JTextField chemicalNameTextField;
    private javax.swing.JLabel drugLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelChart;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel serialNumLabel;
    private javax.swing.JTextField serialNumTextField;
    // End of variables declaration//GEN-END:variables
}