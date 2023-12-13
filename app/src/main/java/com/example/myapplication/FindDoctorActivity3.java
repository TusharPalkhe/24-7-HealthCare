package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FindDoctorActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_doctor3);

        CardView exit = findViewById(R.id.BackButton);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FindDoctorActivity3.this, HomeActivity.class));

            }
        });
      /*  CardView familyphysician = findViewById(R.id.physician);
        familyphysician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindDoctorActivity3.this, DoctorDetailActivity3.class);
                it.putExtra("titile", "Physicians");
                startActivity(it);
            }
        });*/
        CardView dietician = findViewById(R.id.Doctor2);
        dietician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindDoctorActivity3.this, DoctorDetailActivity3.class);
                it.putExtra("title","Dietician");
                startActivity(it);
            }
        });
        CardView dentist = findViewById(R.id.Doctor3);
        dentist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindDoctorActivity3.this, DoctorDetailActivity3.class);
                it.putExtra("title", "Dentist");
                startActivity(it);
            }
        });
        CardView surgeon = findViewById(R.id.Doctor4);
        surgeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindDoctorActivity3.this, DoctorDetailActivity3.class);
                it.putExtra("title", "Surgeon");
                startActivity(it);
            }
        });
        CardView cardiologist = findViewById(R.id.Doctor5);
        cardiologist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindDoctorActivity3.this, DoctorDetailActivity3.class);
                it.putExtra("title", "Cardiologist");
                startActivity(it);
            }
        });
        CardView pysican = findViewById(R.id.physician);
        pysican.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(FindDoctorActivity3.this, DoctorDetailActivity3.class);
                it.putExtra("title", "Family Physician");
                startActivity(it);
            }
        });

    };

}