package com.example.imagepro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Learn extends AppCompatActivity {

    TextView youtube ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        youtube = findViewById(R.id.youtube);

        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                gottoUrl("https://youtu.be/cGavOVNDj1s?si=bfww_YiIXDBcpNkR");

            }

            private void gottoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });


    }
}