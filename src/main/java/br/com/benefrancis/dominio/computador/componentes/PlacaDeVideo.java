package br.com.benefrancis.dominio.computador.componentes;

import br.com.benefrancis.dominio.computador.abstracoes.Componente;
import com.google.gson.Gson;

public class PlacaDeVideo extends Componente {



    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
