package com.example.application.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.application.R;

public class LinearLayoutActivity extends AppCompatActivity {

    Button common_button,text_button,buttons_button,widgets_button,cardview_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linearlayout);

        common_button = findViewById(R.id.common);
        text_button = findViewById(R.id.text);
        buttons_button = findViewById(R.id.buttons);
        widgets_button = findViewById(R.id.widgets);
        cardview_button = findViewById(R.id.cardview);

        common_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ChangeActivity(new CommonActivity());
            }
        });

        text_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ChangeActivity(new TextActivity());
            }
        });

        buttons_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ChangeActivity(new ButtonsActivity());
            }
        });

        widgets_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ChangeActivity(new WidgetsActivity());
            }
        });

        cardview_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ChangeActivity(new CardViewActivity());
            }
        });
    }

    public void ChangeActivity(Activity activity){

        Intent intent = new Intent(this, activity.getClass());
        startActivity(intent);
    }
}