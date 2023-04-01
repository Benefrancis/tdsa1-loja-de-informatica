package br.com.benefrancis.dominio.computador;

import br.com.benefrancis.dominio.abstracoes.Peca;
import br.com.benefrancis.dominio.enumeracoes.TipoGabinete;
import com.google.gson.Gson;

public class Gabinete extends Peca {

    private float altura;
    private float largura;
    private float profundidade;

    private TipoGabinete tipo;

    public Gabinete() {
    }

    public Gabinete(float altura, float largura, float profundidade, TipoGabinete tipo) {
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
        this.tipo = tipo;
    }


    public float getAltura() {
        return altura;
    }

    public Gabinete setAltura(float altura) {
        this.altura = altura;
        return this;
    }

    public float getLargura() {
        return largura;
    }

    public Gabinete setLargura(float largura) {
        this.largura = largura;
        return this;
    }

    public float getProfundidade() {
        return profundidade;
    }

    public Gabinete setProfundidade(float profundidade) {
        this.profundidade = profundidade;
        return this;
    }

    public TipoGabinete getTipo() {
        return tipo;
    }

    public Gabinete setTipo(TipoGabinete tipo) {
        this.tipo = tipo;
        return this;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
