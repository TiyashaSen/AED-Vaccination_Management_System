/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Doctor;

import Vaccination.Doctor.Doctor;
import Vaccination.Doctor.Order;
import Vaccination.Doctor.OrderArray;
import Vaccination.Configuration.EcoSystem;
import Vaccination.Enterprise.Enterprise;
import Vaccination.Connection.Connection;
import Vaccination.Medicine.Drug;
import Vaccination.Notify.SendEmail;
import Vaccination.Organization.DoctorOrg;
import Vaccination.Organization.Organization;
import Vaccination.Organization.Pharmacy;
import Vaccination.UserAccount.UserAcc;
import Vaccination.WorkQueue.DoctorWorkRequest;
import Vaccination.WorkQueue.PharmacyWorkRequest;
import Vaccination.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.CardLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import userinterface.SystemAdminWorkArea.GetReportsJPanel;
/**
 *
 * @author prakruthisomashekar
 */
public class AddPrescriptionMedicineJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddPrescriptionMedicineJPanel
     */
    SendEmail s = new SendEmail();
    private OrderArray orderList;
    private DoctorOrg doctorOrganization;
    private Enterprise enterprise;
    private UserAcc userAccount;
    private JPanel userProcessContainer;
    private Order order;
    private DoctorWorkRequest docWR;
    private Connection network;
    private EcoSystem system;
    private static Logger log = Logger.getLogger(AddPrescriptionMedicineJPanel.class);
    private static final String CLASS_NAME = AddPrescriptionMedicineJPanel.class.getName();
   
    public AddPrescriptionMedicineJPanel(JPanel userProcessContainer, OrderArray List, UserAcc account, Enterprise enterprise, DoctorOrg organization, EcoSystem system, Connection network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.enterprise = enterprise;
        this.doctorOrganization = organization;
        this.network = network;
        this.system = system;
        this.setSize(1920, 1080);
        populateWorkRequestTable();
        jDateChooser2.setMinSelectableDate(new Date());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        doctorPrescriptionLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        ageLbl = new javax.swing.JLabel();
        ageTxtField = new javax.swing.JTextField();
        sexLbl = new javax.swing.JLabel();
        sexcomboBox = new javax.swing.JComboBox<>();
        diagnosisLbl = new javax.swing.JLabel();
        medicationLbl = new javax.swing.JLabel();
        diagnosisComboBox = new javax.swing.JComboBox<>();
        timesADayLbl = new javax.swing.JLabel();
        forLbl = new javax.swing.JLabel();
        savePrescriptionBtn = new javax.swing.JButton();
        noofTimesTxt = new javax.swing.JSpinner();
        noofDaysTxt = new javax.swing.JSpinner();
        patientEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        scrollPane2 = new javax.swing.JScrollPane();
        prescriptionJTable = new javax.swing.JTable();
        dateLbl = new javax.swing.JLabel();
        medicationCombobox = new javax.swing.JComboBox<>();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        sendPrescription = new javax.swing.JButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        generateReports = new javax.swing.JButton();

        setBackground(new java.awt.Color(233, 235, 204));
        setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 48)); // NOI18N
        setPreferredSize(new java.awt.Dimension(2000, 1200));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        doctorPrescriptionLbl.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        doctorPrescriptionLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        doctorPrescriptionLbl.setText("BOSTON HEALTH CENTER");
        add(doctorPrescriptionLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 683, -1));

        nameLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        nameLbl.setText("NAME:");
        add(nameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));
        add(nameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 132, -1));

        ageLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        ageLbl.setText("AGE:");
        add(ageLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, 20));
        add(ageTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 132, -1));

        sexLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        sexLbl.setText("GENDER:");
        add(sexLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        sexcomboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "MALE", "FEMALE" }));
        sexcomboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexcomboBoxActionPerformed(evt);
            }
        });
        add(sexcomboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 132, -1));

        diagnosisLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        diagnosisLbl.setText("DISEASE SEVERITY LEVEL:");
        add(diagnosisLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        medicationLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        medicationLbl.setText("MEDICINES:");
        add(medicationLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, -1, -1));

        diagnosisComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "LOW", "MEDIUM", "HIGH", "SEVER", " " }));
        diagnosisComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagnosisComboBoxActionPerformed(evt);
            }
        });
        add(diagnosisComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 132, 30));

        timesADayLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        timesADayLbl.setText("NUMBER OF TIMES A DAY");
        add(timesADayLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, 20));

        forLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        forLbl.setText("FOR");
        add(forLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, 20));

        savePrescriptionBtn.setBackground(new java.awt.Color(102, 102, 102));
        savePrescriptionBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        savePrescriptionBtn.setForeground(new java.awt.Color(255, 255, 255));
        savePrescriptionBtn.setText("SEND PRESCRIPTION");
        savePrescriptionBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        savePrescriptionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePrescriptionBtnActionPerformed(evt);
            }
        });
        add(savePrescriptionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 170, 38));

        noofTimesTxt.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        add(noofTimesTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 72, -1));

        noofDaysTxt.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        add(noofDaysTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 327, 72, -1));
        add(patientEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 130, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setText("E-MAIL:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        prescriptionJTable.setBackground(new java.awt.Color(102, 102, 102));
        prescriptionJTable.setForeground(new java.awt.Color(255, 255, 255));
        prescriptionJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MEDICINE", "TOTAL QUANTITY", "RECIEVER"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        prescriptionJTable.setRowHeight(25);
        scrollPane2.setViewportView(prescriptionJTable);

        add(scrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 689, 173));

        dateLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        dateLbl.setText("DATE:");
        add(dateLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, 26));

        medicationCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "PARACETAMOL", "COMBIFLAM", "FLUDREX", "IVERMECTIN", "HYDROXYCHLOROQUINE" }));
        medicationCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicationComboboxActionPerformed(evt);
            }
        });
        add(medicationCombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 217, 132, -1));

        backBtn.setBackground(new java.awt.Color(0, 0, 0));
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("BACK");
        backBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 76, 28));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/prescription_2_1000x1000.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 730, 940));

        sendPrescription.setBackground(new java.awt.Color(0, 0, 255));
        sendPrescription.setForeground(new java.awt.Color(255, 255, 255));
        sendPrescription.setText("SEND E-PRESCRIPTION");
        sendPrescription.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        sendPrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendPrescriptionActionPerformed(evt);
            }
        });
        add(sendPrescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 640, 160, 30));

        jDateChooser2.setBackground(new java.awt.Color(0, 0, 0));
        add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 130, -1));

        generateReports.setBackground(new java.awt.Color(102, 102, 102));
        generateReports.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        generateReports.setForeground(new java.awt.Color(255, 255, 255));
        generateReports.setText("GENERATE REPORT");
        generateReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateReportsActionPerformed(evt);
            }
        });
        add(generateReports, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 403, 180, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void savePrescriptionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePrescriptionBtnActionPerformed
        // TODO add your handling code here:

        Order p = new Order();
        p.setIssue(diagnosisComboBox.getSelectedItem().toString());
        p.setMedName(medicationCombobox.getSelectedItem().toString());
        p.setFreqInADay((Integer) noofTimesTxt.getValue());
        p.setDaysTotal((Integer) noofDaysTxt.getValue());
        p.setNetworkName(network.getName());

        String age = ageTxtField.getText();
        boolean flag = true;
        System.out.println("the new date"+jDateChooser2.getDate());
        try {
            Integer.parseInt(age);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Age must be integer!");
            flag = false;
            return;
        }

        if (p.getIssue().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the daignosis!");
            flag = false;
            return;
        } else if (nameTxtField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the patient name!");
            flag = false;
            return;

        }
        if (((Integer) noofTimesTxt.getValue()) == 0 || ((Integer) noofDaysTxt.getValue()) == 0) {
            JOptionPane.showMessageDialog(null, "Please enter the no of days or no times !");
            flag = false;
            return;
        }
        if (jDateChooser2.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Please select the date !");
            flag = false;
            return;
        }
        if (medicationCombobox.getSelectedIndex() <= 0) {
            JOptionPane.showMessageDialog(null, "Please select the Medication Name !");
            flag = false;
        }
        if (sexcomboBox.getSelectedIndex() <= 0) {
            JOptionPane.showMessageDialog(null, "Please select the Gender !");
            flag = false;
            return;
        }
        if (diagnosisComboBox.getSelectedIndex() <= 0) {
            JOptionPane.showMessageDialog(null, "please select the diagonsis name");
            flag = false;
            return;
        }
        String regex = "^(.+)@(.+)$";

        Pattern pattern = Pattern.compile(regex);
        if (!patientEmail.getText().isEmpty()) {
            Matcher matcher = pattern.matcher(patientEmail.getText());
            if (matcher.matches()) {
                String email = patientEmail.getText();
                p.setEmail(email);
            } else {
                JOptionPane.showMessageDialog(null, "Email is not in proper format");
                flag = false;
                return;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Email cannot be empty");
        }
        if (flag == true) {

            try {
                doctorOrganization.addPrescription(p);
                
                PharmacyWorkRequest request = new PharmacyWorkRequest();
                
                request.setMedName(medicationCombobox.getSelectedItem().toString());
                request.setQty(((Integer) noofTimesTxt.getValue()) * ((Integer) noofDaysTxt.getValue()));
                request.setEndUser(userAccount);
                request.setStatus("Sent");
                System.out.println(request.getMedName());
                JOptionPane.showMessageDialog(null, "Prescription added successfully");
                
                System.out.println("****" + enterprise.getName());
                Organization org = null;
                
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof Pharmacy) {
                            org = organization;
                            System.out.println("****" + org);
                            log.debug(org);
                            log.debug("Current Enterprise\t" + enterprise);
                            log.debug("Current Organization\t" + org);
                            log.debug("Current Network\t" + network);
                            break;
                        }
                    }
                }

//            if (org != null) {
System.out.println("adding request"+request);
org.getWq().getWorkRequestList().add(request);
userAccount.getWorkQueue().getWorkRequestList().add(request);
log.debug("request sent to Pharmacy");
//            }

populateWorkRequestTable();
s.sendMail(nameTxtField.getText(), patientEmail.getText(), medicationCombobox.getSelectedItem().toString(), ageTxtField.getText());

nameTxtField.setText("");
ageTxtField.setText("");
noofTimesTxt.setValue(0);
noofDaysTxt.setValue(0);
sexcomboBox.setSelectedIndex(0);
medicationCombobox.setSelectedIndex(0);
patientEmail.setText("");
            } catch (Exception ex) {
                java.util.logging.Logger.getLogger(AddPrescriptionMedicineJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_savePrescriptionBtnActionPerformed

    private void diagnosisComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagnosisComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diagnosisComboBoxActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        log.debug("going back to Doctors work area");
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void sexcomboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexcomboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexcomboBoxActionPerformed

    private void medicationComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicationComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicationComboboxActionPerformed

    private void sendPrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendPrescriptionActionPerformed
        // TODO add your handling code here:
        pdfGeneration();

    }//GEN-LAST:event_sendPrescriptionActionPerformed

    private void generateReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateReportsActionPerformed
        // TODO add your handling code here:
        String medicineString= medicationCombobox.getSelectedItem().toString();
        List<String> medList = new ArrayList<>();
        medList.add(medicineString);
        
        GetReportsJPanel getReportsJPanel = new GetReportsJPanel(userProcessContainer, system, medList, system.getNetworkArray() );
                userProcessContainer.add("getReportsJPanel", getReportsJPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
    }//GEN-LAST:event_generateReportsActionPerformed

    public void populateWorkRequestTable() {
        try {
            System.out.println("hitting here");
            DefaultTableModel model = (DefaultTableModel) prescriptionJTable.getModel();

            model.setRowCount(0);
            System.out.println("userAccount.getWorkQueue().getWorkRequestList()"+userAccount.getWorkQueue().getWorkRequestList().size());
            for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
                if (request instanceof PharmacyWorkRequest) {
                    Object[] row = new Object[4];
                    String medication = ((PharmacyWorkRequest) request).getMedName();
                    System.out.println("****" + medication);
                    
                    row[0] = (PharmacyWorkRequest) request;
                    int quantity = ((PharmacyWorkRequest) request).getQty();
                    row[1] = quantity;
                    row[2] = request.getReceiver();
                    String result = request.getStatus();
                    row[3] = result == null ? "Waiting" : result;
                    System.out.println("the details "+quantity);
                    model.addRow(row);

                }
            }
        } catch (Exception e) {
            System.out.println("addprescription table not populating yet");
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLbl;
    private javax.swing.JTextField ageTxtField;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel dateLbl;
    private javax.swing.JComboBox<String> diagnosisComboBox;
    private javax.swing.JLabel diagnosisLbl;
    private javax.swing.JLabel doctorPrescriptionLbl;
    private javax.swing.JLabel forLbl;
    private javax.swing.JButton generateReports;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> medicationCombobox;
    private javax.swing.JLabel medicationLbl;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JSpinner noofDaysTxt;
    private javax.swing.JSpinner noofTimesTxt;
    private javax.swing.JTextField patientEmail;
    private javax.swing.JTable prescriptionJTable;
    private javax.swing.JButton savePrescriptionBtn;
    private javax.swing.JScrollPane scrollPane2;
    private javax.swing.JButton sendPrescription;
    private javax.swing.JLabel sexLbl;
    private javax.swing.JComboBox<String> sexcomboBox;
    private javax.swing.JLabel timesADayLbl;
    // End of variables declaration//GEN-END:variables

    public void pdfGeneration() {
        Doctor d = new Doctor();
        Order p = new Order();
        PharmacyWorkRequest request = new PharmacyWorkRequest();
        if (prescriptionJTable.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }

        try {

            String deductReason = "";
            JFileChooser chooser = new JFileChooser();
            chooser.setSelectedFile(new File("Prescription" + ".pdf"));
            int dialogResult = chooser.showSaveDialog(null);
            if (dialogResult == JFileChooser.APPROVE_OPTION) {

                String filepath = chooser.getSelectedFile().getPath();
                try {
                    Document myDocumen = new Document();
                    PdfWriter mywriter = PdfWriter.getInstance(myDocumen, new FileOutputStream(filepath));

                    myDocumen.open();
                    myDocumen.add(new Paragraph("NORTHEASTERN COVID-19 CENTER", FontFactory.getFont(FontFactory.TIMES_BOLD, 28, Font.BOLD)));
                    myDocumen.add(new Paragraph("PRESCRIPTION", FontFactory.getFont(FontFactory.TIMES_BOLD, 22, Font.BOLD)));
                    myDocumen.add(new Paragraph(new Date().toString()));
                    myDocumen.add(new Paragraph("----------------------------------------------------------------------------"));
                    myDocumen.add(new Paragraph("HOSPITAL: NORTHEASTERN COVID-19 CENTER", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.NORMAL)));

                    myDocumen.add(new Paragraph("----------------------------------------------------------------------------"));
                    myDocumen.add(new Paragraph("PATIENT DETAILS", FontFactory.getFont(FontFactory.TIMES_BOLD, 15, Font.BOLD)));
                    myDocumen.add(new Paragraph("NAME: " + "Deepa", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.NORMAL)));
                    myDocumen.add(new Paragraph("AGE: " + "25", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.NORMAL)));
                    myDocumen.add(new Paragraph("E-MAIL: " +"Deepa@gmail.com" , FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.NORMAL)));
                    myDocumen.add(new Paragraph("GENDER: " + "Female", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.NORMAL)));
                    myDocumen.add(new Paragraph("----------------------------------------------------------------------------"));
                    myDocumen.add(new Paragraph("----------------------------------------------------------------------------"));
                    myDocumen.add(new Paragraph("MEDICATION", FontFactory.getFont(FontFactory.TIMES_BOLD, 15, Font.BOLD)));
                    myDocumen.add(new Paragraph("DRUG NAME: " + "PARACETAMOL", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.NORMAL)));
                    myDocumen.add(new Paragraph("DOSE: " + "3", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.NORMAL)));
                    myDocumen.add(new Paragraph("DURATON :" + "3" + " Days", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.NORMAL)));
                    myDocumen.add(new Paragraph("----------------------------------------------------------------------------"));
                    myDocumen.newPage();
                    myDocumen.close();
                    JOptionPane.showMessageDialog(null, "Report successfuly generated");
                } catch (NumberFormatException | FileNotFoundException e) {
                    JOptionPane.showMessageDialog(null, e);
                    e.printStackTrace();
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid medications!!!", "Not Numeric", JOptionPane.ERROR_MESSAGE);
        }
    }
}
