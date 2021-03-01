package com.example.android_1_1_hw;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView iv, ivButton;
    Uri imageUri;
    EditText etText;
    Button bReturn;

    private static final int PICK_IMAGE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        iv = findViewById(R.id.iv);
        ivButton = findViewById(R.id.ivButton);
        etText = findViewById(R.id.etText);
        bReturn = findViewById(R.id.bReturn);


        ivButton.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            openGallery();
                                        }
                                    }
        );

    }

    private void openGallery() {
        Intent gallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        startActivityForResult(gallery, PICK_IMAGE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK && requestCode == PICK_IMAGE) {
            imageUri = data.getData();
            iv.setImageURI(imageUri);
        }
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, FirstActivity.class);
        intent.putExtra("text", etText.getText().toString());
        intent.putExtra("image", 0);
        startActivity(intent);

    }
}

