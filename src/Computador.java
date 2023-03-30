import java.util.Arrays;

public class Computador implements Negociavel{

    private Peca[] componentes;
    private double valorCompra;
    private double margemDeLucro;

    private Fabricante fabricante;

    @Override
    public double getValorCompra() {
        double acumulador = 0;
        for (int i=0; i<componentes.length; i++){
            acumulador += componentes[i].getValorCompra();
        }
        return acumulador;
    }

    @Override
    public Negociavel setValorCompra(double valor) {
        System.out.println("O valor de compra é a soma dos valores de compra das pecas");
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


    public Computador() {
    }

    public Computador(Peca[] componentes, double valorCompra, double margemDeLucro, Fabricante fabricante) {
        this.componentes = componentes;
        this.valorCompra = valorCompra;
        this.margemDeLucro = margemDeLucro;
        this.fabricante = fabricante;
    }

    public Peca[] getComponentes() {
        return componentes;
    }

    public Computador setComponentes(Peca[] componentes) {
        this.componentes = componentes;
        return this;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public Computador setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
        return this;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "componentes=" + Arrays.toString(componentes) +
                ", valorCompra=" + valorCompra +
                ", margemDeLucro=" + margemDeLucro +
                ", fabricante=" + fabricante +
                '}';
    }
}
