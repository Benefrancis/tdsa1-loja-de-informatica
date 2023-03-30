public class PlacaDeVideo extends Peca {
    private String modelo;


    public PlacaDeVideo(String modelo) {
        this.modelo = modelo;
    }

    public PlacaDeVideo() {
    }

    public String getModelo() {
        return modelo;
    }

    public PlacaDeVideo setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PlacaDeVideo{");
        sb.append("modelo='").append(modelo).append('\'');
        sb.append('}');
        return sb.toString();
    }
}