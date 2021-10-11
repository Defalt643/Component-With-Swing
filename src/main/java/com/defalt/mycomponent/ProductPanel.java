/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.defalt.mycomponent;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author ming
 */
public class ProductPanel extends javax.swing.JPanel {

    private final Product product;
    private int amount=0;

    /**
     * Creates new form ProductPanel
     */
    ProductPanel(Product product) {
        initComponents();
        this.product=product;
        setProduct(product);
    }
    private void loadImage(){
        try {
            File file = new File(this.product.getImage());
            BufferedImage image = ImageIO.read(file);
            imageButton.setIcon(new ImageIcon(image));
        } catch (IOException ex) {
            Logger.getLogger(ProductPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void setProduct(Product product1) {
        productName.setText(product1.getName());
        productPrice.setText(Double.toString(product1.getPrice()));
        productAmount.setText(Integer.toString(amount));
        loadImage();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageButton = new javax.swing.JButton();
        productAmount = new javax.swing.JTextField();
        subtractButton = new javax.swing.JButton();
        plusButton = new javax.swing.JButton();
        productName = new javax.swing.JLabel();
        productPrice = new javax.swing.JLabel();

        imageButton.setMaximumSize(new java.awt.Dimension(200, 200));
        imageButton.setMinimumSize(new java.awt.Dimension(200, 200));
        imageButton.setName(""); // NOI18N
        imageButton.setPreferredSize(new java.awt.Dimension(200, 200));
        imageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageButtonActionPerformed(evt);
            }
        });

        productAmount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        productAmount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        productAmount.setText("0");
        productAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productAmountActionPerformed(evt);
            }
        });

        subtractButton.setText("-");
        subtractButton.setMaximumSize(new java.awt.Dimension(30, 30));
        subtractButton.setMinimumSize(new java.awt.Dimension(30, 30));
        subtractButton.setPreferredSize(new java.awt.Dimension(30, 30));
        subtractButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractButtonActionPerformed(evt);
            }
        });

        plusButton.setText("+");
        plusButton.setMaximumSize(new java.awt.Dimension(30, 30));
        plusButton.setMinimumSize(new java.awt.Dimension(30, 30));
        plusButton.setPreferredSize(new java.awt.Dimension(30, 30));
        plusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusButtonActionPerformed(evt);
            }
        });

        productName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        productName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productName.setText("productName");

        productPrice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        productPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productPrice.setText("price");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(subtractButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(productAmount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(plusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imageButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(productPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productName)
                    .addComponent(productPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(productAmount, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(subtractButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(plusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void productAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productAmountActionPerformed
        
    }//GEN-LAST:event_productAmountActionPerformed

    private void subtractButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractButtonActionPerformed
        if(amount==0){
            return;
        }amount--;
        productAmount.setText(Integer.toString(amount));
    }//GEN-LAST:event_subtractButtonActionPerformed

    private void plusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusButtonActionPerformed
        amount++;
        productAmount.setText(Integer.toString(amount));
    }//GEN-LAST:event_plusButtonActionPerformed

    private void imageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageButtonActionPerformed
        System.out.println("Product Panel:"+product+"Amount: "+amount);
    }//GEN-LAST:event_imageButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton imageButton;
    private javax.swing.JButton plusButton;
    private javax.swing.JTextField productAmount;
    private javax.swing.JLabel productName;
    private javax.swing.JLabel productPrice;
    private javax.swing.JButton subtractButton;
    // End of variables declaration//GEN-END:variables
}
