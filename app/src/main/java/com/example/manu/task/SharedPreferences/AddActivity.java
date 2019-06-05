package com.example.manu.task.SharedPreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.manu.task.R;

public class AddActivity extends AppCompatActivity {

    TextView fn,ln,email,pn;
    Button btn_select;
    public static String Default;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        fn = (TextView)findViewById(R.id.tv_first_name);
        ln = (TextView) findViewById(R.id.tv_last_name);
        email = (TextView)findViewById(R.id.tv_email);
        pn = (TextView) findViewById(R.id.tv_phone_number);
        btn_select = (Button) findViewById(R.id.btn_select);
        btn_select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences("MyPref", Context.MODE_PRIVATE);
                String first_name = sharedPreferences.getString("key1",Default);
                String last_name = sharedPreferences.getString("key2",Default);
                String user_email = sharedPreferences.getString("key3",Default);
                String phone_number = sharedPreferences.getString("key4",Default);
                fn.setText(first_name);
                ln.setText(last_name);
                email.setText(user_email);
                pn.setText(phone_number);
            }
        });
    }
}
