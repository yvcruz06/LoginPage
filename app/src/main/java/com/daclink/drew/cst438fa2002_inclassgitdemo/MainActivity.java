package com.daclink.drew.cst438fa2002_inclassgitdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // input texts and login button initiation
    EditText mEditText1;
    EditText mEditText2;
    Button mButton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //adding input text and login button into initiated variables
        mEditText1 = (EditText) findViewById(R.id.editText1);
        mEditText2 = (EditText) findViewById(R.id.editText2);
        mButton1 = (Button) findViewById(R.id.button1);

        // set listener to login button
        // when clicked will check if account exists
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAccount();
            }
        });
    }

    // function checks if account exists
    public void checkAccount(){
        String un = mEditText1.getText().toString();
        String pw = mEditText2.getText().toString();

        String universal_un = "yvonne";
        String universal_pw = "cruz";

        if (un.equals(universal_un)) {

            if (pw.equals(universal_pw)) {

                Toast.makeText(this, "Success", Toast.LENGTH_LONG).show();

                //Intent intent = MainActivity.newIntent(MainActivity.this, m1);
                //startActivity(intent);

            }
            else {
                Toast.makeText(this, "Password is incorrect", Toast.LENGTH_LONG).show();
                mEditText2.setTextColor(Color.RED);
            }
        }
        else if (pw.equals(universal_pw)){
            Toast.makeText(this, "Username is incorrect", Toast.LENGTH_LONG).show();
            mEditText1.setTextColor(Color.RED);

        }
        else {
            Toast.makeText(this, "Username & Password are incorrect", Toast.LENGTH_LONG).show();
            mEditText1.setTextColor(Color.RED);
            mEditText2.setTextColor(Color.RED);

        }
    }
}