package com.example.android_1_1_hw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

//    public static final String EXTRA_KEY = "textKey";
//    public static final String EXTRA_KEY_IMAGE = "imgKey";

    TextView tv;
    ImageView iv;
    Uri imageUri;
    Button bGmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        tv = findViewById(R.id.tv);
        Intent intent = getIntent();
        String text = intent.getStringExtra("text");
        tv.setText(text);

        iv = findViewById(R.id.iv);
        Intent intent1 = getIntent();
        int image = intent1.getIntExtra("image", 1);
        iv.setImageURI(imageUri);
        bGmail = findViewById(R.id.bGmail);

    }


    public void onClick(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void sendMail(View view) {
        Intent gmail = new Intent(Intent.ACTION_SEND);
        gmail.setType("text/plain");
        gmail.putExtra(Intent.EXTRA_SUBJECT, "tv");
        gmail.putExtra(Intent.EXTRA_TEXT, "body of email");
        startActivity(gmail);
    }
}