package com.entity;

/**
 * This is a class to describe the infomation need to save into databas;
 */
public class PartSaveInfo {
    private Boolean result;
    private String partNumber;
    private String station;

    public PartSaveInfo() {}

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    @Override
    public String toString() {
        return "PartSaveInfo{" +
                "result=" + result +
                ", partNumber='" + partNumber + '\'' +
                ", station='" + station + '\'' +
                '}';
    }
}
