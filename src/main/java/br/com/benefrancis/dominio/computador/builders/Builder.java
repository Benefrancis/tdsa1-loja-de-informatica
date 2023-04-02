package br.com.benefrancis.dominio.computador.builders;

import br.com.benefrancis.dominio.computador.abstracoes.Armazenamento;
import br.com.benefrancis.dominio.computador.componentes.*;

/**
 * <p>
 * <STRONG>Definição</STRONG>
 * </p>
 * O Builder é um padrão de projeto criacional que permite a você construir objetos complexos passo a passo.
 * O padrão permite que você produza diferentes tipos e representações de um objeto usando o mesmo código de
 * construção.
 *
 * <p>
 * <STRONG>Problema</STRONG>
 * </p>
 * Imagine um objeto complexo que necessite de uma inicialização passo a passo trabalhosa de muitos campos e
 * objetos agrupados. Tal código de inicialização fica geralmente enterrado dentro de um construtor monstruoso
 * com vários parâmetros. Ou pior: espalhado por todo o código cliente.
 * <p>
 * <strong>Solução</strong>
 * </p>
 * O padrão Builder sugere que você extraia o código de construção do objeto para fora de sua própria classe e
 * mova ele para objetos separados chamados construtores. O padrão organiza a construção de objetos em uma série de
 * etapas executa uma série de etapas em um objeto construtor.
 * <br />
 * <p>
 * A parte importante é que você não precisa chamar todas as etapas. Você chama apenas aquelas etapas que são
 * necessárias para a produção de uma configuração específica de um objeto.
 * </p>
 *
 * @param <T>
 */
public interface Builder<T> {

    Builder setProcessador(Processador processador);

    Builder setPlacaMae(PlacaMae placaMae);

    Builder setMemoria(Memoria memoria);

    Builder setGabinete(Gabinete gabinete);

    Builder setArmazenamento(Armazenamento armazenamento);

    Builder setPlacaDeVideo(PlacaDeVideo placaDeVideo);


    public T build();

}
