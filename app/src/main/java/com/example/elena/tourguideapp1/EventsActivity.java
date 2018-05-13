package com.example.elena.tourguideapp1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class EventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_for_all);


        // Find the View that shows the home category
        LinearLayout home_navbar = (LinearLayout) findViewById(R.id.home_navbar_id);

        // Set a click listener on that View
        home_navbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the MainActivity
                Intent homeIntent = new Intent(EventsActivity.this, MainActivity.class);
                // Start the new activity
                startActivity(homeIntent);
            }
        });

        //Find the view that shows the attractions category
        LinearLayout attractions_navbar = (LinearLayout) findViewById(R.id.attractions_navbar_id);

        // Set a click listener on that View
        attractions_navbar.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the songs category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the AttractionsActivity}
                Intent attractionsIntent = new Intent(EventsActivity.this, AttractionsActivity.class);
                // Start the new activity
                startActivity(attractionsIntent);
            }
        });


        // Find the View that shows the Food category
        LinearLayout food_navbar = (LinearLayout) findViewById(R.id.food_navbar_id);
        // Set a click listener on that View
        food_navbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the Food Activity}
                Intent foodIntent = new Intent(EventsActivity.this, FoodActivity.class);
                // Start the new activity
                startActivity(foodIntent);
            }
        });


        // Find the View that shows the shops category
        LinearLayout shops_navbar = (LinearLayout) findViewById(R.id.shops_navbar_id);

        // Set a click listener on that View
        shops_navbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the ShopsActivity
                Intent shopsIntent = new Intent(EventsActivity.this, ShopsActivity.class);
                // Start the new activity
                startActivity(shopsIntent);
            }
        });

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.event_ride), getString(R.string.event_ride_date), R.drawable.naked_bike_ride));
        places.add(new Place(getString(R.string.event_ladyboys), getString(R.string.event_ladyboys_date), R.drawable.ladyboys));
        places.add(new Place(getString(R.string.event_pride), getString(R.string.event_pride_date), R.drawable.pride_2));
        places.add(new Place(getString(R.string.event_colorrun), getString(R.string.event_colorrun_date), R.drawable.colorrun_2));
        places.add(new Place(getString(R.string.event_marathon), getString(R.string.event_marathon_date), R.drawable.marathon_2));

        // Create an PlaceAdapter whose data source is a list of Places.
        PlacesAdapter adapter = new PlacesAdapter(this, places);

        // Find the ListView object in the view hierarchy
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the ListView use the PlacesAdapter that is created above so that the
        //ListView will display list items for each Place in the list.
        listView.setAdapter(adapter);
    }
}
