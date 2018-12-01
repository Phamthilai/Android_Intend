package com.example.laipham.facebooklogin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ProfileActivity extends Activity {
    TextView getUsername;
    Button bntFinish,bntNext;
    EditText welcomeText;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        getUsername = (TextView)findViewById(R.id.get_username);
        bntFinish = (Button)findViewById(R.id.finish);
        bntNext = (Button)findViewById(R.id.bnt_next);
        welcomeText = (EditText)findViewById(R.id.welcome_text);
        if (getIntent() !=null){
            String data = getIntent().getStringExtra("username");
            getUsername.setText(data);
        }

        bntFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        bntNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this,GetDataActitvity.class);
                intent.putExtra("welcome_text", welcomeText.getText().toString());
                startActivity(intent);

            }
        });

    }



}
