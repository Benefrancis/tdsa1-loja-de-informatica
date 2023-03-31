package br.com.benefrancis.dominio.computador;

import br.com.benefrancis.dominio.abstracoes.Peca;
import br.com.benefrancis.dominio.enumeracoes.TipoDeSocket;
import br.com.benefrancis.dominio.enumeracoes.TipoGabinete;
import br.com.benefrancis.dominio.enumeracoes.TipoMemoria;

public class PlacaMae extends Peca {

    private TipoMemoria tipoMemoria;

    private TipoGabinete tipoGabinete;

    private TipoDeSocket socket;

    private boolean wifiIntegrado;

    public PlacaMae() {
    }

    public PlacaMae(TipoMemoria tipoMemoria, TipoGabinete tipoGabinete, TipoDeSocket socket, boolean wifiIntegrado) {
        this.tipoMemoria = tipoMemoria;
        this.tipoGabinete = tipoGabinete;
        this.socket = socket;
        this.wifiIntegrado = wifiIntegrado;
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
        return "PlacaMae{" +
                "tipoMemoria=" + tipoMemoria +
                ", tipoGabinete=" + tipoGabinete +
                ", socket=" + socket +
                ", wifiIntegrado=" + wifiIntegrado +
                "} " + super.toString();
    }
}
