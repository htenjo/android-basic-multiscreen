package com.example.android.miwok.model;

/**
 * Created by htenjo on 7/28/16.
 */
public class Word {
    public static final int RESOURCE_NOT_FOUND = -1;
    private String english;
    private String miwok;
    private int iconId = RESOURCE_NOT_FOUND;
    private int soundId = RESOURCE_NOT_FOUND;

    public Word (String english, String miwok){
        this.english = english;
        this.miwok = miwok;
    }

    public Word (String english, String miwok, int iconId){
        this.english = english;
        this.miwok = miwok;
        this.iconId = iconId;
    }

    public Word (String english, String miwok, int iconId, int soundId){
        this.english = english;
        this.miwok = miwok;
        this.iconId = iconId;
        this.soundId = soundId;
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

    public int getSoundId() {
        return soundId;
    }
}
