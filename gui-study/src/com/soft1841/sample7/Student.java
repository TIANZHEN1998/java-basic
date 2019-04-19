package com.soft1841.sample7;

public class Student {
    private String picture;
    private String name;
    private String gender;
    private String homeAddress;
    private String phoneNumber;
    private String studentNumber;
    private String dormRoom;

    public Student(String picture,String name, String gender, String homeAddress, String phoneNumber, String studentNumber, String dormRoom) {
        this.picture = picture;
        this.name = name;
        this.gender = gender;
        this.homeAddress = homeAddress;
        this.phoneNumber = phoneNumber;
        this.studentNumber = studentNumber;
        this.dormRoom = dormRoom;


    }

    public String getName() {
        return name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getDormRoom() {
        return dormRoom;
    }

    public void setDormRoom(String dormRoom) {
        this.dormRoom = dormRoom;

    }

    @Override
    public String toString() {
        return
                "照片"+picture+"名字："+name+"性别："+gender+"家庭住址："+homeAddress+"电话号码："
                +studentNumber+"宿舍号："+dormRoom;
    }
}

