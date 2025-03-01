/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Xyjor
 */
public class Transaction extends javax.swing.JFrame {

    DefaultTableModel cartModel;

    /**
     * Creates new form Transaction
     */
    public Transaction(ArrayList<String> productList) {
        initComponents();
        for (String product : productList) {
        jComboBoxProducts.addItem(product);
        
    }
    }
    

    public void setSelectedProduct(String productName, int price) {
        jComboBoxProducts.removeAllItems(); // Clear existing items
        jComboBoxProducts.addItem(productName + " - " + price);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldQuantity = new javax.swing.JTextField();
        jRadioButtonCash = new javax.swing.JRadioButton();
        jRadioButtonCard = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCart = new javax.swing.JTable();
        jButtonAddToCart = new javax.swing.JButton();
        jButtonCalculateTotal = new javax.swing.JButton();
        jButtonReturnToStore = new javax.swing.JButton();
        jComboBoxProducts = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnClearCart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldQuantity.setText("0");
        jTextFieldQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantityActionPerformed(evt);
            }
        });

        jRadioButtonCash.setText("Cash");

        jRadioButtonCard.setText("Card");

        jTableCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Price", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableCart);

        jButtonAddToCart.setText("Add to Cart");
        jButtonAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddToCartActionPerformed(evt);
            }
        });

        jButtonCalculateTotal.setText("Calculate Total");
        jButtonCalculateTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalculateTotalActionPerformed(evt);
            }
        });

        jButtonReturnToStore.setText("Return to Front Store");
        jButtonReturnToStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReturnToStoreActionPerformed(evt);
            }
        });

        jLabel1.setText("Quantity");

        btnClearCart.setText("Clear the Cart");
        btnClearCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearCartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAddToCart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClearCart))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCalculateTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonCash)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCard))
                    .addComponent(jButtonReturnToStore))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBoxProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAddToCart)
                            .addComponent(btnClearCart))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonCalculateTotal)
                            .addComponent(jRadioButtonCash)
                            .addComponent(jRadioButtonCard))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonReturnToStore)))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddToCartActionPerformed
        String selectedProduct = (String) jComboBoxProducts.getSelectedItem();
        int quantity = Integer.parseInt(jTextFieldQuantity.getText());

        // Extract product name and price from the ComboBox
        String[] productDetails = selectedProduct.split(" - ");
        String productName = productDetails[0];
        int price = Integer.parseInt(productDetails[1]);

        // Calculate subtotal
        int subtotal = quantity * price;

        // Add to cart table
        cartModel.addRow(new Object[]{productName, quantity, price, subtotal});
    }//GEN-LAST:event_jButtonAddToCartActionPerformed

    private void jButtonCalculateTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalculateTotalActionPerformed
        int total = 0;

        if (cartModel.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Cart is empty. Please add items first.");
            return;
        }

        try {
            for (int i = 0; i < cartModel.getRowCount(); i++) {
                if (cartModel.getColumnCount() > 3) {
                    int subtotal = Integer.parseInt(cartModel.getValueAt(i, 3).toString());
                    total += subtotal;
                } else {
                    JOptionPane.showMessageDialog(this, "Error: Cart data is incomplete.");
                    return;
                }
            }

            // Manually format total price with currency symbol
            String Total = "₱" + String.format("%,.2f", (double) total);

            JOptionPane.showMessageDialog(this, "Total Amount: " + Total);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error calculating total: " + e.getMessage());
        }
    }//GEN-LAST:event_jButtonCalculateTotalActionPerformed

    private void jButtonReturnToStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReturnToStoreActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonReturnToStoreActionPerformed

    private void jTextFieldQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQuantityActionPerformed

    private void btnClearCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearCartActionPerformed
        if (cartModel.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Cart is already empty.");
            return;
        }

        // Confirm before clearing
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to clear the cart?",
                "Clear Cart", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            cartModel.setRowCount(0); // Remove all rows from table
            JOptionPane.showMessageDialog(this, "Cart has been cleared.");
        }
    }//GEN-LAST:event_btnClearCartActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClearCart;
    private javax.swing.JButton jButtonAddToCart;
    private javax.swing.JButton jButtonCalculateTotal;
    private javax.swing.JButton jButtonReturnToStore;
    private javax.swing.JComboBox<String> jComboBoxProducts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButtonCard;
    private javax.swing.JRadioButton jRadioButtonCash;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCart;
    private javax.swing.JTextField jTextFieldQuantity;
    // End of variables declaration//GEN-END:variables
}
