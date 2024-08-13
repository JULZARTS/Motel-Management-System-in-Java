/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
import java.sql.SQLException;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author ignac
 */
public class MmReservations extends javax.swing.JFrame implements ActionListener {

    private void close() {
        this.dispose(); // Close the current JFrame
    }
    


    @Override
    public void actionPerformed(ActionEvent e) {
        // Add your action handling code here
    }

    public MmReservations() {
        initComponents();
         ShowHistory();
        displayRecords();
        EditRes();
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        choice1 = new java.awt.Choice();
        jMenu1 = new javax.swing.JMenu();
        Update = new javax.swing.JMenuItem();
        Remove = new javax.swing.JMenuItem();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Cd1 = new javax.swing.JComboBox<>();
        Cd2 = new javax.swing.JComboBox<>();
        Cd3 = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Records = new javax.swing.JPanel();
        Back = new javax.swing.JButton();
        EditRes = new javax.swing.JPanel();
        month = new javax.swing.JComboBox<>();
        day = new javax.swing.JComboBox<>();
        year = new javax.swing.JComboBox<>();
        CancelCod = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        pstatus = new javax.swing.JTextField();
        ConfirmCod = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        reservs = new javax.swing.JPanel();
        Editbtn1 = new javax.swing.JButton();
        Editbtn2 = new javax.swing.JButton();
        Editbtn3 = new javax.swing.JButton();
        Editbtn4 = new javax.swing.JButton();
        Editbtn5 = new javax.swing.JButton();
        Editbtn6 = new javax.swing.JButton();
        Editbtn7 = new javax.swing.JButton();
        Editbtn8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Room108 = new javax.swing.JTextArea();
        Room107 = new javax.swing.JTextArea();
        Room106 = new javax.swing.JTextArea();
        Room105 = new javax.swing.JTextArea();
        Room104 = new javax.swing.JTextArea();
        Room103 = new javax.swing.JTextArea();
        Room102 = new javax.swing.JTextArea();
        Room101 = new javax.swing.JTextArea();
        History2 = new javax.swing.JPanel();
        Back2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        Cod = new javax.swing.JTextArea();
        Fname = new javax.swing.JTextArea();
        Lname = new javax.swing.JTextArea();
        Ctact = new javax.swing.JTextArea();
        Adr = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        Update.setText("jMenuItem1");
        jMenu1.add(Update);

        Remove.setText("jMenuItem1");
        jMenu1.add(Remove);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setText("Contact");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel13.setText("Check-Out Date");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jLabel14.setText("Payment Status");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, -1, -1));

        jLabel15.setText("Address");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        jLabel11.setText("Last Name");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        jLabel16.setText("First Name");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jButton2.setText("jButton2");
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, -1, -1));

        Cd1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " " }));
        Cd1.setSelectedItem(null);
        Cd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cd1ActionPerformed(evt);
            }
        });
        jPanel3.add(Cd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 60, 30));

        Cd2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", " " }));
        Cd2.setSelectedItem(null);
        Cd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cd2ActionPerformed(evt);
            }
        });
        jPanel3.add(Cd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 60, 30));

        Cd3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024" }));
        Cd3.setSelectedItem(null);
        Cd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cd3ActionPerformed(evt);
            }
        });
        jPanel3.add(Cd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 60, 30));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("First Name");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 579));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        Records.setBackground(new java.awt.Color(0,0,0,98));
        Records.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        Records.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, 98, 30));

        EditRes.setBackground(new java.awt.Color(255, 255, 255));
        EditRes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        month.setSelectedItem("-");
        month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthActionPerformed(evt);
            }
        });
        EditRes.add(month, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 50, -1));

        day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", " " }));
        day.setSelectedItem("-");
        EditRes.add(day, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 50, -1));

        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "2024" }));
        year.setSelectedItem("-");
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });
        EditRes.add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        CancelCod.setText("Cancel");
        CancelCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelCodActionPerformed(evt);
            }
        });
        EditRes.add(CancelCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Payment Status");
        EditRes.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 130, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Check-out Date");
        EditRes.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 130, -1));

        pstatus.setEditable(false);
        pstatus.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pstatus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pstatus.setCaretColor(new java.awt.Color(51, 255, 51));
        pstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pstatusActionPerformed(evt);
            }
        });
        EditRes.add(pstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 172, 190, 30));

        ConfirmCod.setText("Confirm");
        ConfirmCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmCodActionPerformed(evt);
            }
        });
        EditRes.add(ConfirmCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 260, 90, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel19.setText("Year");
        EditRes.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel20.setText("Month");
        EditRes.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel21.setText("Day");
        EditRes.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        Records.add(EditRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 110, 360, 340));
        EditRes.getAccessibleContext().setAccessibleName("");
        EditRes.setVisible(false);

        reservs.setOpaque(false);
        reservs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Editbtn1.setBackground(new java.awt.Color(0, 0, 0));
        Editbtn1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Editbtn1.setForeground(new java.awt.Color(255, 255, 255));
        Editbtn1.setText("•••");
        Editbtn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Editbtn1.setMaximumSize(new java.awt.Dimension(75, 20));
        Editbtn1.setMinimumSize(new java.awt.Dimension(75, 20));
        Editbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Editbtn1ActionPerformed(evt);
            }
        });
        reservs.add(Editbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 45, 20));

        Editbtn2.setBackground(new java.awt.Color(0, 0, 0));
        Editbtn2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Editbtn2.setForeground(new java.awt.Color(255, 255, 255));
        Editbtn2.setText("•••");
        Editbtn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Editbtn2.setMaximumSize(new java.awt.Dimension(75, 20));
        Editbtn2.setMinimumSize(new java.awt.Dimension(75, 20));
        Editbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Editbtn2ActionPerformed(evt);
            }
        });
        reservs.add(Editbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, 45, 20));

        Editbtn3.setBackground(new java.awt.Color(0, 0, 0));
        Editbtn3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Editbtn3.setForeground(new java.awt.Color(255, 255, 255));
        Editbtn3.setText("•••");
        Editbtn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Editbtn3.setMaximumSize(new java.awt.Dimension(75, 20));
        Editbtn3.setMinimumSize(new java.awt.Dimension(75, 20));
        Editbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Editbtn3ActionPerformed(evt);
            }
        });
        reservs.add(Editbtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 45, 20));

        Editbtn4.setBackground(new java.awt.Color(0, 0, 0));
        Editbtn4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Editbtn4.setForeground(new java.awt.Color(255, 255, 255));
        Editbtn4.setText("•••");
        Editbtn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Editbtn4.setMaximumSize(new java.awt.Dimension(75, 20));
        Editbtn4.setMinimumSize(new java.awt.Dimension(75, 20));
        Editbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Editbtn4ActionPerformed(evt);
            }
        });
        reservs.add(Editbtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, 45, 20));

        Editbtn5.setBackground(new java.awt.Color(0, 0, 0));
        Editbtn5.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Editbtn5.setForeground(new java.awt.Color(255, 255, 255));
        Editbtn5.setText("•••");
        Editbtn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Editbtn5.setMaximumSize(new java.awt.Dimension(75, 20));
        Editbtn5.setMinimumSize(new java.awt.Dimension(75, 20));
        Editbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Editbtn5ActionPerformed(evt);
            }
        });
        reservs.add(Editbtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 45, 20));

        Editbtn6.setBackground(new java.awt.Color(0, 0, 0));
        Editbtn6.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Editbtn6.setForeground(new java.awt.Color(255, 255, 255));
        Editbtn6.setText("•••");
        Editbtn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Editbtn6.setMaximumSize(new java.awt.Dimension(75, 20));
        Editbtn6.setMinimumSize(new java.awt.Dimension(75, 20));
        Editbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Editbtn6ActionPerformed(evt);
            }
        });
        reservs.add(Editbtn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, 45, 20));

        Editbtn7.setBackground(new java.awt.Color(0, 0, 0));
        Editbtn7.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Editbtn7.setForeground(new java.awt.Color(255, 255, 255));
        Editbtn7.setText("•••");
        Editbtn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Editbtn7.setMaximumSize(new java.awt.Dimension(75, 20));
        Editbtn7.setMinimumSize(new java.awt.Dimension(75, 20));
        Editbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Editbtn7ActionPerformed(evt);
            }
        });
        reservs.add(Editbtn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 45, 20));

        Editbtn8.setBackground(new java.awt.Color(0, 0, 0));
        Editbtn8.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Editbtn8.setForeground(new java.awt.Color(255, 255, 255));
        Editbtn8.setText("•••");
        Editbtn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Editbtn8.setMaximumSize(new java.awt.Dimension(75, 20));
        Editbtn8.setMinimumSize(new java.awt.Dimension(75, 20));
        Editbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Editbtn8ActionPerformed(evt);
            }
        });
        reservs.add(Editbtn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, 45, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RESERVATIONS");
        reservs.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 730, 40));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_fluent_door_tag_24_filled (2).png"))); // NOI18N
        jLabel6.setText("Room #101");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 10, 340, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_fluent_door_tag_24_filled (2).png"))); // NOI18N
        jLabel2.setText("Room #102");
        jLabel2.setMaximumSize(new java.awt.Dimension(16, 16));
        jLabel2.setMinimumSize(new java.awt.Dimension(16, 16));
        jLabel2.setPreferredSize(new java.awt.Dimension(16, 16));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(350, 10, 340, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_fluent_door_tag_24_filled (2).png"))); // NOI18N
        jLabel4.setText("Room #103");
        jLabel4.setMaximumSize(new java.awt.Dimension(25, 16));
        jLabel4.setMinimumSize(new java.awt.Dimension(25, 16));
        jLabel4.setPreferredSize(new java.awt.Dimension(25, 16));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 130, 340, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_fluent_door_tag_24_filled (2).png"))); // NOI18N
        jLabel5.setText("Room #104");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(350, 130, 340, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_fluent_door_tag_24_filled (2).png"))); // NOI18N
        jLabel7.setText("Room #105");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 250, 340, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_fluent_door_tag_24_filled (2).png"))); // NOI18N
        jLabel8.setText("Room #106");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(350, 250, 340, 30);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_fluent_door_tag_24_filled (2).png"))); // NOI18N
        jLabel9.setText("Room #107");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 362, 340, 30);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_fluent_door_tag_24_filled (2).png"))); // NOI18N
        jLabel10.setText("Room #108");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(350, 362, 340, 30);

        Room108.setEditable(false);
        Room108.setBackground(new java.awt.Color(0, 0, 0));
        Room108.setColumns(20);
        Room108.setForeground(new java.awt.Color(255, 255, 255));
        Room108.setLineWrap(true);
        Room108.setRows(5);
        Room108.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        Room108.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(Room108);
        Room108.setBounds(350, 390, 340, 85);

        Room107.setEditable(false);
        Room107.setBackground(new java.awt.Color(0, 0, 0));
        Room107.setColumns(20);
        Room107.setForeground(new java.awt.Color(255, 255, 255));
        Room107.setLineWrap(true);
        Room107.setRows(5);
        Room107.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        Room107.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(Room107);
        Room107.setBounds(0, 390, 340, 85);

        Room106.setEditable(false);
        Room106.setBackground(new java.awt.Color(0, 0, 0));
        Room106.setColumns(20);
        Room106.setForeground(new java.awt.Color(255, 255, 255));
        Room106.setLineWrap(true);
        Room106.setRows(5);
        Room106.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        Room106.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(Room106);
        Room106.setBounds(350, 276, 340, 85);

        Room105.setEditable(false);
        Room105.setBackground(new java.awt.Color(0, 0, 0));
        Room105.setColumns(20);
        Room105.setForeground(new java.awt.Color(255, 255, 255));
        Room105.setLineWrap(true);
        Room105.setRows(5);
        Room105.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        Room105.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(Room105);
        Room105.setBounds(0, 276, 340, 85);

        Room104.setEditable(false);
        Room104.setBackground(new java.awt.Color(0, 0, 0));
        Room104.setColumns(20);
        Room104.setForeground(new java.awt.Color(255, 255, 255));
        Room104.setLineWrap(true);
        Room104.setRows(5);
        Room104.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        Room104.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(Room104);
        Room104.setBounds(350, 158, 340, 85);

        Room103.setEditable(false);
        Room103.setBackground(new java.awt.Color(0, 0, 0));
        Room103.setColumns(20);
        Room103.setForeground(new java.awt.Color(255, 255, 255));
        Room103.setLineWrap(true);
        Room103.setRows(5);
        Room103.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        Room103.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(Room103);
        Room103.setBounds(0, 158, 340, 85);

        Room102.setEditable(false);
        Room102.setBackground(new java.awt.Color(0, 0, 0));
        Room102.setColumns(20);
        Room102.setForeground(new java.awt.Color(255, 255, 255));
        Room102.setLineWrap(true);
        Room102.setRows(5);
        Room102.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        Room102.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(Room102);
        Room102.setBounds(350, 40, 340, 85);

        Room101.setEditable(false);
        Room101.setBackground(new java.awt.Color(0, 0, 0));
        Room101.setColumns(20);
        Room101.setForeground(new java.awt.Color(255, 255, 255));
        Room101.setLineWrap(true);
        Room101.setRows(5);
        Room101.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        Room101.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(Room101);
        Room101.setBounds(0, 40, 340, 85);

        reservs.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 690, 480));

        Records.add(reservs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 560));

        jTabbedPane1.addTab("Reservations", Records);

        History2.setBackground(new java.awt.Color(0,0,0,98));
        History2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Back2.setText("Back");
        Back2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back2ActionPerformed(evt);
            }
        });
        History2.add(Back2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, 98, 30));

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cod.setEditable(false);
        Cod.setBackground(new java.awt.Color(0, 0, 0));
        Cod.setColumns(20);
        Cod.setForeground(new java.awt.Color(255, 255, 255));
        Cod.setLineWrap(true);
        Cod.setRows(5);
        Cod.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        Cod.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel4.add(Cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 140, 420));

        Fname.setEditable(false);
        Fname.setBackground(new java.awt.Color(0, 0, 0));
        Fname.setColumns(20);
        Fname.setForeground(new java.awt.Color(255, 255, 255));
        Fname.setLineWrap(true);
        Fname.setRows(5);
        Fname.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        Fname.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel4.add(Fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 140, 420));

        Lname.setEditable(false);
        Lname.setBackground(new java.awt.Color(0, 0, 0));
        Lname.setColumns(20);
        Lname.setForeground(new java.awt.Color(255, 255, 255));
        Lname.setLineWrap(true);
        Lname.setRows(5);
        Lname.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        Lname.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel4.add(Lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 140, 420));

        Ctact.setEditable(false);
        Ctact.setBackground(new java.awt.Color(0, 0, 0));
        Ctact.setColumns(20);
        Ctact.setForeground(new java.awt.Color(255, 255, 255));
        Ctact.setLineWrap(true);
        Ctact.setRows(5);
        Ctact.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        Ctact.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel4.add(Ctact, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 140, 420));

        Adr.setEditable(false);
        Adr.setBackground(new java.awt.Color(0, 0, 0));
        Adr.setColumns(20);
        Adr.setForeground(new java.awt.Color(255, 255, 255));
        Adr.setLineWrap(true);
        Adr.setRows(5);
        Adr.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        Adr.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel4.add(Adr, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 140, 420));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Check-out Date");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 140, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("First Name");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 140, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Last Name");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 140, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Contact");
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 140, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Address");
        jPanel4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 140, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("History");
        jPanel4.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 730, 20));

        History2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 560));

        jTabbedPane1.addTab("History", History2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 740, 580));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/297653636.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Connection tools() throws SQLException, ClassNotFoundException { //SHORTCUT
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/moteldb", "root", "julius022104");
        return con;
    }
    
    

    private void displayRecords() {
        try {
            Connection con = tools();
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("SELECT reservations.*, guests.FirstName, guests.LastName, guests.Phone FROM reservations INNER JOIN guests ON reservations.GuestID = guests.GuestID;"); // Corrected SQL query string

            while (rs.next()) {
                int roomID = rs.getInt("RoomID");
                String rowData = "     Name: " + rs.getString("FirstName") + " " + rs.getString("LastName") + "\n"
                        + "     Contact: " + rs.getString("Phone") + "\n"
                        + "     GuestID: " + rs.getInt("GuestID") + "\t     " + "Check-In Date: " + rs.getString("CheckInDate") + "\n"
                        + "     Total: ₱" + rs.getInt("TotalAmount") + "      " + "Payment Status: " + rs.getString("PaymentStatus") + "\n";

                // Display records in respective JTextAreas based on roomID
                switch (roomID) {
                    case 1: Room101.append(rowData); break;
                    case 2: Room102.append(rowData); break;
                    case 3: Room103.append(rowData) ;break;
                    case 4: Room104.append(rowData); break;
                    case 5: Room105.append(rowData); break;
                    case 6: Room106.append(rowData); break;
                    case 7: Room107.append(rowData); break;
                    case 8: Room108.append(rowData); break;
                }
            }

            // Close resources
            rs.close();
            s.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace(); // Print the stack trace to diagnose any issues
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
    
   public void ShowHistory() {
     try {
            Connection con = tools();
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select * from guests order by GuestID desc;");
            String space = "       ";

            while (rs.next()) {
                String fnameData = space + rs.getString("FirstName") + "\n";
                 String lnameData =  space + rs.getString("LastName") + "\n";
                  String phoneData =  space + rs.getString("Phone") + "\n";
                   String addressData =  space +rs.getString("Address") + "\n";
                    String codData =  space + rs.getString("CheckOutDate") + "\n";
                // Display records in respective JTextAreas based on roomID
                
                Fname.append(fnameData);
                Lname.append(lnameData);
                Ctact.append(phoneData);
                Adr.append(addressData);
                Cod.append(codData);
            }

            // Close resources
            rs.close();
            s.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace(); // Print the stack trace to diagnose any issues
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
}
    

    
    


    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        close();
        Mmmenu Mmenu = new Mmmenu();
        Mmenu.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    
    
    
    
    private void Editbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Editbtn8ActionPerformed
         selectedEdit = 8;
        EditRes.setVisible(true);
    }//GEN-LAST:event_Editbtn8ActionPerformed

    private void Editbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Editbtn5ActionPerformed
          selectedEdit = 5;
        EditRes.setVisible(true);
    }//GEN-LAST:event_Editbtn5ActionPerformed

    private void Editbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Editbtn4ActionPerformed
          selectedEdit = 4;
        EditRes.setVisible(true);
    }//GEN-LAST:event_Editbtn4ActionPerformed

    private void Editbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Editbtn1ActionPerformed

        selectedEdit = 1;
        EditRes.setVisible(true);
    }//GEN-LAST:event_Editbtn1ActionPerformed

    private void Cd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cd1ActionPerformed

    private void Cd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cd2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cd2ActionPerformed

    private void Cd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cd3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cd3ActionPerformed

    private void Back2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back2ActionPerformed
        close();
        Mmmenu Mmenu = new Mmmenu();
        Mmenu.setVisible(true);
    }//GEN-LAST:event_Back2ActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearActionPerformed

    private void monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthActionPerformed

    private void pstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pstatusActionPerformed

  
   
   public String formatDate(){
         String Date1 = (String) day.getSelectedItem();  //CheckIn Date
         String Date2 = (String) month.getSelectedItem();
         String Date3 = (String) year.getSelectedItem();
         String formattedDate = Date3 + "-" + Date2 + "-" + Date1;
         
         return formattedDate;
   }
    

    static int selectedEdit;
    
    
    
    private void ConfirmCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmCodActionPerformed
