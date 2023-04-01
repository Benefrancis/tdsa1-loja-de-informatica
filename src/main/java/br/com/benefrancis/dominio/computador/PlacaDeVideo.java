package br.com.benefrancis.dominio.computador;

import br.com.benefrancis.dominio.abstracoes.Peca;
import com.google.gson.Gson;

public class PlacaDeVideo extends Peca {



    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
