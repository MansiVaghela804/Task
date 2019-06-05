package com.example.manu.task.SharedPreferences;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.manu.task.R;

public class SharedpreferencesActivity extends AppCompatActivity {

    EditText F_N,L_N,EMAIL,P_N;
    Button btn_add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sharedpreferences);
        F_N = (EditText)findViewById(R.id.et_first_name);
        L_N = (EditText)findViewById(R.id.et_last_name);
        EMAIL = (EditText)findViewById(R.id.et_email);
        P_N = (EditText)findViewById(R.id.et_phone_number);
        btn_add = (Button) findViewById(R.id.btn_add);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences("MyPref", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("key1",F_N.getText().toString());
                editor.putString("key2",L_N.getText().toString());
                editor.putString("key3",EMAIL.getText().toString());
                editor.putString("key4",P_N.getText().toString());
                editor.commit();
                Intent intent = new Intent(SharedpreferencesActivity.this,AddActivity.class);
                startActivity(intent);
                Toast.makeText(SharedpreferencesActivity.this, "Data Was Saved", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
