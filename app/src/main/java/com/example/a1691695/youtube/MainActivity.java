package com.example.a1691695.youtube;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
    }

    public void SubClick (View v){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void SharedClick (View v){
        Intent intent = new Intent(this,Shared.class);
        startActivity(intent);
    }

    public void HomeClick (View v){
        Intent intent = new Intent(this,Subscription.class);
        startActivity(intent);
    }


}
