package com.example.tugas1_10118737;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

//04-06-2021 Moch Rifqi Ramdhani 10118737 IF-10
public class MainActivity extends AppCompatActivity {
    private TextView tvUsername, tvPassword;
    private String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setData();

    }


    public void setData(){
        Intent intent = getIntent();
        username = intent.getStringExtra("username");

        Toast.makeText(getApplicationContext(), "Selamat Datang " + username,
                Toast.LENGTH_LONG).show();

    }

    public void linkToProfile(View view){
        Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
        startActivity(intent);
    }
    public void linkToLogin(View view){
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}