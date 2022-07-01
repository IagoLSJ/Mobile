package com.projeto.projeto_final.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.projeto.projeto_final.R;
import com.projeto.projeto_final.controller.UserController;
import com.projeto.projeto_final.model.User;

public class Login extends AppCompatActivity {
    Button btn;
    private TextInputEditText email, senha;
    private TextView recSenha;
    private UserController controller = new UserController();
    FirebaseAuth userAuth = FirebaseAuth.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
        carregar();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              if(controller.login(email.getText().toString().toLowerCase(),senha.getText().toString())){
                  startActivity(new Intent(getApplicationContext(),MainActivity.class));
              }
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