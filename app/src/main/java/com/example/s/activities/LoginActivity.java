package com.example.s.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.s.MainActivity;
import com.example.s.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void Register(View view) {
        startActivity(new Intent(LoginActivity.this, RegistrationActivity.class));
    }

    public void mainActivity(View view) {
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
    }
}