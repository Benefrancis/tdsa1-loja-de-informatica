public class Gabinete extends Peca {
    private String modelo;
    private float altura;
    private float largura;
    private float profundidade;

    private TipoGabinete tipo;

    public Gabinete() {
    }

    public Gabinete(String modelo, float altura, float largura, float profundidade, TipoGabinete tipo) {
        this.modelo = modelo;
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public Gabinete setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public float getAltura() {
        return altura;
    }

    public Gabinete setAltura(float altura) {
        this.altura = altura;
        return this;
    }

    public float getLargura() {
        return largura;
    }

    public Gabinete setLargura(float largura) {
        this.largura = largura;
        return this;
    }

    public float getProfundidade() {
        return profundidade;
    }

    public Gabinete setProfundidade(float profundidade) {
        this.profundidade = profundidade;
        return this;
    }

    public TipoGabinete getTipo() {
        return tipo;
    }

    public Gabinete setTipo(TipoGabinete tipo) {
        this.tipo = tipo;
        return this;
    }

    @Override
    public String toString() {
        return "Gabinete{" +
                "modelo='" + modelo + '\'' +
                ", altura=" + altura +
                ", largura=" + largura +
                ", profundidade=" + profundidade +
                ", tipo=" + tipo +
                "} " + super.toString();
    }
}
