package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.button);
        TextView username=findViewById(R.id.userName);
        TextView email=findViewById(R.id.email);
        TextView password=findViewById(R.id.password);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().length()>0 && email.getText().length()>0 && password.getText().length()>0) {
                    username.setText("");
                    email.setText("");
                    password.setText("");
                    Toast.makeText(MainActivity.this,"Sign Up Successfully!",Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(MainActivity.this,"Fill out all the fields!",Toast.LENGTH_SHORT).show();
            }
        });

    }
}