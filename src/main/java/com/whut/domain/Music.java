package com.whut.domain;

public class Music
{
    private String id;
    private String musicName;
    private String musicId;

    @Override
    public String toString() {
        return "Music{" +
                "id='" + id + '\'' +
                ", musicName='" + musicName + '\'' +
                ", musicId='" + musicId + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public String getMusicId() {
        return musicId;
    }

    public void setMusicId(String musicId) {
        this.musicId = musicId;
    }
}
