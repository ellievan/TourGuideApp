package com.example.elena.tourguideapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity {

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
                Intent homeIntent = new Intent(FoodActivity.this, MainActivity.class);
                // Start the new activity
                startActivity(homeIntent);
            }
        });


        // Find the View that shows the attractions category
        LinearLayout attractions_navbar = (LinearLayout) findViewById(R.id.attractions_navbar_id);
        // Set a click listener on that View
        attractions_navbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the Attractions Activity}
                Intent attractionsIntent = new Intent(FoodActivity.this, AttractionsActivity.class);
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
                // Create a new intent to open the EventsActivity}
                Intent eventsIntent = new Intent(FoodActivity.this, EventsActivity.class);
                // Start the new activity
                startActivity(eventsIntent);
            }
        });

        // Find the View that shows the shops category
        LinearLayout shops_navbar = (LinearLayout) findViewById(R.id.shops_navbar_id);
        // Set a click listener on that View
        shops_navbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the ShopsActivity}
                Intent shopsIntent = new Intent(FoodActivity.this, ShopsActivity.class);

                // Start the new activity
                startActivity(shopsIntent);
            }
        });

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.food_forfriends), getString(R.string.food_forfriends_address), R.drawable.food_for_friends));
        places.add(new Place(getString(R.string.food_lachoza), getString(R.string.food_lachoza_address), R.drawable.la_choza));
        places.add(new Place(getString(R.string.food_terre), getString(R.string.food_terre_address), R.drawable.terraterre));
        places.add(new Place(getString(R.string.food_cabaret), getString(R.string.food_cabaret_address), R.drawable.proud_cabaret));
        places.add(new Place(getString(R.string.food_lion), getString(R.string.food_lion_address), R.drawable.lion_and_libster));

        // Create an PlaceAdapter} whose data source is a list of Places.
        PlacesAdapter adapter = new PlacesAdapter(this, places);

        // Find the ListView object in the view hierarchy
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the ListView use the PlacesAdapter that is created above so that the
        //ListView will display list items for each Place in the list.
        listView.setAdapter(adapter);
    }
}