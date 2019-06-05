package com.example.manu.task;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.xml.sax.helpers.DefaultHandler;

public class SharedPreference2Activity extends AppCompatActivity {

    TextView txt1, txt2;
    Button btn1, btn2;
    public static String Default = "N/A";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preference2);
        txt1 = (TextView) findViewById(R.id.txtview1);
        txt2 = (TextView) findViewById(R.id.txtview2);
        btn1 = (Button) findViewById(R.id.btn11);
        btn2 = (Button) findViewById(R.id.btn12);
    }

    public void Load(View view) {
        SharedPreferences sharedPreferences = getSharedPreferences("MyPREFERENCES", Context.MODE_PRIVATE);
//        com.example.manu.task.SharedPreferences.Editor editor = sharedPreferences.edit();
        String text1 = sharedPreferences.getString("key1", Default);
        String text2 = sharedPreferences.getString("key2", Default);
        if (text1.equals(Default) || text2.equals(Default)) {
            Toast.makeText(this, "Data Not Found", Toast.LENGTH_SHORT).show();
            txt1.setText(Default);
            txt2.setText(Default);
        } else {
            Toast.makeText(this, "Data Load Sucessfully", Toast.LENGTH_SHORT).show();
            txt1.setText(text1);
            txt2.setText(text2);
        }
    }

    public void Previous(View view) {
        Toast.makeText(this, "Previous", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(SharedPreference2Activity.this, SharedPreferenceActivity.class);
        startActivity(intent);
        SharedPreferences sharedPreferences = getSharedPreferences("MyPREFERENCES", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.commit();
    }
}