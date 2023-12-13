package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class DoctorDetailActivity3 extends AppCompatActivity {
    private String[][] doctor_details1 =
            {
                    { "Doctor Name : Ajit Bhise", "Hospital Address : Pimpri", "MO.No. : 9545878054", "200"},
                    { "Doctor Name : Abhijit Saste", "Hospital Address : Pune", "MO.No. : 9874548754", "600"},
                    { "Doctor Name : Sumit Bhosale", "Hospital Address : Pangri", "MO.No. : 9623585993", "500"},
                    { "Doctor Name : Rohan Gavali", "Hospital Address : Pimpri", "MO.No. : 8459187793", "600"},
                    { "Doctor Name : Vijay Saste", "Hospital Address : solapur", "MO.No. : 9874254155", "300"}

            };
    private String[][] doctor_details2 =
            {
                    { "Doctor Name : Sakshi ", "Hospital Address : Pimpri", "MO.No. : 9545878054", "200"},
                    { "Doctor Name : Harshda", "Hospital Address : Pune", "MO.No. : 9874548754", "600"},
                    { "Doctor Name : Priyanka", "Hospital Address : Pangri", "MO.No. : 9623585993", "500"},
                    { "Doctor Name : Pradnya", "Hospital Address : Pimpri", "MO.No. : 8459187793", "600"},
                    { "Doctor Name : Vaishnavi", "Hospital Address : Pimpri", "MO.No. : 8459187793", "600"}


            };
    private String[][] doctor_details3 =
            {
                    { "Doctor Name :  Bhise", "Hospital Address : Pimpri", "MO.No. : 9545878054", "200"},
                    { "Doctor Name :  Saste", "Hospital Address : Pune", "MO.No. : 9874548754", "600"},
                   { "Doctor Name :   Bhosale", "Hospital Address : Pangri", "MO.No. : 9623585993", "500"},
                    { "Doctor Name :  Gavali", "Hospital Address : Pimpri", "MO.No. : 8459187793", "600"},
                    { "Doctor Name :  Saste", "Hospital Address : solapur", "MO.No. : 9874254155", "300"}

            };
    private String[][] doctor_details4 =
            {
                    { "Doctor Name : Ajit Gore", "Hospital Address : Pimpri", "MO.No. : 9545878054", "200"},
                    { "Doctor Name : Abhijit Shinde", "Hospital Address : Pune", "MO.No. : 9874548754", "600"},
                    { "Doctor Name : Sushant Wakade", "Hospital Address : Pangri", "MO.No. : 9623585993", "500"},
                    { "Doctor Name : Virat Gavali", "Hospital Address : Pimpri", "MO.No. : 8459187793", "600"},
                    { "Doctor Name : Vijay Ghule", "Hospital Address : solapur", "MO.No. : 9874254155", "300"}

            };
    private String[][] doctor_details5 =
            {
                    { "Doctor Name : Sakshi ", "Hospital Address : Pimpri", "MO.No. : 9545878054", "200"},
                    { "Doctor Name : Harshda", "Hospital Address : Pune", "MO.No. : 9874548754", "600"},
                    { "Doctor Name : Priyanka", "Hospital Address : Pangri", "MO.No. : 9623585993", "500"},
                    { "Doctor Name : Pradnya", "Hospital Address : Pimpri", "MO.No. : 8459187793", "600"}

            };
    TextView tv;
    ImageView Back;
    String[][] doctor_details = {};
    HashMap<String,String> item;
    ArrayList list;
    SimpleAdapter sa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_detail3);
        tv = findViewById(R.id.cardDDtitle);
        Intent it = getIntent() ;
        String title = it.getStringExtra("title");
        tv.setText(title);

        if (title.compareTo("Phsician")==0)
            doctor_details= doctor_details1;
        else
        if (title.compareTo("Dietation")==0)
            doctor_details= doctor_details2;
        else
        if (title.compareTo("Dentist")==0)
            doctor_details= doctor_details3;
        else
        if (title.compareTo("Surgeon")==0)
            doctor_details= doctor_details4;
        else
            doctor_details= doctor_details5;

        ImageView Back = findViewById(R.id.DDBack);
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DoctorDetailActivity3.this,FindDoctorActivity3.class));
            }
        });
        list = new ArrayList();
        for (int i=0; i<doctor_details.length;i++){
            item = new HashMap<>();
            item.put("line1", doctor_details[i][0]);
            item.put("line2", doctor_details[i][1]);
            item.put("line3", doctor_details[i][2]);
            item.put("line4", "Cons Fees: "+doctor_details[i][3]+"/-");
            list.add(item);
        }
        sa= new SimpleAdapter(this,list,
                R.layout.multi_lines,
                new String[]{"line1","line2","line3","line4"},
                new int[]{R.id.line_a,R.id.line_b,R.id.line_c,R.id.line_d}
    );
        ListView lst = findViewById(R.id.listViewDD);
        lst.setAdapter(sa);
    }
}