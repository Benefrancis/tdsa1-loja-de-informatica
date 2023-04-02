package br.com.benefrancis.dominio.computador.builders;

import br.com.benefrancis.dominio.computador.abstracoes.Armazenamento;
import br.com.benefrancis.dominio.computador.*;
import br.com.benefrancis.dominio.computador.componentes.*;

public class ComputadorBuilder implements Builder<Computador> {

    private Processador processador;

    private PlacaMae placaMae;

    private Memoria memoria;

    private Gabinete gabinete;

    private Armazenamento armazenamento;

    private PlacaDeVideo placaDeVideo;

    @Override
    public ComputadorBuilder setProcessador(Processador processador) {
        this.processador = processador;
        return this;
    }

    @Override
    public ComputadorBuilder setPlacaMae(PlacaMae placaMae) {
        this.placaMae = placaMae;
        return this;
    }

    @Override
    public ComputadorBuilder setMemoria(Memoria memoria) {
        this.memoria = memoria;
        return this;
    }

    @Override
    public ComputadorBuilder setGabinete(Gabinete gabinete) {
        this.gabinete = gabinete;
        return this;
    }

    @Override
    public ComputadorBuilder setArmazenamento(Armazenamento armazenamento) {
        this.armazenamento = armazenamento;
        return this;
    }

    @Override
    public ComputadorBuilder setPlacaDeVideo(PlacaDeVideo placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
        return this;
    }

    public Computador build() {
        return new Computador(processador, placaMae, memoria, gabinete, armazenamento, placaDeVideo);
    }
}
