package com.projeto.projeto_final.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.projeto.projeto_final.R;

public class Login extends AppCompatActivity {
    Button btn;
    TextInputEditText email, senha;
    TextView recSenha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
        carregar();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(main);
            }
        });
    }

    public void carregar(){
        btn = findViewById(R.id.btn_login);
        email = findViewById(R.id.email_input);
        senha = findViewById(R.id.senha_input);
        recSenha = findViewById(R.id.recuperarSenha);
    }

}