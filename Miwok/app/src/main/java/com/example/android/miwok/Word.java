package com.example.android.miwok;

/**
 * Created by htenjo on 7/28/16.
 */
public class Word {
    private String english;
    private String miwok;

    public Word (String english, String miwok){
        this.english = english;
        this.miwok = miwok;
    }

    public String getEnglishTranslation() {
        return english;
    }

    public String getMiwokTranslation() {
        return miwok;
    }
}
