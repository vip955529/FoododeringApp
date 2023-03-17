package com.example.foododeringapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Signin_Activity extends AppCompatActivity {
    TextView signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        getSupportActionBar().setTitle("Sign in");

        signup = findViewById(R.id.signuptxt);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Signin_Activity.this, "Please Signup here..", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Signin_Activity.this,SignUp_Activity.class);
                startActivity(intent );
            }
        });
    }
}