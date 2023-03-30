public abstract class Peca implements Negociavel {
    private double valorCompra;
    private double margemDeLucro;

    private Fabricante fabricante;

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
                "valorCompra=" + valorCompra +
                ", margemDeLucro=" + margemDeLucro +
                ", fabricante=" + fabricante +
                '}';
    }
}
