package com.example.ecomx;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button signin, register;
    EditText email_id, pass_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signin = findViewById(R.id.sign_in);
        register = findViewById(R.id.register);
        email_id = findViewById(R.id.email_id);
        pass_id = findViewById(R.id.pass_id);

        signin.setOnClickListener(view -> {
            String email = email_id.getText().toString().trim();
            String pass = pass_id.getText().toString().trim();

            if (email.equals("admin") && pass.equals("admin")) {
                Log.d("login", "Login successful");
                Toast.makeText(MainActivity.this, "Login successful", Toast.LENGTH_SHORT).show();

                //Intent intent = new Intent(MainActivity.this, homepage.class); // Use your actual home activity
                //startActivity(intent);
            } else {
                Log.e("login", "Login unsuccessful");
                Toast.makeText(MainActivity.this, "Login unsuccessful", Toast.LENGTH_SHORT).show();
            }
        });

        // Optionally handle register click
        register.setOnClickListener(view -> {
            Toast.makeText(this, "Register clicked", Toast.LENGTH_SHORT).show();
        });
    }
}
