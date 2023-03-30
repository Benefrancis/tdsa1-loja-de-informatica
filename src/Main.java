public class Main {
    public static void main(String[] args) {


        Computador comp0 = new Computador();


        Gabinete gabinete = new Gabinete();
        gabinete.setTipo(TipoGabinete.ATX).setModelo("13213").setAltura(1).setLargura(1).setProfundidade(1).setFabricante(new Fabricante("Cooler Master"))
                .setValorCompra(200).setMargemDeLucro(20);


        comp0.setComponentes(new Peca[]{gabinete});


        System.out.println(comp0);

    }
}