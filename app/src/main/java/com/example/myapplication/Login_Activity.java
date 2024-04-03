package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login_Activity extends AppCompatActivity {

    SQLiteDatabase database;

    EditText login_email_phone_no;
    EditText login_password;

    Button btn_login;
    String Str_login_email_phone_no;
    String Str_login_password;
    String Str_btn_login;
    @SuppressLint("WrongConstant")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        database = openOrCreateDatabase("healthcare.db", SQLiteDatabase.CREATE_IF_NECESSARY, null);
        database.execSQL("create table if not exists Signup(email_phone_no text,passward text)");


        login_email_phone_no = findViewById(R.id.login_email_and_phone_no);
        login_password = findViewById(R.id.login_password);
        btn_login = findViewById(R.id.btn_login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Str_login_email_phone_no = login_email_phone_no.getText().toString().trim();
                Str_login_password = login_password.getText().toString().trim();

                if (Str_login_email_phone_no.equals("")) {
                    login_email_phone_no.setError("Enter Email and Phone no");
                } else if (Str_login_password.equals("")) {
                    login_password.setError("Enter Password");
                } else {
                    database.execSQL("insert into Signup(name,email,passward,re_password) values('" + Str_login_email_phone_no + "','" + Str_login_password + "')");

                    Toast.makeText(Login_Activity.this, "Login sucess full", Toast.LENGTH_SHORT).show();
                    Toast.makeText(Login_Activity.this, " login_email_phone_no:" + login_email_phone_no + "login_password:" + login_password, Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(intent);

            }
        });

    }
        public boolean emailValidator(String str_login_email_phone_no) {
            Pattern pattern;
            Matcher matcher;
            final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
            pattern = Pattern.compile(EMAIL_PATTERN);
            matcher = pattern.matcher(Str_login_email_phone_no);
            return matcher.matches();
        }
    }



