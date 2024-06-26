/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package java2107;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lim Ee Chian
 */
public class StaffManagePage extends javax.swing.JFrame {

    public StaffManagePage() {
        initComponents();
        
        // Set the location of the JFrame form to be centered on the screen
        setLocationRelativeTo(null);
        
        loadStaffData();

        // set the table's cell editor to null - disable the cell editing functionality / non-editable - for double click usage
        tbManageStaffs.setDefaultEditor(Object.class, null);   
        
        // Disable the Save button before clicking Edit button once
        btnSave.setEnabled(false);  
        
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbManageStaffs = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfUserID = new javax.swing.JTextField();
        tfUsername = new javax.swing.JTextField();
        tfPassword = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        setTitle("Serenity Sands Retreat Hotel Room Booking System");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Serenity Sands Retreat");

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hotel Room Booking System ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(284, 284, 284))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Mongolian Baiti", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Manage Staffs");

        tbManageStaffs.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbManageStaffs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbManageStaffs.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbManageStaffs.setRowHeight(25);
        tbManageStaffs.setSelectionBackground(new java.awt.Color(153, 0, 0));
        tbManageStaffs.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tbManageStaffs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbManageStaffsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbManageStaffs);

        jLabel4.setFont(new java.awt.Font("Mongolian Baiti", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("User ID");

        jLabel5.setFont(new java.awt.Font("Mongolian Baiti", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("Username");

        jLabel6.setFont(new java.awt.Font("Mongolian Baiti", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("Password");

        tfUserID.setEditable(false);

        btnEdit.setBackground(new java.awt.Color(153, 0, 0));
        btnEdit.setFont(new java.awt.Font("Mongolian Baiti", 1, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(153, 0, 0));
        btnDelete.setFont(new java.awt.Font("Mongolian Baiti", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(153, 0, 0));
        btnAdd.setFont(new java.awt.Font("Mongolian Baiti", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(153, 0, 0));
        btnSave.setFont(new java.awt.Font("Mongolian Baiti", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfUserID, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                        .addComponent(tfUsername)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfPassword))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(307, 307, 307))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // Delete button
   
        int rowToDelete = tbManageStaffs.getSelectedRow();  // Row number to delete
        int modelDeleteRow = tbManageStaffs.convertRowIndexToModel(rowToDelete);  // Convert to model index
        if (modelDeleteRow != -1) {  // Check if a row is selected
            DefaultTableModel model = (DefaultTableModel) tbManageStaffs.getModel();
            model.removeRow(modelDeleteRow);
        
            String filePath = "staffInfo.txt";  // Path to the text file                   
        
            try {
                File inputFile = new File(filePath);

                // Read the contents of the original file
                BufferedReader br = new BufferedReader(new FileReader(inputFile));
                List<String> lines = new ArrayList<>();
                String currentLine;

                while ((currentLine = br.readLine()) != null) {
                    lines.add(currentLine);
                }
                br.close();
            
            
                // Delete the specific row
                if (modelDeleteRow >= 0 && modelDeleteRow <= lines.size()) {
                   lines.remove(modelDeleteRow);
                } else {
                   System.out.println("Invalid row number.");
                   return;
                }

                // Write the modified data back to the original file
                BufferedWriter bw = new BufferedWriter(new FileWriter(inputFile));

                for (String line : lines) {
                    bw.write(line);
                    bw.newLine();
                }
                bw.close();

                System.out.println("Row Deleted successfully");
                
                // Clear the text fields
                tfUserID.setText("");
                tfUsername.setText("");
                tfPassword.setText("");

            } catch (IOException e) {
            System.out.println("IOException occured during delete: " + e.getMessage());
            }            
        } else {
            // Display an error message indicating that no row is selected
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // Add button
        
        DefaultTableModel model = (DefaultTableModel) tbManageStaffs.getModel();
        
        String userID = tfUserID.getText();
        String username = tfUsername.getText();
        String password = tfPassword.getText();

        // Check if fields are filled
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill up all fields.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Check if the tfUserID text field is empty
            if (userID.isEmpty()) {
            
                // Generate the Staff ID for the new staff record
                String staffID = generateStaffID();
        
                // Set the generated Staff ID in the tfUserID text field
                tfUserID.setText(staffID);
                userID = staffID;  // Update the userID variable with the generated ID
            } else {
                // Clear the tfUserID text field when editing a staff record
                tfUserID.setText("");
            }
        
            // All fields are filled, proceed with adding the staff
            model.addRow(new Object[]{userID, username, password});
            String [] dataRow = {userID, username, password};

            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter("staffInfo.txt", true));
                String rowData = String.join(":", dataRow);
                bw.write(rowData);
                bw.newLine();
                bw.close();

                JOptionPane.showMessageDialog(rootPane, "Add data successfully!");

                // Clear the text fields
                tfUserID.setText("");
                tfUsername.setText("");
                tfPassword.setText("");
            } catch (IOException e) {
                System.out.println("IOException occured during add: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // Edit button

        int selectedRow = tbManageStaffs.getSelectedRow();
        int modelRow = tbManageStaffs.convertRowIndexToModel(selectedRow);
        
        if (modelRow != -1) {
            // Get the modified values from the text fields
            String userID = tfUserID.getText();
            String username = tfUsername.getText();
            String password = tfPassword.getText();
            
            // Update the data in the selected row of the table model
            DefaultTableModel model = (DefaultTableModel) tbManageStaffs.getModel();
            model.setValueAt(userID, modelRow, 0);
            model.setValueAt(username, modelRow, 1);
            model.setValueAt(password, modelRow, 2);    
            btnSave.setEnabled(true);  // Enable the Save button after clicking Edit button once
        } else {
            // Display an error message indicating that no row is selected
            JOptionPane.showMessageDialog(this, "Please select a row to edit.");
        }      
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // Save button
       
        // Check if fields are filled
        if (tfUserID.getText().isEmpty() || tfUsername.getText().isEmpty() || tfPassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill up all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;  // Stop execution if fields are empty
        }
        
        int selectedRow = tbManageStaffs.getSelectedRow();
        int modelRow = tbManageStaffs.convertRowIndexToModel(selectedRow);
        
        if (modelRow != -1) {  // Check if a row is selected             
            // Get the updated data from the text fields
            String userID = tfUserID.getText();
            String username = tfUsername.getText();
            String password = tfPassword.getText();

            // Read the contents of the file and modify the specific line
            String filePath = "staffInfo.txt";
            File inputFile = new File(filePath);
            List<String> lines = new ArrayList<>();
            boolean modified = false;  // Flag to track if the data is modified
            
            try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
                String currentLine;
                while ((currentLine = br.readLine()) != null) {
                    String[] rowInFile = currentLine.split(":");
                    if (rowInFile.length != tbManageStaffs.getColumnCount()) {
                        // Skip the line if it doesn't have the correct number of elements
                        continue;
                    }
                    
                    String existingStaffID = rowInFile[0].trim();
                    if (existingStaffID.equals(userID)) {
                        // Modify the data for matching staffID
                        String[] rowModifyData = {userID, username, password};
                        String rowMData = String.join(":",rowModifyData);
                        lines.add(rowMData);
                        modified = true;
                    } else {
                        lines.add(currentLine);
                    }
                }
            } catch (IOException e) {
                    System.out.println("Error reading file: " + e.getMessage());
            }

            // Write the modified contents back to the staffInfo.txt file if data is modified
            if (modified) {
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(inputFile))) {  // Open the file in write mode
                    for (String line : lines) {
                        bw.write(line);
                        bw.newLine();
                    }
                    JOptionPane.showMessageDialog(this, "Data saved successfully!");  
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(this, "Error saving data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "No matching staff found with the given User ID.", "Error", JOptionPane.ERROR_MESSAGE);
            }    
            
            // Clear the tbManageStaffs table          
            DefaultTableModel model = (DefaultTableModel) tbManageStaffs.getModel();
            model.setRowCount(0);           
         
            // Read the data from the file and populate the tbManageStaffs table
            try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] rowInFile = line.split(":");
                    model.addRow(rowInFile);                            
                }                
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error saving data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

            // Clear the text fields
            tfUserID.setText("");
            tfUsername.setText("");
            tfPassword.setText("");
            }     

    }//GEN-LAST:event_btnSaveActionPerformed

    private void tbManageStaffsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbManageStaffsMouseClicked
        // Select staff by clicking the selected row
        
        if (evt.getClickCount() == 2) {
            int selectedRow = tbManageStaffs.getSelectedRow();
            int modelRow = tbManageStaffs.convertRowIndexToModel(selectedRow);
            
            if (modelRow != -1) {
                // Edit and set the modified values into the table fields - get the values from the selected row and display the values in the text fields
                tfUserID.setText(tbManageStaffs.getModel().getValueAt(modelRow, 0).toString());
                tfUsername.setText(tbManageStaffs.getModel().getValueAt(modelRow, 1).toString());
                tfPassword.setText(tbManageStaffs.getModel().getValueAt(modelRow, 2).toString());
            }
        }
    }//GEN-LAST:event_tbManageStaffsMouseClicked

     
    // Method to load and display the staff data
    private void loadStaffData() {
        DefaultTableModel model = (DefaultTableModel) tbManageStaffs.getModel();
        try {
            FileReader fr = new FileReader("staffInfo.txt");
            BufferedReader br = new BufferedReader(fr);                     
            String line;
            
            while ((line = br.readLine()) != null) {
                String[] col = line.split(":");
                if (col.length >= 3) {
                    String userID = col[0].trim();
                    String userName = col[1].trim();
                    String password = col[2].trim();
                    
                    // Create a new row and add the data to the tbManageStaffs table
                    Object[] rowData = {userID, userName, password};
                    model.addRow(rowData);                   
                } else {
                    System.out.println("Invalid line: " + line);
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println("IOException occured during loading staff data: " + e.getMessage());
        }
    }
    
    // Method to generate the next Staff ID
    private String generateStaffID() {
        
        // Read the current Staff ID number from staffID.txt
        try (BufferedReader br = new BufferedReader(new FileReader("staffID.txt"))) {
            String currentID = br.readLine();
            int nextID = Integer.parseInt(currentID) + 1;  // Increment the current Staff ID number

            // Write the updated Staff ID number back to the staffID.txt file
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("staffID.txt"))) {
                bw.write(String.valueOf(nextID));
            }
            
            // Format the Staff ID with leading zeros (e.g., S001, S002)
            String newID = String.format("%03d", nextID);
            
            // Generate the new Staff ID
            String staffID = "S" + newID;
            
            return staffID;
         
        } catch (IOException e) {
            System.out.println("IOException occured during generating Staff ID: " + e.getMessage());  // Handle file reading error
        }       
        return null;
    }
    
    
    
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
            java.util.logging.Logger.getLogger(StaffManagePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffManagePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffManagePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffManagePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffManagePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbManageStaffs;
    private javax.swing.JTextField tfPassword;
    private javax.swing.JTextField tfUserID;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
