package com.projeto.createcar.controller;

import com.projeto.createcar.model.Carro;

import java.util.ArrayList;
import java.util.List;
public class CarroController {
    private static CarroController carroController;
    private List<Carro> carros;
    private CarroController(){
        carros = new ArrayList<>();
    }
    public static CarroController getInstance(){
        if (carroController == null){
             carroController = new CarroController();
        }
        return carroController;
    }

    public void createCar(Carro car){
        carros.add(car);
    }

    public Carro findCar(int id){
        for (Carro car:carros) {
            if(car.getId() == id)
                return car;
        }
    return null;
    }

    public void editCar(int id, Carro car){
        for (int i=0;i<carros.size();i++){
            if (carros.get(i).getId()==id){
                carros.set(i,car);
            }
        }
    }

    public List<Carro> list(){
        return carros;
    }


}
