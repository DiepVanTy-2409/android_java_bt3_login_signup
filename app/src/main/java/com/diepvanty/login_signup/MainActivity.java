package com.diepvanty.login_signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLogin = findViewById(R.id.btnLogin);
        TextView changeToSignup = findViewById(R.id.changeToSignup);

        btnLogin.setOnClickListener( v -> changeActivity());
        changeToSignup.setOnClickListener( v -> changeActivity());
    }

    private void changeActivity() {
        startActivity(new Intent(MainActivity.this, SignUpActivity.class));
    }
}