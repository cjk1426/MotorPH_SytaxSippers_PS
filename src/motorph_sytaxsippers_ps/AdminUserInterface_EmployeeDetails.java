package motorph_sytaxsippers_ps;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Locale;
import javax.swing.JOptionPane;
import static motorph_sytaxsippers_ps.OpenCSV_HashMapSearch.preprocessCSV;
import static motorph_sytaxsippers_ps.OpenCSV_HashMapSearch.searchInDataAdmin;

public class AdminUserInterface_EmployeeDetails extends javax.swing.JFrame {

    public AdminUserInterface_EmployeeDetails(String empNumber, String empLastName, String empFirstName, String empSSS, String empPhilH, String empTIN, String empPAGIBIG) {
        initComponents();

        //empNumber, empLastName, empFirstName,empSSS,empPhilH,empTIN,empPAGIBIG
        jText_EmpNumber.setText(empNumber);
        jText_LatName.setText(empLastName);
        jText_Fname.setText(empFirstName);
        jText_SSS.setText(empSSS);
        jText_PhilHealth.setText(empPhilH);
        jText_TIN.setText(empTIN);
        jText_PAGIBIG.setText(empPAGIBIG);

    }

    private AdminUserInterface_EmployeeDetails() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        jLbl_Title = new javax.swing.JLabel();
        jLbl_EmpNo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLbl_Fname = new javax.swing.JLabel();
        jLbl_SSSnum = new javax.swing.JLabel();
        jLbl_PhilHealth = new javax.swing.JLabel();
        jLbl_TIN = new javax.swing.JLabel();
        jLbl_PagIbig = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jText_EmpNumber = new javax.swing.JTextField();
        jText_LatName = new javax.swing.JTextField();
        jText_Fname = new javax.swing.JTextField();
        jText_SSS = new javax.swing.JTextField();
        jText_PhilHealth = new javax.swing.JTextField();
        jText_TIN = new javax.swing.JTextField();
        jText_PAGIBIG = new javax.swing.JTextField();
        jCbx_Month = new javax.swing.JComboBox<>();
        jBtn_Compute = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jText_TOtalHrsWrk = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jText_HourlyRate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jText_MGI = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jText_NetInc = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jText_SSSDeduct = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jText_PhilH = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MotorPH Employee Details");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0, 160));

        jLbl_Title.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLbl_Title.setForeground(new java.awt.Color(255, 255, 255));
        jLbl_Title.setText("EMPLOYEE DETAILS INFORMATION");

