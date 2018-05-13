package com.example.elena.tourguideapp1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;


public class AttractionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_for_all);


        // Find the View that shows the home category
        LinearLayout home_navbar = (LinearLayout) findViewById(R.id.home_navbar_id);

        // Set a click listener on that View
        home_navbar.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the MainActivity}
                Intent homeIntent = new Intent(AttractionsActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(homeIntent);
            }
        });

        // Find the View that shows the events category
        LinearLayout events_navbar = (LinearLayout) findViewById(R.id.events_navbar_id);
        // Set a click listener on that Events View
        events_navbar.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the events category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the Events Activity
                Intent eventsIntent = new Intent(AttractionsActivity.this, EventsActivity.class);
                // Start the new activity
                startActivity(eventsIntent);
            }
        });

        // Find the View that shows the shops category
        LinearLayout shops_navbar = (LinearLayout) findViewById(R.id.shops_navbar_id);
        // Set a click listener on that View
        shops_navbar.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the shops category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FoodActivity}
                Intent shopsIntent = new Intent(AttractionsActivity.this, ShopsActivity.class);
                // Start the new activity
                startActivity(shopsIntent);
            }
        });

        // Find the View that shows the food category
        LinearLayout food_navbar = (LinearLayout) findViewById(R.id.food_navbar_id);
        // Set a click listener on that View
        food_navbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the FoodActivity
                Intent foodIntent = new Intent(AttractionsActivity.this, FoodActivity.class);
                // Start the new activity
                startActivity(foodIntent);
            }
        });

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.attraction_pavilion), getString(R.string.attraction_pavilion_address), R.drawable.br_pav));
        places.add(new Place(getString(R.string.attraction_pier), getString(R.string.attraction_pier_address), R.drawable.br_pier));
        places.add(new Place(getString(R.string.attraction_i360), getString(R.string.attraction_i360_address), R.drawable.br_360));
        places.add(new Place(getString(R.string.attraction_gallery_address), getString(R.string.attraction_gallery_address), R.drawable.be_art));
        places.add(new Place(getString(R.string.attraction_museum), getString(R.string.attraction_museum_address), R.drawable.toy_museum));

        // Create an Place Adapter whose data source is a list of Places.
        PlacesAdapter adapter = new PlacesAdapter(this, places);

        // Find the ListView object in the view hierarchy
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the ListView use the PlacesAdapter that is created above so that the
        //ListView will display list items for each Place in the list.
        listView.setAdapter(adapter);
    }
}