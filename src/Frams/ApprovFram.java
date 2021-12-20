package Frams;


import classess.ApprovedClass;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;


public class ApprovFram extends javax.swing.JFrame {

    public ApprovFram() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aprovedPanel = new javax.swing.JPanel();
        resultbgPenel = new javax.swing.JPanel();
        titleLebel = new javax.swing.JLabel();
        resultScrollingpanel = new javax.swing.JScrollPane();
        resultT = new javax.swing.JTextArea();
        nameTitle = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        nidTitle = new javax.swing.JLabel();
        nidTF = new javax.swing.JTextField();
        sendBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        resultbgPenel.setBackground(new java.awt.Color(51, 51, 255));

        titleLebel.setBackground(new java.awt.Color(0, 0, 0));
        titleLebel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        titleLebel.setText("Covid Vaccine Information");

        resultT.setEditable(false);
        resultT.setColumns(20);
        resultT.setLineWrap(true);
        resultT.setRows(5);
        resultT.setText("                             Result Empty Now");
        resultT.setWrapStyleWord(true);
        resultScrollingpanel.setViewportView(resultT);

        javax.swing.GroupLayout resultbgPenelLayout = new javax.swing.GroupLayout(resultbgPenel);
        resultbgPenel.setLayout(resultbgPenelLayout);
        resultbgPenelLayout.setHorizontalGroup(
            resultbgPenelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultbgPenelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(resultbgPenelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLebel)
                    .addComponent(resultScrollingpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        resultbgPenelLayout.setVerticalGroup(
            resultbgPenelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultbgPenelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLebel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(resultScrollingpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        nameTitle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nameTitle.setText("Fullname");

        nidTitle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nidTitle.setText("NID No");

        sendBtn.setText("Send");
        sendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtnActionPerformed(evt);
            }
        });

        resetBtn.setText("Reset");

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout aprovedPanelLayout = new javax.swing.GroupLayout(aprovedPanel);
        aprovedPanel.setLayout(aprovedPanelLayout);
        aprovedPanelLayout.setHorizontalGroup(
            aprovedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aprovedPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(aprovedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameTitle)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nidTitle)
                    .addComponent(nidTF, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(aprovedPanelLayout.createSequentialGroup()
                        .addComponent(sendBtn)
                        .addGap(18, 18, 18)
                        .addComponent(resetBtn))
                    .addComponent(backBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(resultbgPenel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        aprovedPanelLayout.setVerticalGroup(
            aprovedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resultbgPenel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(aprovedPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(nameTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nidTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nidTF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(aprovedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sendBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aprovedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aprovedPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
     
         DashboardFram dashboardFram=new DashboardFram();
        dashboardFram.setVisible(true);
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    //send button
    private void sendBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_sendBtnActionPerformed
       
        String name="",nidNO="";
        ApprovedClass approvedClass=new ApprovedClass();
        
        
        //Exception Handling
        
        //for name
        try {
            name=nameTF.getText();
            if(name.isEmpty()){
                JOptionPane.showConfirmDialog(this, "Name Can't be empty");
            }
        } catch (HeadlessException e) {
             JOptionPane.showConfirmDialog(this, "Something wrong with Name");
        }
        
        //for NID
        try {
            nidNO=nidTF.getText();
            if(nidNO.isEmpty()){
                JOptionPane.showConfirmDialog(this, "NID No Can't be empty");
            }
        } catch (HeadlessException e) {
             JOptionPane.showConfirmDialog(this, "Something wrong with NID No");
        }
        
        //assing value
        approvedClass.setInformation(name, nidNO);
        
        //set result
        resultT.setText(approvedClass.showValue());
    }//GEN-LAST:event_sendBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ApprovFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApprovFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApprovFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApprovFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApprovFram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aprovedPanel;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField nameTF;
    private javax.swing.JLabel nameTitle;
    private javax.swing.JTextField nidTF;
    private javax.swing.JLabel nidTitle;
    private javax.swing.JButton resetBtn;
    private javax.swing.JScrollPane resultScrollingpanel;
    private javax.swing.JTextArea resultT;
    private javax.swing.JPanel resultbgPenel;
    private javax.swing.JButton sendBtn;
    private javax.swing.JLabel titleLebel;
    // End of variables declaration//GEN-END:variables
}
