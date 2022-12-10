/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VaccineRole;

import Vaccination.SampleInventory.SampleCompound;
import Vaccination.Enterprise.Enterprise;
import Vaccination.MedicalInventory.MedicalInventoryList;
import Vaccination.Organization.Vaccine;
import Vaccination.UserAccount.UserAcc;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.apache.log4j.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author tiyashasen
 */
public class ViewSampleDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewSampleDetailsJPanel
     */
    JPanel userProcessContainer;
    private UserAcc userAccount;
    private Enterprise enterprise;
    private MedicalInventoryList mil;
    private Vaccine drugOrg;
    private SampleCompound mi;
    private static Logger log = Logger.getLogger(ViewSampleDetailsJPanel.class);
    private static final String CLASS_NAME = ViewSampleDetailsJPanel.class.getName();
    //Barchart implementation
    private HashMap dataHashMap=new HashMap();
    static float COVACCINE_QTY,COVISHIELD_QTY,SPUTNIK_QTY;
    
    
    public ViewSampleDetailsJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, SampleCompound mi) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.drugOrg = drugOrg;
        this.mi = mi;
        serialNumTextField.setText(String.valueOf(mi.getSerialNumber()));
        availQuantityTextField.setText(String.valueOf(mi.getAvailQuantity()));
        chemicalNameTextField.setText(mi.getSampleName());
        try {
            String phone = JOptionPane.showInputDialog(null, "Please enter phone number");
            String opt = JOptionPane.showInputDialog(null, "Please enter the generated OTP.");
            if (opt.equalsIgnoreCase("12697") || opt.equalsIgnoreCase("30897") || opt.equalsIgnoreCase("28596") || opt.equalsIgnoreCase("15067")) {
                serialNumTextField.setEnabled(true);
                chemicalNameTextField.setEnabled(true);
                availQuantityTextField.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "No Update Access.");
                serialNumTextField.setEnabled(false);
                chemicalNameTextField.setEnabled(false);
                availQuantityTextField.setEnabled(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No Update Access.");
        }
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

        jFreeChartResources1 = new org.jfree.chart.resources.JFreeChartResources();
        jFreeChartResources2 = new org.jfree.chart.resources.JFreeChartResources();
        serialNumLabel = new javax.swing.JLabel();
        serialNumTextField = new javax.swing.JTextField();
        drugLabel = new javax.swing.JLabel();
        chemicalNameTextField = new javax.swing.JTextField();
        availLabel = new javax.swing.JLabel();
        availQuantityTextField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanelChart = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(233, 235, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        serialNumLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        serialNumLabel.setForeground(new java.awt.Color(102, 0, 255));
        serialNumLabel.setText("SERIAL NUMBER:");
        add(serialNumLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 140, 30));

        serialNumTextField.setEditable(false);
        serialNumTextField.setBackground(new java.awt.Color(102, 102, 255));
        serialNumTextField.setForeground(new java.awt.Color(255, 255, 255));
        serialNumTextField.setBorder(null);
        serialNumTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serialNumTextFieldActionPerformed(evt);
            }
        });
        add(serialNumTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 130, 30));

        drugLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        drugLabel.setForeground(new java.awt.Color(102, 0, 255));
        drugLabel.setText("VACCINE NAME:");
        add(drugLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 120, 30));

        chemicalNameTextField.setEditable(false);
        chemicalNameTextField.setBackground(new java.awt.Color(102, 102, 255));
        chemicalNameTextField.setForeground(new java.awt.Color(255, 255, 255));
        chemicalNameTextField.setBorder(null);
        add(chemicalNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, 130, 30));

        availLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        availLabel.setForeground(new java.awt.Color(102, 0, 255));
        availLabel.setText("AVAILABILITY:");
        add(availLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 120, 30));

        availQuantityTextField.setEditable(false);
        availQuantityTextField.setBackground(new java.awt.Color(102, 102, 255));
        availQuantityTextField.setForeground(new java.awt.Color(255, 255, 255));
        availQuantityTextField.setBorder(null);
        availQuantityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availQuantityTextFieldActionPerformed(evt);
            }
        });
        add(availQuantityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, 130, 30));

        backButton.setBackground(new java.awt.Color(102, 51, 255));
        backButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText(" BACK");
        backButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 74, 32));

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
        add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, 100, 60));

        updateButton.setBackground(new java.awt.Color(102, 51, 255));
        updateButton.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("UPDATE");
        updateButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 400, 100, 60));

        jLabel1.setBackground(new java.awt.Color(51, 153, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VACCINE DETAILS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 260, 30));

        jButton1.setText("SHOW CHART");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, -1, -1));

        jPanelChart.setBackground(new java.awt.Color(204, 204, 204));
        jPanelChart.setLayout(new javax.swing.BoxLayout(jPanelChart, javax.swing.BoxLayout.LINE_AXIS));
        add(jPanelChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 480, 470));
        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 90, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void availQuantityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availQuantityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availQuantityTextFieldActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ViewSampleRequestsJPanel me = (ViewSampleRequestsJPanel) component;
        me.reorderTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        if (chemicalNameTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "chemical name is empty");
            return;
        }
        mi.setSampleName(chemicalNameTextField.getText());

        try {
            int availableQuantity = Integer.parseInt(availQuantityTextField.getText());
            mi.setAvailQuantity(availableQuantity);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Available quantity must be integer");
            return;
        }
        try {
            int serialNumber = Integer.parseInt(serialNumTextField.getText());
            mi.setSerialNumber(serialNumber);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Serial number must be integer");
            return;
        }

        saveButton.setEnabled(false);
        updateButton.setEnabled(true);
        chemicalNameTextField.setEditable(false);
        serialNumTextField.setEditable(false);
        availQuantityTextField.setEditable(false);

        JOptionPane.showMessageDialog(null, "Medicine updated Successfully", "Warning", JOptionPane.INFORMATION_MESSAGE);
        log.debug(userAccount + " " + "updated chemical details successfully");
        
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

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed

        chemicalNameTextField.setEditable(true);
        serialNumTextField.setEditable(true);
        availQuantityTextField.setEditable(true);
        updateButton.setEnabled(false);
        saveButton.setEnabled(true);
    }//GEN-LAST:event_updateButtonActionPerformed

    private void serialNumTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serialNumTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serialNumTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel availLabel;
    private javax.swing.JTextField availQuantityTextField;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField chemicalNameTextField;
    private javax.swing.JLabel drugLabel;
    private javax.swing.JButton jButton1;
    private org.jfree.chart.resources.JFreeChartResources jFreeChartResources1;
    private org.jfree.chart.resources.JFreeChartResources jFreeChartResources2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelChart;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel serialNumLabel;
    private javax.swing.JTextField serialNumTextField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
