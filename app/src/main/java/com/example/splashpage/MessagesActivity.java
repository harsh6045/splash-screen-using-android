package com.example.splashpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MessagesActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);
        textView = findViewById(R.id.textView);
        handleIntent(getIntent());
    }

    @Override
    protected void onNewIntent(Intent intent){
        super.onNewIntent(intent);
        handleIntent(intent);
    }
    private void handleIntent(Intent intent){
        if(intent != null){
            String message =  intent.getStringExtra("message");
            if(message != null){
                // Opened from a notification, display the message
                textView.setText(message);
            } else {
                // Opened directly, set a default message or leave it empty
                textView.setText("No message to display");
            }
        }
    }

}