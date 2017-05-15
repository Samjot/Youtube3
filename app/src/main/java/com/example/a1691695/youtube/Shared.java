package com.example.a1691695.youtube;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Shared extends AppCompatActivity {

    public void SharedClicksubs (View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void SharedClickhome (View v){
        Intent intent = new Intent(this, Subscription.class);
        startActivity(intent);
    }

    public void SharedClickaccount (View v){
        Intent intent = new Intent(this, Account.class);
        startActivity(intent);
    }

    public void SharedClicktrending (View v){
        Intent intent = new Intent(this, Trending1.class);
        startActivity(intent);
    }

    public void SharedClickCast (View v){
        Intent intent = new Intent(this, Cast.class);
        startActivity(intent);
    }

    public void SharedClickshared (View v){
        Intent intent = new Intent(this, Shared.class);
        startActivity(intent);
    }

    public void SharedClicksearch (View v){
        Intent intent = new Intent(this, Serach.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared);
    }


}
