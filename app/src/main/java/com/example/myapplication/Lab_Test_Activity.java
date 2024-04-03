//package com.example.myapplication;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
//
//
//
//public class Lab_Test_Activity extends AppCompatActivity {
//    TextView leb_name_1,leb_name_2,leb_name_3,leb_name_4,leb_name_5,leb_name_6;
//    TextView leb_amo_1,leb_amo_2,leb_amo_3,leb_amo_4,leb_amo_5,leb_amo_6;
//
//    Button buynow_1;
//    Button buynow_2;
//    Button buynow_3;
//    Button buynow_4;
//    Button buynow_5;
//    Button buynow_6;
//
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_lab_test);
//
//        TextView leb_name_1 = findViewById(R.id.leb_name_1);
//        TextView leb_name_2 = findViewById(R.id.leb_name_2);
//        TextView leb_name_3 = findViewById(R.id.leb_name_3);
//        TextView leb_name_4 = findViewById(R.id.leb_name_4);
//        TextView leb_name_5 = findViewById(R.id.leb_name_5);
//        TextView leb_name_6 = findViewById(R.id.leb_name_6);
//
//        TextView leb_amo_1 = findViewById(R.id.leb_amo_1);
//        TextView leb_amo_2= findViewById(R.id.leb_amo_2);
//        TextView leb_amo_3 = findViewById(R.id.leb_amo_3);
//        TextView leb_amo_4 = findViewById(R.id.leb_amo_4);
//        TextView leb_amo_5 = findViewById(R.id.leb_amo_5);
//        TextView leb_amo_6 = findViewById(R.id.leb_amo_6);
//
//        Button buynow_1 = findViewById(R.id.buynow_1);
//        Button buynow_2 = findViewById(R.id.buynow_2);
//        Button buynow_3 = findViewById(R.id.buynow_3);
//        Button buynow_4 = findViewById(R.id.buynow_4);
//        Button buynow_5 = findViewById(R.id.buynow_5);
//        Button buynow_6 = findViewById(R.id.buynow_6);
//
//        buynow_1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String getleb_name_1=leb_name_1.getText().toString().trim();
//                String getleb_amo_1=leb_amo_1.getText().toString().trim();
//
//                Intent intent=new Intent(Lab_Test_Activity.this,Book_Lab_Activity.class);
//                intent.putExtra("leb_name_1",getleb_name_1);
//                intent.putExtra("leb_amo_1",getleb_amo_1);
//                startActivity(intent);
//
//
//            }
//        });
//
//        buynow_2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String getleb_name_2=leb_name_2.getText().toString().trim();
//                String getleb_amo_2=leb_amo_2.getText().toString().trim();
//
//                Intent intent=new Intent(Lab_Test_Activity.this,Book_Lab_Activity.class);
//                intent.putExtra("leb_name_1",getleb_name_2);
//                intent.putExtra("leb_amo_1",getleb_amo_2);
//                startActivity(intent);
//
//
//            }
//        });
//
//        buynow_3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String getleb_name_3=leb_name_3.getText().toString().trim();
//                String getleb_amo_3=leb_amo_3.getText().toString().trim();
//
//                Intent intent=new Intent(Lab_Test_Activity.this,Book_Lab_Activity.class);
//                intent.putExtra("leb_name_1",getleb_name_3);
//                intent.putExtra("leb_amo_1",getleb_amo_3);
//                startActivity(intent);
//
//
//            }
//        });
//        buynow_4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String getleb_name_4=leb_name_4.getText().toString().trim();
//                String getleb_amo_4=leb_amo_4.getText().toString().trim();
//
//                Intent intent=new Intent(Lab_Test_Activity.this,Book_Lab_Activity.class);
//                intent.putExtra("leb_name_1",getleb_name_4);
//                intent.putExtra("leb_amo_1",getleb_amo_4);
//                startActivity(intent);
//
//
//            }
//        });
//        buynow_5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String getleb_name_5=leb_name_5.getText().toString().trim();
//                String getleb_amo_5=leb_amo_5.getText().toString().trim();
//
//                Intent intent=new Intent(Lab_Test_Activity.this,Book_Lab_Activity.class);
//                intent.putExtra("leb_name_1",getleb_name_5);
//                intent.putExtra("leb_amo_1",getleb_amo_5);
//                startActivity(intent);
//
//
//            }
//        });
//        buynow_6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String getleb_name_6=leb_name_6.getText().toString().trim();
//                String getleb_amo_6=leb_amo_6.getText().toString().trim();
//
//                Intent intent=new Intent(Lab_Test_Activity.this,Book_Lab_Activity.class);
//                intent.putExtra("leb_name_1",getleb_name_6);
//                intent.putExtra("leb_amo_1",getleb_amo_6);
//                startActivity(intent);
//
//
//            }
//        });
//
//    }
//
//}
