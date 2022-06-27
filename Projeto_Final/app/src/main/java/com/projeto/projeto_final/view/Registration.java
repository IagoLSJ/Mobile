package com.projeto.projeto_final.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;
import com.projeto.projeto_final.R;

public class Registration extends AppCompatActivity {
    Button btn;
    TextInputEditText email, senha, nome, sobrenome, genero, datanascimento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        carregar();

        btn.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        });

    }

    public void carregar(){
        btn = findViewById(R.id.btn_cadastrar);
        email = findViewById(R.id.email_input);
        senha = findViewById(R.id.senha_input);
        nome = findViewById(R.id.nome_input);
        sobrenome = findViewById(R.id.sobrenome_input);
        genero = findViewById(R.id.genero_input);
        datanascimento = findViewById(R.id.dataNascimento_input);
    }
}