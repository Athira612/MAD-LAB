package com.example.sjcet.background;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
Button b1;
LinearLayout l1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ChangeColor(View view) {
        b1=findViewById(R.id.b1);
        //l1.setBackgroundResource(R.color.green);
        l1.setBackgroundColor(Color.parseColor("#D81B60"));

    }
}
