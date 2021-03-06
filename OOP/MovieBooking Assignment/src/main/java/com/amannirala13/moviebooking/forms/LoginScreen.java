package com.amannirala13.moviebooking.forms;

import com.amannirala13.moviebooking.helpers.Cache;
import com.amannirala13.moviebooking.helpers.database.Database;
import com.amannirala13.moviebooking.models.User;
import com.amannirala13.moviebooking.values.text;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author amann
 */
public class LoginScreen extends javax.swing.JFrame {

    public LoginScreen() {
        initComponents();
        Database.createConnection("jdbc:mysql://127.0.0.1:3306/moviebooking", "developer", "developer123");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        brandingPanel = new javax.swing.JPanel();
        loginText = new javax.swing.JLabel();
        LoginFieldsHolder = new javax.swing.JPanel();
        usernameText = new javax.swing.JTextField();
        passwordText = new javax.swing.JTextField();
        loginBtn = new javax.swing.JButton();
        login_creds_message = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        brandingPanel.setBackground(new java.awt.Color(51, 51, 51));

        loginText.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        loginText.setForeground(new java.awt.Color(255, 255, 255));
        loginText.setText("Movie Booking");

        LoginFieldsHolder.setBackground(new java.awt.Color(255, 255, 255));

        usernameText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        usernameText.setForeground(new java.awt.Color(51, 51, 51));
        usernameText.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Username ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
        usernameText.setSelectionColor(new java.awt.Color(51, 51, 51));
        usernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextActionPerformed(evt);
            }
        });

        passwordText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        passwordText.setForeground(new java.awt.Color(51, 51, 51));
        passwordText.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Password ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
        passwordText.setSelectionColor(new java.awt.Color(51, 51, 51));
        passwordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextActionPerformed(evt);
            }
        });

        loginBtn.setBackground(new java.awt.Color(51, 51, 51));
        loginBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Login");
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginBtnMousePressed(evt);
            }
        });
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        login_creds_message.setBackground(new java.awt.Color(255, 255, 255));
        login_creds_message.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout LoginFieldsHolderLayout = new javax.swing.GroupLayout(LoginFieldsHolder);
        LoginFieldsHolder.setLayout(LoginFieldsHolderLayout);
        LoginFieldsHolderLayout.setHorizontalGroup(
            LoginFieldsHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginFieldsHolderLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(LoginFieldsHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(login_creds_message, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        LoginFieldsHolderLayout.setVerticalGroup(
            LoginFieldsHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginFieldsHolderLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(login_creds_message)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" By Aman Kumar Nirala");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("v 1.0 Alpha");

        javax.swing.GroupLayout brandingPanelLayout = new javax.swing.GroupLayout(brandingPanel);
        brandingPanel.setLayout(brandingPanelLayout);
        brandingPanelLayout.setHorizontalGroup(
            brandingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(brandingPanelLayout.createSequentialGroup()
                .addGroup(brandingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(brandingPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(brandingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(loginText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, brandingPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(LoginFieldsHolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        brandingPanelLayout.setVerticalGroup(
            brandingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginFieldsHolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(brandingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(loginText, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(brandingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(brandingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        loginUser();
    }//GEN-LAST:event_loginBtnActionPerformed

    private void loginBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtnMousePressed

    private void passwordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextActionPerformed

    
    public static void main(String args[]) {
        FlatLightLaf.install();
        
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
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            JFrame frame = new LoginScreen();
            frame.setVisible(true);
            frame.setBackground(new Color(0,0,0,0));
            /*ComponentResizer cr = new ComponentResizer();
            cr.registerComponent(frame);
            cr.setSnapSize(new Dimension(300, 300));
            cr.setMaximumSize(new Dimension(600, 350));
            cr.setMinimumSize(new Dimension(600, 350));*/
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoginFieldsHolder;
    private javax.swing.JPanel brandingPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel loginText;
    private javax.swing.JLabel login_creds_message;
    private javax.swing.JTextField passwordText;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables

    private void loginUser() {
       var username = usernameText.getText();
       var password = passwordText.getText();
       String query = "SELECT * FROM users WHERE username = '"+username+"' AND password = '"+password+"';";
        try {
            ResultSet result = Database.getResult(query);
            if(result.next() == false){
                login_creds_message.setText(text.invalid_login_creds);
            }
            else{
                Cache.currentUser = new User(result.getInt(User.ID),
                        result.getString(User.USERNAME),
                        result.getString(User.PASSWORD),
                        result.getBoolean(User.ADMIN));
                
                HomeForm intent = new HomeForm();
                intent.setVisible(true);
                this.setVisible(false);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoginScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
