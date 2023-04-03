package br.com.benefrancis.dominio.computador;

import br.com.benefrancis.dominio.computador.abstracoes.Componente;
import com.google.gson.Gson;

import java.util.Map;

public class Computador {
    Map<String, Componente> componentes;

    public Computador(Map<String, Componente> componentes) {
        this.componentes = componentes;
    }

    public Map<String, Componente> getComponentes() {
        return componentes;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
