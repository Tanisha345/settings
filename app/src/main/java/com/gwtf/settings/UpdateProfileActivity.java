package com.gwtf.settings;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.StorageTask;


public class UpdateProfileActivity extends AppCompatActivity {
    public static final String TAG = "TAG";
    ImageView backbtn;
    EditText businessname, staffsize, bemail, bmobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent data=getIntent();
        String bname=data.getStringExtra("businessname");
        String ssize=data.getStringExtra("Staffsize");
        String email=data.getStringExtra("businessemail");
        String mobile=data.getStringExtra("businessmobile");

        setContentView(R.layout.activity_update_profile);
        backbtn = findViewById(R.id.backbtn);
        businessname = findViewById(R.id.hintbname);
        staffsize = findViewById(R.id.textbelowstaffsize);
        bemail = findViewById(R.id.textbelowbemail);
        bmobile = findViewById(R.id.textbelowbmobilenumber);

        businessname.setText(bname);
        staffsize.setText(ssize);
        bemail.setText(email);
        bmobile.setText(mobile);

        Log.d(TAG,"OnCreate: "+bname+" "+ssize+" "+email+" "+mobile+" ");
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UpdateProfileActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}