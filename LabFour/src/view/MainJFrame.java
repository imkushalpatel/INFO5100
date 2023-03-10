/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import data.User;
import data.UserDirectory;
import java.awt.CardLayout;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author imkus
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    final static String ADDPANEL = "ADD";
    final static String DETAILPANEL = "DETAIL";
    final static String LISTPANEL = "LIST";
    CardLayout cardLayout;
    DetailsPanel detailsPanel;
    AddPanel addPanel;
    UserDirectory userDirectory;
    DefaultTableModel tableModel;
    TableRowSorter<DefaultTableModel> rowSorter;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("LLLL d, yyyy");
    
    public MainJFrame() {
        
        initComponents();
        userDirectory = new UserDirectory();
        cardLayout = (CardLayout) mainPanel.getLayout();
        tableModel = (DefaultTableModel) userListTable.getModel();
        rowSorter = new TableRowSorter<>(tableModel);
        userListTable.setRowSorter(rowSorter);
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        listPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        tableScrollPane = new javax.swing.JScrollPane();
        userListTable = new javax.swing.JTable();
        addUserButton = new javax.swing.JButton();
        viewUserButton = new javax.swing.JButton();
        editUserButton = new javax.swing.JButton();
        deleteUserButton = new javax.swing.JButton();
        filterField = new javax.swing.JTextField();
        filterLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setLayout(new java.awt.CardLayout());

        listPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                listPanelComponentShown(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        titleLabel.setText("Employee List");

        userListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Name", "Email", "Phone", "Gender", "DOB"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userListTable.getTableHeader().setReorderingAllowed(false);
        tableScrollPane.setViewportView(userListTable);

        addUserButton.setText("Add Employee");
        addUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserButtonActionPerformed(evt);
            }
        });

        viewUserButton.setText("View Employee");
        viewUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewUserButtonActionPerformed(evt);
            }
        });

        editUserButton.setText("Edit Employee");
        editUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUserButtonActionPerformed(evt);
            }
        });

        deleteUserButton.setText("Delete Employee");
        deleteUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserButtonActionPerformed(evt);
            }
        });

        filterField.setToolTipText("");
        filterField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filterFieldKeyReleased(evt);
            }
        });

        filterLabel.setText("Filter:");

        javax.swing.GroupLayout listPanelLayout = new javax.swing.GroupLayout(listPanel);
        listPanel.setLayout(listPanelLayout);
        listPanelLayout.setHorizontalGroup(
            listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listPanelLayout.createSequentialGroup()
                .addGroup(listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listPanelLayout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(titleLabel))
                    .addGroup(listPanelLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(filterLabel)
                            .addComponent(filterField))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        listPanelLayout.setVerticalGroup(
            listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addGroup(listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listPanelLayout.createSequentialGroup()
                        .addComponent(addUserButton)
                        .addGap(18, 18, 18)
                        .addComponent(editUserButton)
                        .addGap(18, 18, 18)
                        .addComponent(viewUserButton)
                        .addGap(18, 18, 18)
                        .addComponent(deleteUserButton)
                        .addGap(18, 18, 18)
                        .addComponent(filterLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filterField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        mainPanel.add(listPanel, "LIST");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserButtonActionPerformed
        // TODO add your handling code here:
        addPanel = new AddPanel(mainPanel, userDirectory, null);
        mainPanel.add(addPanel, ADDPANEL);
        cardLayout.show(mainPanel, ADDPANEL);
    }//GEN-LAST:event_addUserButtonActionPerformed

    private void deleteUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserButtonActionPerformed
        // TODO add your handling code here:
        if (checkSelection()) {
            return;
        }
        userDirectory.removeUser((String) tableModel.getValueAt(userListTable.getSelectedRow(), 0));
        JOptionPane.showMessageDialog(this,
                "User deleted successfully",
                "Success",
                JOptionPane.INFORMATION_MESSAGE);
        populateTable();
    }//GEN-LAST:event_deleteUserButtonActionPerformed

    private void viewUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewUserButtonActionPerformed
        // TODO add your handling code here
        if (checkSelection()) {
            return;
        }
        User user = userDirectory.getUser((String) tableModel.getValueAt(userListTable.getSelectedRow(), 0));
        detailsPanel = new DetailsPanel(mainPanel, user);
        mainPanel.add(detailsPanel, DETAILPANEL);
        cardLayout.show(mainPanel, DETAILPANEL);
    }//GEN-LAST:event_viewUserButtonActionPerformed

    private void listPanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_listPanelComponentShown
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_listPanelComponentShown

    private void editUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUserButtonActionPerformed
        // TODO add your handling code here:
        if (checkSelection()) {
            return;
        }
        addPanel = new AddPanel(mainPanel, userDirectory, (String) tableModel.getValueAt(userListTable.getSelectedRow(), 0));
        mainPanel.add(addPanel, ADDPANEL);
        cardLayout.show(mainPanel, ADDPANEL);
    }//GEN-LAST:event_editUserButtonActionPerformed

    private void filterFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filterFieldKeyReleased
        // TODO add your handling code here:
        rowSorter.setRowFilter(RowFilter.regexFilter(filterField.getText().toLowerCase()));
    }//GEN-LAST:event_filterFieldKeyReleased

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    
    private void populateTable() {
        tableModel.setRowCount(0);
        userDirectory.getAllUser().forEach((u) -> tableModel.addRow(new Object[]{
            u.getEmployeeId(),
            u.getFirstName() + " " + u.getLastName(),
            u.getEmail(),
            u.getPhone(),
            u.getGender(),
            u.getBirthDate().format(formatter)
        }));
    }
    
    private boolean checkSelection() {
        
        if (tableModel.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Please add employee first", "No Employee Avilable", JOptionPane.WARNING_MESSAGE);
            return true;
        } else if (userListTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Please select employee from table", "No Employee Slected", JOptionPane.WARNING_MESSAGE);
            return true;
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUserButton;
    private javax.swing.JButton deleteUserButton;
    private javax.swing.JButton editUserButton;
    private javax.swing.JTextField filterField;
    private javax.swing.JLabel filterLabel;
    private javax.swing.JPanel listPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTable userListTable;
    private javax.swing.JButton viewUserButton;
    // End of variables declaration//GEN-END:variables
}
