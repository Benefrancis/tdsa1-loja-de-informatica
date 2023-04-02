package br.com.benefrancis.dominio.computador.componentes;

import br.com.benefrancis.dominio.computador.abstracoes.Componente;
import br.com.benefrancis.dominio.computador.componentes.enumeracoes.TipoDeSocket;
import br.com.benefrancis.dominio.computador.componentes.enumeracoes.TipoGabinete;
import br.com.benefrancis.dominio.computador.componentes.enumeracoes.TipoMemoria;
import br.com.benefrancis.dominio.fabricante.Fabricante;
import com.google.gson.Gson;

public class PlacaMae extends Componente {

    private TipoMemoria tipoMemoria;

    private TipoGabinete tipoGabinete;

    private TipoDeSocket socket;

    private boolean wifiIntegrado;


    private int quantidadeDeCPU;

    public PlacaMae() {
    }


    public PlacaMae(String modelo, Fabricante fabricante, TipoMemoria tipoMemoria, TipoGabinete tipoGabinete, TipoDeSocket socket, boolean wifiIntegrado, byte quantidadeDeCPU) {
        super(modelo, fabricante);
        this.tipoMemoria = tipoMemoria;
        this.tipoGabinete = tipoGabinete;
        this.socket = socket;
        this.wifiIntegrado = wifiIntegrado;
        this.quantidadeDeCPU = quantidadeDeCPU;
    }

    public int getQuantidadeDeCPU() {
        return quantidadeDeCPU;
    }

    public PlacaMae setQuantidadeDeCPU(int quantidadeDeCPU) {
        this.quantidadeDeCPU = quantidadeDeCPU;
        return this;
    }

    public TipoMemoria getTipoMemoria() {
        return tipoMemoria;
    }

    public void setTipoMemoria(TipoMemoria tipoMemoria) {
        this.tipoMemoria = tipoMemoria;
    }

    public TipoGabinete getTipoGabinete() {
        return tipoGabinete;
    }

    public void setTipoGabinete(TipoGabinete tipoGabinete) {
        this.tipoGabinete = tipoGabinete;
    }

    public TipoDeSocket getSocket() {
        return socket;
    }

    public void setSocket(TipoDeSocket socket) {
        this.socket = socket;
    }

    public boolean isWifiIntegrado() {
        return wifiIntegrado;
    }

    public void setWifiIntegrado(boolean wifiIntegrado) {
        this.wifiIntegrado = wifiIntegrado;
    }



    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
