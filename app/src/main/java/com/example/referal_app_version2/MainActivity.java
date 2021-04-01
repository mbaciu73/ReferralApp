package com.example.referal_app_version2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatabaseManager myDm;
    Button btnLogin,btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);


        myDm = new DatabaseManager(this);
        myDm.open();

        btnLogin = (Button)findViewById(R.id.log_in);
        btnLogin.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent LoginIntent = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(LoginIntent);
            }
        });

        btnRegister = (Button)findViewById(R.id.register);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent RegisterIntent = new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(RegisterIntent);
            }
        });
  }



}