try {
        Connection con = tools();
  
         String RoomNuminFormat = "10" + selectedEdit;
         int roomID = selectedEdit;
         String CheckOutDate = formatDate();
        
        // Update availability in the rooms table
        PreparedStatement pstmt1 = con.prepareStatement("UPDATE rooms SET Availability = 1 WHERE RoomID = ?");
        pstmt1.setInt(1, roomID);
        pstmt1.executeUpdate();
        
        //setting Check-out Date
         PreparedStatement pstmt2 = con.prepareStatement("UPDATE guests SET CheckOutDate = ? WHERE RoomNumber = ?");
         pstmt2.setString(1, CheckOutDate);
         pstmt2.setString(2, RoomNuminFormat);
         pstmt2.executeUpdate();

         
         //Deleting records
         PreparedStatement pstmt3 = con.prepareStatement("DELETE  from reservations WHERE RoomID = ?");
         pstmt3.setInt(1, roomID);
         pstmt3.executeUpdate();
         
         JOptionPane.showMessageDialog(this, "Information Saved");
        
        pstmt1.close();
        pstmt2.close();
        pstmt3.close();
        con.close();
        EditRes.setVisible(false);
        
        
    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }        
    }//GEN-LAST:event_ConfirmCodActionPerformed

    
    public void EditRes(){        
         if (day.getSelectedItem() == "-" && month.getSelectedItem() == "-" &&  year.getSelectedItem() == "-"  ) {
         pstatus.setText("Reservation not paid"); pstatus.setForeground(Color.red);
      } else {
           pstatus.setText("Reservation paid"); pstatus.setForeground(Color.green);
       }
}
   
    
    private void CancelCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelCodActionPerformed
        month.setSelectedIndex(0);
        day.setSelectedIndex(0);
        year.setSelectedIndex(0);
        EditRes.setVisible(false);
        reservs.setVisible(true);
    }//GEN-LAST:event_CancelCodActionPerformed

    private void Editbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Editbtn7ActionPerformed
       selectedEdit = 7;
        EditRes.setVisible(true);
    }//GEN-LAST:event_Editbtn7ActionPerformed

    private void Editbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Editbtn6ActionPerformed
         selectedEdit = 6;
        EditRes.setVisible(true);
    }//GEN-LAST:event_Editbtn6ActionPerformed

    private void Editbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Editbtn3ActionPerformed
          selectedEdit = 3;
        EditRes.setVisible(true);
    }//GEN-LAST:event_Editbtn3ActionPerformed

    private void Editbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Editbtn2ActionPerformed
          selectedEdit = 2;
        EditRes.setVisible(true);
    }//GEN-LAST:event_Editbtn2ActionPerformed

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
            java.util.logging.Logger.getLogger(MmReservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MmReservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MmReservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MmReservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MmReservations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea Adr;
    private javax.swing.JButton Back;
    private javax.swing.JButton Back2;
    private javax.swing.JButton CancelCod;
    private javax.swing.JComboBox<String> Cd1;
    private javax.swing.JComboBox<String> Cd2;
    private javax.swing.JComboBox<String> Cd3;
    public javax.swing.JTextArea Cod;
    private javax.swing.JButton ConfirmCod;
    public javax.swing.JTextArea Ctact;
    private javax.swing.JPanel EditRes;
    private javax.swing.JButton Editbtn1;
    private javax.swing.JButton Editbtn2;
    private javax.swing.JButton Editbtn3;
    private javax.swing.JButton Editbtn4;
    private javax.swing.JButton Editbtn5;
    private javax.swing.JButton Editbtn6;
    private javax.swing.JButton Editbtn7;
    private javax.swing.JButton Editbtn8;
    public javax.swing.JTextArea Fname;
    private javax.swing.JPanel History2;
    public javax.swing.JTextArea Lname;
    private javax.swing.JPanel Records;
    private javax.swing.JMenuItem Remove;
    public javax.swing.JTextArea Room101;
    public javax.swing.JTextArea Room102;
    public javax.swing.JTextArea Room103;
    public javax.swing.JTextArea Room104;
    public javax.swing.JTextArea Room105;
    public javax.swing.JTextArea Room106;
    public javax.swing.JTextArea Room107;
    public javax.swing.JTextArea Room108;
    private javax.swing.JLabel Title;
    private javax.swing.JMenuItem Update;
    private java.awt.Choice choice1;
    private javax.swing.JComboBox<String> day;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JTextField pstatus;
    private javax.swing.JPanel reservs;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
