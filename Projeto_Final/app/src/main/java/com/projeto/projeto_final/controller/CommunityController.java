package com.projeto.projeto_final.controller;

import com.google.firebase.firestore.FirebaseFirestore;
import com.projeto.projeto_final.model.Comunidade;

import java.util.ArrayList;
import java.util.List;

public class CommunityController {
    private FirebaseFirestore db  = FirebaseFirestore.getInstance();
    private static CommunityController communityController;
    private List<Comunidade> comunidades;
    private CommunityController(){
        comunidades = new ArrayList<>();
    }

    public static CommunityController getInstance(){
        if (communityController == null){
            communityController = new CommunityController();
        }
        return communityController;
    }

    public void createCommunity(Comunidade c){
        try {
            db.collection("groups").add(c);
        }catch (Exception e){
            System.out.println(e);
        }

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
            return comunidade;
        }
        return null;
    }
    public List<Comunidade> list(){
        return comunidades;
    }



}
