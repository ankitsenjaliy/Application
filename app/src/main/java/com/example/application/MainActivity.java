package com.example.application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.application.activity.FrameLayoutActivity;
import com.example.application.activity.LinearLayoutActivity;

public class MainActivity extends AppCompatActivity {

    Button linear_layout,frame_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linear_layout = findViewById(R.id.linearlayoutbutton);
        frame_layout = findViewById(R.id.framelayoutbutton);

        linear_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ChangeActivity(new LinearLayoutActivity());
            }
        });
        frame_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ChangeActivity(new FrameLayoutActivity());
            }
        });
    }

    public void ChangeActivity(Activity activity){

        Intent intent = new Intent(this, activity.getClass());
        startActivity(intent);
    }
}