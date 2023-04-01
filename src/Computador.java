import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicReference;

public class Computador {




    private List<Peca> pecas = new Vector<>();

    private Fabricante marca = new Fabricante("Benefrancis");

    private Memoria[] memorias;

    private Gabinete gabinete;

    private PlacaDeVideo placaDeVideo;

    private Processador processador;

    private PlacaMae placaMae;

    private SSD ssd;

    private HD hd;

    private double valorCompra;

    private double margemDeLucro;

    public Computador() {
    }


    public Computador(Processador processador, PlacaMae placaMae, Gabinete gabinete, Memoria[] memorias, PlacaDeVideo placaDeVideo, SSD ssd, HD hd) {


        this.memorias = memorias;
        this.gabinete = gabinete;
        this.placaDeVideo = placaDeVideo;
        this.processador = processador;
        this.placaMae = placaMae;
        this.ssd = ssd;
        this.hd = hd;


        this.pecas = Arrays.asList(
                processador,
                placaDeVideo,
                gabinete,
                hd,
                ssd,
                (Peca) Arrays.stream(memorias).toList(),
                placaDeVideo
        );


    }


    public Fabricante getMarca() {
        return marca;
    }

    public Computador setMarca(Fabricante marca) {
        this.marca = marca;
        return this;
    }

    public Memoria[] getMemorias() {
        return memorias;
    }

    public Computador setMemorias(Memoria[] memorias) {
        this.memorias = memorias;
        return this;
    }

    public Gabinete getGabinete() {
        return gabinete;
    }

    public Computador setGabinete(Gabinete gabinete) {
        this.gabinete = gabinete;
        return this;
    }

    public PlacaDeVideo getPlacaDeVideo() {
        return placaDeVideo;
    }

    public Computador setPlacaDeVideo(PlacaDeVideo placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
        return this;
    }

    public Processador getProcessador() {
        return processador;
    }

    public Computador setProcessador(Processador processador) {
        this.processador = processador;
        return this;
    }

    public PlacaMae getPlacaMae() {
        return placaMae;
    }

    public Computador setPlacaMae(PlacaMae placaMae) {
        this.placaMae = placaMae;
        return this;
    }

    public SSD getSsd() {
        return ssd;
    }

    public Computador setSsd(SSD ssd) {
        this.ssd = ssd;
        return this;
    }

    public HD getHd() {
        return hd;
    }

    public Computador setHd(HD hd) {
        this.hd = hd;
        return this;
    }

    public synchronized double getValor() {
        double v = 0;

        for (Peca p : this.pecas) {
            v += p.getValor();
        }


        return v;
    }

    public Fabricante getFabricante() {
        return marca;
    }


    @Override
    public String toString() {
        return "Computador{" +
                "marca=" + marca +
                ", memorias=" + Arrays.toString(memorias) +
                ", gabinete=" + gabinete +
                ", placaDeVideo=" + placaDeVideo +
                ", processador=" + processador +
                ", placaMae=" + placaMae +
                ", ssd=" + ssd +
                ", hd=" + hd +
                ", valor=" + String.format("%nR$ %,.2f", this.getValor()) +
                '}';
    }
}
