public class Main {
    public static void main(String[] args) {

        Fabricante dell = new Fabricante("Dell");
        Fabricante hp = new Fabricante("HP");


        Computador comp0 = new Computador();
        comp0.setModelo("    Vostro    ");
        comp0.setMarca(dell);
        comp0.setPreco(5999.99F);
        comp0.setProcessador("Intel i7");
        comp0.setMemoriaRAM(64);
        comp0.setEspacoHD(1024);
        comp0.setPlacaDeVideoDedicada(true);


        Computador comp1 = new Computador();
        comp1.setModelo("HP123");
        comp1.setMarca(hp);
        comp1.setPreco(7999.99F);
        comp1.setProcessador("Intel i9");
        comp1.setMemoriaRAM(64);
        comp1.setEspacoHD(1024);
        comp1.setPlacaDeVideoDedicada(false);

        Computador comp2 = new Computador();
        comp2.setModelo("Latitude");
        comp2.setMarca(dell);
        comp2.setPreco(4999.99F);
        comp2.setProcessador("Intel i5");
        comp2.setMemoriaRAM(32);
        comp2.setEspacoHD(1024);
        comp2.setPlacaDeVideoDedicada(false);

        System.out.println(comp0);
        System.out.println(comp1);
        System.out.println(comp2);
    }
}