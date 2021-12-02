/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carfleetmanager;

/**
 *
 * @author katta
 */
public class carDetails {
    public String available;
    public String manufacturer;
    public Integer manfYear;
    public String serialNumber;
    public String modelNumber;
    public Integer minSeats;
    public Integer maxSeats;
    public String lastUpdated;
    public String city;
    public String mcExpiryDate;

    public Integer getMinSeats() {
        return minSeats;
    }

    public void setMinSeats(Integer minSeats) {
        this.minSeats = minSeats;
    }

    public Integer getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(Integer maxSeats) {
        this.maxSeats = maxSeats;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String availabletrue) {
        this.available = availabletrue;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getManfYear() {
        return manfYear;
    }

    public void setManfYear(Integer manfYear) {
        this.manfYear = manfYear;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMcExpiryDate() {
        return mcExpiryDate;
    }

    public void setMcExpiryDate(String mcExpiryDate) {
        this.mcExpiryDate = mcExpiryDate;
    }
    
    @Override
    public String toString() {
        return "carDetails{" + "available=" + available + ", manufacturer=" + manufacturer + ", manfYear=" + manfYear + ", serialNumber=" + serialNumber + ", modelNumber=" + modelNumber + ", minSeats=" + minSeats + ", maxSeats=" + maxSeats + ", lastUpdated=" + lastUpdated + ", city=" + city + ", mcExpiryDate=" + mcExpiryDate + '}';
    }
}
