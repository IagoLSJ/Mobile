package com.projeto.createcar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.projeto.createcar.controller.CarroController;
import com.projeto.createcar.model.Carro;

import java.util.ArrayList;
import java.util.List;

public class ListCar extends AppCompatActivity {
    private Button add_new_car, edit_car;
    private EditText id;
    private RecyclerView list_car;
    CarroController controller = CarroController.getInstance();
    private CarroAdapter carroAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_car);
        iniciarComponts();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        list_car.setLayoutManager(linearLayoutManager);

        List<Carro> carros = controller.list();
        carroAdapter = new CarroAdapter(carros);
        list_car.setAdapter(carroAdapter);

        add_new_car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent create_car = new Intent(ListCar.this, create.class);
                create_car.putExtra("id", id.getText().toString());
                startActivity(create_car);
            }
        });
        edit_car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!id.getText().toString().isEmpty()){
                   if(controller.findCar(Integer.parseInt(id.getText().toString())) != null){
                       Intent edit_car = new Intent(ListCar.this, create.class);
                       edit_car.putExtra("id", id.getText().toString());
                       edit_car.putExtra("editar", true);
                       startActivity(edit_car);
                   }else{
                       // id not exist in list
                       // create menssage  error
                   }

                }else{
                    // input id is empty
                    // create message error
                }

            }
         });

    }


    public void iniciarComponts(){
        add_new_car = findViewById(R.id.btn_add_new_car);
        edit_car = findViewById(R.id.btn_edit_car);
        id = findViewById(R.id.id);
        list_car =(RecyclerView) findViewById(R.id.list_car);
    }


}