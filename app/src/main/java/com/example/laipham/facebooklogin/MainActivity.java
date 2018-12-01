package com.example.laipham.facebooklogin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    TextView result;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bntPlus,bntSubtract;
        bntPlus = (Button)findViewById(R.id.bnt_plus);
        bntSubtract = (Button)findViewById(R.id.bnt_subtract);
        result = (TextView)findViewById(R.id.result);

        bntPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActionMainActivity.class);
                intent.putExtra("action", "+");
               startActivityForResult(intent,1);
            }
        });
        bntSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActionMainActivity.class);
                intent.putExtra("action", "-");
                startActivityForResult(intent,1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==30){
            Integer d = data.getIntExtra("back",0);
            result.setText(String.valueOf(d));
        }
    }
}
