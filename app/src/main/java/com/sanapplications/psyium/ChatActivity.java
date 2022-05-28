package com.sanapplications.psyium;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class ChatActivity extends AppCompatActivity {
    EditText editTextTextPersonName;
    TextView textView4;
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        imageButton=findViewById(R.id.imageButton);

        editTextTextPersonName=findViewById(R.id.editTextTextPersonName);
        textView4=findViewById(R.id.textView4);


        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chat = editTextTextPersonName.getText().toString();
                textView4.setText(chat);
                editTextTextPersonName.setText("");
            }
        });

    }
}