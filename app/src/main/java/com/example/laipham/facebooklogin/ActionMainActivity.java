package com.example.laipham.facebooklogin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActionMainActivity extends Activity {
    EditText edt_a, edt_b;
    Button bntBack;
    String input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_main);
        final int result = 0;
        edt_a = (EditText) findViewById(R.id.edt_a);
        edt_b = (EditText) findViewById(R.id.edt_b);
        bntBack = (Button) findViewById(R.id.bnt_ok);
        if (getIntent() != null) {
            input = getIntent().getStringExtra("action");
        }

        bntBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int finalResult = result;
                String sa = edt_a.getText().toString();
                String sb = edt_b.getText().toString();
                int a = Integer.parseInt(sa);
                int b = Integer.parseInt(sb);
                if (input.equals("+")) {

                    finalResult = a + b;
                } else {
                    finalResult = a - b;
                }
                Intent in = new Intent();
                in.putExtra("back", finalResult);
                setResult(30,in);
                finish();
            }

        });

    }
}
