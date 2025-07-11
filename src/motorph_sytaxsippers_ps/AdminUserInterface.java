package motorph_sytaxsippers_ps;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static motorph_sytaxsippers_ps.OpenCsv_DeleteData.deleteFromCSV;

public class AdminUserInterface extends javax.swing.JFrame {

    /**
     * Creates new form AdminUserInterface
     */
    public AdminUserInterface() {
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jBtn_OpenEmpDetails = new javax.swing.JButton();
        jBtn_ShowAddEmp = new javax.swing.JButton();
        jBtn_Update = new javax.swing.JButton();
        jBtn_Delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MotorPH");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0, 100));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 102));
        jLabel1.setText("EMPLOYEE PAYROLL ADMINISTRATOR");

        jButton1.setBackground(new java.awt.Color(255, 204, 102));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("CLOSE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jBtn_OpenEmpDetails.setBackground(new java.awt.Color(255, 204, 102));
        jBtn_OpenEmpDetails.setForeground(new java.awt.Color(0, 0, 0));
        jBtn_OpenEmpDetails.setText("VIEW EMPLOYEE");
        jBtn_OpenEmpDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_OpenEmpDetailsActionPerformed(evt);
            }
        });

        jBtn_ShowAddEmp.setBackground(new java.awt.Color(255, 204, 102));
        jBtn_ShowAddEmp.setForeground(new java.awt.Color(0, 0, 0));
        jBtn_ShowAddEmp.setText("ADD EMPLOYEE");
        jBtn_ShowAddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_ShowAddEmpActionPerformed(evt);
            }
        });

        jBtn_Update.setBackground(new java.awt.Color(255, 204, 102));
        jBtn_Update.setForeground(new java.awt.Color(0, 0, 0));
        jBtn_Update.setText("UPDATE EMPLOYEE");
        jBtn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_UpdateActionPerformed(evt);
            }
        });

        jBtn_Delete.setBackground(new java.awt.Color(255, 204, 102));
        jBtn_Delete.setForeground(new java.awt.Color(0, 0, 0));
        jBtn_Delete.setText("DELETE");
        jBtn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_DeleteActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(248, 233, 200));
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtn_OpenEmpDetails)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtn_ShowAddEmp)
                        .addGap(18, 18, 18)
                        .addComponent(jBtn_Update)
                        .addGap(18, 18, 18)
                        .addComponent(jBtn_Delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 3, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jBtn_OpenEmpDetails)
                    .addComponent(jBtn_ShowAddEmp)
                    .addComponent(jBtn_Update)
                    .addComponent(jBtn_Delete))
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 610));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/bg6.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        reloadData();
//        String currentPath = System.getProperty("user.dir");
//        String csvFile = currentPath + File.separator + "resources" + File.separator + "MotorPHEmployeeData-EmployeeDetails.csv";
//
//        try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
//            // Read all data from the CSV file
//            List<String[]> allData = reader.readAll();
//
//            if (!allData.isEmpty()) {
//                // Assuming jTable1 is the JTable in your form (declared in the GUI designer)
//                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//
//                // Identify desired columns by their names
//                String[] originalHeaders = allData.get(0);
//                String[] desiredHeaders = {"Employee #", "Last Name", "First Name", "SSS #", "Philhealth #", "TIN #", "Pag-ibig #"};
//                int[] desiredIndices = new int[desiredHeaders.length];
//
//                // Map desired column indices
//                for (int i = 0; i < desiredHeaders.length; i++) {
//                    desiredIndices[i] = -1;
//                    for (int j = 0; j < originalHeaders.length; j++) {
//                        if (originalHeaders[j].equalsIgnoreCase(desiredHeaders[i])) {
//                            desiredIndices[i] = j;
//                            break;
//                        }
//                    }
//                    if (desiredIndices[i] == -1) {
//                        throw new IllegalArgumentException("Column '" + desiredHeaders[i] + "' not found in CSV file.");
//                    }
//                }
//
//                // Set table headers
//                model.setColumnIdentifiers(desiredHeaders);
//
//                // Add rows with only desired columns
//                for (int i = 1; i < allData.size(); i++) {
//                    String[] row = allData.get(i);
//                    String[] filteredRow = new String[desiredHeaders.length];
//                    for (int j = 0; j < desiredIndices.length; j++) {
//                        filteredRow[j] = row[desiredIndices[j]];
//                    }
//                    model.addRow(filteredRow);
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            JOptionPane.showMessageDialog(null, "Error loading table data.", "Error", JOptionPane.ERROR_MESSAGE);
//        }


    }//GEN-LAST:event_formWindowOpened

    private void jBtn_OpenEmpDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_OpenEmpDetailsActionPerformed

        // Need to select from the jtable first
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            // No row is selected; show a message box
            JOptionPane.showMessageDialog(this, "Please select an employee from the table before proceeding.", "Selection Required", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Get employee data from the selected row - FOR UPDATE
        String empNumber = (String) jTable1.getValueAt(selectedRow, 0); // Employee number (Column 0)
        String empLastName = (String) jTable1.getValueAt(selectedRow, 1); // Last Name (Column 1)
        String empFirstName = (String) jTable1.getValueAt(selectedRow, 2); // First Name (Column 2)
        String empSSS = (String) jTable1.getValueAt(selectedRow, 3); //  SSS(Column 3)
        String empPhilH = (String) jTable1.getValueAt(selectedRow, 4); // PHILHEALTH(Column 4)
        String empTIN = (String) jTable1.getValueAt(selectedRow, 5); // PHILHEALTH(Column 4)
        String empPAGIBIG = (String) jTable1.getValueAt(selectedRow, 6); // PHILHEALTH(Column 4)

        // Open GUI employee full details as a modal lang muna like VBA
        //     AdminUserInterface_EmployeeDetails adminEmpDetails = new AdminUserInterface_EmployeeDetails();
        AdminUserInterface_EmployeeDetails adminEmpDetails = new AdminUserInterface_EmployeeDetails(empNumber, empLastName, empFirstName, empSSS, empPhilH, empTIN, empPAGIBIG);
        // adminEmpDetails.jLabel.value = empNumber     

        // Disable the adminUI
        this.setEnabled(false);

        // if the EmployeeDetails close then enable the admin UI
        adminEmpDetails.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                // Re-enable the main form
                setEnabled(true);
            }

            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                // Re-enable the main form when the new window is closed
                setEnabled(true);
            }
        });

        // Make the new form visible
        adminEmpDetails.setVisible(true);

    }//GEN-LAST:event_jBtn_OpenEmpDetailsActionPerformed

    private void jBtn_ShowAddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_ShowAddEmpActionPerformed
        // 

        // Open GUI employee full details as a modal lang muna like VBA
        AdminUserInterface_AddEmployee adminAddEmpDetails = new AdminUserInterface_AddEmployee();

        // adminEmpDetails.jLabel.value = empNumber     
        // Disable the adminUI
        this.setEnabled(false);

        // if the EmployeeDetails close then enable the admin UI
        adminAddEmpDetails.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                // Re-enable the main form

                reloadData();
                setEnabled(true);
            }

            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                // Re-enable the main form when the new window is closed
                setEnabled(true);
            }
        });

        // Make the new form visible
        adminAddEmpDetails.setVisible(true);


    }//GEN-LAST:event_jBtn_ShowAddEmpActionPerformed

    private void jBtn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_UpdateActionPerformed
        // TODO add your handling code here:
        
                int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            // No row is selected; show a message box
            JOptionPane.showMessageDialog(this, "Please select an employee from the table before proceeding.", "Selection Required", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        
                String empNumber = (String) jTable1.getValueAt(selectedRow, 0); // Employee number (Column 0)
        String empLastName = (String) jTable1.getValueAt(selectedRow, 1); // Last Name (Column 1)
        String empFirstName = (String) jTable1.getValueAt(selectedRow, 2); // First Name (Column 2)
        String empSSS = (String) jTable1.getValueAt(selectedRow, 3); //  SSS(Column 3)
        String empPhilH = (String) jTable1.getValueAt(selectedRow, 4); // PHILHEALTH(Column 4)
        String empTIN = (String) jTable1.getValueAt(selectedRow, 5); // PHILHEALTH(Column 4)
        String empPAGIBIG = (String) jTable1.getValueAt(selectedRow, 6); // PHILHEALTH(Column 4)
        
        
                // Open GUI employee full details as a modal lang muna like VBA
        //     AdminUserInterface_EmployeeDetails adminEmpDetails = new AdminUserInterface_EmployeeDetails();
        AdminUserInterface_UpdateEmp adminUpdateEmpDetails = new AdminUserInterface_UpdateEmp(empNumber, empLastName, empFirstName, empSSS, empPhilH, empTIN, empPAGIBIG);
        // adminEmpDetails.jLabel.value = empNumber     
        
                // Disable the adminUI
        this.setEnabled(false);

        // if the EmployeeDetails close then enable the admin UI
        adminUpdateEmpDetails.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                // Re-enable the main form
                     reloadData();
                setEnabled(true);
            }

            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                // Re-enable the main form when the new window is closed
                setEnabled(true);
            }
        });

        // Make the new form visible
        adminUpdateEmpDetails.setVisible(true);

        
    }//GEN-LAST:event_jBtn_UpdateActionPerformed

    private void jBtn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_DeleteActionPerformed

        // Get the current working directory
        String currentPath = System.getProperty("user.dir");
        String csvFile = currentPath + File.separator + "resources" + File.separator + "EmployeeDetails_AdminView.csv";

        // Check if a row is selected
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            // No row is selected; show a message box
            JOptionPane.showMessageDialog(this, "Please select an employee from the table before proceeding.", "Selection Required", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Get employee data from the selected row
        String empNumber = (String) jTable1.getValueAt(selectedRow, 0); // Employee number (Column 0)
        String empName = (String) jTable1.getValueAt(selectedRow, 1); // Employee name (Column 1)

        // Show confirmation dialog
        int response = JOptionPane.showConfirmDialog(
                this,
                "Are you sure you want to delete the selected employee?\n\nEmployee #: " + empNumber + "\nName: " + empName,
                "Confirm Delete",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        // If the user clicked "Yes"
        if (response == JOptionPane.YES_OPTION) {
            try {
                // Delete rows matching the condition
                deleteFromCSV(csvFile, empNumber);
                reloadData();
                JOptionPane.showMessageDialog(this, "Employee deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (CsvValidationException ex) {
                Logger.getLogger(AdminUserInterface.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "An error occurred while deleting the employee.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jBtn_DeleteActionPerformed

    private void reloadData() {
        String currentPath = System.getProperty("user.dir");
        String csvFile = currentPath + File.separator + "resources" + File.separator + "EmployeeDetails_AdminView.csv";

        try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
            // Read all data from the CSV file
            List<String[]> allData = reader.readAll();

            if (!allData.isEmpty()) {
                // Assuming jTable1 is the JTable in your form (declared in the GUI designer)
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

                // Clear existing data
                model.setRowCount(0);

                // Identify desired columns by their names
                String[] originalHeaders = allData.get(0);
                String[] desiredHeaders = {"Employee #", "Last Name", "First Name", "SSS #", "Philhealth #", "TIN #", "Pag-ibig #"};
                int[] desiredIndices = new int[desiredHeaders.length];

                // Map desired column indices
                for (int i = 0; i < desiredHeaders.length; i++) {
                    desiredIndices[i] = -1;
                    for (int j = 0; j < originalHeaders.length; j++) {
                        if (originalHeaders[j].equalsIgnoreCase(desiredHeaders[i])) {
                            desiredIndices[i] = j;
                            break;
                        }
                    }
                    if (desiredIndices[i] == -1) {
                        throw new IllegalArgumentException("Column '" + desiredHeaders[i] + "' not found in CSV file.");
                    }
                }

                // Set table headers
                model.setColumnIdentifiers(desiredHeaders);

                // Add rows with only desired columns
                for (int i = 1; i < allData.size(); i++) {
                    String[] row = allData.get(i);
                    String[] filteredRow = new String[desiredHeaders.length];
                    for (int j = 0; j < desiredIndices.length; j++) {
                        filteredRow[j] = row[desiredIndices[j]];
                    }
                    model.addRow(filteredRow);
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "No data found in the CSV file.", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading table data.", "Error", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(AdminUserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminUserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminUserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminUserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminUserInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_Delete;
    private javax.swing.JButton jBtn_OpenEmpDetails;
    private javax.swing.JButton jBtn_ShowAddEmp;
    private javax.swing.JButton jBtn_Update;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
