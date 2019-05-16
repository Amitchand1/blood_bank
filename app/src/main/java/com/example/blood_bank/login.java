package com.example.blood_bank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity implements View.OnClickListener {
    EditText txtuname,txtpassword;
    Button btnsignin,btnsignup;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtuname=findViewById(R.id.txtuname);
        txtpassword=findViewById(R.id.txtpassword);

        btnsignin=findViewById(R.id.btnsignin);
        btnsignin.setOnClickListener(this);

        btnsignup=findViewById(R.id.btnsignup);
        btnsignup.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btnsignin){

        }
        else if (v.getId()==R.id.btnsignup){
            intent=new Intent(login.this, register.class);
            startActivity(intent);

        }
    }
}
