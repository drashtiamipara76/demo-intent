package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DocterActivity extends AppCompatActivity {

    TextView doc_name_1,doc_name_2,doc_name_3,doc_name_4,doc_name_5;
    TextView doc_profile_1,doc_profile_2,doc_profile_3,doc_profile_4,doc_profile_5;
    TextView doc_add_1,doc_add_2,doc_add_3,doc_add_4,doc_add_5;
    TextView doc_amo_1,doc_amo_2,doc_amo_3,doc_amo_4,doc_amo_5;


    Button booknow_1;
    Button booknow_2;
    Button booknow_3;
    Button booknow_4;
    Button booknow_5;

    Intent intent;


    @SuppressLint({"WrongViewCast", "WrongConstant"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_docter);


        TextView doc_name_1 = findViewById(R.id.doc_name_1);
        TextView doc_name_2 = findViewById(R.id.doc_name_2);
        TextView doc_name_3 = findViewById(R.id.doc_name_3);
        TextView doc_name_4 = findViewById(R.id.doc_name_4);
        TextView doc_name_5 = findViewById(R.id.doc_name_5);

        TextView doc_profile_1=findViewById(R.id.doc_profile_1);
        TextView doc_profile_2=findViewById(R.id.doc_profile_2);
        TextView doc_profile_3=findViewById(R.id.doc_profile_3);
        TextView doc_profile_4=findViewById(R.id.doc_profile_4);
        TextView doc_profile_5=findViewById(R.id.doc_profile_5);

        TextView doc_add_1=findViewById(R.id.doc_add_1);
        TextView doc_add_2=findViewById(R.id.doc_add_2);
        TextView doc_add_3=findViewById(R.id.doc_add_3);
        TextView doc_add_4=findViewById(R.id.doc_add_4);
        TextView doc_add_5=findViewById(R.id.doc_add_5);

        TextView doc_amo_1=findViewById(R.id.doc_amo_1);
        TextView doc_amo_2=findViewById(R.id.doc_amo_2);
        TextView doc_amo_3=findViewById(R.id.doc_amo_3);
        TextView doc_amo_4=findViewById(R.id.doc_amo_4);
        TextView doc_amo_5=findViewById(R.id.doc_amo_5);

        Button booknow_1 = findViewById(R.id.booknow_1);
        Button booknow_2 = findViewById(R.id.booknow_2);
        Button booknow_3 = findViewById(R.id.booknow_3);
        Button booknow_4 = findViewById(R.id.booknow_4);
        Button booknow_5 = findViewById(R.id.booknow_5);



        booknow_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getdoc_name_1=doc_name_1.getText().toString().trim();
                String getdoc_profile_1=doc_profile_1.getText().toString().trim();
                String getdoc_add_1=doc_add_1.getText().toString().trim();
                String getdoc_amo_1=doc_amo_1.getText().toString().trim();


                Intent intent=new Intent(DocterActivity.this, Book_Doctor_Activity.class);
                intent.putExtra("doc_name_1",getdoc_name_1);
                intent.putExtra("doc_profile_1",getdoc_profile_1);
                intent.putExtra("doc_add_1",getdoc_add_1);
                intent.putExtra("doc_amo_1",getdoc_amo_1);
                startActivity(intent);


            }
        });

        booknow_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getdoc_name_2=doc_name_2.getText().toString().trim();
                String getdoc_profile_2=doc_profile_2.getText().toString().trim();
                String getdoc_add_2=doc_add_2.getText().toString().trim();
                String getdoc_amo_2=doc_amo_2.getText().toString().trim();

//                Intent intent=new Intent(DocterActivity.this, Book_Doctor_Activity.class);
//                intent.putExtra("doc_name_2",getdoc_name_2);
//                intent.putExtra("doc_profile_2",getdoc_profile_2);
//                intent.putExtra("doc_add_2",getdoc_add_2);
//                intent.putExtra("doc_amo_2",getdoc_amo_2);
//                startActivity(intent);

                Intent intent=new Intent(DocterActivity.this, Book_Doctor_Activity.class);
                intent.putExtra("doc_name_1",getdoc_name_2);
                intent.putExtra("doc_profile_1",getdoc_profile_2);
                intent.putExtra("doc_add_1",getdoc_add_2);
                intent.putExtra("doc_amo_1",getdoc_amo_2);
                startActivity(intent);



            }
        });

        booknow_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getdoc_name_3=doc_name_3.getText().toString().trim();
                String getdoc_profile_3=doc_profile_3.getText().toString().trim();
                String getdoc_add_3=doc_add_3.getText().toString().trim();
                String getdoc_amo_3=doc_amo_3.getText().toString().trim();

//                Intent intent=new Intent(DocterActivity.this, Book_Doctor_Activity.class);
//                intent.putExtra("doc_name_3",getdoc_name_3);
//                intent.putExtra("doc_profile_3",getdoc_profile_3);
//                intent.putExtra("doc_add_3",getdoc_add_3);
//                intent.putExtra("doc_amo_3",getdoc_amo_3);
//                startActivity(intent);

                Intent intent=new Intent(DocterActivity.this, Book_Doctor_Activity.class);
                intent.putExtra("doc_name_1",getdoc_name_3);
                intent.putExtra("doc_profile_1",getdoc_profile_3);
                intent.putExtra("doc_add_1",getdoc_add_3);
                intent.putExtra("doc_amo_1",getdoc_amo_3);
                startActivity(intent);



            }
        });

        booknow_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getdoc_name_4=doc_name_4.getText().toString().trim();
                String getdoc_profile_4=doc_profile_4.getText().toString().trim();
                String getdoc_add_4=doc_add_4.getText().toString().trim();
                String getdoc_amo_4=doc_amo_4.getText().toString().trim();

//                Intent intent=new Intent(DocterActivity.this, Book_Doctor_Activity.class);
//                intent.putExtra("doc_name_4",getdoc_name_4);
//                intent.putExtra("doc_profile_4",getdoc_profile_4);
//                intent.putExtra("doc_add_4",getdoc_add_4);
//                intent.putExtra("doc_amo_4",getdoc_amo_4);
//                startActivity(intent);

                Intent intent=new Intent(DocterActivity.this, Book_Doctor_Activity.class);
                intent.putExtra("doc_name_1",getdoc_name_4);
                intent.putExtra("doc_profile_1",getdoc_profile_4);
                intent.putExtra("doc_add_1",getdoc_add_4);
                intent.putExtra("doc_amo_1",getdoc_amo_4);
                startActivity(intent);




            }
        });

        booknow_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getdoc_name_5=doc_name_5.getText().toString().trim();
                String getdoc_profile_5=doc_profile_5.getText().toString().trim();
                String getdoc_add_5=doc_add_5.getText().toString().trim();
                String getdoc_amo_5=doc_amo_5.getText().toString().trim();

//                Intent intent=new Intent(DocterActivity.this, Book_Doctor_Activity.class);
//                intent.putExtra("doc_name_5",getdoc_name_5);
//                intent.putExtra("doc_profile_5",getdoc_profile_5);
//                intent.putExtra("doc_add_5",getdoc_add_5);
//                intent.putExtra("doc_amo_5",getdoc_amo_5);
//                startActivity(intent);

                Intent intent=new Intent(DocterActivity.this, Book_Doctor_Activity.class);
                intent.putExtra("doc_name_1",getdoc_name_5);
                intent.putExtra("doc_profile_1",getdoc_profile_5);
                intent.putExtra("doc_add_1",getdoc_add_5);
                intent.putExtra("doc_amo_1",getdoc_amo_5);
                startActivity(intent);





            }
        });

    }
}