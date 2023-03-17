package com.example.foododeringapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class SignUp_Activity extends AppCompatActivity {
    TextView signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Sign up");

        signin = findViewById(R.id.logintxt);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SignUp_Activity.this, " Please Signin here..", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SignUp_Activity.this,Signin_Activity.class);
                startActivity(intent );
            }
        });
    }
}