package com.example.elena.tourguideapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class ShopsActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_for_all);

        // Find the View that shows the home category
        LinearLayout home_navbar = (LinearLayout) findViewById(R.id.home_navbar_id);
        // Set a click listener on that View
        home_navbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the MainActivity}
                Intent homeIntent = new Intent(ShopsActivity.this, MainActivity.class);
                // Start the new activity
                startActivity(homeIntent);
            }
        });

        //Find the View that shows the attractions category
        LinearLayout attractions_navbar = (LinearLayout) findViewById(R.id.attractions_navbar_id);
        // Set a click listener on that View
        attractions_navbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the AttractionsActivity
                Intent attractionsIntent = new Intent(ShopsActivity.this, AttractionsActivity.class);
                // Start the new activity
                startActivity(attractionsIntent);
            }
        });

        // Find the View that shows the events category
        LinearLayout events_navbar = (LinearLayout) findViewById(R.id.events_navbar_id);
        // Set a click listener on that View
        events_navbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the EventsActivity
                Intent eventsIntent = new Intent(ShopsActivity.this, EventsActivity.class);
                // Start the new activity
                startActivity(eventsIntent);
            }
        });

        // Find the View that shows the food category
        LinearLayout food_navbar = (LinearLayout) findViewById(R.id.food_navbar_id);
        // Set a click listener on that View
        food_navbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the FoodActivity
                Intent foodIntent = new Intent(ShopsActivity.this, FoodActivity.class);
                // Start the new activity
                startActivity(foodIntent);
            }
        });

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.shops_churchill), getString(R.string.shops_churchill_address), R.drawable.churchill_sqare));
        places.add(new Place(getString(R.string.shops_nlanes), getString(R.string.shops_nlanes_address), R.drawable.north_lanes));
        places.add(new Place(getString(R.string.shops_slanes), getString(R.string.shops_slanes_address), R.drawable.south_lanes));
        places.add(new Place(getString(R.string.shops_marina), getString(R.string.shops_marina_address), R.drawable.marina_shopping));

        // Create an PlaceAdapter whose data source is a list of Places.
        PlacesAdapter adapter = new PlacesAdapter(this, places);

        // Find the ListView object in the view hierarchy
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the ListView use the PlacesAdapter that is created above so that the
        //ListView will display list items for each Place in the list.
        listView.setAdapter(adapter);
    }
}