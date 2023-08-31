/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package net.braium.academy;

import java.awt.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author nvhan
 */
public class LoginFrm
        extends javax.swing.JFrame {

  private ArrayList<Account> accounts;
  private static final String FILE_NAME = "ACC.DAT";

  /**
   * Creates new form LoginFrm
   */
  public LoginFrm() {
    initComponents();
    setLocationRelativeTo(null);
    loadData();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    btnLogin = new javax.swing.JButton();
    btnSignin = new javax.swing.JButton();
    emailValue = new javax.swing.JTextField();
    passwordValue = new javax.swing.JPasswordField();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 51, 51));
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("Log in");
    jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    jLabel2.setText("Email:");

    jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    jLabel3.setText("Password:");

    btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/braium/academy/images/login.png"))); // NOI18N
    btnLogin.setText("Log in");
    btnLogin.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnLoginActionPerformed(evt);
      }
    });

    btnSignin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    btnSignin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/braium/academy/images/add-user.png"))); // NOI18N
    btnSignin.setText("Sign in");
    btnSignin.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSigninActionPerformed(evt);
      }
    });

    passwordValue.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        passwordValueActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(btnLogin)
        .addGap(39, 39, 39)
        .addComponent(btnSignin)
        .addGap(81, 81, 81))
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(41, 41, 41)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(emailValue, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
              .addComponent(passwordValue)))
          .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(41, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(18, 18, 18)
        .addComponent(jLabel1)
        .addGap(32, 32, 32)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jLabel2)
          .addComponent(emailValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(42, 42, 42)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(passwordValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnLogin)
          .addComponent(btnSignin))
        .addGap(44, 44, 44))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
     var email = emailValue.getText();
     var password = new String(passwordValue.getPassword());
     Account acc = new Account(email , password, "");
     if (accounts != null && accounts.contains(acc)) {
       HomeFrm homeFrm = new HomeFrm(acc);
       homeFrm.setVisible(true);
       this.dispose();
     }else{
       JOptionPane.showMessageDialog(rootPane, "Thong tin cua ban khong dung!");
     }
  }//GEN-LAST:event_btnLoginActionPerformed

  private void btnSigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSigninActionPerformed
    RegisterFrm registerFrm = new RegisterFrm(this);
    registerFrm.setVisible(true);
  }//GEN-LAST:event_btnSigninActionPerformed

  private void passwordValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordValueActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_passwordValueActionPerformed

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
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.
              getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(LoginFrm.class.getName()).
              log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(LoginFrm.class.getName()).
              log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(LoginFrm.class.getName()).
              log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(LoginFrm.class.getName()).
              log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new LoginFrm().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnLogin;
  private javax.swing.JButton btnSignin;
  private javax.swing.JTextField emailValue;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JPasswordField passwordValue;
  // End of variables declaration//GEN-END:variables

  private void loadData() {
    try (FileInputStream fis = new FileInputStream(FILE_NAME);
            ObjectInputStream ois = new ObjectInputStream(fis)) {
      accounts = (ArrayList<Account>) ois.readObject();
      
    } catch (FileNotFoundException ex) {
      ex.printStackTrace();
    } catch (IOException ex) {
      ex.printStackTrace();
    } catch (ClassNotFoundException ex) {
      ex.printStackTrace();
    }
  }
  
  private void writeDataToFile() {
    try (FileOutputStream fos = new FileOutputStream(FILE_NAME);
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
      oos.writeObject(accounts);
    } catch (FileNotFoundException ex) {
      ex.printStackTrace();
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }
  public void setAccount(Account acc) {
    if (accounts == null) {
      accounts = new ArrayList<>();
    }
    accounts.add(acc);
    writeDataToFile();
  }
}