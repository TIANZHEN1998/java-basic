package com.soft1841.sample6;

public class Student1 {
    private String name;
    private String age;
    private  String gender;
    private  String major;

    public Student1 (String name, String age, String gender, String major) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.major = major;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getAge () {
        return age;
    }

    public void setAge (String age) {
        this.age = age;
    }

    public String getGender () {
        return gender;
    }

    public void setGender (String gender) {
        this.gender = gender;
    }

    public String getMajor () {
        return major;
    }

    public void setMajor (String major) {
        this.major = major;
    }

    @Override
    public String toString () {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}

