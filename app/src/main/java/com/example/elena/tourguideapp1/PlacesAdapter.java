package com.example.elena.tourguideapp1;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class PlacesAdapter extends ArrayAdapter<Place> {

    public PlacesAdapter(Activity context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Get a list item view, check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //Get the AndroidPlace  object located at this position in the list
        Place currentPlace = getItem(position);

        //Find the TextView with the id place_text_view
        TextView placeTextView = (TextView) listItemView.findViewById(R.id.place_text_view);
        //Get the version name from the current Place object and set it
        placeTextView.setText(currentPlace.getPlace());

        //Find the TextView with the id address_text_view
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);
        //Get the version name from the current Place object and set it
        addressTextView.setText(currentPlace.getAddress());

        //Find the TextView with the id image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        ///Get the version name from the current Place object and set it
        imageView.setImageResource(currentPlace.getImageResourceId());

        //Return the whole layout
        return listItemView;

    }
}
