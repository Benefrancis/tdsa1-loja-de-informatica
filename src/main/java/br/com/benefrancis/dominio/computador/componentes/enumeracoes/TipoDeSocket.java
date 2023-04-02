package br.com.benefrancis.dominio.computador.componentes.enumeracoes;

import br.com.benefrancis.dominio.fabricante.Fabricante;
import com.google.gson.Gson;

/**
 * Soquete é o componente com o qual você vai prender/instalar seu processador no PC
 *
 * @see <a href="https://adrenaline.com.br/artigos/v/71710/voce-sabe-o-que-e-um-soquete-para-processador-vai-saber" >leia</a>
 */
public enum TipoDeSocket {


    AM3(1, "AM3", new Fabricante("AMD")),
    AM4(2, "AM4", new Fabricante("AMD")),
    AM5(3, "AM5", new Fabricante("AMD")),
    INTEL_LGA1155(4, "LGA1155", new Fabricante("Intel")),
    INTEL_LGA1156(5, "LGA1156", new Fabricante("Intel")),
    INTEL_LGA1200(6, "LGA1200", new Fabricante("Intel"));


    int id;

    String nome;

    Fabricante fabricante;


    TipoDeSocket(int id, String nome, Fabricante fabricante) {
        this.id = id;
        this.nome = nome;
        this.fabricante = fabricante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
