package br.com.benefrancis.dominio.computador;

import br.com.benefrancis.dominio.abstracoes.Armazenamento;
import br.com.benefrancis.dominio.abstracoes.Peca;
import com.google.gson.Gson;

public class HD extends Peca implements Armazenamento {

    private int capacidade;

    private int velocidade;


    public HD() {
    }

    public HD(int capacidade, int velocidade) {
        this.capacidade = capacidade;
        this.velocidade = velocidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public HD setCapacidade(int capacidade) {
        this.capacidade = capacidade;
        return this;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public HD setVelocidade(int velocidade) {
        this.velocidade = velocidade;
        return this;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
