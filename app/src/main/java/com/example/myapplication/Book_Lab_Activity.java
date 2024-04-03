package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Book_Lab_Activity extends AppCompatActivity {
    TextView set_leb_name,set_leb_amo;
    TextView username_2,email_2,contect_2;

    Button btn_book_now;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_lab);

        set_leb_name=findViewById(R.id.set_leb_name);
        set_leb_amo=findViewById(R.id.set_leb_amo);
        username_2=findViewById(R.id.username_2);
        email_2=findViewById(R.id.email_2);
        contect_2=findViewById(R.id.contect_2);

       // btn_book_now=findViewById(R.id.btn_book_now);

        Intent intent=getIntent();
        String getset_leb_name_1 = intent.getStringExtra("set_leb_name_1");
        String getset_leb_amo_1 = intent.getStringExtra("set_leb_amo_1");
        String getusername_2 = intent.getStringExtra("username_2");
        String getemail_2 = intent.getStringExtra("email_2");
        String getcontect_2= intent.getStringExtra("contect_2");

        String getbtn_book_now=intent.getStringExtra("btn_book_now");


        if( getset_leb_name_1==null ) {
            set_leb_name.setText("No leb Name");
        }else{
            set_leb_name.setText(getset_leb_name_1);

        }

        if( getset_leb_amo_1==null ){
            set_leb_amo .setText("No amount");
        }else{
            set_leb_amo.setText(getset_leb_amo_1);

        }

        if( getusername_2==null ){
            username_2.setText("No username");
        }else{

        }
        if(getemail_2 ==null ){
            email_2.setText("No email");
        }else{

        }
        if( getcontect_2==null ){
            contect_2 .setText("No contect");
        }else{

        }


    }
}
