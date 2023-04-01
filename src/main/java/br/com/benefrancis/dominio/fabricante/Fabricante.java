package br.com.benefrancis.dominio.fabricante;

import com.google.gson.Gson;

public class Fabricante {
    private String nome;

    public Fabricante(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Fabricante setNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
