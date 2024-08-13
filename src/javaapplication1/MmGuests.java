/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
import java.sql.SQLException;
import java.awt.event.*;


/**
 *
 * @author ignac
 */
public class MmGuests extends javax.swing.JFrame implements ActionListener {

    private void close() {
        this.dispose(); // Close the current JFrame
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Add your action handling code here
    }

    public MmGuests() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        Rooms = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Ratetxt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ConfirmToRes = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        Roomnum = new javax.swing.JComboBox<>();
        Cd1 = new javax.swing.JComboBox<>();
        Cd2 = new javax.swing.JComboBox<>();
        Cd3 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jTextArea8 = new javax.swing.JTextArea();
        Hours = new javax.swing.JTextField();
        Roomtype = new javax.swing.JTextField();
        Reservations = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        Confirmbtn = new javax.swing.JButton();
        GetRoomID = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        FinalTextField4 = new javax.swing.JTextField();
        FinalTextField6 = new javax.swing.JTextField();
        FinalTextField5 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        FinalTextField3 = new javax.swing.JTextField();
        FinalTextField1 = new javax.swing.JTextField();
        FinalTextField2 = new javax.swing.JTextField();
        Guests = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Fname = new javax.swing.JTextField();
        Lname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Addresstxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Phonetxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 579));
        setPreferredSize(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setPreferredSize(new java.awt.Dimension(200, 200));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Rooms.setBackground(new java.awt.Color(0,0,0,98));
        Rooms.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Checking In");
        Rooms.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Room Number");
        Rooms.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Room Type");
        Rooms.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, -1, -1));

        Ratetxt.setEditable(false);
        Rooms.add(Ratetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 70, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Hours");
        Rooms.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Check-in Date");
        Rooms.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, -1));

        ConfirmToRes.setText("Next");
        ConfirmToRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmToResActionPerformed(evt);
            }
        });
        Rooms.add(ConfirmToRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 98, 34));

        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        Rooms.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 98, 34));

        Roomnum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "101", "102", "103", "104", "105", "106", "107", "108", " " }));
        Roomnum.setSelectedItem(null);
        Roomnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomnumActionPerformed(evt);
            }
        });
        Rooms.add(Roomnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 200, 30));

        Cd1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " " }));
        Cd1.setSelectedItem(null);
        Cd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cd1ActionPerformed(evt);
            }
        });
        Rooms.add(Cd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 60, 30));

        Cd2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", " " }));
        Cd2.setSelectedItem(null);
        Cd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cd2ActionPerformed(evt);
            }
        });
        Rooms.add(Cd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 60, 30));

        Cd3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024" , "2025" }));
        Cd3.setSelectedItem(null);
        Cd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cd3ActionPerformed(evt);
            }
        });
        Rooms.add(Cd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 60, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Rate");
        Rooms.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, -1, -1));

        jTextArea8.setEditable(false);
        jTextArea8.setColumns(20);
        jTextArea8.setLineWrap(true);
        jTextArea8.setRows(5);
        jTextArea8.setText("[ Rooms 101 - 105 ]  Standard\n[ Rooms 106 -108 ]  Deluxe");
        Rooms.add(jTextArea8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 170, 40));
        Rooms.add(Hours, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 292, 90, 30));

        Roomtype.setEditable(false);
        Rooms.add(Roomtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 200, 30));

        jLayeredPane1.add(Rooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 560));
        Rooms.setVisible(false);

        Reservations.setBackground(new java.awt.Color(0,0,0,98));
        Reservations.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Finalizing Reservation");
        Reservations.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        Confirmbtn.setText("Confirm");
        Confirmbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmbtnActionPerformed(evt);
            }
        });
        Reservations.add(Confirmbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 98, 34));

        GetRoomID.setEditable(false);
        GetRoomID.setOpaque(false);
        Reservations.add(GetRoomID, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, 20, 10));

        jButton8.setText("Back");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        Reservations.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 98, 34));

        jPanel2.setBackground(new java.awt.Color(0,0,0,98));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Room Number and Type");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 180, -1));

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Amount to be paid");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 130, 180, -1));

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Check-in Date");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 180, 20));

        FinalTextField4.setEditable(false);
        FinalTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(FinalTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 180, 30));

        FinalTextField6.setEditable(false);
        FinalTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(FinalTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 180, 30));

        FinalTextField5.setEditable(false);
        FinalTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(FinalTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 180, 30));

        Reservations.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 340, 260));

        jPanel1.setBackground(new java.awt.Color(0,0,0,98));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Contact Number");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 180, -1));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Full Name");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 180, -1));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Address");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 180, 20));

        FinalTextField3.setEditable(false);
        FinalTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(FinalTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 180, 30));

        FinalTextField1.setEditable(false);
        FinalTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FinalTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(FinalTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 180, 30));

        FinalTextField2.setEditable(false);
        FinalTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(FinalTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 180, 30));

        Reservations.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 330, 260));

        jLayeredPane1.add(Reservations, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 560));
        Reservations.setVisible(false);

        Guests.setBackground(new java.awt.Color(0,0,0,98));
        Guests.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Guest's Information");
        Guests.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First Name");
        Guests.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));
        Guests.add(Fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 200, 30));
        Guests.add(Lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 200, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Last Name");
        Guests.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, -1, -1));
        Guests.add(Addresstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 200, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address");
        Guests.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));
        Guests.add(Phonetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 200, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Phone");
        Guests.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Guests.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 98, 34));

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Guests.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 98, 34));

        jLayeredPane1.add(Guests, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 560));

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 730, 560));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/297653636.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        close();
        Mmmenu Mmenu = new Mmmenu();
        Mmenu.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Guests.setVisible(true);
        Rooms.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void Cd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cd1ActionPerformed

    private void Cd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cd2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cd2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (Fname.getText().equals("") || Lname.getText().equals("") || Phonetxt.getText().equals("") || Addresstxt.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please complete the information!", "Warning", JOptionPane.ERROR_MESSAGE);
        } else {
            Guests.setVisible(false);
            Rooms.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Cd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cd3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cd3ActionPerformed

    private void ConfirmToResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmToResActionPerformed

        if (Roomnum.getSelectedItem() == null || Roomtype.getText() == null || Cd1.getSelectedItem() == null || Cd2.getSelectedItem() == null || Cd3.getSelectedItem() == null || Hours.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please complete the information!", "Warning", JOptionPane.ERROR_MESSAGE);
        } else {
            // Perform your actions here since all necessary information is selected/entered
            Reservations.setVisible(true);
            Rooms.setVisible(false);
        }

        //Printing in Finalization of Reservation
        String FirstName = Fname.getText();
        String LastName = Lname.getText();
        String Phone = Phonetxt.getText();
        String Address = Addresstxt.getText();

        // Set the text of the text area
        FinalTextField1.setText(FirstName + " " + LastName);
        FinalTextField2.setText(Phone);
        FinalTextField3.setText(Address);

        
        //ROOMS
        
         String Date1 = (String) Cd1.getSelectedItem();  //CheckIn Date
         String Date2 = (String) Cd2.getSelectedItem();
         String Date3 = (String) Cd3.getSelectedItem();
         FinalTextField5.setText(Date3 + "-" + Date1 + "-" + Date2);
         
         String RT = (String) Roomtype.getText();  //Room type and number
         String RN = (String) Roomnum.getSelectedItem();
         FinalTextField4.setText(RN + " - "+ RT);
         
         //Setting RoomID
         String selectedRoom = (String) Roomnum.getSelectedItem(); // Cast the selected item to a String
         int roomnum = Integer.parseInt(selectedRoom); // Convert the String to an int
         switch(roomnum){
         case 101: GetRoomID.setText("1"); break;
         case 102: GetRoomID.setText("2"); break;
         case 103: GetRoomID.setText("3"); break;
         case 104: GetRoomID.setText("4"); break;
         case 105: GetRoomID.setText("5"); break;
         case 106: GetRoomID.setText("6"); break;
         case 107: GetRoomID.setText("7"); break;
         case 108: GetRoomID.setText("8"); break;
}
         
         
         //Amount to be paid  and Rate
         String H = Hours.getText();
         int ConvertH = Integer.parseInt(H);
 
         int TotalAmount;
         if (RT.equals("Standard")) {
         TotalAmount = 250 * ConvertH;
         String TA = Integer.toString(TotalAmount);
         FinalTextField6.setText(TA); // Corrected line to set the text
       
         } else if (RT.equals("Deluxe")) {
          TotalAmount = 450 * ConvertH;
          String TA = Integer.toString(TotalAmount);
          FinalTextField6.setText(TA); // Corrected line to set the text

        
}

 
    }//GEN-LAST:event_ConfirmToResActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Guests.setVisible(false);
        Reservations.setVisible(false);
        Rooms.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    public static Connection tools() throws SQLException, ClassNotFoundException { //SHORTCUT
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/moteldb", "root", "julius022104");
        return con;
    }


    private void ConfirmbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmbtnActionPerformed

        String FirstName = Fname.getText();
        String LastName = Lname.getText();
        String Phone = Phonetxt.getText();
        String Address = Addresstxt.getText();
        
        String selectedRoom = (String) Roomnum.getSelectedItem(); 
        
        String CheckInDate = FinalTextField5.getText();
        
        int TotalAmount = Integer.parseInt(FinalTextField6.getText());
        
        int RoomID = Integer.parseInt(GetRoomID.getText());

        try {   //INSERTING DATA - Guest table

            Connection con = tools();
            Statement s = con.createStatement();
            
            String sql1 = "INSERT INTO guests (FirstName, LastName, Phone, Address, RoomNumber) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt1 = con.prepareStatement(sql1, Statement.RETURN_GENERATED_KEYS);
            pstmt1.setString(1, FirstName); // Set first name
            pstmt1.setString(2, LastName);  // Set last name
            pstmt1.setString(3, Phone);     // Set phone 
            pstmt1.setString(4, Address);   // Set address
            pstmt1.setString(5, selectedRoom);
            pstmt1.executeUpdate();
            //Get GuestID
            ResultSet generatedKeys = pstmt1.getGeneratedKeys();
            int GuestID = -1; // Initialize with an invalid value
            if (generatedKeys.next()) {
            GuestID = generatedKeys.getInt(1); 
            } else {
            }
            
            
            String sql2 = "UPDATE rooms SET Availability = 0 WHERE RoomID = ?";
            PreparedStatement pstmt2 = con.prepareStatement(sql2);  
            pstmt2.setInt(1, RoomID);    
            pstmt2.executeUpdate();
            
            String sql3 = "INSERT INTO reservations (GuestID, RoomID, CheckInDate, TotalAmount) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt3 = con.prepareStatement(sql3);
            pstmt3.setInt(1, GuestID); // Use the retrieved GuestID
            pstmt3.setInt(2, RoomID);
            pstmt3.setString(3, CheckInDate);
            pstmt3.setInt(4, TotalAmount);
            pstmt3.executeUpdate();

            JOptionPane.showMessageDialog(this, "Information Saved");
            con.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(); // Print the stack trace to diagnose any issues
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        
        
        
        
        //    Inserting Data - Rooms table
        //Printing in Finalization of Reservation
        String Fullname = FirstName + " " + LastName;
        // Set the text of the text area
        FinalTextField1.setText(Fullname);
           
        
        
        close();
        Mmmenu Mmenu = new Mmmenu();
        Mmenu.setVisible(true);
    }//GEN-LAST:event_ConfirmbtnActionPerformed

    
    
    
    
    
    
   
    
    private void RoomnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomnumActionPerformed
       String selectedRoom = (String) Roomnum.getSelectedItem();
         if(selectedRoom != null){
             int x = Integer.parseInt(selectedRoom);
         
            if(x >= 101 && x <= 105){ 
                Roomtype.setText("Standard");
                Ratetxt.setText("250");
            } else {
                Roomtype.setText("Deluxe");
                Ratetxt.setText("450");
            }
         }
         else{      
             Roomtype.setText("No room selected");
         }
    }//GEN-LAST:event_RoomnumActionPerformed

    private void FinalTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FinalTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(MmGuests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MmGuests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MmGuests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MmGuests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MmGuests().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Addresstxt;
    private javax.swing.JComboBox<String> Cd1;
    private javax.swing.JComboBox<String> Cd2;
    private javax.swing.JComboBox<String> Cd3;
    private javax.swing.JButton ConfirmToRes;
    private javax.swing.JButton Confirmbtn;
    private javax.swing.JTextField FinalTextField1;
    private javax.swing.JTextField FinalTextField2;
    private javax.swing.JTextField FinalTextField3;
    private javax.swing.JTextField FinalTextField4;
    private javax.swing.JTextField FinalTextField5;
    private javax.swing.JTextField FinalTextField6;
    private javax.swing.JTextField Fname;
    private javax.swing.JTextField GetRoomID;
    private javax.swing.JPanel Guests;
    private javax.swing.JTextField Hours;
    private javax.swing.JTextField Lname;
    private javax.swing.JTextField Phonetxt;
    private javax.swing.JTextField Ratetxt;
    private javax.swing.JPanel Reservations;
    public static javax.swing.JComboBox<String> Roomnum;
    private javax.swing.JPanel Rooms;
    private javax.swing.JTextField Roomtype;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextArea jTextArea8;
    // End of variables declaration//GEN-END:variables
}
