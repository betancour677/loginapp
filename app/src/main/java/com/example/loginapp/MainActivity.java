package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.loginapp.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName = binding.editTextFirstName.getText().toString();
                String lastName = binding.editTextLastName.getText().toString();
                String email = binding.editTextEmail.getText().toString();
                String password = binding.editTextPassword.getText().toString();

                if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || password.isEmpty()) {
                    // Al menos un campo está vacío, mostramos el Toast de aviso
                    Toast.makeText(MainActivity.this, "Complete todos los campos", Toast.LENGTH_SHORT).show();
                } else {
                    // Todos los campos están completos, mostramos un saludo
                    String greeting = "Hola, " + firstName + " " + lastName + "!";
                    Toast.makeText(MainActivity.this, greeting, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}


