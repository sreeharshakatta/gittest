/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import userprofile.UserProfile;

/**
 *
 * @author katta
 */


public class CreateProfileJPanel extends javax.swing.JPanel {
    
    UserProfile userProfile;
    /**
     * Creates new form CreateProfileJPanel
     */
    public CreateProfileJPanel(UserProfile userProfile) {
        initComponents();
        /* Setting the value of Textfield - To be used in validate function*/
        txtName.setName("Name");
        txtGeographicalData.setName("GeographicalData");
        txtDateOfBirth.setName("DateOfBirth");
        txtTelephoneNumber.setName("TelephoneNumber");
        txtFaxNumber.setName("FaxNumber");
        txtEmailAddress.setName("EmailAddress");
        txtSocialSecurityNumber.setName("SocialSecurityNumber");
        txtMedicalRecordNumber.setName("MedicalRecordNumber");
        txtHealthPlanNumber.setName("HealthPlanNumber");
        txtBankAccountNumber.setName("BankAccountNumber");
        txtLicenseNumber.setName("LicenseNumber");
        txtVehicleIdentificationNumber.setName("VehicleIdentificationNumber");
        txtDeviceIdentifier.setName("DeviceIdentifier");
        txtLinkedIn.setName("LinkedIn");
        txtIpAddress.setName("IpAddress");
        txtUniqueId.setName("UniqueId");
        
        this.userProfile = userProfile;
    }
    
    /*validateData() - Takes a JComponent as input - Perform validation if data received is valid*/
    public boolean validateData(JComponent input) {
        String name = input.getName();
        String errorMsg="";
        boolean raiseError = false;
        String text = ((JTextField) input).getText().trim();
        if (text == null || text.isEmpty()) {
            raiseError = true;
            errorMsg = String.format("Please enter a value. The value for %s cannot be empty", name);

        }
        else{
            switch (name) {
                case "Name":
                    if(!text.matches("^[a-zA-z]+$")){
                        raiseError = true;
                        errorMsg = String.format("Please enter valid values for %s", name);
                    }   break;
                case "TelephoneNumber":
                case "FaxNumber":
                    if(!text.matches("^[0-9]{10}")){
                        raiseError = true;
                        errorMsg = String.format("Please enter a valid %s", name);
                    }   break;
                case "SocialSecurityNumber":
                    if(!text.matches("^[0-9]{9}")){
                        raiseError = true;
                        errorMsg = String.format("Please enter a valid %s of 9 digits", name);
                    }   break;
                case "MedicalRecordNumber":
                case "HealthPlanNumber":
                case "BankAccountNumber":
                    if(!text.matches("^[0-9]+")){
                        raiseError = true;
                        errorMsg = String.format("Please enter a valid %s", name);
                    }   break;
                case "VehicleIdentificationNumber":
                    if(!text.matches("^[0-9]{17}")){
                        raiseError = true;
                        errorMsg = String.format("Please enter a valid %s", name);
                    }   break;
                case "GeographicalData":
                case "LicenseNumber":
                case "DeviceIdentifier":
                case "UniqueId":
                    if(!text.matches("^[a-zA-Z0-9]+$")){
                        raiseError = true;
                        errorMsg = String.format("Please enter a valid %s", name);
                    }   break;
                case "LinkedIn":
                    if(!text.matches(".*http://.*")){
                        raiseError = true;
                        errorMsg = String.format("Please enter a valid %s", name);
                    }   break;
                case "DateOfBirth":
                    if(!text.matches("^((0[0-9]||1[0-2])/[0-2][0-9]||3[0-1])/([0-9][0-9])?[0-9][0-9]$")){
                        raiseError = true;
                        errorMsg = String.format("Please enter a valid %s with the format MM/DD/YYYY", name);
                    }   break;
                case "IpAddress":
                    if(!text.matches("^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$")){
                        raiseError = true;
                        errorMsg = String.format("Please enter a valid %s", name);
                    }   break;
                case "EmailAddress":
                    if(!text.matches("^(.+)@(.+)$")){
                        raiseError = true;
                        errorMsg = String.format("Please enter a valid %s", name);
                    }   break;
                default:
                    break;
            }
        }
        if (raiseError){
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

        lblTitle = new javax.swing.JLabel();
        btnSaveProfile = new javax.swing.JButton();
        txtDateOfBirth = new javax.swing.JTextField();
        txtFaxNumber = new javax.swing.JTextField();
        lblMedicalRecordNumber = new javax.swing.JLabel();
        lblGeographicalData16 = new javax.swing.JLabel();
        lblGeographicalData10 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtGeographicalData = new javax.swing.JTextField();
        txtTelephoneNumber = new javax.swing.JTextField();
        lblSocialSecurityNumber = new javax.swing.JLabel();
        txtLicenseNumber = new javax.swing.JTextField();
        txtIpAddress = new javax.swing.JTextField();
        lblFaxNumber = new javax.swing.JLabel();
        lblDateOfBirth = new javax.swing.JLabel();
        txtHealthPlanNumber = new javax.swing.JTextField();
        lblDeviceIndentifier = new javax.swing.JLabel();
        lblTelephoneNumber = new javax.swing.JLabel();
        txtEmailAddress = new javax.swing.JTextField();
        txtUniqueId = new javax.swing.JTextField();
        lblUniqueId = new javax.swing.JLabel();
        txtDeviceIdentifier = new javax.swing.JTextField();
        txtVehicleIdentificationNumber = new javax.swing.JTextField();
        txtMedicalRecordNumber = new javax.swing.JTextField();
        lblLicenseNumber = new javax.swing.JLabel();
        lblGeographicalData = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        lblDeviceIdentifiationNumber = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtBankAccountNumber = new javax.swing.JTextField();
        lblBankAccountNumber = new javax.swing.JLabel();
        txtLinkedIn = new javax.swing.JTextField();
        lblLinkedIn = new javax.swing.JLabel();
        lblBiometricIdentifier = new javax.swing.JLabel();
        lblEmailAddress = new javax.swing.JLabel();
        txtSocialSecurityNumber = new javax.swing.JTextField();
        btnUploadBiometric = new javax.swing.JButton();
        btnUploadPhoto = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 800));

