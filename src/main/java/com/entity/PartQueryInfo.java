package com.entity;

import org.springframework.stereotype.Component;

/**
 * This is a class to describe the infomation need to query status in databas;
 */
@Component
public class PartQueryInfo {
    private String task;
    private String queryPartNumber;
    private String queryStation;
    private String queryOrderNumber;



    public PartQueryInfo() {}

    public String getTask() {  return task;  }

    public void setTask(String task) { this.task = task; }

    public PartQueryInfo(String task) {  this.task = task;    }

    public String getQueryPartNumber() {
        return queryPartNumber;
    }

    public void setQueryPartNumber(String queryPartNumber) {
        this.queryPartNumber = queryPartNumber;
    }

    public String getQueryStation() {
        return queryStation;
    }

    public void setQueryStation(String queryStation) {
        this.queryStation = queryStation;
    }

    public String getQueryOrderNumber() {
        return queryOrderNumber;
    }

    public void setQueryOrderNumber(String queryOrderNumber) {
        this.queryOrderNumber = queryOrderNumber;
    }

    @Override
    public String toString() {
        return "PartQueryInfo{" +
                "task='" + task + '\'' +
                ", queryPartNumber='" + queryPartNumber + '\'' +
                ", queryStation='" + queryStation + '\'' +
                ", queryOrderNumber='" + queryOrderNumber + '\'' +
                '}';
    }
}
