/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometastic;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
//import javax.swing.*;

/**
 *
 * @author lenovo
 */
public class ViewProperty extends javax.swing.JFrame {

    /**
     * Creates new form QuickHome_ModifyProperty
     */
    public ViewProperty() {
        initComponents();
        getData();
    }
    String username;
    int propid;

    public ViewProperty(String username, int propid) {
        initComponents();
        this.username = username;
        this.propid = propid;
        userName.setText(username);
        //getData();
    }
    
    public int getPropid(){
        return propid;
    }
    public void getData() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hometastic", "root", "1234");
            
            //"select  USER_ID, USER_PASS from user where USER_ID LIKE '%"+jTextFieldEmail.getText()+"%'";
            PreparedStatement statement = conn.prepareStatement("select * from property where property_id = "+getPropid());
            ResultSet rs = statement.executeQuery();
        
            while(rs.next()) {
                homestayName.setText(rs.getString("property_name"));
                description.setText(rs.getString("description"));
                location1.setText((rs.getString("city"))+", "+rs.getString("state"));
                //location2.setText(rs.getString("state"));
                propertyType.setText(rs.getString("property_type"));
                price.setText(rs.getString("price"));
                queen_bed.setText(rs.getString("queen_bed"));
                single_bed.setText(rs.getString("single_bed"));
                wifi.setText(rs.getString("wifi"));
                backyard.setText(rs.getString("backyard"));
                max_person1.setText(rs.getString("max_person"));
                aircond.setText(rs.getString("aircond"));
                parking2.setText(rs.getString("parking"));
                pool.setText(rs.getString("pool"));
            }
           
            PreparedStatement reviewStatement = conn.prepareStatement("select * from review where property_id = " +getPropid());
            ResultSet rs1 = reviewStatement.executeQuery();
            
