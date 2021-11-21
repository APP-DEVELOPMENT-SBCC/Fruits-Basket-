package com.example.s.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.s.MainActivity;
import com.example.s.R;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void Login(View view) {
        startActivity(new Intent(RegistrationActivity.this, LoginActivity.class));
    }

    public void mainActivity(View view) {
        startActivity(new Intent(RegistrationActivity.this, MainActivity.class));
    }
}