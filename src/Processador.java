public class Processador extends Peca {
    private String modelo;

    private int quantidadeDeNucleos;

    private int quantidadeDeThreads;

    private int cache;


    public Processador() {
    }

    public Processador(String modelo, int quantidadeDeNucleos, int quantidadeDeThreads, int cache) {
        this.modelo = modelo;
        this.quantidadeDeNucleos = quantidadeDeNucleos;
        this.quantidadeDeThreads = quantidadeDeThreads;
        this.cache = cache;
    }

    public String getModelo() {
        return modelo;
    }

    public Processador setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public int getQuantidadeDeNucleos() {
        return quantidadeDeNucleos;
    }

    public Processador setQuantidadeDeNucleos(int quantidadeDeNucleos) {
        this.quantidadeDeNucleos = quantidadeDeNucleos;
        return this;
    }

    public int getQuantidadeDeThreads() {
        return quantidadeDeThreads;
    }

    public Processador setQuantidadeDeThreads(int quantidadeDeThreads) {
        this.quantidadeDeThreads = quantidadeDeThreads;
        return this;
    }

    public int getCache() {
        return cache;
    }

    public Processador setCache(int cache) {
        this.cache = cache;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Processador{");
        sb.append("modelo='").append(modelo).append('\'');
        sb.append(", quantidadeDeNucleos=").append(quantidadeDeNucleos);
        sb.append(", quantidadeDeThreads=").append(quantidadeDeThreads);
        sb.append(", cache=").append(cache);
        sb.append('}');
        return sb.toString();
    }
}
