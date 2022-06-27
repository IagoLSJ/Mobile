package com.projeto.projeto_final.view.community;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationBarView;
import com.projeto.projeto_final.R;
import com.projeto.projeto_final.controller.CommunityController;
import com.projeto.projeto_final.model.Comunidade;
import com.projeto.projeto_final.view.MainActivity;

import java.util.List;

public class Community_Main extends AppCompatActivity {

    FloatingActionButton btn;
    RecyclerView list_community;
    private CommunityAdapter communityAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community_main);
        menu();
        CommunityController controller = new CommunityController();
        Comunidade c = new Comunidade(controller.idGenerete(),"drawable/montanha.png", "drawable/ciclista_64.png","iago","teste");
        Comunidade c2 = new Comunidade(controller.idGenerete(),"drawable/montanha.png", "drawable/ciclista_64.png", "ian","teste");
        Comunidade c3 = new Comunidade(controller.idGenerete(),"drawable/montanha.png", "drawable/ciclista_64.png", "jose","teste");
        controller.createCommunity(c);
        controller.createCommunity(c2);
        controller.createCommunity(c3);
        list_community = findViewById(R.id.list_community);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        list_community.setLayoutManager(linearLayoutManager);

        List<Comunidade> comunidades = controller.list();
        communityAdapter = new CommunityAdapter(comunidades);
        list_community.setAdapter(communityAdapter);

        btn = findViewById(R.id.create_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent create = new Intent(getApplicationContext(), Create_community.class);
                startActivity(create);
            }
        });

    }

    public void menu(){
        BottomNavigationView menu;
        Create_community community = new Create_community();
        menu = findViewById(R.id.bottom_navegation);
        menu.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        Intent home = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(home);
                        break;
                    case R.id.trilhas:
                        break;
                    case R.id.comunidades:
                        Intent comunidades = new Intent(getApplicationContext(), Community_Main.class);
                        startActivity(comunidades);
                        break;
                    default:
                        return false;
                }
                return false;
            }
        });
    }
}