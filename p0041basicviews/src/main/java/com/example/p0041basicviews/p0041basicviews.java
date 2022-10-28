package com.example.p0041basicviews;

import androidx.appcompat.app.AppCompatActivity;

import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;
import android.widget.EditText;

public class p0041basicviews extends AppCompatActivity {
    TextView tvOut;
    Button btnOk;
    Button btnCancel;
    EditText editTextTextEmailAddress;
    EditText editTextTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p0041basicviews);
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);
        View.OnClickListener oclBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tvOut.setText("данная функция в разработке");
            }
        };
        btnOk.setOnClickListener(oclBtnOk);
        View.OnClickListener oclBtnCancel = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a= editTextTextEmailAddress.getText().toString();
                String b= editTextTextPassword.getText().toString();
                if (a== "admin" && b == "admin")
                {
                    tvOut.setText("Авторизация пройдена");

                }
                else
                {
                    tvOut.setText("Авторизация не пройдена");
                }


                // Меняем текст в TextView (tvOut)


            }
        };

        btnCancel.setOnClickListener(oclBtnCancel);


    }
}