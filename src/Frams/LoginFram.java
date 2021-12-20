package Frams;

import classess.DBConnector;
import classess.LoginClass;

import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;

public class LoginFram extends javax.swing.JFrame {
    DBConnector dbConnector = new DBConnector();

    public LoginFram() {
        initComponents();
        dbConnector.dbConnectNow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        passwordTFlog = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        loginBtnlog = new javax.swing.JButton();
        resetBtnlog = new javax.swing.JButton();
        nameTFlog = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        backBtnlog = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Name");

        loginBtnlog.setText("Login");
        loginBtnlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnlogActionPerformed(evt);
            }
        });

        resetBtnlog.setText("Reset");
        resetBtnlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnlogActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Password");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Welcom Back");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Login Your Account");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(nameTFlog, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(loginBtnlog)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(resetBtnlog))
                                                        .addComponent(passwordTFlog, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel1))
                                                .addContainerGap(115, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel2))
                                                .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(33, 33, 33))
                                        .addComponent(nameTFlog, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passwordTFlog, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(loginBtnlog)
                                        .addComponent(resetBtnlog))
                                .addContainerGap(71, Short.MAX_VALUE))
        );

        backBtnlog.setBackground(new java.awt.Color(0, 153, 102));
        backBtnlog.setText("Back");
        backBtnlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnlogActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Enter Your Name & Password");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 102, 255));
        jLabel6.setText("To Access all Featuer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(jLabel5)
                                                                .addGap(28, 28, 28))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(backBtnlog)
                                                                .addGap(101, 101, 101))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(64, 64, 64)
                                                .addComponent(jLabel6)
                                                .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(backBtnlog)
                                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnlogActionPerformed
        // TODO add your handling code here:
        RegisterFram startFram = new RegisterFram();
        startFram.setVisible(true);
        dispose();
    }//GEN-LAST:event_backBtnlogActionPerformed

    //patient login are
    private void loginBtnlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnlogActionPerformed
        String name = "", password = "";

        LoginClass loginClass = new LoginClass();

        //username
        try {
            name = nameTFlog.getText();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Something Wring with Username");
        }

        //password
        try {
            password = passwordTFlog.getText();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Something Wring with Password");
        }


        //check
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username Cannot be Empty");
        } else if (password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Password Cannnot be Empty");
        } else {
            //get information from db:
            String userName;
            String userPassword;
            try {

                PreparedStatement pst;
                pst = dbConnector.con.prepareStatement("select fullname,password from Users where fullname = ? and password= ?");
                pst.setString(1, name);
                pst.setString(2, password);
                ResultSet rs = pst.executeQuery();

                if (rs.next() == true) {
                    userName = rs.getString(1);
                    userPassword = rs.getString(2);



                    if (!name.toLowerCase()
                            .equals(userName.toLowerCase())) {
                        JOptionPane.showMessageDialog(this, "Username Incorrect");
                    } else if (!password.toLowerCase().equals(userPassword.toLowerCase())) {
                        JOptionPane.showMessageDialog(this, "Password Incorrect");
                    } else {
                        System.out.printf(userName);
                        System.out.printf(userPassword);

                        DashboardFram dashboardFram = new DashboardFram();
                        dashboardFram.setVisible(true);
                        dispose();
                    }
                } else {

                    JOptionPane.showMessageDialog(null, "User No Found");

                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }


    }//GEN-LAST:event_loginBtnlogActionPerformed

    //reset value
    private void resetBtnlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnlogActionPerformed
        // TODO add your handling code here:
        if (nameTFlog.getText().isEmpty() || passwordTFlog.getText().isEmpty()) {
            JOptionPane.showConfirmDialog(this, "Don't Need To Reset ):");
        } else {
            nameTFlog.setText("");
            passwordTFlog.setText("");
            JOptionPane.showConfirmDialog(this, "Reset Done");
        }
    }//GEN-LAST:event_resetBtnlogActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtnlog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginBtnlog;
    private javax.swing.JTextField nameTFlog;
    private javax.swing.JTextField passwordTFlog;
    private javax.swing.JButton resetBtnlog;
    // End of variables declaration//GEN-END:variables
}
