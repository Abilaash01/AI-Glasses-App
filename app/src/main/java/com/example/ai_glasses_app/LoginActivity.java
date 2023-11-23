package com.example.ai_glasses_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText editUser, editPass;

    Button loginbtn, createbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editUser = findViewById(R.id.username);
        editPass = findViewById(R.id.password);
        loginbtn = findViewById(R.id.loginbtn);
        createbtn = findViewById(R.id.registerbtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editUser.getText().toString().equals("admin") && editPass.getText().toString().equals("admin123")) {
                    //correct
                    Toast.makeText(LoginActivity.this, "LOGIN SUCCESS", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    //wrong
                    Toast.makeText(LoginActivity.this, "LOGIN FAILED", Toast.LENGTH_SHORT).show();
                }
            }
        });

        createbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}