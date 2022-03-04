package com.example.mc1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    EditText t, t1, t2, t3, t4, t5, t6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t = (EditText) findViewById(R.id.editTextTextPersonName4);
        t1 = (EditText) findViewById(R.id.editTextTextEmailAddress);
        t2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        t3 = (EditText) findViewById(R.id.editTextTextPersonName5);
        t4 = (EditText) findViewById(R.id.editTextTextPersonName6);
        t5 = (EditText) findViewById(R.id.editTextTextPersonName7);
        t6 = (EditText) findViewById(R.id.editTextTextPersonName8);

    }

    public void btn(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("Name", t.getText().toString());
        intent.putExtra("E-mail", t1.getText().toString());
        intent.putExtra("Phone_num", t2.getText().toString());
        intent.putExtra("Description", t3.getText().toString());
        intent.putExtra("Final Degree", t4.getText().toString());
        intent.putExtra("Skill", t5.getText().toString());
        intent.putExtra("Experience", t6.getText().toString());
        startActivity(intent);
    }



}