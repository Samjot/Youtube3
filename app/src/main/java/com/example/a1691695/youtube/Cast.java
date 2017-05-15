package com.example.a1691695.youtube;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Cast extends AppCompatActivity {

    public void CastClickback (View v){
        Intent intent = new Intent(this, Subscription.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cast);
    }
}
