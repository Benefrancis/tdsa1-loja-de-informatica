package br.com.benefrancis.dominio.computador;

import br.com.benefrancis.dominio.abstracoes.Armazenamento;
import com.google.gson.Gson;

public class Computador {

    private Processador processador;

    private PlacaMae placaMae;

    private Memoria memoria;

    private Gabinete gabinete;

    private Armazenamento armazenamento;

    private PlacaDeVideo placaDeVideo;

    public Computador(Processador processador, PlacaMae placaMae, Memoria memoria, Gabinete gabinete, Armazenamento armazenamento, PlacaDeVideo placaDeVideo) {
        this.processador = processador;
        this.placaMae = placaMae;
        this.memoria = memoria;
        this.gabinete = gabinete;
        this.armazenamento = armazenamento;
        this.placaDeVideo = placaDeVideo;
    }

    public Computador() {
    }

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public PlacaMae getPlacaMae() {
        return placaMae;
    }

    public void setPlacaMae(PlacaMae placaMae) {
        this.placaMae = placaMae;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }

    public Gabinete getGabinete() {
        return gabinete;
    }

    public void setGabinete(Gabinete gabinete) {
        this.gabinete = gabinete;
    }

    public Armazenamento getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(Armazenamento armazenamento) {
        this.armazenamento = armazenamento;
    }

    public PlacaDeVideo getPlacaDeVideo() {
        return placaDeVideo;
    }

    public void setPlacaDeVideo(PlacaDeVideo placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