            while(rs1.next()){
                //userName.setText(rs1.getString("user_id")); //user's name kat atas sekali
                userName1.setText(rs1.getString("user_id"));
                overallRating1.setText(rs1.getString("rating"));
                comment1.setText(rs1.getString("review_desc"));
            }
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        propertyType = new javax.swing.JLabel();
        homestayName = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        location1 = new javax.swing.JLabel();
        FullName = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        aircond = new javax.swing.JLabel();
        max_person = new javax.swing.JLabel();
        single_bed1 = new javax.swing.JLabel();
        wifi = new javax.swing.JLabel();
        single_bed = new javax.swing.JLabel();
        pool = new javax.swing.JLabel();
        backyard = new javax.swing.JLabel();
        max_person1 = new javax.swing.JLabel();
        queen_bed = new javax.swing.JLabel();
        queen_bed2 = new javax.swing.JLabel();
        parking1 = new javax.swing.JLabel();
        parking2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        ReserveButton = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        Photo2 = new javax.swing.JLabel();
        Photo3 = new javax.swing.JLabel();
        Photo1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        description = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        overallRating = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        userName2 = new javax.swing.JLabel();
        comment2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        userName1 = new javax.swing.JLabel();
        comment1 = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        overallRating1 = new javax.swing.JLabel();
        BackButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1280, 900));

        jPanel1.setBackground(new java.awt.Color(0, 96, 166));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 75, 146));

        jButton2.setBackground(new java.awt.Color(0, 75, 146));
        jButton2.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Home");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 96, 166));
        jButton3.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("My Bookings");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 96, 166));
        jButton4.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Account Settings");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 430, 230));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 66, 127));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        propertyType.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        propertyType.setForeground(new java.awt.Color(255, 255, 255));
        propertyType.setText("Bungalow");
        jPanel2.add(propertyType, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 170, 40));

        homestayName.setFont(new java.awt.Font("Montserrat SemiBold", 1, 36)); // NOI18N
        homestayName.setForeground(new java.awt.Color(255, 255, 255));
        homestayName.setText("Homestay Kelantan Darul Naim");
        jPanel2.add(homestayName, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 73, 650, 50));

        userName.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        userName.setForeground(new java.awt.Color(255, 255, 255));
        userName.setText("User's Name");
        jPanel2.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        location1.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        location1.setForeground(new java.awt.Color(255, 255, 255));
        location1.setText("Bachok");
        jPanel2.add(location1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 450, 40));

        FullName.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        FullName.setForeground(new java.awt.Color(255, 255, 255));
        FullName.setText("Log Out");
        FullName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FullNameMouseClicked(evt);
            }
        });
        jPanel2.add(FullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Montserrat Light", 1, 14)); // NOI18N
        jLabel19.setText("Parking");
        jPanel9.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, 20));

        jLabel20.setFont(new java.awt.Font("Montserrat Light", 1, 14)); // NOI18N
        jLabel20.setText("Backyard");
        jPanel9.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        jLabel21.setFont(new java.awt.Font("Montserrat Light", 1, 14)); // NOI18N
        jLabel21.setText("Swimming Pool");
        jPanel9.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel22.setFont(new java.awt.Font("Montserrat Light", 1, 14)); // NOI18N
        jLabel22.setText("Air Conditioner");
        jPanel9.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        jLabel23.setFont(new java.awt.Font("Montserrat Light", 1, 14)); // NOI18N
        jLabel23.setText("Queen Beds");
        jPanel9.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel25.setFont(new java.awt.Font("Montserrat Light", 1, 14)); // NOI18N
        jLabel25.setText("Wifi");
        jPanel9.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, -1));

        jLabel27.setFont(new java.awt.Font("Montserrat Light", 1, 14)); // NOI18N
        jLabel27.setText("Single Beds");
        jPanel9.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        jLabel24.setFont(new java.awt.Font("Montserrat Light", 1, 14)); // NOI18N
        jLabel24.setText("Max Person");
        jPanel9.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 212, -1, -1));

        aircond.setFont(new java.awt.Font("Montserrat Light", 0, 14)); // NOI18N
        aircond.setText("Yes");
        jPanel9.add(aircond, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        max_person.setFont(new java.awt.Font("Montserrat Light", 0, 14)); // NOI18N
        max_person.setText("Persons");
        jPanel9.add(max_person, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        single_bed1.setFont(new java.awt.Font("Montserrat Light", 0, 14)); // NOI18N
        single_bed1.setText("Single Bed(s)");
        jPanel9.add(single_bed1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 125, -1, 20));

        wifi.setFont(new java.awt.Font("Montserrat Light", 0, 14)); // NOI18N
        wifi.setText("Yes");
        jPanel9.add(wifi, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        single_bed.setFont(new java.awt.Font("Montserrat Light", 0, 14)); // NOI18N
        single_bed.setText("1");
        jPanel9.add(single_bed, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, 30));

        pool.setFont(new java.awt.Font("Montserrat Light", 0, 14)); // NOI18N
        pool.setText("Yes");
        jPanel9.add(pool, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        backyard.setFont(new java.awt.Font("Montserrat Light", 0, 14)); // NOI18N
        backyard.setText("Yes");
        jPanel9.add(backyard, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, -1, 30));

        max_person1.setFont(new java.awt.Font("Montserrat Light", 0, 14)); // NOI18N
        max_person1.setText("12");
        jPanel9.add(max_person1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        queen_bed.setFont(new java.awt.Font("Montserrat Light", 0, 14)); // NOI18N
        queen_bed.setText("5");
        jPanel9.add(queen_bed, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        queen_bed2.setFont(new java.awt.Font("Montserrat Light", 0, 14)); // NOI18N
        queen_bed2.setText("Queen Bed(s)");
        jPanel9.add(queen_bed2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        parking1.setFont(new java.awt.Font("Montserrat Light", 0, 14)); // NOI18N
        parking1.setText("Parking(s)");
        jPanel9.add(parking1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 70, -1));

        parking2.setFont(new java.awt.Font("Montserrat Light", 0, 14)); // NOI18N
        parking2.setText("2");
        jPanel9.add(parking2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));
        jPanel9.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        jPanel9.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));
        jPanel9.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));
        jPanel9.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));
        jPanel9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));
        jPanel9.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));
        jPanel9.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        jPanel6.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, 390, -1));

        BackButton.setBackground(new java.awt.Color(0, 66, 127));
        BackButton.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        BackButton.setForeground(new java.awt.Color(255, 255, 255));
        BackButton.setText("Make Review");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        jPanel6.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 650, 150, 40));

        ReserveButton.setBackground(new java.awt.Color(0, 66, 127));
        ReserveButton.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        ReserveButton.setForeground(new java.awt.Color(255, 255, 255));
        ReserveButton.setText("Reserve");
        ReserveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReserveButtonActionPerformed(evt);
            }
        });
        jPanel6.add(ReserveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 650, 140, 40));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Photo2.setBackground(new java.awt.Color(153, 153, 153));
        Photo2.setText("Photo2");
        Photo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.add(Photo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 335, 206));

        Photo3.setBackground(new java.awt.Color(153, 153, 153));
        Photo3.setText("Photo3");
        Photo3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.add(Photo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 335, 206));

        Photo1.setBackground(new java.awt.Color(153, 153, 153));
        Photo1.setText("Photo1");
        Photo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.add(Photo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 335, 206));

        jPanel6.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1170, 229));

        jLabel2.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel2.setText("Description");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        description.setFont(new java.awt.Font("Montserrat Light", 0, 16)); // NOI18N
        description.setText("Homestay Description");
        jPanel6.add(description, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, 30));

        jLabel11.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel11.setText("Personal Rating & Review");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, 30));

        overallRating.setFont(new java.awt.Font("Montserrat Light", 0, 16)); // NOI18N
        overallRating.setText("Star(s)");
        jPanel6.add(overallRating, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, 20));

        jLabel13.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        jLabel13.setText("Average Rating");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        userName2.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        userName2.setText("User2's Name");

        comment2.setFont(new java.awt.Font("Montserrat Light", 0, 16)); // NOI18N
        comment2.setText("User2's Comment");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userName2)
                    .addComponent(comment2))
                .addContainerGap(450, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userName2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comment2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, 610, 90));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        userName1.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        userName1.setText("User1's Name");

        comment1.setFont(new java.awt.Font("Montserrat Light", 0, 16)); // NOI18N
        comment1.setText("User1's Comment");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userName1)
                    .addComponent(comment1))
                .addContainerGap(450, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userName1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comment1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 610, 90));

        price.setFont(new java.awt.Font("Montserrat SemiBold", 0, 36)); // NOI18N
        price.setText("RM");
        jPanel6.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, -1, 60));

        jLabel12.setFont(new java.awt.Font("Montserrat SemiBold", 0, 36)); // NOI18N
        jLabel12.setText("RM");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, -1, 60));

        overallRating1.setFont(new java.awt.Font("Montserrat Light", 0, 16)); // NOI18N
        overallRating1.setText("5");
        jPanel6.add(overallRating1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, 20));

        BackButton1.setBackground(new java.awt.Color(0, 66, 127));
        BackButton1.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        BackButton1.setForeground(new java.awt.Color(255, 255, 255));
        BackButton1.setText("Back");
        BackButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(BackButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 650, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ReserveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReserveButtonActionPerformed
        // TODO add your handling code here:
        
        try{
            dispose();
//            new QuickHome_BookProperty(username, propid, homestayName.getText()).setVisible(true);
            //System.out.println("Update successful");
        }
        catch(Exception e){
            System.out.println("Update fail");
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_ReserveButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
        new MainPage(username).setVisible(true);//////
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        dispose();
//        new MakeReview(username, homestayName.getText()).setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void FullNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FullNameMouseClicked
        // TODO add your handling code here:
        dispose();
        new Welcome().setVisible(true);
       
    }//GEN-LAST:event_FullNameMouseClicked

    private void BackButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        new MainPage(username).setVisible(true);
    }//GEN-LAST:event_BackButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewProperty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProperty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProperty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProperty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new ViewProperty().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton BackButton1;
    private javax.swing.JLabel FullName;
    private javax.swing.JLabel Photo1;
    private javax.swing.JLabel Photo2;
    private javax.swing.JLabel Photo3;
    private javax.swing.JButton ReserveButton;
    private javax.swing.JLabel aircond;
    private javax.swing.JLabel backyard;
    private javax.swing.JLabel comment1;
    private javax.swing.JLabel comment2;
    private javax.swing.JLabel description;
    private javax.swing.JLabel homestayName;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel location1;
    private javax.swing.JLabel max_person;
    private javax.swing.JLabel max_person1;
    private javax.swing.JLabel overallRating;
    private javax.swing.JLabel overallRating1;
    private javax.swing.JLabel parking1;
    private javax.swing.JLabel parking2;
    private javax.swing.JLabel pool;
    private javax.swing.JLabel price;
    private javax.swing.JLabel propertyType;
    private javax.swing.JLabel queen_bed;
    private javax.swing.JLabel queen_bed2;
    private javax.swing.JLabel single_bed;
    private javax.swing.JLabel single_bed1;
    private javax.swing.JLabel userName;
    private javax.swing.JLabel userName1;
    private javax.swing.JLabel userName2;
    private javax.swing.JLabel wifi;
    // End of variables declaration//GEN-END:variables
}