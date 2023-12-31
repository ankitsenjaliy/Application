package com.example.application.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.provider.Settings;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Toast;
import android.widget.VideoView;

import com.example.application.R;

import java.util.Timer;

public class WidgetsActivity extends AppCompatActivity {

    WebView web_view;
    VideoView video_view;

    ProgressBar progress_bar1;
    Button progress_button_1;
    int CurrentProgress = 0;

    SeekBar seek_bar;

    RatingBar rating_bar;
    Button rating_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widgets);

        web_view = findViewById(R.id.webview);
        web_view.loadUrl("data:image/jpeg;base64,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");
        web_view.getSettings().setJavaScriptEnabled(true);
        web_view.setWebViewClient(new WebViewClient());

        video_view = findViewById(R.id.videoview);
        video_view.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.a);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(video_view);
        video_view.setMediaController(mediaController);


        progress_bar1 = findViewById(R.id.progressbar1);
        progress_button_1 = findViewById(R.id.progressbutton1);

        CountDownTimer countDownTimer = new CountDownTimer(11*1000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {

                CurrentProgress = CurrentProgress + 10;
                progress_bar1.setProgress(CurrentProgress);
                progress_bar1.setMax(100);
            }
            @Override
            public void onFinish() {
            }
        };
        progress_button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                countDownTimer.start();
            }
        });

        seek_bar = findViewById(R.id.seekbar);

        seek_bar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                Toast.makeText(WidgetsActivity.this, "A", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        rating_bar = findViewById(R.id.ratingbar);
        rating_button = findViewById(R.id.ratingButton);

        rating_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                String rating = String.valueOf(rating_bar.getRating());
                Toast.makeText(getApplicationContext(), rating, Toast.LENGTH_LONG).show();

            }
        });




    }
}



