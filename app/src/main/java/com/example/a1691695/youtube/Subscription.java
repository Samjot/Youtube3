package com.example.a1691695.youtube;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Subscription extends AppCompatActivity {

    public void SubClick (View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void SubClick1 (View v){
        Intent intent = new Intent(this, Shared.class);
        startActivity(intent);
    }

    public void SubClick2 (View v){
        Intent intent = new Intent(this, Cast.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscription);
    }

}