        lblTitle.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Profile");

        btnSaveProfile.setText("Save");
        btnSaveProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveProfileActionPerformed(evt);
            }
        });

        txtDateOfBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateOfBirthActionPerformed(evt);
            }
        });

        txtFaxNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFaxNumberActionPerformed(evt);
            }
        });

        lblMedicalRecordNumber.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        lblMedicalRecordNumber.setText("Medical Record Number:");

        lblGeographicalData16.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        lblGeographicalData16.setText("IP Address:");

        lblGeographicalData10.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        lblGeographicalData10.setText("Health Plan Number:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtGeographicalData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeographicalDataActionPerformed(evt);
            }
        });

        txtTelephoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelephoneNumberActionPerformed(evt);
            }
        });

        lblSocialSecurityNumber.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        lblSocialSecurityNumber.setText("Social Security Number:");

        txtLicenseNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLicenseNumberActionPerformed(evt);
            }
        });

        txtIpAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIpAddressActionPerformed(evt);
            }
        });

        lblFaxNumber.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        lblFaxNumber.setText("FAX Number:");

        lblDateOfBirth.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        lblDateOfBirth.setText("Date of Birth:");

        txtHealthPlanNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHealthPlanNumberActionPerformed(evt);
            }
        });

        lblDeviceIndentifier.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        lblDeviceIndentifier.setText("Device Identifier/Serial Number:");

        lblTelephoneNumber.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        lblTelephoneNumber.setText("Telephone Number:");

        txtEmailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailAddressActionPerformed(evt);
            }
        });

        txtUniqueId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUniqueIdActionPerformed(evt);
            }
        });

        lblUniqueId.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        lblUniqueId.setText("Unique ID:");

        txtDeviceIdentifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeviceIdentifierActionPerformed(evt);
            }
        });

        txtVehicleIdentificationNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVehicleIdentificationNumberActionPerformed(evt);
            }
        });

        txtMedicalRecordNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicalRecordNumberActionPerformed(evt);
            }
        });

        lblLicenseNumber.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        lblLicenseNumber.setText("Certificate/License Number:");

        lblGeographicalData.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        lblGeographicalData.setText("Geographical Data:");

        lblPhoto.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        lblPhoto.setText("Photo:");

        lblDeviceIdentifiationNumber.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        lblDeviceIdentifiationNumber.setText("Vehicle Identification Number:");

        lblName.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        lblName.setText("Name:");

        txtBankAccountNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBankAccountNumberActionPerformed(evt);
            }
        });

        lblBankAccountNumber.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        lblBankAccountNumber.setText("Bank Account Number");

        txtLinkedIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLinkedInActionPerformed(evt);
            }
        });

        lblLinkedIn.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        lblLinkedIn.setText("LinkedIn:");

        lblBiometricIdentifier.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        lblBiometricIdentifier.setText("Biometric Identifier:");

        lblEmailAddress.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        lblEmailAddress.setText("Email Address:");

        txtSocialSecurityNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSocialSecurityNumberActionPerformed(evt);
            }
        });

        btnUploadBiometric.setText("Upload");
        btnUploadBiometric.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadBiometricActionPerformed(evt);
            }
        });

        btnUploadPhoto.setText("Upload");
        btnUploadPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadPhotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(btnSaveProfile))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSocialSecurityNumber)
                                .addGap(18, 18, 18)
                                .addComponent(txtSocialSecurityNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblGeographicalData, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDateOfBirth, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTelephoneNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblFaxNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEmailAddress, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFaxNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelephoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGeographicalData, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMedicalRecordNumber)
                                .addGap(18, 18, 18)
                                .addComponent(txtMedicalRecordNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblGeographicalData10)
                                .addGap(18, 18, 18)
                                .addComponent(txtHealthPlanNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblBankAccountNumber)
                                .addGap(18, 18, 18)
                                .addComponent(txtBankAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLicenseNumber)
                                .addGap(18, 18, 18)
                                .addComponent(txtLicenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDeviceIdentifiationNumber)
                                .addGap(18, 18, 18)
                                .addComponent(txtVehicleIdentificationNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDeviceIndentifier)
                                .addGap(18, 18, 18)
                                .addComponent(txtDeviceIdentifier, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLinkedIn)
                                .addGap(18, 18, 18)
                                .addComponent(txtLinkedIn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblGeographicalData16)
                                .addGap(18, 18, 18)
                                .addComponent(txtIpAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblUniqueId)
                                .addGap(18, 18, 18)
                                .addComponent(txtUniqueId, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblBiometricIdentifier)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnUploadBiometric))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPhoto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnUploadPhoto)))
                                .addGap(79, 79, 79)))))
                .addContainerGap(398, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGeographicalData)
                    .addComponent(txtGeographicalData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDateOfBirth)
                    .addComponent(txtDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelephoneNumber)
                    .addComponent(txtTelephoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFaxNumber)
                    .addComponent(txtFaxNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailAddress)
                    .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSocialSecurityNumber)
                    .addComponent(txtSocialSecurityNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMedicalRecordNumber)
                    .addComponent(txtMedicalRecordNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGeographicalData10)
                    .addComponent(txtHealthPlanNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBankAccountNumber)
                    .addComponent(txtBankAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLicenseNumber)
                    .addComponent(txtLicenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDeviceIdentifiationNumber)
                    .addComponent(txtVehicleIdentificationNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDeviceIndentifier)
                    .addComponent(txtDeviceIdentifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLinkedIn)
                    .addComponent(txtLinkedIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGeographicalData16)
                    .addComponent(txtIpAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBiometricIdentifier)
                    .addComponent(btnUploadBiometric))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoto)
                    .addComponent(btnUploadPhoto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUniqueId)
                    .addComponent(txtUniqueId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                .addComponent(btnSaveProfile)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveProfileActionPerformed
        JTextField[] VARIABLE_CONSTANTS = {txtName,txtGeographicalData,txtDateOfBirth,txtTelephoneNumber,txtFaxNumber,txtEmailAddress,txtSocialSecurityNumber,txtMedicalRecordNumber,txtHealthPlanNumber,txtBankAccountNumber,txtLicenseNumber,txtVehicleIdentificationNumber,txtDeviceIdentifier,txtLinkedIn,txtIpAddress,txtUniqueId};
        boolean validated = false;
        for(JTextField field: VARIABLE_CONSTANTS){
            if(!validateData(field)){
                validated = false;
                break;
            }
            else{
                validated = true;
                System.out.println("Validated");
            }
        }
        if(validated){
            userProfile.setName(txtName.getText());
            userProfile.setGeographicData(txtGeographicalData.getText());
            userProfile.setDateOfBirth(txtDateOfBirth.getText());
            userProfile.setTelephoneNumber(txtTelephoneNumber.getText());
            userProfile.setFaxNumber(txtFaxNumber.getText());
            userProfile.setEmail(txtEmailAddress.getText());
            userProfile.setSocialSecNum(txtSocialSecurityNumber.getText());
            userProfile.setMedicalRecNum(txtMedicalRecordNumber.getText());
            userProfile.setHealthPlanBenfNum(txtHealthPlanNumber.getText());
            userProfile.setBankAccountNum(txtBankAccountNumber.getText());
            userProfile.setLicenseNum(txtLicenseNumber.getText());
            userProfile.setVinNum(txtVehicleIdentificationNumber.getText());
            userProfile.setDeviceId(txtDeviceIdentifier.getText());
            userProfile.setLinkedIn(txtLinkedIn.getText());
            userProfile.setIpAddr(txtIpAddress.getText());
            userProfile.setUuid(txtUniqueId.getText());
            
            
            JOptionPane.showMessageDialog(this,"Profile Created Successfully");
        }
    }//GEN-LAST:event_btnSaveProfileActionPerformed

    private void txtDateOfBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateOfBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateOfBirthActionPerformed

    private void txtFaxNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFaxNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFaxNumberActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtGeographicalDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeographicalDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeographicalDataActionPerformed

    private void txtTelephoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelephoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelephoneNumberActionPerformed

    private void txtLicenseNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLicenseNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLicenseNumberActionPerformed

    private void txtIpAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIpAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIpAddressActionPerformed

    private void txtHealthPlanNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHealthPlanNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHealthPlanNumberActionPerformed

    private void txtEmailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailAddressActionPerformed

    private void txtUniqueIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUniqueIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUniqueIdActionPerformed

    private void txtDeviceIdentifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeviceIdentifierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeviceIdentifierActionPerformed

    private void txtVehicleIdentificationNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVehicleIdentificationNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVehicleIdentificationNumberActionPerformed

    private void txtMedicalRecordNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicalRecordNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedicalRecordNumberActionPerformed

    private void txtBankAccountNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBankAccountNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBankAccountNumberActionPerformed

    private void txtLinkedInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLinkedInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLinkedInActionPerformed

    private void txtSocialSecurityNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSocialSecurityNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSocialSecurityNumberActionPerformed

    private void btnUploadBiometricActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadBiometricActionPerformed
        JFileChooser fileUploader = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "JPG & GIF Images", "jpg", "gif");
        fileUploader.setFileFilter(filter);
        fileUploader.setDialogTitle("Choose Your Biometric ID");
        fileUploader.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnval = fileUploader.showOpenDialog(this);
        if (returnval == JFileChooser.APPROVE_OPTION)
        {
            File uploadedFile = fileUploader.getSelectedFile();
            BufferedImage bufferedImageObj;
            try {
                bufferedImageObj = ImageIO.read(uploadedFile);
                ByteArrayOutputStream byteArrayOs = new ByteArrayOutputStream();
                ImageIO.write(bufferedImageObj, "jpg", byteArrayOs);
                byte[] photoBytes = byteArrayOs.toByteArray();
                userProfile.setBiometricId(photoBytes);
                JOptionPane.showMessageDialog(fileUploader, "Biometric ID Uploaded Successfully");
            } catch(IOException e) {
               e.printStackTrace();
               JOptionPane.showMessageDialog(fileUploader, "Error while uploading Biometric ID");
            }
        }
        
    }//GEN-LAST:event_btnUploadBiometricActionPerformed

    private void btnUploadPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadPhotoActionPerformed
        
        JFileChooser fileUploader = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "JPG & GIF Images", "jpg", "gif");
        fileUploader.setFileFilter(filter);
        fileUploader.setDialogTitle("Choose Your Photo");
        fileUploader.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnval = fileUploader.showOpenDialog(this);
        if (returnval == JFileChooser.APPROVE_OPTION)
        {
            File uploadedFile = fileUploader.getSelectedFile();
            BufferedImage bufferedImageObj;
            try {
                bufferedImageObj = ImageIO.read(uploadedFile);
                ByteArrayOutputStream byteArrayOs = new ByteArrayOutputStream();
                ImageIO.write(bufferedImageObj, "jpg", byteArrayOs);
                byte[] photoBytes = byteArrayOs.toByteArray();
                userProfile.setPhoto(photoBytes);
                JOptionPane.showMessageDialog(fileUploader, "Photo Uploaded Successfully");
            } catch(IOException e) {
               e.printStackTrace();
               JOptionPane.showMessageDialog(fileUploader, "Error while uploading Photo");
            }
        }
        
    }//GEN-LAST:event_btnUploadPhotoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveProfile;
    private javax.swing.JButton btnUploadBiometric;
    private javax.swing.JButton btnUploadPhoto;
    private javax.swing.JLabel lblBankAccountNumber;
    private javax.swing.JLabel lblBiometricIdentifier;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblDeviceIdentifiationNumber;
    private javax.swing.JLabel lblDeviceIndentifier;
    private javax.swing.JLabel lblEmailAddress;
    private javax.swing.JLabel lblFaxNumber;
    private javax.swing.JLabel lblGeographicalData;
    private javax.swing.JLabel lblGeographicalData10;
    private javax.swing.JLabel lblGeographicalData16;
    private javax.swing.JLabel lblLicenseNumber;
    private javax.swing.JLabel lblLinkedIn;
    private javax.swing.JLabel lblMedicalRecordNumber;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblSocialSecurityNumber;
    private javax.swing.JLabel lblTelephoneNumber;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUniqueId;
    private javax.swing.JTextField txtBankAccountNumber;
    private javax.swing.JTextField txtDateOfBirth;
    private javax.swing.JTextField txtDeviceIdentifier;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtFaxNumber;
    private javax.swing.JTextField txtGeographicalData;
    private javax.swing.JTextField txtHealthPlanNumber;
    private javax.swing.JTextField txtIpAddress;
    private javax.swing.JTextField txtLicenseNumber;
    private javax.swing.JTextField txtLinkedIn;
    private javax.swing.JTextField txtMedicalRecordNumber;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSocialSecurityNumber;
    private javax.swing.JTextField txtTelephoneNumber;
    private javax.swing.JTextField txtUniqueId;
    private javax.swing.JTextField txtVehicleIdentificationNumber;
    // End of variables declaration//GEN-END:variables
}
