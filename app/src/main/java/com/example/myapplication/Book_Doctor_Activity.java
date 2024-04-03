package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Book_Doctor_Activity extends AppCompatActivity {

TextView set_doc_name,set_doc_profile,set_doc_location,set_doc_amo;
TextView username_1,email_1,contect_1;
Intent intent;
    Button btn_book;

    @SuppressLint({"WrongConstant", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_docter);

        set_doc_name=findViewById(R.id.doc_name);
        set_doc_profile=findViewById(R.id.doc_profile);
        set_doc_location=findViewById(R.id.doc_location);
        set_doc_amo=findViewById(R.id.doc_amo);
        username_1=findViewById(R.id.username_1);
        email_1=findViewById(R.id.email_1);
        contect_1=findViewById(R.id.contect_1);

        btn_book=findViewById(R.id.btn_book);


        Intent intent=getIntent();
        String getset_doc_name_1 = intent.getStringExtra("doc_name_1");
        String getset_doc_profile_1 = intent.getStringExtra("doc_profile_1");
        String getset_doc_location_1 = intent.getStringExtra("doc_add_1");
        String getset_doc_amo_1= intent.getStringExtra("doc_amo_1");
        String getusername_1 = intent.getStringExtra("username_1");
        String getemail_1 = intent.getStringExtra("email_1");
        String getcontect_1 = intent.getStringExtra("contect_1");



        String getbtn_book=intent.getStringExtra("btn_book");

        if( getset_doc_name_1==null ) {
            set_doc_name.setText("No Doctor Name");
        }else{
            set_doc_name.setText(getset_doc_name_1);


        }

        if(getset_doc_profile_1 ==null ){
            set_doc_profile.setText("No Profile");
        }else{
            set_doc_profile.setText(getset_doc_profile_1);

        }

        if( getset_doc_location_1==null ){
            set_doc_location.setText("No location");
        }else{
            set_doc_location.setText(getset_doc_location_1);

        }
        if( getset_doc_amo_1==null ){
            set_doc_amo .setText("No amount");
        }else{
            set_doc_amo.setText(getset_doc_amo_1);


        }





        if( getusername_1==null ){
           username_1.setText("No username");
        }else{

        }
        if(getemail_1 ==null ){
            email_1.setText("No email");
        }else{

        }
        if( getcontect_1==null ){
           contect_1 .setText("No contect");
       }else{

        }




          //  database.execSQL("insert into doctor(doc_name,doc_profile,doc_add,doc_amo,username,email,contect) values('" + getset_doc_name + "','" +getset_doc_profile + "','" +getset_doc_location + "','" +getset_doc_amo + "')");
          //  Toast.makeText(Book_Doctor_Activity.this, "Sucess full", Toast.LENGTH_SHORT).show();
            //Toast.makeText(Book_Doctor_Activity.this, " doc_name:"+getset_doc_name+ "doc_profile:" + getset_doc_profile+"doc_add :"+getset_doc_location +" doc_amo :"+ getset_doc_amo + "username:" + getusername_1+"email :"+getemail_1 +" contect no :"+getcontect_1 , Toast.LENGTH_SHORT).show();
       }




    }

//  set_doc_name.setText(getset_doc_name);
//set_doc_profile.setText(getset_doc_profile);
//set_doc_location.setText(getset_doc_location);
//set_doc_amo.setText(getset_doc_amo);
//username_1.setText(getusername_1);
//email_1.setText(getemail_1);
//contect_1.setText(getcontect_1);
//btn_book.setText(getbtn_book);
