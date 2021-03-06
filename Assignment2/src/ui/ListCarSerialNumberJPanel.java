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
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author katta
 */
public class ListCarSerialNumberJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ListCarSerialNumber
     */
    public ListCarSerialNumberJPanel() {
        initComponents();
        ButtonGroup btnGrp = new ButtonGroup();
        btnGrp.add(rdbAvlblYes);
        btnGrp.add(rdbAvlblNo);
        txtManufacturer.setName("Manufacturer");
        txtModelNumber.setName("ModelNumber");
        txtMinSeats.setName("MinimumSeats");
        txtMaxSeats.setName("MaximumSeats");
        txtYearofManf.setName("YearOfManf");
        txtMcExpiryDate.setName("McExpiryDate");
        txtCity.setName("City");
    }

    /*validateData() - Takes a JComponent as input - Perform validation if data received is valid*/
    public boolean validateData(JComponent input) {
        String name = input.getName();
        String errorMsg = "";
        boolean raiseError = false;
        String text = ((JTextField) input).getText().trim();
        if (text == null || text.isEmpty()) {
            raiseError = true;
            errorMsg = String.format("Please enter a value. The value for %s cannot be empty", name);

        } else {
            switch (name) {
                case "Manufacturer":
                case "ModelNumber":
                case "City":
                    if (!text.matches("^[a-zA-Z0-9]+$")) {
                        raiseError = true;
                        errorMsg = String.format("Please enter a valid %s", name);
                    }
                    break;
                case "McExpiryDate":
                    if (!text.matches("^((0[0-9]||1[0-2])-[0-2][0-9]||3[0-1])-([0-9][0-9])?[0-9][0-9]$")) {
                        raiseError = true;
                        errorMsg = String.format("Please enter a valid %s with the format MM-DD-YYYY", name);
                    }
                    break;
                case "MinimumSeats":
                case "MaximumSeats":
                    if (!text.matches("^[0-9]+")) {
                        raiseError = true;
                        errorMsg = String.format("Please enter a valid %s", name);
                    }
                    break;
                case "YearOfManf":
                    if (!text.matches("^[0-9]{4}")) {
                        raiseError = true;
                        errorMsg = String.format("Please enter a valid %s of 4 digits", name);
                    }
                    break;
                default:
                    break;
            }
        }
        if (raiseError) {
            JOptionPane.showMessageDialog(this, errorMsg);
            return false;
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSerialNumber = new javax.swing.JLabel();
        txtSerialNumber = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        txtManufacturer = new javax.swing.JTextField();
        txtSerialNumOut = new javax.swing.JTextField();
        txtModelNumber = new javax.swing.JTextField();
        lblManufacturer = new javax.swing.JLabel();
        lbltxtSerialNumber = new javax.swing.JLabel();
        lblModelNumber = new javax.swing.JLabel();
        lblMcExpiryDate = new javax.swing.JLabel();
        lblMinSeats = new javax.swing.JLabel();
        lblMaxSeats = new javax.swing.JLabel();
        lblYearofManf = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        txtMcExpiryDate = new javax.swing.JTextField();
        txtMinSeats = new javax.swing.JTextField();
        txtMaxSeats = new javax.swing.JTextField();
        txtYearofManf = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        lblAvailable = new javax.swing.JLabel();
        rdbAvlblYes = new javax.swing.JRadioButton();
        rdbAvlblNo = new javax.swing.JRadioButton();
        btnUpdateCarData = new javax.swing.JButton();

        lblSerialNumber.setText("Serial Number:");

        txtSerialNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerialNumberActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtManufacturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManufacturerActionPerformed(evt);
            }
        });

        txtSerialNumOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerialNumOutActionPerformed(evt);
            }
        });

        lblManufacturer.setText("Manufacturer");

        lbltxtSerialNumber.setText("Serial Number");

        lblModelNumber.setText("Model Number");

        lblMcExpiryDate.setText("MC Expiry Date");

        lblMinSeats.setText("Min Seats");

        lblMaxSeats.setText("Max Seats");

        lblYearofManf.setText("Year of Manf");

        lblCity.setText("City");

        lblAvailable.setText("Available");

        rdbAvlblYes.setText("Yes");
        rdbAvlblYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbAvlblYesActionPerformed(evt);
            }
        });

        rdbAvlblNo.setText("No");

        btnUpdateCarData.setText("Update");
        btnUpdateCarData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCarDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(304, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblManufacturer, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbltxtSerialNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblModelNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMcExpiryDate, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMinSeats, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMaxSeats, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblYearofManf, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCity, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAvailable, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtSerialNumOut)
                                .addComponent(txtManufacturer, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                .addComponent(txtModelNumber)
                                .addComponent(txtMcExpiryDate)
                                .addComponent(txtMinSeats)
                                .addComponent(txtMaxSeats)
                                .addComponent(txtYearofManf, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtCity))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdbAvlblYes)
                                .addGap(18, 18, 18)
                                .addComponent(rdbAvlblNo))
                            .addComponent(btnUpdateCarData))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblSerialNumber)
                        .addGap(18, 18, 18)
                        .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch)
                        .addGap(211, 211, 211))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtManufacturer, txtModelNumber, txtSerialNumOut});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSerialNumber)
                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblManufacturer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSerialNumOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltxtSerialNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModelNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMcExpiryDate)
                    .addComponent(txtMcExpiryDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMinSeats)
                    .addComponent(txtMinSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaxSeats)
                    .addComponent(txtMaxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblYearofManf)
                    .addComponent(txtYearofManf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvailable)
                    .addComponent(rdbAvlblYes)
                    .addComponent(rdbAvlblNo))
                .addGap(46, 46, 46)
                .addComponent(btnUpdateCarData)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnSearch, lblSerialNumber, txtSerialNumber});

    }// </editor-fold>//GEN-END:initComponents

    private void txtSerialNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerialNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSerialNumberActionPerformed

    private void txtManufacturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManufacturerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtManufacturerActionPerformed

    private void txtSerialNumOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerialNumOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSerialNumOutActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String enteredValue = "";
        try {
            enteredValue = (txtSerialNumber.getText());
            if (enteredValue.isBlank() || enteredValue.isEmpty()) {
                throw new Exception("Please enter a valid value");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid value");
            ex.printStackTrace();
        }
        try {
            Gson gson = new Gson();
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\katta\\OneDrive\\Documents\\NetBeansProjects\\Assignment2\\src\\config\\carData.json"));
            List<carDetails> cars = new Gson().fromJson(bufferedReader, new TypeToken<List<carDetails>>() {
            }.getType());
            for (carDetails detail : cars) {
                String serialNumber = detail.getSerialNumber();
                if (serialNumber.equalsIgnoreCase(enteredValue)) {
                    txtManufacturer.setText(detail.getManufacturer());
                    txtModelNumber.setText(detail.getModelNumber());
                    txtSerialNumOut.setText(detail.getSerialNumber());
                    txtCity.setText(detail.getCity());
                    txtMinSeats.setText(detail.getMinSeats().toString());
                    txtMaxSeats.setText(detail.getMaxSeats().toString());
                    txtYearofManf.setText(detail.getManfYear().toString());
                    txtMcExpiryDate.setText(detail.getMcExpiryDate());
                    if ("true".equalsIgnoreCase(detail.getAvailable())) {
                        rdbAvlblYes.setSelected(true);
                    } else {
                        rdbAvlblNo.setSelected(true);
                    }
                } else {
                    ;
                }

            }
            txtSerialNumOut.setEditable(false);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void rdbAvlblYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbAvlblYesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbAvlblYesActionPerformed

    private void btnUpdateCarDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCarDataActionPerformed
        // TODO add your handling code here:
        try {
            Gson gson = new Gson();
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\katta\\OneDrive\\Documents\\NetBeansProjects\\Assignment2\\src\\config\\carData.json"));
            List<carDetails> cars = new Gson().fromJson(bufferedReader, new TypeToken<List<carDetails>>() {
            }.getType());
            JTextField[] VARIABLE_CONSTANTS = {txtManufacturer, txtModelNumber, txtMinSeats, txtMaxSeats, txtYearofManf, txtMcExpiryDate, txtCity};
            boolean validated = false;
            for (JTextField field : VARIABLE_CONSTANTS) {
                if (!validateData(field)) {
                    validated = false;
                    break;
                } else {
                    validated = true;
                    System.out.println("Validated");
                }
            }
            if (validated) {
                Writer writer = new FileWriter("C:\\Users\\katta\\OneDrive\\Documents\\NetBeansProjects\\Assignment2\\src\\config\\carData.json");
                for (carDetails detail : cars) {
                    String serialNumber = detail.getSerialNumber();
                    String inputSerialNum = txtSerialNumOut.getText();

                    if (inputSerialNum.equals(serialNumber)) {
                        detail.setManufacturer(txtManufacturer.getText());
                        detail.setModelNumber(txtModelNumber.getText());
                        detail.setManfYear(Integer.parseInt(txtYearofManf.getText()));
                        detail.setMinSeats(Integer.parseInt(txtMinSeats.getText()));
                        detail.setMaxSeats(Integer.parseInt(txtMaxSeats.getText()));
                        detail.setCity(txtCity.getText());
                        detail.setMcExpiryDate(txtMcExpiryDate.getText());
                        if ((rdbAvlblYes.isSelected())) {
                            detail.setAvailable("true");
                        } else if ((rdbAvlblYes.isSelected())) {
                            detail.setAvailable("false");
                        } else {;
                        }
                    }
                }
                gson.toJson(cars, writer);
                writer.flush();
                writer.close();
                JOptionPane.showMessageDialog(this, "Updated the Car details successfully");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnUpdateCarDataActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdateCarData;
    private javax.swing.JLabel lblAvailable;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblManufacturer;
    private javax.swing.JLabel lblMaxSeats;
    private javax.swing.JLabel lblMcExpiryDate;
    private javax.swing.JLabel lblMinSeats;
    private javax.swing.JLabel lblModelNumber;
    private javax.swing.JLabel lblSerialNumber;
    private javax.swing.JLabel lblYearofManf;
    private javax.swing.JLabel lbltxtSerialNumber;
    private javax.swing.JRadioButton rdbAvlblNo;
    private javax.swing.JRadioButton rdbAvlblYes;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtManufacturer;
    private javax.swing.JTextField txtMaxSeats;
    private javax.swing.JTextField txtMcExpiryDate;
    private javax.swing.JTextField txtMinSeats;
    private javax.swing.JTextField txtModelNumber;
    private javax.swing.JTextField txtSerialNumOut;
    private javax.swing.JTextField txtSerialNumber;
    private javax.swing.JTextField txtYearofManf;
    // End of variables declaration//GEN-END:variables
}
