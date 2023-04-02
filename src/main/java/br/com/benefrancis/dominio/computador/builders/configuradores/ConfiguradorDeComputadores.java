package br.com.benefrancis.dominio.computador.builders.configuradores;

import br.com.benefrancis.dominio.computador.builders.Builder;
import br.com.benefrancis.dominio.computador.*;
import br.com.benefrancis.dominio.computador.componentes.*;
import br.com.benefrancis.dominio.computador.componentes.enumeracoes.TipoDeSocket;
import br.com.benefrancis.dominio.computador.componentes.enumeracoes.TipoGabinete;
import br.com.benefrancis.dominio.computador.componentes.enumeracoes.TipoMemoria;
import br.com.benefrancis.dominio.fabricante.Fabricante;

public class ConfiguradorDeComputadores {

    private Builder<Computador> builder;

    public ConfiguradorDeComputadores(Builder builder) {
        this.builder = builder;
    }

    public Computador configuraCoputadorGamerAMD() {

        var socket = TipoDeSocket.AM5;
        var tipoMemoria = TipoMemoria.DDR5;
        int quantidadeDeCPU = 1;

        var processador = new Processador();
        processador.setFabricante(socket.getFabricante());
        processador.setSocket(socket);
        processador.setQuantidadeDeNucleos(16).setQuantidadeDeThreads(32).setCache(128);

        var motherboard = new PlacaMae();
        motherboard.setFabricante(new Fabricante("ASUS"));
        motherboard.setSocket(socket);
        motherboard.setTipoMemoria(tipoMemoria);
        motherboard.setTipoGabinete(TipoGabinete.ATX);
        motherboard.setWifiIntegrado(true);
        motherboard.setQuantidadeDeCPU(quantidadeDeCPU);

        var ssd = new SSD();
        ssd.setFabricante(new Fabricante("Kingston"));
        ssd.setCapacidade(1024).setVelocidade(65356);

        var video = new PlacaDeVideo();
        video.setFabricante(new Fabricante("Asus"));
        video.setModelo("RTX3070TI-O8G-V2-GAMING");

        var gabinete = new Gabinete();
        gabinete.setFabricante(new Fabricante("CoolerMaster"));
        gabinete.setLargura(1).setAltura(1).setProfundidade(2);
        gabinete.setTipo(TipoGabinete.ATX);

        var memoria = new Memoria();
        memoria.setCapacidade(64).setFabricante(new Fabricante("Corsair")).setModelo("CMT64GX5M2B5200C40");
        memoria.setTipo(TipoMemoria.DDR5);
        memoria.setMHZ(5200);
        memoria.setRGB(true);

        this.builder.setProcessador(processador)
                .setPlacaMae(motherboard)
                .setMemoria(memoria)
                .setArmazenamento(ssd)
                .setPlacaDeVideo(video)
                .setGabinete(gabinete);

        return this.builder.build();
    }

}
