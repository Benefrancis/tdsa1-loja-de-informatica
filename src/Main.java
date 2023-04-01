public class Main {
    public static void main(String[] args) {

        Fabricante dell = new Fabricante("Dell");

        Computador comp0 = new Computador();

        PlacaMae placa = new PlacaMae(TipoGabinete.ATX, Socket.AM5, TipoMemoria.DDR5);

        placa.setFabricante(new Fabricante("ASUS"))
                .setValorCompra(1000)
                .setMargemDeLucro(15);

        Processador processador = new Processador(Socket.AM5);

        Gabinete gabinete = new Gabinete();
        gabinete.setTipo(TipoGabinete.ATX)
                .setModelo("13213")
                .setAltura(1)
                .setLargura(1)
                .setProfundidade(1)
                .setFabricante(new Fabricante("Cooler Master"))
                .setValorCompra(200)
                .setMargemDeLucro(20);


        Memoria memoria = new Memoria();
        memoria.setTipo(TipoMemoria.DDR5)
                .setMHZ(6000)
                .setCapacidade(64)
                .setModelo("DDR5-2023-64-6000")
                .setRGB(true)
                .setFabricante(new Fabricante("Kingston"))
                .setValorCompra(300)
                .setMargemDeLucro(20);

        SSD ssd = new SSD();
        ssd.setCapacidade(1024)
                .setFabricante(new Fabricante("Kingston"))
                .setValorCompra(300)
                .setMargemDeLucro(20);

        HD hd = new HD();
        hd.setModelo("SEAGATE-156600")
                .setFabricante(new Fabricante("Segate"))
                .setValorCompra(200)
                .setMargemDeLucro(20);

        PlacaDeVideo video = new PlacaDeVideo();
        video.setFabricante(new Fabricante("ZOTAC"))
                .setModelo("RTX 3060")
                .setValorCompra(1500)
                .setMargemDeLucro(18);


        comp0.setMarca(dell)
                .setMemorias(new Memoria[]{memoria})
                .setPlacaMae(placa)
                .setProcessador(processador)
                .setGabinete(gabinete)
                .setSsd(ssd)
                .setHd(hd)
                .setPlacaDeVideo(video);

        System.out.println(comp0);

    }
}