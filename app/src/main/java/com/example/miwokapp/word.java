package com.example.miwokapp;

public class word {

    private String mMiwoktrans;
    private String mDefulttrans;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED =-1;
    private int mAduio;

    public word( String Miwoktrans, String Defulttrans, int imageResourceId,int aduio){
         mMiwoktrans=Miwoktrans;
         mDefulttrans=Defulttrans;
         mAduio= aduio;
        mImageResourceId = imageResourceId;

    }
    public word( String Miwoktrans, String Defulttrans,int aduio){
        mMiwoktrans=Miwoktrans;
        mDefulttrans=Defulttrans;
        mAduio= aduio;

    }

    public String getDefulttrans(){
        return mDefulttrans;
    }
    public String getmMiwoktrans(){
        return mMiwoktrans;
    }

    public int getmImageResourceId(){
        return mImageResourceId;
    }
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getmAduio() {
        return mAduio;
    }
}
