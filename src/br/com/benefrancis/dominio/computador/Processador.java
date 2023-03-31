package br.com.benefrancis.dominio.computador;

import br.com.benefrancis.dominio.abstracoes.Peca;
import br.com.benefrancis.dominio.enumeracoes.TipoDeSocket;

public class Processador extends Peca {


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

    public TipoDeSocket getSocket() {
        return socket;
    }

    public Processador setSocket(TipoDeSocket socket) {
        this.socket = socket;
        return this;
    }

    @Override
    public String toString() {
        return "Processador{" +
                "socket=" + socket +
                ", quantidadeDeNucleos=" + quantidadeDeNucleos +
                ", quantidadeDeThreads=" + quantidadeDeThreads +
                ", cache=" + cache +
                "} " + super.toString();
    }
}
