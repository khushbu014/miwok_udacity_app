package com.example.android.miwok;

/**
 * Created by khushbu on 7/12/17.
 */

public class Word {

    private String miwokTranslation;
    private String defaultTranslation;
    private int resourseId=HAS_NO_IMAGE;
    private static final int HAS_NO_IMAGE=-1;


    Word(String miwokTranslation , String defaultTranslation ,  int resourseId)
    {
        this.miwokTranslation= miwokTranslation;
        this.defaultTranslation= defaultTranslation;
        this.resourseId= resourseId;
    }

    Word(String miwokTranslation , String defaultTranslation) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public int getResourseId(){
        return resourseId;
    }

    public boolean hasImage(){
        if(resourseId==HAS_NO_IMAGE)
            return false;
        else return true;
    }
}
