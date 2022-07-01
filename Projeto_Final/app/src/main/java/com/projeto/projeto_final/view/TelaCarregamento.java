package com.projeto.projeto_final.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.projeto.projeto_final.R;

public class TelaCarregamento extends AppCompatActivity {
    public Button gmail, cadastrar, login;
    public View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_carregamento);
        getSupportActionBar().hide();
        carregar();
        login.setOnClickListener(view -> {
            Intent loginView = new Intent(getApplicationContext(), Login.class);
            startActivity(loginView);
        });

        cadastrar.setOnClickListener(view -> {
            Intent registrationView = new Intent(getApplicationContext(), Registration.class);
            startActivity(registrationView);
        });

    }
    public void carregar(){
        view = findViewById(R.id.view);
        cadastrar = findViewById(R.id.btn_cadastrar);
        login = findViewById(R.id.btn_login);

        view.setVisibility(View.VISIBLE);

        cadastrar.setVisibility(View.VISIBLE);
        login.setVisibility(View.VISIBLE);

    }

}