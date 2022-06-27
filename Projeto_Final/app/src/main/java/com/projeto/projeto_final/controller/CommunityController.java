package com.projeto.projeto_final.controller;

import com.projeto.projeto_final.model.Comunidade;

import java.util.ArrayList;
import java.util.List;

public class CommunityController {
    private int id = 0;
    private List<Comunidade> comunidades = new ArrayList<>();

    public void createCommunity(Comunidade c){
        comunidades.add(c);
    }

    public Comunidade findCommunityByName(String nome){
        for (Comunidade comunidade : comunidades){
            if(comunidade.getNome() == nome){
                return comunidade;
            }
        }
        return null;
    }

    public Comunidade findCommunityById(int id){
        for (Comunidade comunidade : comunidades){
            if(comunidade.getId() == id){
                return comunidade;
            }
        }
        return null;
    }
    public List<Comunidade> list(){
        return comunidades;
    }
    public int idGenerete(){
        this.id += 1;
        return this.id;
    }


}
