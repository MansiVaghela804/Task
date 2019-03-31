package com.example.manu.task;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class ImageButtonDesign extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_button_design);

        RelativeLayout rel1 =(RelativeLayout)findViewById(R.id.rel1);
        rel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplication(),"Religion",Toast.LENGTH_SHORT).show();
            }
        });

        RelativeLayout rel2 =(RelativeLayout)findViewById(R.id.rel2);
        rel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplication(),"Sports",Toast.LENGTH_SHORT).show();
            }
        });

        RelativeLayout rel3 =(RelativeLayout)findViewById(R.id.rel3);
        rel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplication(),"Technology",Toast.LENGTH_SHORT).show();
            }
        });

        RelativeLayout rel4 =(RelativeLayout)findViewById(R.id.rel4);
        rel4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplication(),"Science",Toast.LENGTH_SHORT).show();
            }
        });

        RelativeLayout rel5 =(RelativeLayout)findViewById(R.id.rel5);
        rel5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplication(),"News",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
