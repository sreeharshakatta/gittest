/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;
import java.util.zip.DataFormatException;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Community;
import model.Patient;
import model.VitalSigns;

/**
 *
 * @author katta
 */
public class AddPatientDataJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddPatientDataJPanel
     */
    public AddPatientDataJPanel() {
        initComponents();
        txtPatientId.setName("PatientId");
        txtPatientName.setName("PatientName");
        txtDob.setName("Dob");
        txtCommunityId.setName("CommunityId");
        txthouseId.setName("HouseId");
        txtCity.setName("City");
        txtCommunityName.setName("CommunityName");
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
                case "PatientName":
                case "HouseId":
                case "City":
                case "CommunityName":
                    if (!text.matches("^[a-zA-Z0-9]+$")) {
                        raiseError = true;
                        errorMsg = String.format("Please enter a valid %s", name);
                    }
                    break;
                case "Dob":
                    if (!text.matches("^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$")) {
                        raiseError = true;
                        errorMsg = String.format("Please enter a valid %s with the format DD/MM/YYYY", name);
                    }
                    break;
                case "PatientId":
                case "CommunityId":
                    if (!text.matches("^[0-9]+")) {
                        raiseError = true;
                        errorMsg = String.format("Please enter a valid %s", name);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        txtDob = new javax.swing.JTextField();
        txtCommunityId = new javax.swing.JTextField();
        txtCommunityName = new javax.swing.JTextField();
        txthouseId = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        btnSavePatient = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Add Patient Data");

        jLabel2.setText("Patient ID");

        txtPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdActionPerformed(evt);
            }
        });

        jLabel3.setText("Patient Name");

        jLabel4.setText("Date of Birth");

        jLabel5.setText("Community ID");

        jLabel6.setText("Community Name");

        jLabel7.setText("House ID");

        jLabel8.setText("City");

        txtCommunityId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommunityIdActionPerformed(evt);
            }
        });

        btnSavePatient.setText("Save");
        btnSavePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePatientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCommunityId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txthouseId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(btnSavePatient)))
                .addContainerGap(187, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCity, txtCommunityId, txtCommunityName, txtDob, txtPatientId, txtPatientName, txthouseId});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCommunityId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txthouseId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSavePatient)
                .addContainerGap(264, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, txtCity, txtCommunityId, txtCommunityName, txtDob, txtPatientId, txtPatientName, txthouseId});

    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void txtCommunityIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommunityIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommunityIdActionPerformed

    private void btnSavePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePatientActionPerformed
        // TODO add your handling code here:
        VitalSigns vs;
        Patient p;
        boolean patientExists;
        Community comm;

        int age=0;
        p = new Patient();
        ArrayList<VitalSigns> existedArray = new ArrayList<VitalSigns>();
        Map<Patient, ArrayList<VitalSigns>> map = Patient.getEncounterHistory();
        patientExists = false;
        for (Patient patient : map.keySet()) {
            if (Integer.parseInt(txtPatientId.getText()) == patient.getPatientId()) {
                patientExists = true;
                existedArray = map.get(patient);
                p = patient;
            }
        }
        JTextField[] VARIABLE_CONSTANTS = {txtPatientId,txtPatientName,txtDob,txtCommunityId,txtCommunityName,txthouseId,txtCity};
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
        if (!patientExists) {
            if (validated){
            comm = new Community();
            comm.setCommunityId(Integer.parseInt(txtCommunityId.getText()));
            comm.setCity(txtCity.getText());
            comm.setCommunityName(txtCommunityName.getText());
            comm.setHouseId(txthouseId.getText());
            String dob = txtDob.getText();
            try {
                Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
                LocalDate ld = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                Period period = Period.between(ld, LocalDate.now());
                System.out.println(period.getYears());
                age = period.getYears();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(btnSavePatient, "Enter date in the requried format");
            }
            p.setAge(age);
            p.setDob(dob);
            p.setPatientId(Integer.parseInt(txtPatientId.getText()));
            p.setPatientName(txtPatientName.getText());
            p.setCommunity(comm);
            map.put(p, existedArray);
            JOptionPane.showMessageDialog(btnSavePatient, "Added details successfully");}
        } else {
            JOptionPane.showMessageDialog(btnSavePatient, "Patient already exists");
        }
    }//GEN-LAST:event_btnSavePatientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSavePatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCommunityId;
    private javax.swing.JTextField txtCommunityName;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txthouseId;
    // End of variables declaration//GEN-END:variables
}
