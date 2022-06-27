package com.projeto.projeto_final.model;

import java.util.ArrayList;

public class Comunidade {
    private int id;
    private String urlImageMural;
    private String urlImage;
    private String nome;
    private String descrição;
    private User criador;
    private ArrayList<User> menbros = new ArrayList<>();

    public Comunidade(int id, String urlImageMural, String urlImage, String nome, String descrição) {
        this.id = id;
        this.urlImageMural = urlImageMural;
        this.urlImage = urlImage;
        this.nome = nome;
        this.descrição = descrição;

    }


    public String getUrlImageMural() {
        return urlImageMural;
    }

    public void setUrlImageMural(String urlImageMural) {
        this.urlImageMural = urlImageMural;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public User getCriador() {
        return criador;
    }

    public void setCriador(User criador) {
        this.criador = criador;
    }
    public int getId(){return this.id;}
}
