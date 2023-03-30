public class Computador {

    private String modelo;
    private Fabricante marca;
    private float preco;
    private int memoriaRAM;
    private int espacoHD;
    private String processador;
    private boolean placaDeVideoDedicada;

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m != null ? m.toUpperCase().trim() : null;
    }

    public Fabricante getMarca() {
        return marca;
    }

    public void setMarca(Fabricante marca) {
        this.marca = marca;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco >= 0 ? preco : 0;
    }

    public int getEspacoHD() {
        return espacoHD;
    }

    public void setEspacoHD(int espacoHD) {
        this.espacoHD = espacoHD;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String p) {
        this.processador = p != null ? p.toUpperCase().trim() : null;
    }

    public boolean isPlacaDeVideoDedicada() {
        return placaDeVideoDedicada;
    }

    public void setPlacaDeVideoDedicada(boolean placaDeVideoDedicada) {
        this.placaDeVideoDedicada = placaDeVideoDedicada;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computador{");
        sb.append("modelo='").append(modelo).append('\'');
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", preco=").append(preco);
        sb.append(", memoriaRAM=").append(memoriaRAM);
        sb.append(", espacoHD=").append(espacoHD);
        sb.append(", processador='").append(processador).append('\'');
        sb.append(", placaDeVideoDedicada=").append(placaDeVideoDedicada);
        sb.append('}');
        return sb.toString();
    }
}
