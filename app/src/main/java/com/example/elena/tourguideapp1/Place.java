package com.example.elena.tourguideapp1;

/**
 * Created by Elena on 20/05/2017.
 */

public class Place {

    private String mPlace;

    private String mAddress;

    private int mImageResourceId;

    public Place(String place, String address, int imageResourceId) {
        mPlace = place;
        mAddress = address;
        mImageResourceId = imageResourceId;
    }

    public String getPlace () {
        return mPlace;
    }

    public String getAddress () {
        return mAddress;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

}
