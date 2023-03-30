public class Memoria extends Peca {

    private String modelo;

    private int capacidade;

    private int MHZ;

    private TipoMemoria tipo;

    private boolean RGB;

    public Memoria() {
    }

    public Memoria(String modelo, int capacidade, int MHZ, TipoMemoria tipo, boolean RGB) {
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.MHZ = MHZ;
        this.tipo = tipo;
        this.RGB = RGB;
    }

    public String getModelo() {
        return modelo;
    }

    public Memoria setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public Memoria setCapacidade(int capacidade) {
        this.capacidade = capacidade;
        return this;
    }

    public int getMHZ() {
        return MHZ;
    }

    public Memoria setMHZ(int MHZ) {
        this.MHZ = MHZ;
        return this;
    }

    public TipoMemoria getTipo() {
        return tipo;
    }

    public Memoria setTipo(TipoMemoria tipo) {
        this.tipo = tipo;
        return this;
    }

    public boolean isRGB() {
        return RGB;
    }

    public Memoria setRGB(boolean RGB) {
        this.RGB = RGB;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Memoria{");
        sb.append("modelo='").append(modelo).append('\'');
        sb.append(", capacidade=").append(capacidade);
        sb.append(", MHZ=").append(MHZ);
        sb.append(", tipo=").append(tipo);
        sb.append(", RGB=").append(RGB);
        sb.append('}');
        return sb.toString();
    }
}
