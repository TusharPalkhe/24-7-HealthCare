package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    EditText edUsername, edPass, edEmail, edCon;
    TextView tv;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        edUsername = findViewById(R.id.username);
        edEmail = findViewById(R.id.email);
        edPass = findViewById(R.id.pass);
        edCon = findViewById(R.id.con);
        tv = findViewById(R.id.tv);
        btn = findViewById(R.id.btn);


        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this, MainActivity.class));
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = edUsername.getText().toString();
                String password = edPass.getText().toString();
                String email = edEmail.getText().toString();
                String confirm = edCon.getText().toString();
                Database db = new Database(getApplicationContext(), "helthcare", null,1);
                if (username.length() == 0 || email.length() == 0 || password.length() == 0 || confirm.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Plz Fill All Details", Toast.LENGTH_LONG).show();
                } else {
                    if (password.compareTo(confirm) == 0) {
                        if (isvalid(password)){
                            db.register(username, email, password);
                            Toast.makeText(getApplicationContext(), "Record Inserted", Toast.LENGTH_LONG).show();
                            startActivity(new Intent(MainActivity2.this, MainActivity.class));

                        }else {
                            Toast.makeText(getApplicationContext(), "Password Must have at least 8 characters, having letter, digits and symbol", Toast.LENGTH_LONG).show();

                        }

                    } else {
                        Toast.makeText(getApplicationContext(), "Password and Confrim Password Don't Match", Toast.LENGTH_LONG).show();
                    }
                }
            }

        });
    }

    public static boolean isvalid(String passwordhere) {
        int f1 = 0, f2 = 0, f3 = 0;
        if (passwordhere.length() < 8) {
            return false;
        } else {
            for (int p = 0; p < passwordhere.length(); p++) {
                if (Character.isLetter(passwordhere.charAt(p))) {
                    f1 = 1;
                }
            }
            for (int r = 0; r < passwordhere.length(); r++) {
                if (Character.isDigit(passwordhere.charAt(r))) {
                    f2 = 1;
                }
            }
            for (int s = 0; s < passwordhere.length(); s++) {
                char c = passwordhere.charAt(s);
                if (c >= 33 && c <= 46 || c == 64) {
                    f3 = 1;
                }
            }

            if (f1 == 1 && f2 == 1 && f3 == 1)
                return true;
            return false;
        }
    }
}