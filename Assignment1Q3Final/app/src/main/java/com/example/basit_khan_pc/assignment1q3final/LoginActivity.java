package com.example.basit_khan_pc.assignment1q3final;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private Button btnRegister;
    private Button btnLogin;
    private EditText txtPassword;
    private TextView txtViewError;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnRegister=findViewById(R.id.btnRegister);
        btnLogin=findViewById(R.id.btnLogin);
        txtPassword=findViewById(R.id.txtPassward);
        txtViewError=findViewById(R.id.txtInvalid);

        btnLogin.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view)
            {
                String getPassword=txtPassword.getText().toString();
                if(getPassword.length()>4)
                {
                    txtViewError.setText("Valid Password");
                }
                else
                {
                    txtViewError.setText("Invalid Email or Password");
                }
            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}

