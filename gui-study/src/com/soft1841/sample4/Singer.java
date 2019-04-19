package com.soft1841.sample4;

public class Singer {
    private String name;
    private String avatar;
    public Singer (String name, String avatar) {
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

    public Singer () {
    }
    @Override
    public String toString () {
        return "Singer{" +
                "name='" + name + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}
