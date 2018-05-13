package com.example.elena.tourguideapp1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find view that shows the attractions category
        LinearLayout attractions = (LinearLayout) findViewById(R.id.attractions_id);
        //Set a clicklistener on that view
        attractions.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent attractionsIntent = new Intent(MainActivity.this, AttractionsActivity.class);
                //start the new activity
                startActivity(attractionsIntent);
            }
        });

        //Find view that shows the food category
        LinearLayout food = (LinearLayout) findViewById(R.id.food_id);
        //Set a clicklistener on that view
        food.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //create new intent to open the  Food Activity
                Intent foodIntent = new Intent(MainActivity.this, FoodActivity.class);
                //start the new activity
                startActivity(foodIntent);
            }
        });

        //Find view that shows the shops category
        LinearLayout shops = (LinearLayout) findViewById(R.id.shops_id);
        //Set a clicklistener on that view
        shops.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //create new intent to open the  link Shops Activity
                Intent shopsIntent = new Intent(MainActivity.this, ShopsActivity.class);
                //start the new activity
                startActivity(shopsIntent);
            }
        });

        //Find view that shows the events category
        LinearLayout events = (LinearLayout) findViewById(R.id.events_id);
        //Set a clicklistener on that view
       events.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //create new intent to open the  link Events Activity
                Intent eventsIntent = new Intent(MainActivity.this, EventsActivity.class);
                //start the new activity
                startActivity(eventsIntent);
            }
       });
    }
}
