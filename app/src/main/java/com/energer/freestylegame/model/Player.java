package com.energer.freestylegame.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.energer.freestylegame.R;

public class Player implements Parcelable {
    private String name;
    private int img;
    private String id;
    private int score;

    public Player(String name){
        this.name=name;
        this.img= R.drawable.user;
        this.id="0";
        this.score=0;
    }

    public Player(String name, String id){
        this.name=name;
        this.id=id;
        this.img= R.drawable.user;
        this.score=0;
    }

    public Player(String name, String id,int img){
        this.name=name;
        this.id=id;
        this.img=img;
        this.score=0;
    }

    public String getName(){return this.name;}

    public int getImg() {return img;}

    public void setImg(int img) {this.img = img;}

    public void setName(String name) {this.name = name;}

    public String getId() {return id;}

    public void setId(String id) {this.id = id;}

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void increaseScore(){
        this.score+=1;
    }

    protected Player(Parcel in) {
        name = in.readString();
        img = in.readInt();
        id = in.readString();
        score=in.readInt();
    }


    public static final Creator<Player> CREATOR = new Creator<Player>() {
        @Override
        public Player createFromParcel(Parcel in) {
            return new Player(in);
        }

        @Override
        public Player[] newArray(int size) {
            return new Player[size];
        }
    };



    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeInt(img);
        parcel.writeString(id);
        parcel.writeInt(score);
    }
}
