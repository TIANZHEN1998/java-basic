package com.soft1841.sample4;
public class Song {
    private String songName;
    private String singer;
    private String songUrl;
    private String logo;
    private String time;

    public Song(String songName, String singer, String songUrl, String logo, String time) {
        this.songName = songName;
        this.singer = singer;
        this.songUrl = songUrl;
        this.logo = logo;
        this.time = time;
    }
    public Song() {
    }
    public String getSongName() {
        return songName;
    }
    public void setSongName(String songName) {
        this.songName = songName;
    }
    public String getSinger() {
        return singer;
    }
    public void setSinger(String singer) {
        this.singer = singer;
    }
    public String getSongUrl() {
        return songUrl;
    }
    public void setSongUrl(String songUrl) {
        this.songUrl = songUrl;
    }
    public String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    @Override
    public String toString() {
        return "Song{" +
                "songName='" + songName+'\''
                +
                ", singer='" + singer + '\'' +
                ", songUrl='" + songUrl + '\'' +
                ", logo='" + logo + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
