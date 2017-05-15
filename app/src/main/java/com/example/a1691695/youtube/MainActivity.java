package com.example.a1691695.youtube;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    public void HomeClickshared (View v){
        Intent intent = new Intent(this, Shared.class);
        startActivity(intent);
    }

    public void HomeClickhome (View v){
        Intent intent = new Intent(this, Subscription.class);
        startActivity(intent);
    }

    public void HomeClickcast (View v){
        Intent intent = new Intent(this, Cast.class);
        startActivity(intent);
    }

    public void HomeClicksubs (View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void HomeClickaccount (View v){
        Intent intent = new Intent(this, Account.class);
        startActivity(intent);
    }

    public void HomeClicktrending (View v){
        Intent intent = new Intent(this, Trending1.class);
        startActivity(intent);
    }

    public void HomeClickplay (View v){
        Intent intent = new Intent(this, Trending.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
    }







}
