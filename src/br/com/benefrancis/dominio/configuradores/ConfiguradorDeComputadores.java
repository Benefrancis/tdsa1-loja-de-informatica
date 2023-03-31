package br.com.benefrancis.dominio.configuradores;

import br.com.benefrancis.dominio.builders.Builder;
import br.com.benefrancis.dominio.builders.ComputadorBuilder;
import br.com.benefrancis.dominio.computador.*;
import br.com.benefrancis.dominio.enumeracoes.TipoDeSocket;
import br.com.benefrancis.dominio.enumeracoes.TipoGabinete;
import br.com.benefrancis.dominio.enumeracoes.TipoMemoria;
import br.com.benefrancis.dominio.fabricante.Fabricante;

public class ConfiguradorDeComputadores {
    public Builder configuraCoputadorGamerAMD() {

        ComputadorBuilder builder = new ComputadorBuilder();

        var socket = TipoDeSocket.AM5;
        var tipoMemoria = TipoMemoria.DDR5;

        var processador = new Processador();

        processador.setFabricante(socket.getFabricante());

        var motherboard = new PlacaMae();
        motherboard.setFabricante(new Fabricante("ASUS"));
        motherboard.setSocket(socket);
        motherboard.setTipoMemoria(tipoMemoria);
        motherboard.setTipoGabinete(TipoGabinete.ATX);
        motherboard.setWifiIntegrado(true);

        var ssd = new SSD();
        ssd.setFabricante(new Fabricante("Kingston"));
        ssd.setCapacidade(1024).setVelocidade(65356);

        var video = new PlacaDeVideo();
        video.setFabricante(new Fabricante("Asus "));
        video.setModelo("RTX3070TI-O8G-V2-GAMING");


        var gabinete = new Gabinete();
        gabinete.setFabricante(new Fabricante("CoolerMaster"));
        gabinete.setLargura(1).setAltura(1).setProfundidade(2);
        gabinete.setTipo(TipoGabinete.ATX);

        builder.setProcessador(processador)
                .setPlacaMae(motherboard)
                .setArmazenamento(ssd)
                .setPlacaDeVideo(video)
                .setGabinete(gabinete);

        return builder;
    }

}
