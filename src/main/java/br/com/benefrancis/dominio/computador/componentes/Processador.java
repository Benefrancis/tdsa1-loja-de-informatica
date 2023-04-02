package br.com.benefrancis.dominio.computador.componentes;

import br.com.benefrancis.dominio.computador.abstracoes.Componente;
import br.com.benefrancis.dominio.computador.componentes.enumeracoes.TipoDeSocket;
import com.google.gson.Gson;

public class Processador extends Componente {


    private TipoDeSocket socket;


    private int quantidadeDeNucleos;

    private int quantidadeDeThreads;

    private int cache;


    public Processador() {
    }


    public Processador(TipoDeSocket socket, int quantidadeDeNucleos, int quantidadeDeThreads, int cache) {
        this.socket = socket;
        this.quantidadeDeNucleos = quantidadeDeNucleos;
        this.quantidadeDeThreads = quantidadeDeThreads;
        this.cache = cache;
    }


    public int getQuantidadeDeNucleos() {
        return quantidadeDeNucleos;
    }

    public Processador setQuantidadeDeNucleos(int quantidadeDeNucleos) {
        this.quantidadeDeNucleos = quantidadeDeNucleos;
        return this;
    }

    public int getQuantidadeDeThreads() {
        return quantidadeDeThreads;
    }

    public Processador setQuantidadeDeThreads(int quantidadeDeThreads) {
        this.quantidadeDeThreads = quantidadeDeThreads;
        return this;
    }

    public int getCache() {
        return cache;
    }

    public Processador setCache(int cache) {
        this.cache = cache;
        return this;
    }

    public TipoDeSocket getSocket() {
        return socket;
    }

    public Processador setSocket(TipoDeSocket socket) {
        this.socket = socket;
        return this;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
