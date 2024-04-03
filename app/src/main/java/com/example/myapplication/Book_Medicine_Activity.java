package com.example.myapplication;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Book_Medicine_Activity extends AppCompatActivity {

    TextView set_medi_name,set_medi_amo;
    TextView username_3,email_3,contect_3;
    EditText medi_address;
    Button btn_place_order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_medicine);

        set_medi_name=findViewById(R.id.set_medi_name);
        set_medi_amo=findViewById(R.id.set_medi_amo);
        username_3=findViewById(R.id.username_3);
        email_3=findViewById(R.id.email_3);
        contect_3=findViewById(R.id.contect_3);

        btn_place_order=findViewById(R.id.btn_place_order);

        Intent intent=getIntent();
        String getset_medi_name = intent.getStringExtra("set_medi_name");
        String getset_medi_amo=intent.getStringExtra("rupees");
        String getmedi_address=intent.getStringExtra("medi_address");
        String getusername_3 = intent.getStringExtra("username_3");
        String getemail_3 = intent.getStringExtra("email_3");
        String getcontect_3 = intent.getStringExtra("contect_3");

        String getbtn_place_order=intent.getStringExtra("btn_place_order");

        if(getset_medi_name ==null ){
            set_medi_name.setText("No Doctor Name");
        }else{

        }

        if(getset_medi_amo==null ){
            set_medi_amo .setText("No amount");
        }else{

        }
        if(getmedi_address==null ){
            medi_address .setText("No address");
        }else{

        }

        if(getusername_3==null ){
            username_3.setText("No username");
        }else{

        }
        if(getemail_3==null ){
            email_3.setText("No email");
        }else{

        }
        if(getcontect_3==null ){
            contect_3.setText("No contect");
        }else{

        }

btn_place_order.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

    }
});








    }
}
