package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button but1,but2,but3,but4,but5,but6,but7,but8,but9,but10,but11,but12,but13,but14,but15,but16,but17,but18,but19,but20;
EditText edit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but1=findViewById(R.id.but1);
        but2=findViewById(R.id.but2);
        but3=findViewById(R.id.but3);
        but4=findViewById(R.id.but4);
        but5=findViewById(R.id.but5);
        but6=findViewById(R.id.but6);
        but7=findViewById(R.id.but7);
        but8=findViewById(R.id.but8);
        but9=findViewById(R.id.but9);
        but10=findViewById(R.id.but10);
        but11=findViewById(R.id.but11);
        but12=findViewById(R.id.but12);
        but13=findViewById(R.id.but13);
        but14=findViewById(R.id.but14);
        but15=findViewById(R.id.but15);
        but16=findViewById(R.id.but16);
        but17=findViewById(R.id.but17);
        but18=findViewById(R.id.but18);
        but19=findViewById(R.id.but19);
        but20=findViewById(R.id.but20);
        edit=findViewById(R.id.edit);
        edit.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        }
    }
);

but1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

    }
});

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });





    }
}