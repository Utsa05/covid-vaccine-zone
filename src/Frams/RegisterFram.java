package Frams;


import classess.DBConnector;
import classess.RegisterClass;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class RegisterFram extends javax.swing.JFrame {

    /**
     * Creates new form StartFram
     */
    DBConnector dbConnector=new DBConnector();
    public RegisterFram() {
        initComponents();
        dbConnector.dbConnectNow();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        buttonGroupRegi = new javax.swing.ButtonGroup();
        startPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        exitbtnRegi = new javax.swing.JButton();
        loginbtnRegi = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        nameTFRegi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        phoneTFregi = new javax.swing.JTextField();
        addressTFregi = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        passwordTFregi = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        registerBtn = new javax.swing.JButton();
        femaleRBregi = new javax.swing.JRadioButton();
        maleRBregi = new javax.swing.JRadioButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(11, 255, 41));
        jLabel3.setText("Hey Welcome, Register here to get covid vaccine and helpling");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Covid Vaccine Zone");
        setBackground(new java.awt.Color(102, 102, 255));

        startPanel.setBackground(new java.awt.Color(102, 102, 255));

        jPanel1.setBackground(new java.awt.Color(249, 249, 249));

        jLabel1.setBackground(new java.awt.Color(102, 255, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Covide Vaccine Zone");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 51));
        jLabel2.setText("Hey Welcome, Register here to get covid vaccine and helpling");

        jLabel4.setForeground(new java.awt.Color(0, 153, 51));
        jLabel4.setText("Please Stay Home & Stay Safe");

        exitbtnRegi.setBackground(new java.awt.Color(255, 0, 0));
        exitbtnRegi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exitbtnRegi.setForeground(new java.awt.Color(255, 255, 255));
        exitbtnRegi.setText("Exit");
        exitbtnRegi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnRegiActionPerformed(evt);
            }
        });

        loginbtnRegi.setBackground(new java.awt.Color(102, 153, 255));
        loginbtnRegi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        loginbtnRegi.setForeground(new java.awt.Color(255, 255, 255));
        loginbtnRegi.setText("Login");
        loginbtnRegi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnRegiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(loginbtnRegi)
                        .addGap(33, 33, 33)
                        .addComponent(exitbtnRegi, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(127, 127, 127))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitbtnRegi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginbtnRegi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Full Name");

        nameTFRegi.setBorder(null);
        nameTFRegi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTFRegiActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Phone No");

        phoneTFregi.setBorder(null);
        phoneTFregi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTFregiActionPerformed(evt);
            }
        });

        addressTFregi.setBorder(null);
        addressTFregi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTFregiActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Address");

        passwordTFregi.setBorder(null);
        passwordTFregi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTFregiActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Password");

        registerBtn.setBackground(new java.awt.Color(0, 255, 102));
        registerBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        registerBtn.setForeground(new java.awt.Color(255, 255, 255));
        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        buttonGroupRegi.add(femaleRBregi);
        femaleRBregi.setText(" Female");
        femaleRBregi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRBregiActionPerformed(evt);
            }
        });

        buttonGroupRegi.add(maleRBregi);
        maleRBregi.setText(" Male");
        maleRBregi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRBregiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout startPanelLayout = new javax.swing.GroupLayout(startPanel);
        startPanel.setLayout(startPanelLayout);
        startPanelLayout.setHorizontalGroup(
            startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, startPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(nameTFRegi, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(phoneTFregi, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(passwordTFregi, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressTFregi, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(maleRBregi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(femaleRBregi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(startPanelLayout.createSequentialGroup()
                    .addGap(330, 330, 330)
                    .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(468, Short.MAX_VALUE)))
        );
        startPanelLayout.setVerticalGroup(
            startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(startPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameTFRegi, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneTFregi, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressTFregi, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(maleRBregi)
                .addGap(4, 4, 4)
                .addComponent(femaleRBregi)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordTFregi, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(startPanelLayout.createSequentialGroup()
                    .addGap(192, 192, 192)
                    .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(198, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(startPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(startPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameTFRegiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTFRegiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTFRegiActionPerformed

    private void phoneTFregiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTFregiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTFregiActionPerformed

    private void addressTFregiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTFregiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTFregiActionPerformed

    private void passwordTFregiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTFregiActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_passwordTFregiActionPerformed

    private void exitbtnRegiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnRegiActionPerformed
        // TODO add your handling code here:
        RegisterFram sf=new RegisterFram();
        sf.setVisible(false);
        dispose();
        
    }//GEN-LAST:event_exitbtnRegiActionPerformed

    private void loginbtnRegiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnRegiActionPerformed
        // TODO add your handling code here:
         LoginFram sf=new LoginFram();
        sf.setVisible(true);
        dispose();
        
       
    }//GEN-LAST:event_loginbtnRegiActionPerformed
      // Register operation here:
    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // Register operation here:
        RegisterClass registerClass=new RegisterClass();
        String name="",password="",address="",selectGender="",phone="";
           
           
        //name
              try {
            name=nameTFRegi.getText();
            
            if(name.isEmpty()){
               JOptionPane.showMessageDialog(this, "Name Cannot be Empty");
            }
            
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
              
              
          
              
              //phone
                   try {
            phone=phoneTFregi.getText();
            
            if(phone.isEmpty()){
               JOptionPane.showMessageDialog(this, "Phone Cannot be Empty");
            }
            
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
                   
     
              
              
              //address
              try {
            address=addressTFregi.getText();
            
            if(address.isEmpty()){
               JOptionPane.showMessageDialog(this, "Address Cannot be Empty");
            }
            
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
             
              
              //gender
              if(maleRBregi.isSelected()){
                  selectGender="Male";
              }else if(femaleRBregi.isSelected()){
                  selectGender="Female";
              }else{
                  JOptionPane.showConfirmDialog(this, "Please Select Gender");
              }
              
          
            //password
                               try {
            password=passwordTFregi.getText();
            
            if(password.isEmpty()){
               JOptionPane.showMessageDialog(this, "Password Cannot be Empty");
            }
            
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }


              dbConnector.dbConnectNow();
              //data assing on register class
           if(!(name.isEmpty() || phone.isEmpty() || address.isEmpty() || selectGender.isEmpty() || password.isEmpty())){
//               registerClass.assignValue(name, phone, address, selectGender,password);
//               registerClass.userdataSaver();

               try {
                   PreparedStatement pst;
                   pst = dbConnector.con.
                           prepareStatement("insert into Users(fullname,phoneno,address,gender,password)values(?,?,?,?,?)");
                   pst.setString(1, name);
                   pst.setString(2, phone);

                   pst.setString(3, address);
                   pst.setString(4, selectGender);
                   pst.setString(5, password);
                   pst.executeUpdate();

                   nameTFRegi.setText("");
                   phoneTFregi.setText("");
                   addressTFregi.setText("");
                   selectGender.equals("Select");
                   passwordTFregi.setText("");
                   nameTFRegi.requestFocus();
               }

                catch (SQLException throwables) {
                   throwables.printStackTrace();
               }
               JOptionPane.showMessageDialog(this, "Congress! Successfully Register User");


           }
       
    }//GEN-LAST:event_registerBtnActionPerformed

    private void femaleRBregiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRBregiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleRBregiActionPerformed

    private void maleRBregiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRBregiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleRBregiActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterFram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTFregi;
    private javax.swing.ButtonGroup buttonGroupRegi;
    private javax.swing.JButton exitbtnRegi;
    private javax.swing.JRadioButton femaleRBregi;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginbtnRegi;
    private javax.swing.JRadioButton maleRBregi;
    private javax.swing.JTextField nameTFRegi;
    private javax.swing.JTextField passwordTFregi;
    private javax.swing.JTextField phoneTFregi;
    private javax.swing.JButton registerBtn;
    private javax.swing.JPanel startPanel;
    // End of variables declaration//GEN-END:variables
}
