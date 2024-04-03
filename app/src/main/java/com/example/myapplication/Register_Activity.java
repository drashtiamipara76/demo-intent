package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Register_Activity extends AppCompatActivity {

    SQLiteDatabase database;
    EditText id_name;
    EditText id_email;
    EditText id_passward;
    EditText id_re_password;
    Button btnsingup;
    String Str_name;
    String Str_email;
    String Str_passward;
    String Str_re_password;

    String Str_btnsingup;

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        database = openOrCreateDatabase("healthcare.db",SQLiteDatabase.CREATE_IF_NECESSARY,null);
        database.execSQL("create table if not exists Signup(name text,email text,passward text,re_password)");

        id_name = findViewById(R.id.id_name);
        id_email = findViewById(R.id.id_email);
        id_passward = findViewById(R.id.id_passward);
        id_re_password = findViewById(R.id.id_re_password);

        btnsingup = findViewById(R.id.btnsingup);
        btnsingup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Login_Activity.class);

                startActivity(intent);
            }
        });



        btnsingup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Str_name = id_name.getText().toString().trim();
                Str_email = id_email.getText().toString().trim();
                Str_passward = id_passward.getText().toString().trim();
                Str_re_password = id_re_password.getText().toString().trim();




                if(Str_name.equals("")){
                    id_name.setError("Enter Name");
                }else if(Str_email.equals("")){
                      id_email.setError("Enter Email");
                }else if(Str_passward.equals("")){
                       id_passward.setError("Enter Passward");
                }else if(Str_re_password.equals("")){
                        id_re_password.setError("Enter Re Password");
                }else {
                    database.execSQL("insert into Signup(name,email,passward,re_password) values('" + Str_name + "','" + Str_email + "','" + Str_passward + "','" + Str_re_password+ "')");
                    Toast.makeText(Register_Activity.this, "Register Sucess full", Toast.LENGTH_SHORT).show();
                    Toast.makeText(Register_Activity.this, "Name :"+Str_name + "Email :" + Str_email +"Passward :"+ Str_passward +"Re Passwrod :"+ Str_re_password, Toast.LENGTH_SHORT).show();
               }

            }

        });


    }
}

