package userinterface;

import Vaccination.Configuration.EcoSystem;
import Vaccination.DB4OUtil.DB4OUtil;
import Vaccination.Enterprise.Enterprise;
import Vaccination.Network.Network;
import Vaccination.Organization.Organization;
import Vaccination.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.apache.log4j.Logger;

/**
 *
 * @author prakruthisomashekar
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private static Logger log = Logger.getLogger(MainJFrame.class);
    private static final String CLASS_NAME = MainJFrame.class.getName();
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    public MainJFrame() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        logoutBtn.setBackground(Color.blue);
        loginBtn.setBackground(Color.blue);

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT
     * modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        loginBtn = new javax.swing.JButton();
        userNameTxt = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JPasswordField();
        loginJLabel = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSplitPane1.setBackground(new java.awt.Color(255, 255, 255));
        jSplitPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1,
                new java.awt.Color(0, 0, 255)));
        jSplitPane1.setDividerSize(10);

        jPanel1.setBackground(new java.awt.Color(233, 235, 204));

        loginBtn.setBackground(new java.awt.Color(204, 204, 255));
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/login.png"))); // NOI18N
        loginBtn.setText("LOGIN");
        loginBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1,
                new java.awt.Color(255, 255, 255)));
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        userNameTxt.setBackground(new java.awt.Color(204, 204, 255));
        userNameTxt.setForeground(new java.awt.Color(255, 255, 255));
        userNameTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1,
                new java.awt.Color(255, 255, 255)));

        passwordTxt.setBackground(new java.awt.Color(204, 204, 255));
        passwordTxt.setForeground(new java.awt.Color(255, 255, 255));
        passwordTxt.setBorder(
                javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        logoutBtn.setBackground(new java.awt.Color(255, 204, 204));
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logout.png"))); // NOI18N
        logoutBtn.setText("LOGOUT");
        logoutBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1,
                new java.awt.Color(255, 255, 255)));
        logoutBtn.setEnabled(false);
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 204, 204));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/username.jpeg"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/password.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/images (1).png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 25)); // NOI18N
        jLabel7.setText("Vaccination Management System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)
                                        .addComponent(loginJLabel))
                                .addGroup(jPanel1Layout.createSequentialGroup().addGap(28, 28, 28)
                                        .addGroup(jPanel1Layout
                                                .createParallelGroup(
                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5).addComponent(jLabel4))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(jPanel1Layout
                                .createSequentialGroup().addGap(17, 17, 17).addComponent(jLabel7)
                                .addContainerGap(18, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                .createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addGroup(jPanel1Layout
                                                .createParallelGroup(
                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                        false)
                                                .addComponent(passwordTxt,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, 225,
                                                        Short.MAX_VALUE)
                                                .addComponent(userNameTxt)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(8, 8, 8)
                                                        .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(logoutBtn,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        206,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(loginBtn,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        206,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(85, 85, 85)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup().addGap(12, 12, 12)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 74,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129,
                                Short.MAX_VALUE)
                        .addGroup(jPanel1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(userNameTxt,
                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                        javax.swing.GroupLayout.PREFERRED_SIZE, 55,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(loginJLabel,
                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(loginBtn, javax.swing.GroupLayout.Alignment.TRAILING,
                                        javax.swing.GroupLayout.PREFERRED_SIZE, 39,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(1725, Short.MAX_VALUE)));

        jSplitPane1.setLeftComponent(jPanel1);

        container.setBackground(new java.awt.Color(233, 235, 204));
        container.setLayout(new java.awt.CardLayout());

        jLabel3.setBackground(new java.awt.Color(233, 235, 204));
        container.add(jLabel3, "card2");

        jSplitPane1.setRightComponent(container);

        getContentPane().add(jSplitPane1,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1313, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_loginBtnActionPerformed
        String userName = userNameTxt.getText();
        char[] passwordCharArray = passwordTxt.getPassword();
        String password = String.valueOf(passwordCharArray);

        // Step1: Check in the system admin user account directory if you have the user
        UserAccount userAccount = system.getUAD().authenticateUser(userName, password);

        Enterprise inEnterprise = null;
        Organization inOrganization = null;
        Network inNetwork = null;

        if (userAccount == null) {
            // Step 2: Go inside each network and check each enterprise
            for (Network network : system.getNetworkList()) {
                // Step 2.a: check against each enterprise
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    userAccount = enterprise.getUAD().authenticateUser(userName, password);
                    if (userAccount == null) {
                        // Step 3:check against each organization for each enterprise
                        for (Organization organization : enterprise.getOrganizationDirectory()
                                .getOrgList()) {
                            userAccount =
                                    organization.getUAD().authenticateUser(userName, password);
                            if (userAccount != null) {
                                inEnterprise = enterprise;
                                inOrganization = organization;
                                inNetwork = network;
                                log.debug("Current Enterprise\t" + enterprise);
                                log.debug("Current Organization\t" + organization);
                                log.debug("Current Network\t" + network);
                                break;
                            }
                        }

                    } else {
                        inEnterprise = enterprise;
                        break;
                    }
                    if (inOrganization != null) {
                        break;
                    }
                }
                if (inEnterprise != null) {
                    break;
                }
            }
        }

        if (userAccount == null) {
            log.error("Invalid credentials for user");
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        } else {
            CardLayout layout = (CardLayout) container.getLayout();
            log.debug("Logged in User Role" + userAccount.getRole());
            container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount,
                    inOrganization, inEnterprise, system, inNetwork));
            layout.next(container);
        }
        logoutBtn.setBackground(Color.blue);
        loginBtn.setBackground(Color.blue);
        loginBtn.setEnabled(false);
        logoutBtn.setEnabled(true);
        userNameTxt.setEnabled(false);
        passwordTxt.setEnabled(false);
    }// GEN-LAST:event_loginBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_logoutBtnActionPerformed
        logoutBtn.setEnabled(false);
        loginBtn.setBackground(Color.blue);
        userNameTxt.setEnabled(true);
        passwordTxt.setEnabled(true);
        loginBtn.setEnabled(true);
        logoutBtn.setBackground(Color.blue);
        userNameTxt.setText("");
        passwordTxt.setText("");
        container.removeAll();
        JPanel blankJP = new JPanel();
        blankJP.setBackground(Color.blue);
        container.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(system);
    }// GEN-LAST:event_logoutBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default look and
         * feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                    .getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        log.debug("Entering Main JFrame\t" + CLASS_NAME);
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JTextField userNameTxt;
    // End of variables declaration//GEN-END:variables
}
