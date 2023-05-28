package com.example.convertidora_two;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.convertidora_two.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        //Intent
        Intent passSecond = getIntent();


        binding.name.setText("Marcos");
        binding.lastName.setText("Escobar");
        binding.email.setText("Marcos@gmail.com");
        binding.password.setText("unapasword");

        binding.btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = binding.name.getText().toString();
                String lastName = binding.lastName.getText().toString();
                String email = binding.email.getText().toString();
                String password = binding.password.getText().toString();

                Log.d("Prueba",name+email+password);
                passSecond(name,lastName,email,password);
            }
        });
    }
    private void passSecond(String name, String lastName, String email, String password){
        Intent passSecond = new Intent(MainActivity.this,MainActivity2.class);
        passSecond.putExtra("name",name);
        passSecond.putExtra("lastName",lastName);
        passSecond.putExtra("email",email);
        passSecond.putExtra("password",password);
        startActivity(passSecond);
    }
}