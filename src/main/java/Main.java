import br.com.benefrancis.dominio.builders.ComputadorBuilder;
import br.com.benefrancis.dominio.computador.Computador;
import br.com.benefrancis.dominio.builders.configuradores.ConfiguradorDeComputadores;

public class Main {
    public static void main(String[] args) {

        ComputadorBuilder builder = new ComputadorBuilder();
        ConfiguradorDeComputadores configurador = new ConfiguradorDeComputadores(builder);
        Computador coputador = configurador.configuraCoputadorGamerAMD();

        System.out.println(coputador);

    }
}