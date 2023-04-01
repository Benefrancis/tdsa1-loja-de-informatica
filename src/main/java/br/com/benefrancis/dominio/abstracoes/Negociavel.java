package br.com.benefrancis.dominio.abstracoes;

public interface Negociavel {

    public default double valorVenda() {
        return getValorCompra() * (1 + (getMargemDeLucro() / 100));
    }

    public double getValorCompra();

    public Negociavel setValorCompra(double valor);

    public double getMargemDeLucro();

    public Negociavel setMargemDeLucro(double margem);

}
