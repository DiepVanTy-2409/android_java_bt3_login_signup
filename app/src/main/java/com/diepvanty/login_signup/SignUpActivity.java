package com.diepvanty.login_signup;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_activity);

        Button btnSignup = findViewById(R.id.btnSignup);
        TextView changeToLogin = findViewById(R.id.changeToLogin);

        btnSignup.setOnClickListener(v -> changeActivity());
        changeToLogin.setOnClickListener(v -> changeActivity());
    }

    private void changeActivity() {
        startActivity(new Intent(SignUpActivity.this, MainActivity.class));
    }
}