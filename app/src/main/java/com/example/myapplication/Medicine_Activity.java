package com.example.myapplication;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Medicine_Activity extends AppCompatActivity {
    TextView medi_name_1,medi_name_2,medi_name_3,medi_name_4,medi_name_5,medi_name_6;
    TextView medi_amo_1,medi_amo_2,medi_amo_3,medi_amo_4,medi_amo_5,medi_amo_6;
    Button addnow_1;
    Button addnow_2;
    Button addnow_3;
    Button addnow_4;
    Button addnow_5;
    Button addnow_6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine);

        TextView medi_name_1= findViewById(R.id.medi_name_1);
        TextView medi_name_2 = findViewById(R.id.medi_name_2);
        TextView medi_name_3 = findViewById(R.id.medi_name_3);
        TextView medi_name_4 = findViewById(R.id.medi_name_4);
        TextView medi_name_5 = findViewById(R.id.medi_name_5);
        TextView medi_name_6 = findViewById(R.id.medi_name_6);

        TextView medi_amo_1 = findViewById(R.id.medi_amo_1);
        TextView medi_amo_2 = findViewById(R.id.medi_amo_2);
        TextView medi_amo_3 = findViewById(R.id.medi_amo_3);
        TextView medi_amo_4 = findViewById(R.id.medi_amo_4);
        TextView medi_amo_5 = findViewById(R.id.medi_amo_5);
        TextView medi_amo_6 = findViewById(R.id.medi_amo_6);


        Button addnow_1 = findViewById(R.id.addnow_1);
        Button addnow_2 = findViewById(R.id.addnow_2);
        Button addnow_3 = findViewById(R.id.addnow_3);
        Button addnow_4 = findViewById(R.id.addnow_4);
        Button addnow_5 = findViewById(R.id.addnow_5);
        Button addnow_6 = findViewById(R.id.addnow_6);


        addnow_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getmedi_name_1=medi_name_1.getText().toString().trim();
                String getmedi_amo_1=medi_amo_1.getText().toString().trim();

                Intent intent=new Intent(Medicine_Activity.this,Book_Medicine_Activity.class);
                intent.putExtra("medi_name_1",getmedi_name_1);
                intent.putExtra("medi_amo_1",getmedi_amo_1);
                startActivity(intent);


            }
        });

        addnow_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getmedi_name_2=medi_name_2.getText().toString().trim();
                String getmedi_amo_2=medi_amo_2.getText().toString().trim();

                Intent intent=new Intent(Medicine_Activity.this,Book_Medicine_Activity.class);
                intent.putExtra("medi_name_1",getmedi_name_2);
                intent.putExtra("medi_amo_1",getmedi_amo_2);
                startActivity(intent);

            }
        });

        addnow_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getmedi_name_3=medi_name_3.getText().toString().trim();
                String getmedi_amo_3=medi_amo_3.getText().toString().trim();

                Intent intent=new Intent(Medicine_Activity.this,Book_Medicine_Activity.class);
                intent.putExtra("medi_name_1",getmedi_name_3);
                intent.putExtra("medi_amo_1",getmedi_amo_3);
                startActivity(intent);

            }
        });

        addnow_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getmedi_name_4=medi_name_4.getText().toString().trim();
                String getmedi_amo_4=medi_amo_4.getText().toString().trim();

                Intent intent=new Intent(Medicine_Activity.this,Book_Medicine_Activity.class);
                intent.putExtra("medi_name_1",getmedi_name_4);
                intent.putExtra("medi_amo_1",getmedi_amo_4);
                startActivity(intent);

            }
        });

        addnow_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getmedi_name_5=medi_name_5.getText().toString().trim();
                String getmedi_amo_5=medi_amo_5.getText().toString().trim();

                Intent intent=new Intent(Medicine_Activity.this,Book_Medicine_Activity.class);
                intent.putExtra("medi_name_1",getmedi_name_5);
                intent.putExtra("medi_amo_1",getmedi_amo_5);
                startActivity(intent);

            }
        });

        addnow_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getmedi_name_6=medi_name_6.getText().toString().trim();
                String getmedi_amo_6=medi_amo_6.getText().toString().trim();

                Intent intent=new Intent(Medicine_Activity.this,Book_Medicine_Activity.class);
                intent.putExtra("medi_name_1",getmedi_name_6);
                intent.putExtra("medi_amo_1",getmedi_amo_6);
                startActivity(intent);

            }
        });







    }


}