        jLbl_EmpNo.setForeground(new java.awt.Color(255, 255, 255));
        jLbl_EmpNo.setText("EMPLOYEE NO:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("EMPLOYEE LAST NAME: ");

        jLbl_Fname.setForeground(new java.awt.Color(255, 255, 255));
        jLbl_Fname.setText("EMPLOYEE FIRST NAME: ");

        jLbl_SSSnum.setForeground(new java.awt.Color(255, 255, 255));
        jLbl_SSSnum.setText("SSS NUMBER:");

        jLbl_PhilHealth.setForeground(new java.awt.Color(255, 255, 255));
        jLbl_PhilHealth.setText("PHILHEALTH NUMBER:");

        jLbl_TIN.setForeground(new java.awt.Color(255, 255, 255));
        jLbl_TIN.setText("TIN NUMBER:");

        jLbl_PagIbig.setForeground(new java.awt.Color(255, 255, 255));
        jLbl_PagIbig.setText("PAGIBIG NUMBER:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SELECT MONTH");

        jText_EmpNumber.setEditable(false);

        jText_LatName.setEditable(false);

        jText_Fname.setEditable(false);

        jText_SSS.setEditable(false);

        jText_PhilHealth.setEditable(false);

        jText_TIN.setEditable(false);

        jText_PAGIBIG.setEditable(false);

        jCbx_Month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        jBtn_Compute.setText("COMPUTE");
        jBtn_Compute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_ComputeActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TOTAL HOURS WORK:");

        jText_TOtalHrsWrk.setEditable(false);
        jText_TOtalHrsWrk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_TOtalHrsWrkActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("HOURLY RATES:");

        jText_HourlyRate.setEditable(false);
        jText_HourlyRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_HourlyRateActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("MOTHLY GROSS INCOME: ");

        jText_MGI.setEditable(false);
        jText_MGI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_MGIActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NET INCOME:");

        jText_NetInc.setEditable(false);
        jText_NetInc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_NetIncActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("SSS:");

        jText_SSSDeduct.setEditable(false);
        jText_SSSDeduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_SSSDeductActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PHILHEALTH:");

        jText_PhilH.setEditable(false);
        jText_PhilH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_PhilHActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DEDUCTIONS:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLbl_SSSnum)
                                    .addComponent(jLbl_Fname)
                                    .addComponent(jLbl_PhilHealth)
                                    .addComponent(jLbl_TIN)
                                    .addComponent(jLbl_PagIbig)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(14, 14, 14))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLbl_EmpNo)
                                        .addGap(18, 18, 18)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jText_PAGIBIG, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jText_LatName, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jText_SSS, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jText_PhilHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel8))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jText_Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42)
                                                .addComponent(jLabel6))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jText_TIN, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel10))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(113, 113, 113)
                                                .addComponent(jBtn_Compute)))
                                        .addComponent(jText_EmpNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jText_HourlyRate, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jText_TOtalHrsWrk, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jText_MGI, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jText_PhilH, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jText_SSSDeduct, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jText_NetInc, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jCbx_Month, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLbl_Title))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(498, 498, 498)
                        .addComponent(jLabel9)))
                .addGap(0, 54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLbl_Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jText_TOtalHrsWrk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jText_HourlyRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jText_MGI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jText_EmpNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLbl_EmpNo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jText_LatName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jText_Fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLbl_Fname))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jText_SSS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLbl_SSSnum))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jText_PhilH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_PhilHealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbl_PhilHealth))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jText_SSSDeduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_TIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbl_TIN))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_PAGIBIG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbl_PagIbig)
                    .addComponent(jLabel7)
                    .addComponent(jText_NetInc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCbx_Month, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jBtn_Compute)
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 490));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/bg8.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

        //   JOptionPane.showMessageDialog(this,   "Plecascing.", "Selection Required", JOptionPane.WARNING_MESSAGE);

    }//GEN-LAST:event_formWindowOpened

    private void jBtn_ComputeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_ComputeActionPerformed

        String currentPath = System.getProperty("user.dir");
        String csvFile = currentPath + File.separator + "resources" + File.separator + "MotorPHEmployeeData-EmployeeDetails.csv";
        String csvAttFile = currentPath + File.separator + "resources" + File.separator + "MotorPH Employee Data-Attendance Record.csv";

        // Link CSV data to HashMap
        HashMap<String, String[]> csvData = null;
        try {
            csvData = preprocessCSV(csvFile);
        } catch (CsvValidationException ex) {
            JOptionPane.showMessageDialog(null, "Error processing CSV file.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Search for a specific username
        String idNum = jText_EmpNumber.getText();
        String[] result = searchInDataAdmin(csvData, idNum);

        if (result != null) {
            // user  found
            //   JOptionPane.showMessageDialog(null, "User found: " + String.join(", ", result), "Success", JOptionPane.INFORMATION_MESSAGE);

            //   String targetEmployeeId = jText_EmpNumber.getSelectedText();
            String targetMonth = (String) jCbx_Month.getSelectedItem();

            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("H:mm", Locale.ENGLISH);

            double totalHours = 0.0;

            try (CSVReader csvReader = new CSVReader(new FileReader(csvAttFile))) {
                // Skip the header row
                csvReader.readNext();

                String[] data;
                while ((data = csvReader.readNext()) != null) {
                    String employeeId = data[0];
                    String monthStr = data[3]; // Month is stored in string format (e.g., "June")
                    String logIn = data[4];
                    String logOut = data[5];

                    DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
                    DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("MMMM");

                    LocalDate date = LocalDate.parse(monthStr, inputFormatter);
                    String formattedMonth = date.format(outputFormatter);

                    // Filter by employee ID
                    if (!employeeId.equals(idNum)) {

                        continue;
                    }

                    //    System.out.printf( formattedMonth );
                    if (!formattedMonth.equals(targetMonth)) {

                        continue;
                    }

                    LocalTime inTime = LocalTime.parse(logIn, timeFormatter);
                    LocalTime outTime = LocalTime.parse(logOut, timeFormatter);

                    double hoursWorked = (double) java.time.Duration.between(inTime, outTime).toMinutes() / 60;
                    totalHours += hoursWorked;
                }

                // Output the result
                jText_TOtalHrsWrk.setText(String.valueOf(totalHours));
                jText_HourlyRate.setText(result[18]);

                //double HR = (double) result[18];
                double HR = Double.parseDouble(result[18]);
                double MGI = totalHours * HR;
                jText_MGI.setText(String.format("%.2f", MGI));

                

                double PHLHCONTRI = (MGI * 0.03) / 2;
                jText_PhilH.setText(String.format("%.2f", PHLHCONTRI));
                
                jText_SSSDeduct.setText("1125");
                
                double NetIncome = MGI - (PHLHCONTRI + 1125);
                

                       jText_NetInc.setText(String.format("%.2f", NetIncome));

                // System.out.printf("Total work hours for Employee ID %s in %s: %.2f hours.%n", idNum, targetMonth, totalHours);
            } catch (IOException | CsvValidationException e) {
                System.err.println("Error reading the file: " + e.getMessage());
            } catch (Exception e) {
                System.err.println("Error processing the data: " + e.getMessage());
            }

//save this=-----------------------------
            // JOptionPane.showMessageDialog(null, "Hourly Rate: " + result[18], "monthly nya to", JOptionPane.INFORMATION_MESSAGE);
//--------------------------------------------
            //monthy salary = total work houes  minus decustions =
        }
        else {
            // Username not found

            JOptionPane.showMessageDialog(null, "User not found.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }


    }//GEN-LAST:event_jBtn_ComputeActionPerformed

    private void jText_TOtalHrsWrkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_TOtalHrsWrkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_TOtalHrsWrkActionPerformed

    private void jText_HourlyRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_HourlyRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_HourlyRateActionPerformed

    private void jText_MGIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_MGIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_MGIActionPerformed

    private void jText_PhilHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_PhilHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_PhilHActionPerformed

    private void jText_SSSDeductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_SSSDeductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_SSSDeductActionPerformed

    private void jText_NetIncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_NetIncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_NetIncActionPerformed

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
            java.util.logging.Logger.getLogger(AdminUserInterface_EmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminUserInterface_EmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminUserInterface_EmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminUserInterface_EmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminUserInterface_EmployeeDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_Compute;
    private javax.swing.JComboBox<String> jCbx_Month;
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
    private javax.swing.JLabel jLbl_EmpNo;
    private javax.swing.JLabel jLbl_Fname;
    private javax.swing.JLabel jLbl_PagIbig;
    private javax.swing.JLabel jLbl_PhilHealth;
    private javax.swing.JLabel jLbl_SSSnum;
    private javax.swing.JLabel jLbl_TIN;
    private javax.swing.JLabel jLbl_Title;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jText_EmpNumber;
    private javax.swing.JTextField jText_Fname;
    private javax.swing.JTextField jText_HourlyRate;
    private javax.swing.JTextField jText_LatName;
    private javax.swing.JTextField jText_MGI;
    private javax.swing.JTextField jText_NetInc;
    private javax.swing.JTextField jText_PAGIBIG;
    private javax.swing.JTextField jText_PhilH;
    private javax.swing.JTextField jText_PhilHealth;
    private javax.swing.JTextField jText_SSS;
    private javax.swing.JTextField jText_SSSDeduct;
    private javax.swing.JTextField jText_TIN;
    private javax.swing.JTextField jText_TOtalHrsWrk;
    // End of variables declaration//GEN-END:variables
}
