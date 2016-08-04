package com.example.android.miwok;

/**
 * Created by htenjo on 7/28/16.
 */
public class Word {
    private String english;
    private String miwok;
    private int iconId;

    public Word (String english, String miwok){
        this.english = english;
        this.miwok = miwok;
    }

    public Word (String english, String miwok, int iconId){
        this.english = english;
        this.miwok = miwok;
        this.iconId = iconId;
    }

    public String getEnglishTranslation() {
        return english;
    }

    public String getMiwokTranslation() {
        return miwok;
    }

    public int getIconId() {
        return iconId;
    }
}
