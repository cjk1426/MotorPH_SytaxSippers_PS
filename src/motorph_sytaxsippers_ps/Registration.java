package motorph_sytaxsippers_ps;

import java.awt.Image;
import java.io.File;
import javax.swing.JOptionPane;
import static motorph_sytaxsippers_ps.OpenCSV_Writedata.writeToCSV;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.ImageIcon;

public class Registration extends javax.swing.JFrame {

    public Registration() {
        initComponents();
     //   scaleImage();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        jMenuItem1 = new javax.swing.JMenuItem();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPassword_confirm = new javax.swing.JPasswordField();
        jPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTxt_UserName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTxt_Name = new javax.swing.JTextField();
        jTxt_Email = new javax.swing.JTextField();
        jTxt_Surname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenuItem1.setText("jMenuItem1");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MotorPH Registration");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0, 150));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jPassword_confirm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("SimSun-ExtB", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Confirm Password:");

        jLabel3.setFont(new java.awt.Font("SimSun-ExtB", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password:");

        jTxt_UserName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("SimSun-ExtB", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("User name:");

        jButton2.setBackground(new java.awt.Color(255, 153, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(jTxt_UserName)
                            .addComponent(jPassword_confirm))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxt_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPassword_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton2))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, 330));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0, 150));

        jTxt_Name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTxt_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxt_NameActionPerformed(evt);
            }
        });

        jTxt_Email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTxt_Surname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("SimSun-ExtB", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name:");

        jLabel5.setFont(new java.awt.Font("SimSun-ExtB", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Surname:");

        jLabel6.setFont(new java.awt.Font("SimSun-ExtB", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email Address:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5)
                        .addComponent(jLabel1)
                        .addComponent(jTxt_Name, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                        .addComponent(jTxt_Surname)
                        .addComponent(jTxt_Email)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxt_Surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 370, 310));

        jSeparator1.setBackground(new java.awt.Color(255, 153, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 153, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 740, 20));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Registration");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, -1, 50));
        jLabel7.getAccessibleContext().setAccessibleName("Payroll Registration");

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Perpetua Titling MT", 1, 28)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Payroll");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, -1, 50));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 180, 60));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/bg3.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        // Get the current path for the CSV file
        String currentPath = System.getProperty("user.dir");
        String csvFile = currentPath + File.separator + "resources" + File.separator + "CredentialDetails.csv";

        // Example data to write to the CSV
        // UserName,Password,Name,Surname,Email,Role
        String[] header = {"UserName", "Password", "Name", "Surname", "Email", "Role"};

        // Retrieve input values
        String username = jTxt_UserName.getText().trim();
        char[] passwordChars = jPassword.getPassword();
        char[] confirmPasswordChars = jPassword_confirm.getPassword();
        String password = new String(passwordChars).trim();
        String confirmPassword = new String(confirmPasswordChars).trim();
        String name = jTxt_Name.getText().trim();
        String surname = jTxt_Surname.getText().trim();
        String email = jTxt_Email.getText().trim();

        // Validate fields for empty inputs
        if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()
                || name.isEmpty() || surname.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields are required. Please fill out all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit the method
        }

        // Validate password and confirm password
        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(null, "Passwords do not match. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit the method
        }

            // Hash the password
    String passwordHash = hashPassword(password);
    if (passwordHash == null) {
        JOptionPane.showMessageDialog(null, "Error hashing the password. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Exit the method
    }
        
        // Prepare data to write if all validations pass
        // naka default muna sa super admin
        String[] data1 = {username, passwordHash, name, surname, email, "SuperAdmin"};

        // Write to the CSV file
        writeToCSV(csvFile, header, data1);

        // Show a success message
        JOptionPane.showMessageDialog(null, "User successfully added!", "Notification", JOptionPane.INFORMATION_MESSAGE);

        // Clear fields after successful addition
        jTxt_UserName.setText("");
        jPassword.setText("");
        jPassword_confirm.setText("");
        jTxt_Name.setText("");
        jTxt_Surname.setText("");
        jTxt_Email.setText("");

        

        
    }//GEN-LAST:event_jButton2ActionPerformed

    
    
    // Method to hash a password using SHA-256
private String hashPassword(String password) {
    try {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = md.digest(password.getBytes());
        StringBuilder hashString = new StringBuilder();
        for (byte b : hashBytes) {
            hashString.append(String.format("%02x", b));
        }
        return hashString.toString();
    } catch (NoSuchAlgorithmException e) {
        e.printStackTrace();
        return null;
    }
}
    
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:

        UserLogin Ulogin = new UserLogin();
        Ulogin.setVisible(true);


    }//GEN-LAST:event_formWindowClosed

    private void jTxt_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxt_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxt_NameActionPerformed

//    public void scaleImage() {
//        ImageIcon icon = new ImageIcon ("C:\\Users\\admin\\Downloads\\Logo1-removebg-preview.png");
//        Image img = icon.getImage();
//        Image imgScale = img.getScaledInstance(jLabel8.getWidth(), jLabel8.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon scaledIcon = new ImageIcon(imgScale);
//        jLabel8.setIcon(scaledIcon);
//        
//        
//    }
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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JPasswordField jPassword_confirm;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTxt_Email;
    private javax.swing.JTextField jTxt_Name;
    private javax.swing.JTextField jTxt_Surname;
    private javax.swing.JTextField jTxt_UserName;
    // End of variables declaration//GEN-END:variables
}
