public class PlacaMae extends Peca {

    private TipoGabinete tipo;

    private Socket socket;

    private TipoMemoria tipoMemoria;


    public PlacaMae() {
    }

    public PlacaMae(TipoGabinete tipo, Socket socket, TipoMemoria tipoMemoria) {
        this.tipo = tipo;
        this.socket = socket;
        this.tipoMemoria = tipoMemoria;
    }

    @Override
    public String toString() {
        return "PlacaMae{" +
                "tipo=" + tipo +
                ", socket=" + socket +
                ", tipoMemoria=" + tipoMemoria +
                "} " + super.toString();
    }
}
