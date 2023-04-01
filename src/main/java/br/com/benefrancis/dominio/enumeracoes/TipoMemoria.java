package br.com.benefrancis.dominio.enumeracoes;

import com.google.gson.Gson;

public enum TipoMemoria {
    DDR3,
    DDR4,
    DDR5;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
