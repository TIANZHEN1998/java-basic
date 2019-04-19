package com.soft1841.sample6;
public class Student {
    private String name;
    private String gender;
    private String phoneNumber;
    private String homeAddress;
    private  String dormID;
    private  String picture;
    public Student(String name, String gender, String phoneNumber, String homeAddress,String dormID,String picture) {
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.homeAddress = homeAddress;
        this.dormID=dormID;
        this.picture=picture;
    }
    public Student() {
    }
    public String getName() { return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() { return gender;
    } public void setGender(String gender) {
        this.gender = gender;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    } public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getHomeAddress() {
        return homeAddress;
    }
    public void setHomeAddress(String homeAddress) {
    this.homeAddress=homeAddress;
    }
    public String getDormID() {
        return dormID;
    }
    public void setDormID(String dormID) {
        this.dormID=dormID;
    }
    public String getPicture() {
        return picture;
    }
    public void setPicture(String picture) {
        this.picture=picture;
    }
    @Override
    public String toString() {
        return
                this.name+","+this.gender+","+this.phoneNumber+","+this.homeAddress+","+this.dormID+","+this.picture;}
}