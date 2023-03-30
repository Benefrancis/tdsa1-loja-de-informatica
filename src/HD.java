public class HD extends Peca{

    private int capacidade;

    private int velocidade;


    public HD() {
    }

    public HD(int capacidade, int velocidade) {
        this.capacidade = capacidade;
        this.velocidade = velocidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public HD setCapacidade(int capacidade) {
        this.capacidade = capacidade;
        return this;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public HD setVelocidade(int velocidade) {
        this.velocidade = velocidade;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HD{");
        sb.append("capacidade=").append(capacidade);
        sb.append(", velocidade=").append(velocidade);
        sb.append('}');
        return sb.toString();
    }
}
