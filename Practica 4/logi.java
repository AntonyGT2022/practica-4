
package workfinal;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author AmerDeOleo
 */
public class logi extends javax.swing.JFrame {

   
    public logi() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        login_bo = new javax.swing.JButton();
        signup_bo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Dont have an Acount? Please Sign-Up");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 220, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Amer\\Desktop\\te\\Login.png")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Amer\\Desktop\\te\\btnLoginSwitch.png")); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 90, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Amer\\Desktop\\te\\Sign Up-1.png")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 40, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Amer\\Desktop\\te\\btnSignUpSwitch.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 110, 50));

        password.setToolTipText("password here");
        password.setBorder(null);
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 250, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Amer\\Desktop\\te\\Password.png")); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Amer\\Desktop\\te\\Username.png")); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 60, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Amer\\Desktop\\te\\Join Us.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 70, 30));

        username.setForeground(new java.awt.Color(153, 153, 153));
        username.setText("Username");
        username.setToolTipText("username here");
        username.setBorder(null);
        username.setCaretColor(new java.awt.Color(153, 255, 255));
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFocusLost(evt);
            }
        });
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 250, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Amer\\Desktop\\te\\rightPanel.png")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 340, 440));

        login_bo.setOpaque(false);
        login_bo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_boActionPerformed(evt);
            }
        });
        jPanel1.add(login_bo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 70, 30));

        signup_bo.setBorderPainted(false);
        signup_bo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_boActionPerformed(evt);
            }
        });
        jPanel1.add(signup_bo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 40, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 370, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained
        // TODO add your handling code here:
        if(username.getText().trim().toLowerCase().equals("username")){
            username.setText("");
            username.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_usernameFocusGained

    private void usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusLost

        username.setForeground(Color.gray);
    }//GEN-LAST:event_usernameFocusLost

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed
    
    public boolean checkUsers(String username,String password) 
    {
        
        
        
            boolean checkUser = false;
            conexion objConexion= new conexion();
            ResultSet rs = objConexion.consultarRegistros("SELECT user, password FROM usuarios WHERE user = '"+username+"' AND password = '"+password+"'");
            
            
            
        try {
            if(rs.next())
            {
                checkUser = true;
            }
            else{
                checkUser = false;
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Frm_login.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
            
            return checkUser;
         
    }
    private void login_boActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_boActionPerformed
        String user = username.getText();
        String pass = String.valueOf(password.getPassword());
        
        if(user.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Add A Username");
        }
        
        else if(pass.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Add A Password");
        }
        else {
            if (checkUsers(user,pass)){
                JOptionPane.showMessageDialog(null,"Sea Bienveniddo al gestor de usuarios");
                tabla ma = new tabla();
                
                    ma.pack();
                    ma.setLocationRelativeTo(null);
                    ma.setVisible(true);
                    this.setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(null,"Este usuario no existe o los datos estan incorrectos intentelo nuevamente");
            }
        }
        
             
    }//GEN-LAST:event_login_boActionPerformed

    private void signup_boActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_boActionPerformed
        System.out.println("voy al registro");
        setVisible(false);
         Frm_login mf = new Frm_login();
                    mf.setVisible(true);
                    mf.pack();
                    mf.setLocationRelativeTo(null);
                    
    }//GEN-LAST:event_signup_boActionPerformed

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
            java.util.logging.Logger.getLogger(logi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new logi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login_bo;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton signup_bo;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
