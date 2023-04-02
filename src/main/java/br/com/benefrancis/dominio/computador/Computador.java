package br.com.benefrancis.dominio.computador;

import br.com.benefrancis.dominio.computador.abstracoes.Componente;
import com.google.gson.Gson;

import java.util.Map;
import java.util.TreeMap;

public class Computador {
    Map<String, Componente> componentes = new TreeMap();

    public Computador(Map<String, Componente> componentes) {
        this.componentes = componentes;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
