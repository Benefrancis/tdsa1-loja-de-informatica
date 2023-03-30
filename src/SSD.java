public class SSD extends Peca{

    private int capacidade;

    private int velocidade;

    public SSD(int capacidade, int velocidade) {
        this.capacidade = capacidade;
        this.velocidade = velocidade;
    }

    public SSD() {
    }

    public int getCapacidade() {
        return capacidade;
    }

    public SSD setCapacidade(int capacidade) {
        this.capacidade = capacidade;
        return this;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public SSD setVelocidade(int velocidade) {
        this.velocidade = velocidade;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SSD{");
        sb.append("capacidade=").append(capacidade);
        sb.append(", velocidade=").append(velocidade);
        sb.append('}');
        return sb.toString();
    }
}
