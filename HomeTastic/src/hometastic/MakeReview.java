/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometastic;

/**
 *
 * @author user
 */

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class MakeReview extends javax.swing.JFrame {

    /**
     * Creates new form MakeReview
     */
    public MakeReview() {
        initComponents();
    }
    
    String username, homename;
    int propid;
    public MakeReview(String username, int propid, String homename){
        initComponents();
        this.username = username;
        jLabelusername.setText(username);
        homestayName.setText(homename);
        this.propid = propid;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        HomeMenu2 = new javax.swing.JPanel();
        Menu = new javax.swing.JLabel();
        HomeMenu1 = new javax.swing.JButton();
        HomeMenu3 = new javax.swing.JButton();
        HomeMenu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        PageTitle = new javax.swing.JLabel();
        jLabelusername = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        FullName = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        RateApps1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CommentArea = new javax.swing.JTextArea();
        SubmitButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        homestayName = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        one = new javax.swing.JRadioButton();
        two = new javax.swing.JRadioButton();
        three = new javax.swing.JRadioButton();
        four = new javax.swing.JRadioButton();
        five = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QuickHome");
        setAutoRequestFocus(false);
        setMinimumSize(new java.awt.Dimension(1100, 570));
        setPreferredSize(new java.awt.Dimension(1100, 570));
        setSize(new java.awt.Dimension(960, 540));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 96, 166));
        jPanel3.setMaximumSize(new java.awt.Dimension(300, 900));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomeMenu2.setBackground(new java.awt.Color(0, 66, 127));
        HomeMenu2.setMinimumSize(new java.awt.Dimension(233, 45));
        HomeMenu2.setPreferredSize(new java.awt.Dimension(240, 55));
        HomeMenu2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        Menu.setForeground(new java.awt.Color(255, 255, 255));
        HomeMenu2.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        HomeMenu1.setBackground(new java.awt.Color(0, 96, 166));
        HomeMenu1.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        HomeMenu1.setForeground(new java.awt.Color(255, 255, 255));
        HomeMenu1.setText("Home");
        HomeMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        HomeMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeMenu1ActionPerformed(evt);
            }
        });
        HomeMenu2.add(HomeMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 340, 60));

        HomeMenu3.setBackground(new java.awt.Color(0, 96, 166));
        HomeMenu3.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        HomeMenu3.setForeground(new java.awt.Color(255, 255, 255));
        HomeMenu3.setText("My Bookings");
        HomeMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeMenu3ActionPerformed(evt);
            }
        });
        HomeMenu2.add(HomeMenu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 340, 60));

        HomeMenu.setBackground(new java.awt.Color(0, 96, 166));
        HomeMenu.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        HomeMenu.setForeground(new java.awt.Color(255, 255, 255));
        HomeMenu.setText("Account Settings");
        HomeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeMenuActionPerformed(evt);
            }
        });
        HomeMenu2.add(HomeMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 340, 60));

        jPanel3.add(HomeMenu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 140, 350, 180));
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 230, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hometastic/Logo3a.png"))); // NOI18N
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 130, 120));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 550));

        jPanel4.setBackground(new java.awt.Color(0, 66, 127));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PageTitle.setFont(new java.awt.Font("Montserrat", 1, 28)); // NOI18N
        PageTitle.setForeground(new java.awt.Color(255, 255, 255));
        PageTitle.setText("Make Review");
        jPanel4.add(PageTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 60, 200, -1));

        jLabelusername.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabelusername.setForeground(new java.awt.Color(255, 255, 255));
        jLabelusername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hometastic/user2w.png"))); // NOI18N
        jLabelusername.setText("User's Username");
        jPanel4.add(jLabelusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        FullName.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        FullName.setForeground(new java.awt.Color(255, 255, 255));
        FullName.setText("Log Out");
        FullName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FullNameMouseClicked(evt);
            }
        });
        jPanel4.add(FullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 760, 140));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RateApps1.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        RateApps1.setText("Rate our homestay!");
        jPanel5.add(RateApps1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 66, 127));

        jLabel1.setBackground(new java.awt.Color(0, 66, 127));
        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Comments");
        jPanel1.add(jLabel1);

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 550, 30));

        CommentArea.setColumns(20);
        CommentArea.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        CommentArea.setRows(5);
        CommentArea.setText("Enter comment here\n\nUser must enter comment maximum 280 words\nAll actor can make report");
        CommentArea.setToolTipText("");
        jScrollPane2.setViewportView(CommentArea);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 550, 110));

        SubmitButton.setBackground(new java.awt.Color(0, 66, 127));
        SubmitButton.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        SubmitButton.setForeground(new java.awt.Color(255, 255, 255));
        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });
        jPanel5.add(SubmitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, 140, 40));
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, -1));
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, -1));
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        jLabel9.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hometastic/Asset 7.png"))); // NOI18N
        jLabel9.setText("Bachok, Kelantan");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        homestayName.setFont(new java.awt.Font("Montserrat", 1, 28)); // NOI18N
        homestayName.setText("Homestay Kelantan Darul Naim");
        jPanel5.add(homestayName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 460, -1));
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel12.setFont(new java.awt.Font("Montserrat", 0, 13)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hometastic/Asset 10.png"))); // NOI18N
        jLabel12.setText("Bungalow");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        buttonGroup1.add(one);
        one.setFont(new java.awt.Font("Montserrat Light", 0, 14)); // NOI18N
        one.setText("1 star");
        one.setActionCommand("1");
        jPanel5.add(one, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        buttonGroup1.add(two);
        two.setFont(new java.awt.Font("Montserrat Light", 0, 14)); // NOI18N
        two.setText("2 stars");
        two.setActionCommand("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });
        jPanel5.add(two, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        buttonGroup1.add(three);
        three.setFont(new java.awt.Font("Montserrat Light", 0, 14)); // NOI18N
        three.setText("3 stars");
        three.setActionCommand("3");
        jPanel5.add(three, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        buttonGroup1.add(four);
        four.setFont(new java.awt.Font("Montserrat Light", 0, 14)); // NOI18N
        four.setText("4 stars");
        four.setActionCommand("4");
        jPanel5.add(four, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, -1, -1));

        buttonGroup1.add(five);
        five.setFont(new java.awt.Font("Montserrat Light", 0, 14)); // NOI18N
        five.setText("5 stars");
        five.setActionCommand("5");
        jPanel5.add(five, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, -1, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 760, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HomeMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeMenuActionPerformed

    private void HomeMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeMenu1ActionPerformed
        // TODO add your handling code here:
        dispose();
        new MainPage(username).setVisible(true);
    }//GEN-LAST:event_HomeMenu1ActionPerformed

    private void HomeMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeMenu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeMenu3ActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        // TODO add your handling code here:
        one.setActionCommand("1");
        two.setActionCommand("2");
        three.setActionCommand("3");
        four.setActionCommand("4");
        five.setActionCommand("5");
        String selection = buttonGroup1.getSelection().getActionCommand();
        
        String comment = CommentArea.getText();
        
        Connection conn = null;
        PreparedStatement statement = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hometastic", "root", "1234");
            statement = conn.prepareStatement("insert into review values(null,?,?,?,?)");
            statement.setString(1, comment);
            statement.setString(2, username);
            statement.setInt(3, propid);
            statement.setString(4, selection);
            int i = statement.executeUpdate();
            if(i > 0) {
                JOptionPane.showMessageDialog(null, "Review is successfully sent!");
                dispose();
                new MainPage(username).setVisible(true);
            }
            else {
                JOptionPane.showMessageDialog(null, "Review is failed to send");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_twoActionPerformed

    private void FullNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FullNameMouseClicked
        // TODO add your handling code here:
        dispose();
        new Welcome().setVisible(true);
    }//GEN-LAST:event_FullNameMouseClicked

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
            java.util.logging.Logger.getLogger(MakeReview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MakeReview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MakeReview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MakeReview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MakeReview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CommentArea;
    private javax.swing.JLabel FullName;
    private javax.swing.JButton HomeMenu;
    private javax.swing.JButton HomeMenu1;
    private javax.swing.JPanel HomeMenu2;
    private javax.swing.JButton HomeMenu3;
    private javax.swing.JLabel Menu;
    private javax.swing.JLabel PageTitle;
    private javax.swing.JLabel RateApps1;
    private javax.swing.JButton SubmitButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton five;
    private javax.swing.JRadioButton four;
    private javax.swing.JLabel homestayName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelusername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton one;
    private javax.swing.JRadioButton three;
    private javax.swing.JRadioButton two;
    // End of variables declaration//GEN-END:variables
}
