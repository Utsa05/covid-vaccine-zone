package Frams;


import classess.ApplayClass;
import classess.DBConnector;

import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ApplyFram extends javax.swing.JFrame {
    DBConnector dbConnector=new DBConnector();
    public ApplyFram() {
        initComponents();
        dbConnector.dbConnectNow();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameTFapply = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nidTFapply = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        unionTFapply = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        addressTFapply = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        discesTFapply = new javax.swing.JTextField();
        yearCBapply = new javax.swing.JComboBox<>();
        monthCBapply = new javax.swing.JComboBox<>();
        dayCBapply = new javax.swing.JComboBox<>();
        maleRBapply = new javax.swing.JRadioButton();
        femaleRBapply = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        submitBtnapply = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 255));

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));

        jLabel1.setBackground(new java.awt.Color(0, 204, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 255));
        jLabel1.setText("Fullname");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 204));
        jLabel2.setText("NID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 204));
        jLabel3.setText("Union");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 204));
        jLabel4.setText("Address");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 204));
        jLabel5.setText("Any Diseases");

        yearCBapply.setBackground(new java.awt.Color(255, 102, 51));
        yearCBapply.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0000", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010" }));

        monthCBapply.setBackground(new java.awt.Color(255, 102, 51));
        monthCBapply.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "0 2", "03", "04", "05", "06", "07", "08", "09", "10" }));

        dayCBapply.setBackground(new java.awt.Color(255, 102, 51));
        dayCBapply.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "0 2", "03", "04", "05", "06", "07", "08", "09", "10" }));

        buttonGroup1.add(maleRBapply);
        maleRBapply.setText("Male");

        buttonGroup1.add(femaleRBapply);
        femaleRBapply.setText("Female");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 204));
        jLabel6.setText("DOB");

        submitBtnapply.setBackground(new java.awt.Color(0, 51, 255));
        submitBtnapply.setForeground(new java.awt.Color(255, 255, 255));
        submitBtnapply.setText("Submit");
        submitBtnapply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnapplyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(discesTFapply, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(nameTFapply, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressTFapply, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(unionTFapply, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(nidTFapply, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(dayCBapply, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(monthCBapply, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(yearCBapply, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(maleRBapply, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(femaleRBapply, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(submitBtnapply))
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dayCBapply, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(monthCBapply, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearCBapply, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameTFapply, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nidTFapply, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(unionTFapply, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addressTFapply, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(discesTFapply, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submitBtnapply, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(maleRBapply)
                        .addGap(18, 18, 18)
                        .addComponent(femaleRBapply)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jButton2.setBackground(new java.awt.Color(0, 153, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(102, 255, 102));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 255));
        jLabel7.setText("Covide Vaccine Zone");

        jLabel8.setBackground(new java.awt.Color(102, 255, 102));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 255));
        jLabel8.setText("Apply Vaccine");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 51));
        jLabel9.setText("Please Enter All required Information");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(286, 286, 286)
                    .addComponent(jLabel7)
                    .addContainerGap(287, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(39, 39, 39))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(202, 202, 202)
                    .addComponent(jLabel7)
                    .addContainerGap(202, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DashboardFram dashboardFram=new DashboardFram();
        dashboardFram.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    //sumbit
    private void submitBtnapplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnapplyActionPerformed
       
        String name="",nid="",union="",address="",discess="",day="",month="",year="",gender="";
         String complateDob="";
        boolean isEempty=true;

        //name
        try {
            name=nameTFapply.getText();

            if (name.isEmpty()) {
                JOptionPane.showConfirmDialog(this,"Name Cannot be Empty" );
                isEempty=false;
            }
        } catch (HeadlessException e) {
            JOptionPane.showConfirmDialog(this,"Some Problem with Name" );
        }

        //nid
        try {
            nid=nidTFapply.getText();
            if (nid.isEmpty()) {
                JOptionPane.showConfirmDialog(this,"NID Cannot be Empty" );
                isEempty=false;
            }
        } catch (HeadlessException e) {
            JOptionPane.showConfirmDialog(this,"Some Problem with NID" );
        }

        //Union
        try {
            union=unionTFapply.getText();
            if (union.isEmpty()) {
                JOptionPane.showConfirmDialog(this,"Union Cannot be Empty" );
                isEempty=false;
            }
        } catch (HeadlessException e) {
            JOptionPane.showConfirmDialog(this,"Some Problem with Nion" );
        }

        //address
        try {
            address=addressTFapply.getText();
            if (address.isEmpty()) {
                JOptionPane.showConfirmDialog(this,"Address Cannot be Empty" );
                isEempty=false;
            }
        } catch (HeadlessException e) {
            JOptionPane.showConfirmDialog(this,"Some Problem with Address" );
        }

        //diseases
        try {
            discess=discesTFapply.getText();
            if (discess.isEmpty()) {
                JOptionPane.showConfirmDialog(this,"Diseees Cannot be Empty" );
                isEempty=false;
            }

        } catch (HeadlessException e) {
            JOptionPane.showConfirmDialog(this,"Some Problem with Name" );
        }

        //gender

        if(maleRBapply.isSelected()){
            gender="Male";
            isEempty=false;
        }else if(femaleRBapply.isSelected()){
            gender="Female";
            isEempty=false;
        }else{
            JOptionPane.showConfirmDialog(this,"Selct Your Gender" );
        }

       
        
        //day-month-year
       

        day=dayCBapply.getItemAt(dayCBapply.getSelectedIndex());
        month=monthCBapply.getItemAt(monthCBapply.getSelectedIndex());
        year=yearCBapply.getItemAt(yearCBapply.getSelectedIndex());
        
        if (day.equals("00") || month.equals("00") || year.equals("0000")) {
            isEempty=true;
            JOptionPane.showConfirmDialog(this,"Select Your DOB" );

        }
        
        complateDob=day+"-"+month+"-"+year;
        
        
        if(isEempty==false){
//            ApplayClass applayClass=new ApplayClass();
//            //assign value
//            applayClass.valueAssign(name, nid, address, union, discess, complateDob, gender);
//            //call saveer
//            applayClass.saveapplyinformation();
            //display dialog
            try {
                PreparedStatement pst;
                pst = dbConnector.con.
                        prepareStatement
                                ("insert into Vaccinelist(fullname,gender,nid,diseases)values(?,?,?,?)");
                pst.setString(1, name);
                pst.setString(2, gender);
                pst.setString(3, nid);

                pst.setString(4, discess);

                pst.executeUpdate();

                nameTFapply.setText("");
                nidTFapply.setText("");
                unionTFapply.setText("");
                addressTFapply.equals("");
                discesTFapply.setText("");

            }

            catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            JOptionPane.showConfirmDialog(this,"Congress Vaccine Applied Successfully" );


        }
        
        

      

    }//GEN-LAST:event_submitBtnapplyActionPerformed


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
            java.util.logging.Logger.getLogger(ApplyFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApplyFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApplyFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApplyFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApplyFram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTFapply;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> dayCBapply;
    private javax.swing.JTextField discesTFapply;
    private javax.swing.JRadioButton femaleRBapply;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton maleRBapply;
    private javax.swing.JComboBox<String> monthCBapply;
    private javax.swing.JTextField nameTFapply;
    private javax.swing.JTextField nidTFapply;
    private javax.swing.JButton submitBtnapply;
    private javax.swing.JTextField unionTFapply;
    private javax.swing.JComboBox<String> yearCBapply;
    // End of variables declaration//GEN-END:variables
}
