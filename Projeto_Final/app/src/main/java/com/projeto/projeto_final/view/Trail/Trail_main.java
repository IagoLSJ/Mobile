package com.projeto.projeto_final.view.Trail;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.projeto.projeto_final.R;
import com.projeto.projeto_final.view.MainActivity;
import com.projeto.projeto_final.view.community.Community_Main;
import com.projeto.projeto_final.view.settings.Settings;

public class Trail_main extends AppCompatActivity implements OnMapReadyCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trail_main);
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

    @Override
    public void onMapReady(GoogleMap googleMap) {
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(0, 0))
                .title("Marker"));
    }
}