package com.gwtf.settings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class BusinessSettingActivity extends AppCompatActivity {
ImageView backbtn;
TextView Deletebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_setting);
        backbtn=findViewById(R.id.buisnesssbackbtn);
        Deletebtn=findViewById(R.id.Deletebook);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(BusinessSettingActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
Deletebtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Toast.makeText(BusinessSettingActivity.this, "Business deleted from records", Toast.LENGTH_SHORT).show();
    }
});
    }
}