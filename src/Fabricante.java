public class Fabricante {
    private String nome;

    public String getNome() {
        return nome;
    }

    public Fabricante setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Fabricante(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Fabricante{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
