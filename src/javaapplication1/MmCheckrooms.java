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
import java.awt.*;
import javax.swing.ImageIcon;

/**
 *
 * @author ignac
 */
public class MmCheckrooms extends javax.swing.JFrame implements ActionListener {

   
    
     private void close() {
        this.dispose(); // Close the current JFrame
    }

    @Override
public void actionPerformed(ActionEvent e) {
    // Add your action handling code here
}
    

    
    
    public MmCheckrooms() {
        initComponents();
        changeImage();
    }

  
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        Records = new javax.swing.JPanel();
        Back = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Status1 = new javax.swing.JLabel();
        Status2 = new javax.swing.JLabel();
        Status3 = new javax.swing.JLabel();
        Status4 = new javax.swing.JLabel();
        Status5 = new javax.swing.JLabel();
        Status6 = new javax.swing.JLabel();
        Status7 = new javax.swing.JLabel();
        Status8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Room101Image = new javax.swing.JLabel();
        Room102Image = new javax.swing.JLabel();
        Room103Image = new javax.swing.JLabel();
        Room104Image = new javax.swing.JLabel();
        Room105Image = new javax.swing.JLabel();
        Room106Image = new javax.swing.JLabel();
        Room107Image = new javax.swing.JLabel();
        Room108Image = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 579));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setPreferredSize(new java.awt.Dimension(200, 200));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Records.setBackground(new java.awt.Color(0,0,0,98));
        Records.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        Records.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, 98, 30));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setOpaque(false);
        jPanel3.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Room #101");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(0, 0, 340, 20);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Room #102");
        jLabel12.setMaximumSize(new java.awt.Dimension(16, 16));
        jLabel12.setMinimumSize(new java.awt.Dimension(16, 16));
        jLabel12.setPreferredSize(new java.awt.Dimension(16, 16));
        jPanel3.add(jLabel12);
        jLabel12.setBounds(350, 0, 340, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Room #103");
        jLabel4.setMaximumSize(new java.awt.Dimension(25, 16));
        jLabel4.setMinimumSize(new java.awt.Dimension(25, 16));
        jLabel4.setPreferredSize(new java.awt.Dimension(25, 16));
        jPanel3.add(jLabel4);
        jLabel4.setBounds(0, 120, 340, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Room #104");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(350, 120, 340, 20);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Room #105");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(0, 240, 340, 20);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Room #106");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(350, 240, 340, 20);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Room #107");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(0, 360, 340, 20);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Room #108");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(350, 360, 340, 20);

        Status1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        Status1.setForeground(new java.awt.Color(51, 255, 51));
        Status1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Status1.setText("[ • Available ]");
        Status1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(Status1);
        Status1.setBounds(250, 30, 80, 16);

        Status2.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        Status2.setForeground(new java.awt.Color(51, 255, 51));
        Status2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Status2.setText("[ • Available ]");
        Status2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(Status2);
        Status2.setBounds(600, 30, 80, 14);

        Status3.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        Status3.setForeground(new java.awt.Color(51, 255, 51));
        Status3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Status3.setText("[ • Available ]");
        Status3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(Status3);
        Status3.setBounds(250, 150, 80, 14);

        Status4.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        Status4.setForeground(new java.awt.Color(51, 255, 51));
        Status4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Status4.setText("[ • Available ]");
        Status4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(Status4);
        Status4.setBounds(600, 150, 80, 14);

        Status5.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        Status5.setForeground(new java.awt.Color(51, 255, 51));
        Status5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Status5.setText("[ • Available ]");
        Status5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(Status5);
        Status5.setBounds(250, 270, 80, 14);

        Status6.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        Status6.setForeground(new java.awt.Color(51, 255, 51));
        Status6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Status6.setText("[ • Available ]");
        Status6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(Status6);
        Status6.setBounds(600, 270, 80, 14);

        Status7.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        Status7.setForeground(new java.awt.Color(51, 255, 51));
        Status7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Status7.setText("[ • Available ]");
        Status7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(Status7);
        Status7.setBounds(250, 390, 80, 14);

        Status8.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        Status8.setForeground(new java.awt.Color(51, 255, 51));
        Status8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Status8.setText("[ • Available ]");
        Status8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(Status8);
        Status8.setBounds(600, 390, 80, 14);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 480));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridLayout(4, 2, 5, 20));

        Room101Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/06c50f5b16bb98c36ca5916f70d8aaac.jpg"))); // NOI18N
        Room101Image.setText("jLabel1");
        Room101Image.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(Room101Image);

        Room102Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/06c50f5b16bb98c36ca5916f70d8aaac.jpg"))); // NOI18N
        Room102Image.setText("jLabel1");
        Room102Image.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(Room102Image);

        Room103Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/06c50f5b16bb98c36ca5916f70d8aaac.jpg"))); // NOI18N
        Room103Image.setText("jLabel1");
        Room103Image.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(Room103Image);

        Room104Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/06c50f5b16bb98c36ca5916f70d8aaac.jpg"))); // NOI18N
        Room104Image.setText("jLabel1");
        Room104Image.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(Room104Image);

        Room105Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/06c50f5b16bb98c36ca5916f70d8aaac.jpg"))); // NOI18N
        Room105Image.setText("jLabel1");
        Room105Image.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(Room105Image);

        Room106Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/d71f79e1e76221f35f5911488aeb8f0c.jpg"))); // NOI18N
        Room106Image.setText("jLabel1");
        Room106Image.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(Room106Image);

        Room107Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/d71f79e1e76221f35f5911488aeb8f0c.jpg"))); // NOI18N
        Room107Image.setText("jLabel1");
        Room107Image.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(Room107Image);

        Room108Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/d71f79e1e76221f35f5911488aeb8f0c.jpg"))); // NOI18N
        Room108Image.setText("jLabel1");
        Room108Image.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(Room108Image);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 690, 460));

        Records.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 690, 480));

        jLayeredPane1.add(Records, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 560));

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 730, 560));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/297653636.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        close();
        Mmmenu Mmenu = new Mmmenu();
        Mmenu.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    
    
    
    
    
      public Connection tools() throws SQLException, ClassNotFoundException { //SHORTCUT
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/moteldb", "root", "julius022104");
        return con;
    }
    //"/Images/BlurredDeluxe.png"
    private void changeImage(){
        try{
            Connection con = tools();
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select rooms.Availability, rooms.RoomID from rooms"); 

            while (rs.next()) {
            int roomID = rs.getInt("RoomID");
            int Availab = rs.getInt("Availability");
            
            ImageIcon blurredIcon1 = new ImageIcon(getClass().getResource("/Images/BlurredStandard.png"));
            ImageIcon blurredIcon2 = new ImageIcon(getClass().getResource("/Images/BlurredDeluxe.png"));
            
            String occu = "[ • Occupied ]";
            
            switch (roomID) {
                case 1: if(Availab == 0) {Room101Image.setIcon(blurredIcon1); Status1.setText(occu);Status1.setForeground(Color.RED);} break;
                case 2: if(Availab == 0) {Room102Image.setIcon(blurredIcon1); Status2.setText(occu);Status2.setForeground(Color.RED);} break;
                case 3: if(Availab == 0) {Room103Image.setIcon(blurredIcon1); Status3.setText(occu);Status3.setForeground(Color.RED);} break;
                case 4: if(Availab == 0) {Room104Image.setIcon(blurredIcon1); Status4.setText(occu);Status4.setForeground(Color.RED);} break;
                case 5: if(Availab == 0) {Room105Image.setIcon(blurredIcon1); Status5.setText(occu);Status5.setForeground(Color.RED);} break;
                case 6: if(Availab == 0) {Room106Image.setIcon(blurredIcon2); Status6.setText(occu);Status6.setForeground(Color.RED);} break;
                case 7: if(Availab == 0) {Room107Image.setIcon(blurredIcon2); Status7.setText(occu);Status7.setForeground(Color.RED);} break;
                case 8: if(Availab == 0) {Room108Image.setIcon(blurredIcon2); Status8.setText(occu);Status8.setForeground(Color.RED);} break;   
                    
            }
        }
            
            
            
          rs.close();
          s.close();
          con.close(); 
        } catch (Exception e) {
        e.printStackTrace(); // Print the stack trace to diagnose any issues
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
        
    }
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(MmCheckrooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MmCheckrooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MmCheckrooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MmCheckrooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new MmCheckrooms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JPanel Records;
    public javax.swing.JLabel Room101Image;
    public javax.swing.JLabel Room102Image;
    public javax.swing.JLabel Room103Image;
    public javax.swing.JLabel Room104Image;
    public javax.swing.JLabel Room105Image;
    public javax.swing.JLabel Room106Image;
    public javax.swing.JLabel Room107Image;
    public javax.swing.JLabel Room108Image;
    private javax.swing.JLabel Status1;
    private javax.swing.JLabel Status2;
    private javax.swing.JLabel Status3;
    private javax.swing.JLabel Status4;
    private javax.swing.JLabel Status5;
    private javax.swing.JLabel Status6;
    private javax.swing.JLabel Status7;
    private javax.swing.JLabel Status8;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
