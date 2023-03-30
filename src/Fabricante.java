public class Fabricante {
    private String nome;

    public Fabricante(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Fabricante setNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public String toString() {
        return "Fabricante{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
