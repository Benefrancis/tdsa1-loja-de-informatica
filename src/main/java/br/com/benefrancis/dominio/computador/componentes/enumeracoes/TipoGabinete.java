package br.com.benefrancis.dominio.computador.componentes.enumeracoes;

import com.google.gson.Gson;

public enum TipoGabinete {
    EATX,
    ATX,
    MICRO_ATX;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
