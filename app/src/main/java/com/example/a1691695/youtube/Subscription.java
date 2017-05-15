package com.example.a1691695.youtube;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Subscription extends AppCompatActivity {

    public void SubClicksub (View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void SubClickshared (View v){
        Intent intent = new Intent(this, Shared.class);
        startActivity(intent);
    }

    public void SubClickcast (View v){
        Intent intent = new Intent(this, Cast.class);
        startActivity(intent);
    }

    public void SubClickaccount (View v){
        Intent intent = new Intent(this, Account.class);
        startActivity(intent);
    }

    public void SubClicktrending (View v){
        Intent intent = new Intent(this, Trending1.class);
        startActivity(intent);
    }

    public void SubClickhome (View v){
        Intent intent = new Intent(this, Subscription.class);
        startActivity(intent);
    }

    public void SubClicksearch (View v){
        Intent intent = new Intent(this, Serach.class);
        startActivity(intent);
    }

    public void SubClickplay (View v){
        Intent intent = new Intent(this, Trending.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscription);
    }

}
