package com.atacama.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btnMensagem);
        editText = findViewById(R.id.edtMensagem);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String msg = editText.getText().toString();
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }


    public void proxima(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}