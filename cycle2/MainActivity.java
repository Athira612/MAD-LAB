package com.example.sjcet.firstactivitymove;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
    }
    public void click(View view) {
        Opennewactivity();
    }
    public void Opennewactivity()
    {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}

