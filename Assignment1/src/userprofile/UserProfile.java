/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userprofile;

/**
 *
 * @author katta
 */
public class UserProfile {
    
    private String name;
    private String geographicData;
    private String dateOfBirth;
    private String telephoneNumber;
    private String faxNumber;
    private String email;
    private String socialSecNum;
    private String medicalRecNum;
    private String healthPlanBenfNum;
    private String bankAccountNum;
    private String licenseNum;
    private String vinNum;
    private String deviceId;
    private String linkedIn;
    private String ipAddr;
    private byte[] photo;
    private byte[] biometricId;

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public byte[] getBiometricId() {
        return biometricId;
    }

    public void setBiometricId(byte[] biometricId) {
        this.biometricId = biometricId;
    }
    

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSocialSecNum() {
        return socialSecNum;
    }

    public void setSocialSecNum(String socialSecNum) {
        this.socialSecNum = socialSecNum;
    }

    public String getMedicalRecNum() {
        return medicalRecNum;
    }

    public void setMedicalRecNum(String medicalRecNum) {
        this.medicalRecNum = medicalRecNum;
    }

    public String getHealthPlanBenfNum() {
        return healthPlanBenfNum;
    }

    public void setHealthPlanBenfNum(String healthPlanBenfNum) {
        this.healthPlanBenfNum = healthPlanBenfNum;
    }

    public String getBankAccountNum() {
        return bankAccountNum;
    }

    public void setBankAccountNum(String bankAccountNum) {
        this.bankAccountNum = bankAccountNum;
    }

    public String getLicenseNum() {
        return licenseNum;
    }

    public void setLicenseNum(String licenseNum) {
        this.licenseNum = licenseNum;
    }

    public String getVinNum() {
        return vinNum;
    }

    public void setVinNum(String vinNum) {
        this.vinNum = vinNum;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
//    private String biometricId;
//    private String photo;
    private String uuid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGeographicData() {
        return geographicData;
    }

    public void setGeographicData(String geographicData) {
        this.geographicData = geographicData;
    }
    
}
