package com.projeto.projeto_final.model;

import java.util.ArrayList;

public class Comunidade {

    private String urlImageMural;
    private String urlImage;
    private String nome;
    private String describe;
    private User criador;
    private ArrayList<User> menbros = new ArrayList<>();

    public Comunidade(String urlImageMural, String urlImage, String nome, String describe) {
        this.urlImageMural = urlImageMural;
        this.urlImage = urlImage;
        this.nome = nome;
        this.describe = describe;

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

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public User getCriador() {
        return criador;
    }

    public void setCriador(User criador) {
        this.criador = criador;
    }


    @Override
    public String toString() {
        return "Comunidade{" +
                ", urlImageMural='" + urlImageMural + '\'' +
                ", urlImage='" + urlImage + '\'' +
                ", nome='" + nome + '\'' +
                ", describe='" + describe + '\'' +
                ", criador=" + criador +
                ", menbros=" + menbros +
                '}';
    }
}
