public abstract class Peca implements Negociavel {

    public double getValor() {
        return this.getValorCompra() * (1 + (this.getMargemDeLucro() / 100));
    }

    private String modelo;

    private double valorCompra;
    private double margemDeLucro;

    private Fabricante fabricante;


    public String getModelo() {
        return modelo;
    }

    public Peca setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    @Override
    public double getValorCompra() {
        return valorCompra;
    }

    @Override
    public Negociavel setValorCompra(double valor) {
        this.valorCompra = valor;
        return this;
    }

    @Override
    public double getMargemDeLucro() {
        return margemDeLucro;
    }

    /**
     * Seta a margem de lucro para o equipamento:
     * Ex: para 20% informar 20.
     *
     * @param margem
     * @return
     */
    @Override
    public Negociavel setMargemDeLucro(double margem) {
        this.margemDeLucro = margem;
        return this;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public Peca setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
        return this;
    }

    @Override
    public String toString() {
        return "Peca{" +
                " fabricante=" + fabricante +
                '}';
    }
}
