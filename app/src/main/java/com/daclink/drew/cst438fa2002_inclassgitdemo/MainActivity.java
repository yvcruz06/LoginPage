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

    boolean m1 =  true;
    private static final String M1ISTRUE = "com.daclink.drew.cst438fa2002_inclassgitdemo";

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
                mEditText1.setTextColor(Color.BLACK);
                mEditText2.setTextColor(Color.BLACK);
                String un = mEditText1.getText().toString();
                String pw = mEditText2.getText().toString();
                CheckAccount inputUP = new CheckAccount(un, pw);
                boolean bool_un = inputUP.checkUsername();
                boolean bool_pw = inputUP.checkPassword();
                toastMaker(bool_un, bool_pw);
            }
        });
    }

    public void toastMaker(boolean bool_un, boolean bool_pw) {
        if (bool_un && bool_pw) {
            Toast.makeText(this, "Success", Toast.LENGTH_LONG).show();

            //intent new screen
            Intent intent = MainActivity2.newIntent(MainActivity.this, m1);
            startActivity(intent);

        } else if (!bool_un && !bool_pw) {
            Toast.makeText(this, "Username & Password are incorrect", Toast.LENGTH_LONG).show();
            mEditText1.setTextColor(Color.RED);
            mEditText2.setTextColor(Color.RED);

        } else if (!bool_un) {
            Toast.makeText(this, "Username is incorrect", Toast.LENGTH_LONG).show();
            mEditText1.setTextColor(Color.RED);

        } else {
            Toast.makeText(this, "Password is incorrect", Toast.LENGTH_LONG).show();
            mEditText2.setTextColor(Color.RED);
        }
    }
}

