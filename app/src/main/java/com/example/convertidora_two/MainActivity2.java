package com.example.convertidora_two;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.convertidora_two.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {

    ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();

        if(intent != null){
            binding.name.setText(intent.getStringExtra("name"));
            binding.lastName.setText(intent.getStringExtra("lastName"));
            binding.email.setText(intent.getStringExtra("email"));
            binding.password.setText(intent.getStringExtra("password"));
        }

        binding.btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent passFirst = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(passFirst);
            }
        });


    }
}