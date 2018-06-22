package com.example.android.userprofile;

import android.support.v7.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView name = (TextView) findViewById(R.id.name);
        name.setText("Thirumalai_devi_ramya");

        TextView birthday = (TextView) findViewById(R.id.birthday);
        birthday.setText("1/4/1997");

        TextView school = (TextView) findViewById(R.id.school);
        school.setText("Anna_univ");
    }
}