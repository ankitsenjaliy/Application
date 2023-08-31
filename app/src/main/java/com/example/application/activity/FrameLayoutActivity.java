package com.example.application.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.application.R;

public class FrameLayoutActivity extends AppCompatActivity {

    Button frame_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_framelayout);

        frame_layout = findViewById(R.id.framelayoutbutton);

        frame_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(FrameLayoutActivity.this, "WEL COME", Toast.LENGTH_SHORT).show();
            }
        });

    }
}