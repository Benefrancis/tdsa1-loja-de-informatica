package br.com.benefrancis.dominio.computador.abstracoes;

import br.com.benefrancis.dominio.fabricante.Fabricante;
import com.google.gson.Gson;

public abstract class Componente {
    private String modelo;
    private Fabricante fabricante;

    public Componente() {
    }

    public Componente(String modelo, Fabricante fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public Componente setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public Componente setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
        return this;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
