package com.login_page.hp.signup;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class FBActivity extends AppCompatActivity{

    TextView tv1,tv2,tv3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fb_activity);

        Intent intent = getIntent();
        String first_name = intent.getStringExtra("fname");
        String last_name = intent.getStringExtra("lname");
        String email = intent.getStringExtra("email");
        String id = intent.getStringExtra("id");

        tv1 = findViewById(R.id.tv_name);
        tv2 = findViewById(R.id.tv_email);
        tv3 = findViewById(R.id.tv_id);
        tv1.setText(first_name+" "+last_name);
        tv2.setText(email);
        tv3.setText(id);
    }

}
