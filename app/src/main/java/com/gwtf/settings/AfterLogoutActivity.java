package com.gwtf.settings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AfterLogoutActivity extends AppCompatActivity {
Button settings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_logout);
        settings=findViewById(R.id.settingbutton);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AfterLogoutActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}