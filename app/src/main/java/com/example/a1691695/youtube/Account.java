package com.example.a1691695.youtube;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Account extends AppCompatActivity {

    public void accountClickhome (View v){
        Intent intent = new Intent(this, Subscription.class);
        startActivity(intent);
    }
    public void accountClickSubs (View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void accountClickshared (View v){
        Intent intent = new Intent(this, Shared.class);
        startActivity(intent);
    }

    public void accountClickTrending (View v){
        Intent intent = new Intent(this, Trending1.class);
        startActivity(intent);
    }

    public void accountClickCast (View v){
        Intent intent = new Intent(this, Cast.class);
        startActivity(intent);
    }

    public void accountClicklive (View v){
        Intent intent = new Intent(this, live.class);
        startActivity(intent);
    }

    public void accountClickserach (View v){
        Intent intent = new Intent(this, Serach.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
    }
}
