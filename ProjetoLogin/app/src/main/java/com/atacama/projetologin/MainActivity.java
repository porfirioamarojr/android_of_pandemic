package com.atacama.projetologin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editEmail;
    private EditText editSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editEmail = findViewById(R.id.editEmail);
        editSenha = findViewById(R.id.editSenha);
    }

    public void entrar(View view) {
        String email = editEmail.getText().toString();
        String senha = editSenha.getText().toString();

        if(email.isEmpty()) {
            editEmail.setError("Campo e-mail obrigatório!");
            return;
        }

        if(senha.isEmpty()){
            editSenha.setError("Campo senha obrigatório!");
            return;
        }

        if(email.equals("admin@email.com") && senha.equals("admin")) {
            Intent intent = new Intent(this, PrincipalActivity.class);

            intent.putExtra("email",email);
            intent.putExtra("senha",senha);

            startActivity(intent);

            finish();

        }else{
            Toast.makeText(this, "Email ou senha incorreto!", Toast.LENGTH_LONG).show();

        }

    }

    public void cadastrar(View view) {

        Toast.makeText(this, "Tela de Cadastro", Toast.LENGTH_LONG).show();
    }
}