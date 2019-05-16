package com.example.blood_bank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class register extends AppCompatActivity implements View.OnClickListener {
    Button btnregister;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnregister=findViewById(R.id.btnregister);
        btnregister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btnregister){
            intent=new Intent(register.this,homepage.class);
            startActivity(intent);
        }
    }
}
