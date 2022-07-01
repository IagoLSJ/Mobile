package com.projeto.projeto_final.view.community;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.projeto.projeto_final.R;
import com.projeto.projeto_final.controller.CommunityController;
import com.projeto.projeto_final.model.Comunidade;

public class Create_community extends AppCompatActivity {
    Button btn;
    TextInputEditText nome, descricao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_community);
        carregar();
        CommunityController controller =  CommunityController.getInstance();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent communityview = new Intent(getApplicationContext(), Community.class);
                Comunidade c = new Comunidade("drawable/montanha.png", "drawable/ciclista_64.png", nome.getText().toString(), descricao.getText().toString());
                controller.createCommunity(c);
                startActivity(communityview);


            }
        });

    }
        public void carregar(){
        btn = findViewById(R.id.btn_create);
        nome = findViewById(R.id.nome_input);
        descricao = findViewById(R.id.descricao_input);
    }
}