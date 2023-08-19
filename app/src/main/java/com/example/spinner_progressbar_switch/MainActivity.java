package com.example.spinner_progressbar_switch;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;

    Switch aSwitch;

    ProgressBar pb;
    String [] animals = {"Cat","Dog", "Bird"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.s);
        pb = findViewById(R.id.pp);
        aSwitch = findViewById(R.id.ss);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.drop_down_menu,animals);
        spinner.setAdapter(adapter);

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked)
                {
                   pb.setVisibility(View.VISIBLE);
                }
                else
                {
                    pb.setVisibility(View.GONE);
                }
            }
        });

    }
}