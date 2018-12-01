package com.example.laipham.facebooklogin;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Login extends AppCompatActivity {
    Button loginBnt;
    EditText edtEmail, edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginBnt = (Button) findViewById(R.id.bnt_login);
        edtEmail = (EditText) findViewById(R.id.edt_email);
        edtPassword = (EditText) findViewById(R.id.edt_password);

        loginBnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this,ProfileActivity.class);
                intent.putExtra("username", edtEmail.getText().toString());
                startActivity(intent);
                finish();
            }
        });

    }

    @Override
    protected void onStop() {
        edtEmail = (EditText) findViewById(R.id.edt_email);
        edtPassword = (EditText) findViewById(R.id.edt_password);
        edtEmail.setHint("username");
        edtEmail.setText("");
        edtPassword.setHint("password");
        edtPassword.setText("");
        super.onStop();
    }
}
