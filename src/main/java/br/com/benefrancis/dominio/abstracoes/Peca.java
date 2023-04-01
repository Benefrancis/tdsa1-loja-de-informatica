package br.com.benefrancis.dominio.abstracoes;

import br.com.benefrancis.dominio.fabricante.Fabricante;
import com.google.gson.Gson;

public abstract class Peca {
    private String modelo;
    private Fabricante fabricante;

    public Peca() {
    }

    public Peca(String modelo, Fabricante fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public Peca setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public Peca setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
        return this;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
