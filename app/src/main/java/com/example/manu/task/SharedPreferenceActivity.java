package com.example.manu.task;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SharedPreferenceActivity extends AppCompatActivity {

    Button btn1, btn2;
    EditText edt1, edt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preference);

        edt1 = (EditText) findViewById(R.id.edt1);
        edt2 = (EditText) findViewById(R.id.edt2);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);

    }

    public void Save(View view) {
        SharedPreferences sharedPreferences = getSharedPreferences("MyPREFERENCES", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("key1", edt1.getText().toString());
        editor.putString("key2", edt2.getText().toString());
        editor.commit();
        Toast.makeText(this, "Data Was Saved", Toast.LENGTH_SHORT).show();
    }

    public void Next(View view) {
        Intent intent = new Intent(SharedPreferenceActivity.this, SharedPreference2Activity.class);
        startActivity(intent);
        Toast.makeText(this, "Next", Toast.LENGTH_SHORT).show();
        ;
    }
}

