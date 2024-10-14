/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.supplier;
import model.Supplier;
import model.SupplierDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

import model.Supplier;




/**
 *
 * @author yk385
 */
public class UpdateSupplierJPanel extends javax.swing.JPanel {
    
    private JPanel workArea;
    private SupplierDirectory supplierDirectory;
    
    private final JFileChooser fileChooser = new JFileChooser();
    ImageIcon logoImage;

    /**
     * Creates new form UpdateSupplierJPanel
     */
    public UpdateSupplierJPanel() {
        initComponents();
        if (supplierDirectory.currentSupplier.getLogoImage() != null) imgLogo.setIcon(supplierDirectory.currentSupplier.getLogoImage());
        else imgLogo.setText("No logo");
        displayDetails();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDescription = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        lblLogo = new javax.swing.JLabel();
        imgLogo = new javax.swing.JLabel();
        btnAttach = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        btnUpdateSupplier = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        lblDescription.setFont(new java.awt.Font("Kannada MN", 1, 13)); // NOI18N
        lblDescription.setForeground(new java.awt.Color(0, 51, 255));
        lblDescription.setText("Description:");

        txtDescription.setBackground(new java.awt.Color(204, 255, 204));
        txtDescription.setColumns(20);
        txtDescription.setFont(new java.awt.Font("Kannada MN", 1, 13)); // NOI18N
        txtDescription.setForeground(new java.awt.Color(102, 0, 0));
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        lblLogo.setFont(new java.awt.Font("Kannada MN", 1, 13)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(0, 51, 255));
        lblLogo.setText("Logo:");

        imgLogo.setText("<No Image>");
        imgLogo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        imgLogo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnAttach.setBackground(new java.awt.Color(204, 255, 204));
        btnAttach.setFont(new java.awt.Font("Kannada MN", 1, 13)); // NOI18N
        btnAttach.setForeground(new java.awt.Color(102, 0, 0));
        btnAttach.setText("Attach");
        btnAttach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttachActionPerformed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Kannada MN", 1, 13)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 51, 255));
        lblName.setText("Name:");

        btnRemove.setBackground(new java.awt.Color(204, 255, 204));
        btnRemove.setFont(new java.awt.Font("Kannada MN", 1, 13)); // NOI18N
        btnRemove.setForeground(new java.awt.Color(102, 0, 0));
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        txtName.setBackground(new java.awt.Color(204, 255, 204));
        txtName.setFont(new java.awt.Font("Kannada MN", 1, 13)); // NOI18N
        txtName.setForeground(new java.awt.Color(102, 0, 0));

        btnUpdateSupplier.setBackground(new java.awt.Color(204, 255, 204));
        btnUpdateSupplier.setFont(new java.awt.Font("Kannada MN", 1, 13)); // NOI18N
        btnUpdateSupplier.setForeground(new java.awt.Color(102, 0, 0));
        btnUpdateSupplier.setText("Update");
        btnUpdateSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateSupplierActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(461, Short.MAX_VALUE)
                .addComponent(btnUpdateSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(349, 349, 349))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(271, 271, 271)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblDescription)
                        .addComponent(lblName)
                        .addComponent(lblLogo))
                    .addGap(22, 22, 22)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtName)
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAttach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGap(271, 271, 271)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(493, Short.MAX_VALUE)
                .addComponent(btnUpdateSupplier)
                .addGap(84, 84, 84))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(117, 117, 117)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblName))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblDescription)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(11, 11, 11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnAttach)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnRemove))
                        .addComponent(lblLogo)
                        .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(196, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAttachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttachActionPerformed
        // TODO add your handling code here:
        int returnVal = fileChooser.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            URL url;
            try {
                url = file.toURI().toURL();
                logoImage = new ImageIcon(url);
                logoImage = new ImageIcon(logoImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
                imgLogo.setIcon(logoImage);
            } catch (MalformedURLException ex) {
                Logger.getLogger(this.getName()).log(Level.SEVERE, null, ex);
            }
            //System.out.print(file.toPath() + " opened.");
        }

    }//GEN-LAST:event_btnAttachActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        logoImage = null;
        imgLogo.setIcon(logoImage);
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnUpdateSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSupplierActionPerformed
        // TODO add your handling code here:
           SupplierDirectory.currentSupplier.setSupplyName(txtName.getText());
           SupplierDirectory.currentSupplier.setLogoImage(logoImage);
           SupplierDirectory.currentSupplier.setSupplyDesc(txtDescription.getText());
           JOptionPane.showMessageDialog(this, "Supplier successfully added");

//        Supplier supplier = supplierDirectory.addSupplier();
//        supplier.setSupplyName(txtName.getText());
//        supplier.setLogoImage(logoImage);
//
//        JOptionPane.showMessageDialog(this, "Supplier successfully added", "Warning", JOptionPane.INFORMATION_MESSAGE);
//        backAction();
    }//GEN-LAST:event_btnUpdateSupplierActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAttach;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnUpdateSupplier;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblName;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

public void displayDetails() {
        txtName.setText(supplierDirectory.currentSupplier.getSupplyName());
        txtDescription.setText(supplierDirectory.currentSupplier.getSupplyDesc());
        imgLogo.setIcon(supplierDirectory.currentSupplier.getLogoImage());
    }
}
