/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import carfleetmanager.carDetails;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author katta
 */
public class ListCarsModelNumberJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ListCarsModelNumberJPanel
     */
    public ListCarsModelNumberJPanel() {
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

        lblModelNumberSearch = new javax.swing.JLabel();
        txtModelNumberSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListCarModelNumber = new javax.swing.JTable();

        lblModelNumberSearch.setText("Model Number:");

        txtModelNumberSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelNumberSearchActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jTableListCarModelNumber.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Serial Num", "Manufacturer", "Model Num", "Year of Manf", "Min Seats", "Max Seats"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableListCarModelNumber);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblModelNumberSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtModelNumberSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch)
                        .addGap(218, 218, 218))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnSearch, lblModelNumberSearch});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelNumberSearch)
                    .addComponent(txtModelNumberSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtModelNumberSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelNumberSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelNumberSearchActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String enteredValue = "";
        try {
            enteredValue = (txtModelNumberSearch.getText());
            if (enteredValue.isBlank() || enteredValue.isEmpty()) {
                throw new Exception("Please enter a valid value");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid value");
            ex.printStackTrace();
        }
        String[] columns = {"Serial Num", "Manufacturer", "Model Num", "Year of Manf", "Min Seats", "Max Seats"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        try {
            Gson gson = new Gson();
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\katta\\OneDrive\\Documents\\NetBeansProjects\\Assignment2\\src\\config\\carData.json"));
            List<carDetails> cars = new Gson().fromJson(bufferedReader, new TypeToken<List<carDetails>>() {
            }.getType());
            for (carDetails detail : cars) {
                String modelNumber = detail.getModelNumber();
                if (modelNumber.equalsIgnoreCase(enteredValue)) {
                    Vector<String> row = new Vector<String>();
                    row.add(detail.getSerialNumber());
                    row.add(detail.getManufacturer());
                    row.add(detail.getModelNumber());
                    row.add(detail.getManfYear().toString());
                    row.add(detail.getMinSeats().toString());
                    row.add(detail.getMaxSeats().toString());
                    model.addRow(row);
                } else {
                    ;
                }

            }
            jTableListCarModelNumber.setModel(model);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListCarModelNumber;
    private javax.swing.JLabel lblModelNumberSearch;
    private javax.swing.JTextField txtModelNumberSearch;
    // End of variables declaration//GEN-END:variables
}