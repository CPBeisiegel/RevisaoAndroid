package com.example.revisao.views.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Music implements Parcelable {

    private String music;
    private String album;

    public Music(String music, String album) {
        this.music = music;
        this.album = album;
    }

    protected Music(Parcel in) {
        music = in.readString();
        album = in.readString();
    }


    public Music() {
    }

    public static final Creator<Music> CREATOR = new Creator<Music>() {
        @Override
        public Music createFromParcel(Parcel in) {
            return new Music(in);
        }

        @Override
        public Music[] newArray(int size) {
            return new Music[size];
        }
    };

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(music);
        parcel.writeString(album);
    }
}
