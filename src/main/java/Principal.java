import com.manoelcampos.retornoboleto.ProcessarBoletos;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Executa a aplicação para ler um arquivo de
 * retorno de boleto e imprimir no terminal.
 * @author manoelcampos
 */
public class Principal {
    public static void main(String[] args) throws URISyntaxException {
        ProcessarBoletos processador = new ProcessarBoletos(ProcessarBoletos::lerBradesco);
        URI caminhoArquivo = Principal.class.getResource("bradesco-1.csv").toURI();
        processador.processar(caminhoArquivo);


    }
}
