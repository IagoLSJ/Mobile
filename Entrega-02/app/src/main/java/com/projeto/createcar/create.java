package com.projeto.createcar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.projeto.createcar.controller.CarroController;
import com.projeto.createcar.model.Carro;

import java.util.List;

public class create extends AppCompatActivity {
    private EditText name, brand, model, year;
    private TextView view_id;
    private Button btn_create, btn_cancel;
    CarroController controller =  CarroController.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        iniciarComponts();

        String id;
        boolean editar;

        Bundle extras = getIntent().getExtras();
        id = extras.getString("id");
        editar = extras.getBoolean("editar");
        view_id.setText(id);
        Carro car = controller.findCar(Integer.parseInt(id));
        if (editar){
            btn_create.setText("Atualizar");
            name.setText(car.getNome());
            brand.setText(car.getMarca());
            model.setText(car.getModelo());
            year.setText(car.getAno());
        }
        btn_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Carro carro = new Carro(Integer.parseInt(id),name.getText().toString(), brand.getText().toString(), model.getText().toString(),year.getText().toString());
                if(editar){
                    controller.editCar(Integer.parseInt(id),carro);
                }else {
                    controller.createCar(carro);
                }
                Intent list_car = new Intent(create.this, ListCar.class);
                startActivity(list_car);
            }
        });

       btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cancel = new Intent(create.this, ListCar.class);
                startActivity(cancel);
            }
        });
    }

    public void iniciarComponts(){
        view_id = findViewById(R.id.view_id);
        name = findViewById(R.id.input_car_name);
        brand = findViewById(R.id.input_car_brand);
        model = findViewById(R.id.input_car_model);
        year = findViewById(R.id.input_car_year);
        btn_create = findViewById(R.id.btn_create_new_car);
        btn_cancel = findViewById(R.id.btn_cancel);
    }
}