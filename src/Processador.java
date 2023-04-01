public class Processador extends Peca {


    private Socket socket;

    private int quantidadeDeNucleos;

    private int quantidadeDeThreads;

    private int cache;


    public Processador() {
    }


    public Processador(Socket socket) {
        this.socket = socket;
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
        return "Processador{" +
                "socket=" + socket +
                ", quantidadeDeNucleos=" + quantidadeDeNucleos +
                ", quantidadeDeThreads=" + quantidadeDeThreads +
                ", cache=" + cache +
                "} " + super.toString();
    }
}
