package com.example.mc1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    TextView Tv, t1, t2, t3, t4;
    Button b;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Tv = (TextView) findViewById(R.id.textView);
        b = (Button) findViewById(R.id.button2);
        b1 = (Button) findViewById(R.id.button);
        t1 = (TextView) findViewById(R.id.textView2);
        t2 = (TextView) findViewById(R.id.textView21);
        t3 = (TextView) findViewById(R.id.textView22);
        t4 = (TextView) findViewById(R.id.textView23);

        Intent intent = getIntent();
        String s = intent.getStringExtra("Name");
        Tv.setText(s);
        String S = intent.getStringExtra("E-mail");
        b.setText(S);
        String st = intent.getStringExtra("Phone_num");

        String ST = intent.getStringExtra("Description");
        t1.setText(ST);
        String ss = intent.getStringExtra("Final Degree");
        t2.setText(ss);
        String tt = intent.getStringExtra("Skill");
        t3.setText(tt);
        String Ss = intent.getStringExtra("Experience");
        t4.setText(Ss);


    }
    public void mail(View view)
    {
        Intent i = getIntent();
        String S = i.getStringExtra("E-mail");
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"+S.toString()));
        intent.putExtra(Intent.EXTRA_SUBJECT," This is subject");
        intent.putExtra(Intent.EXTRA_TEXT,"Hello");
        Intent chooser=Intent.createChooser(intent,"Send message");
        startActivity(chooser);

    }


    public void call(View view) {
        Intent intent = getIntent   ();
        String S = intent.getStringExtra("Phone_num");
        Intent i = new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:" + S.toString()));
        startActivity(i);
    }



}