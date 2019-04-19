package com.soft1841.sample5;
public class CPC {

    private String name;
    private String avatar;

    public CPC (String name, String avatar) {
        this.name = name;
        this.avatar = avatar;
    }

    public String getName () {
        return name;
    }
    public void setName (String name) {
        this.name = name;
    }
    public String getAvatar () {
        return avatar;
    }
    public void setAvatar (String avatar) {
        this.avatar = avatar;
    }

    public CPC () {
    }

    @Override
    public String toString () {
        return "CPC{" +
                "name='" + name + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}