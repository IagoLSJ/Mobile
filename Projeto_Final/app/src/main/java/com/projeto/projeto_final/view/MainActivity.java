package com.projeto.projeto_final.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.projeto.projeto_final.R;
import com.projeto.projeto_final.view.Trail.Trail_main;
import com.projeto.projeto_final.view.settings.Settings;
import com.projeto.projeto_final.view.community.Community_Main;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       menu();
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