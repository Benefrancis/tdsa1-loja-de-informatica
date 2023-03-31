import br.com.benefrancis.dominio.abstracoes.Peca;
import br.com.benefrancis.dominio.builders.ComputadorBuilder;
import br.com.benefrancis.dominio.computador.Computador;
import br.com.benefrancis.dominio.computador.Gabinete;
import br.com.benefrancis.dominio.configuradores.ConfiguradorDeComputadores;
import br.com.benefrancis.dominio.enumeracoes.TipoGabinete;
import br.com.benefrancis.dominio.fabricante.Fabricante;

public class Main {
    public static void main(String[] args) {


        ConfiguradorDeComputadores configurador = new ConfiguradorDeComputadores();
        configurador.configuraCoputadorGamerAMD( );

    }
}