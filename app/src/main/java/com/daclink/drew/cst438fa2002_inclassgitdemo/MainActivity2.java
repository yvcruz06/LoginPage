package com.daclink.drew.cst438fa2002_inclassgitdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    boolean m1 =  true;
    private static final String M1ISTRUE = "com.daclink.drew.cst438fa2002_inclassgitdemo";

    TextView mtextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mtextView = (TextView) findViewById(R.id.textView);
    }

    public static Intent newIntent(Context context, boolean m1) {
        Intent intent = new Intent(context, MainActivity2.class);
        intent.putExtra(M1ISTRUE,m1);
        return intent;
    }
}