package com.atacama.projetologin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        Intent intent = getIntent();
        String email = intent.getStringExtra("email");
        String senha = intent.getStringExtra("senha");

        Toast.makeText(this, "Login realizado com sucesso = " +email, Toast.LENGTH_LONG).show();
    }
}