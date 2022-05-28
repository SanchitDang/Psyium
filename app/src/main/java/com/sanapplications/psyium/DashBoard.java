package com.sanapplications.psyium;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.firebase.auth.FirebaseAuth;

public class DashBoard extends AppCompatActivity {
    ImageButton friendsButton, settingsButton;
    Button chatButton, consultButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        friendsButton=findViewById(R.id.friendsButton);
        settingsButton=findViewById(R.id.settingsButton);
        chatButton=findViewById(R.id.chatButton);
        consultButton=findViewById(R.id.consultButton);


        friendsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DashBoard.this, FriendsActivity.class);
                startActivity(intent);
            }
        });


        consultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DashBoard.this, ConsultActivity.class);
                startActivity(intent);
            }
        });


        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });


        chatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DashBoard.this, ChatActivity.class);
                startActivity(intent);
            }
        });

    }
}