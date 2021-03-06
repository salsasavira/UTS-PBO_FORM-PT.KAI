
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPass = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSignUp = new javax.swing.JButton();
        jSignIn = new javax.swing.JButton();
        jExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("The Bold Font", 0, 24)); // NOI18N
        jLabel1.setText("SIGN IN");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, 80));

        jUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUserActionPerformed(evt);
            }
        });
        jPanel2.add(jUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 170, 30));

        jLabel3.setText("Password");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        jLabel4.setText("Username");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));
        jPanel2.add(jPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 170, 30));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(102, 102, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ya.png"))); // NOI18N
        jLabel2.setAlignmentY(0.0F);
        jLabel2.setIconTextGap(0);
        jLabel2.setMaximumSize(new java.awt.Dimension(300, 202));
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 210, 190));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("PT. KERETA API INDONESIA ");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 280, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("kontak_pelanggan@kereta-api.co.id");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("JL. Perintis Kemerdekaan No. 1 Bandung 40117  ");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Telp. 121 / 021 121");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Fax (022) 4203342");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 140));

        jSignUp.setText("Sign Up");
        jSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSignUpActionPerformed(evt);
            }
        });
        jPanel2.add(jSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, 30));

        jSignIn.setText("Sign In");
        jSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSignInActionPerformed(evt);
            }
        });
        jPanel2.add(jSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, 30));

        jExit.setText("Exit");
        jExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitActionPerformed(evt);
            }
        });
        jPanel2.add(jExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(471, 351));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jUserActionPerformed

    private void jSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSignUpActionPerformed
       String username = jUser.getText();
       String password = jPass.getText();
       
       try{
           try (Statement statement = (Statement) file_koneksi.GetConnection().createStatement()){
                statement.executeUpdate("insert into admin(username, password) VALUES ('"+username+"','"+password+"');");
           }
           JOptionPane.showMessageDialog(null,"Selamat! anda berhasil sign up!");
       } catch(Exception t){
           JOptionPane.showMessageDialog(null, "Coba Lagi");
       }
    }//GEN-LAST:event_jSignUpActionPerformed

    private void jSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSignInActionPerformed
        Connection connection;
        PreparedStatement ps;
        
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/data_kereta?zeroDateTimeBehavior=convertToNull", "root", "");
        ps = connection.prepareStatement("SELECT `username`, `password` FROM `admin` WHERE `username` = ? AND `password` = ?");
        ps.setString(1, jUser.getText());
        ps.setString(2, jPass.getText());
        ResultSet result = ps.executeQuery();
        if(result.next()){
            new Home().show();
            this.dispose();
        }else {
            JOptionPane.showMessageDialog(rootPane, "Salah");
            jUser.setText("");
            jPass.setText("");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "gagal");
        }
    }//GEN-LAST:event_jSignInActionPerformed

    private void jExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jExitActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPass;
    private javax.swing.JButton jSignIn;
    private javax.swing.JButton jSignUp;
    private javax.swing.JTextField jUser;
    // End of variables declaration//GEN-END:variables
}
