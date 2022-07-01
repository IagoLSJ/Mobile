package com.projeto.projeto_final.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;
import com.projeto.projeto_final.R;
import com.projeto.projeto_final.controller.UserController;
import com.projeto.projeto_final.model.User;

public class Registration extends AppCompatActivity {
    Button btn;
    TextInputEditText email, senha, nome, sobrenome, genero, datanascimento;
    private UserController controller = new UserController();
    private User user ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        carregar();

        btn.setOnClickListener(view -> {
            user = new User( "https://avatars.githubusercontent.com/u/62673830?v=4",  nome.getText().toString(),  sobrenome.getText().toString(),  datanascimento.getText().toString(),  genero.getText().toString(),  email.getText().toString().toLowerCase(),  senha.getText().toString());
            controller.criateUser(user);
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
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