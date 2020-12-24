package com.example.kiemtra1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtEmmail,txtPassWord;
    Button btnSignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtEmmail =(EditText) findViewById(R.id.eUser);
        txtPassWord= (EditText) findViewById(R.id.ePass);
        btnSignIn=(Button) findViewById(R.id.button);
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email=txtEmmail.getText().toString();
                String pass=txtPassWord.getText().toString();
                if(email.isEmpty() ||email.length()==0)
                    Toast.makeText(MainActivity.this,"Chưa Nhập Email",Toast.LENGTH_LONG).show();
                else if(pass.isEmpty() ||pass.length()==0)
                    Toast.makeText(MainActivity.this,"Chưa Nhập Mật Khẩu",Toast.LENGTH_LONG).show();
                else
                    open2();
            }
        });
    }
    public void open2(){
        Intent intent =new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}