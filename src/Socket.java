public enum Socket {

    AM3(1, "AM3", new Fabricante("AMD")),
    AM4(2, "AM4", new Fabricante("AMD")),
    AM5(3, "AM5", new Fabricante("AMD")),
    INTEL(4, "Intel B660", new Fabricante("Intel"));


    private int id;

    private String chipset;

    private Fabricante fabricante;

    Socket(int id, String chipset, Fabricante fabricante) {
        this.id = id;
        this.chipset = chipset;
        this.fabricante = fabricante;
    }
}
