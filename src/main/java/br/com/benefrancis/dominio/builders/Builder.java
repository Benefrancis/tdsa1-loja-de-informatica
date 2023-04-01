package br.com.benefrancis.dominio.builders;

import br.com.benefrancis.dominio.abstracoes.Armazenamento;
import br.com.benefrancis.dominio.computador.*;

public interface Builder<T> {

    Builder setProcessador(Processador processador);

    Builder setPlacaMae(PlacaMae placaMae);

    Builder setMemoria(Memoria memoria);

    Builder setGabinete(Gabinete gabinete);

    Builder setArmazenamento(Armazenamento armazenamento);

    Builder setPlacaDeVideo(PlacaDeVideo placaDeVideo);


    public T build();

}
