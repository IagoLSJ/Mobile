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
import com.projeto.projeto_final.view.Trail.Trail_main;
import com.projeto.projeto_final.view.settings.Settings;

import java.util.List;

public class Community_Main extends AppCompatActivity {

    private FloatingActionButton btn;
    private RecyclerView list_community;
    private CommunityAdapter communityAdapter;
    CommunityController controller = CommunityController.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community_main);
        menu();



        list_community = (RecyclerView) findViewById(R.id.list_community);

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
        menu = findViewById(R.id.bottom_navegation);
        menu.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        startActivity( new Intent(getApplicationContext(), MainActivity.class));
                        break;
                    case R.id.trilhas:
                        startActivity(new Intent(getApplicationContext(), Trail_main.class));
                        break;
                    case R.id.comunidades:
                        startActivity(new Intent(getApplicationContext(), Community_Main.class));
                        break;
                    case R.id.config:
                        startActivity(new Intent(getApplicationContext(), Settings.class));
                    default:
                        return false;
                }
                return false;
            }
        });
    }
}