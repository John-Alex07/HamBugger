package com.jora.hambugger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buzz(View view) {
        ImageView buzzButton = findViewById(R.id.buzzButton);
        buzzButton.setImageResource(R.drawable.buzz_button_pressed);


    }
}