package br.com.benefrancis.dominio.computador;

import br.com.benefrancis.dominio.abstracoes.Peca;
import br.com.benefrancis.dominio.enumeracoes.TipoMemoria;
import com.google.gson.Gson;

public class Memoria extends Peca {


    private int capacidade;

    private int MHZ;

    private TipoMemoria tipo;

    private boolean RGB;

    public Memoria() {
    }

    public Memoria(int capacidade, int MHZ, TipoMemoria tipo, boolean RGB) {
        this.capacidade = capacidade;
        this.MHZ = MHZ;
        this.tipo = tipo;
        this.RGB = RGB;
    }


    public int getCapacidade() {
        return capacidade;
    }

    public Memoria setCapacidade(int capacidade) {
        this.capacidade = capacidade;
        return this;
    }

    public int getMHZ() {
        return MHZ;
    }

    public Memoria setMHZ(int MHZ) {
        this.MHZ = MHZ;
        return this;
    }

    public TipoMemoria getTipo() {
        return tipo;
    }

    public Memoria setTipo(TipoMemoria tipo) {
        this.tipo = tipo;
        return this;
    }

    public boolean isRGB() {
        return RGB;
    }

    public Memoria setRGB(boolean RGB) {
        this.RGB = RGB;
        return this;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
