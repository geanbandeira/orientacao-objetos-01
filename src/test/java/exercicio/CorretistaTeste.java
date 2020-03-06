package exercicio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CorrentistaTeste {
    @Test
    public void criarCorrentista() {
        Correntista c1 = new Correntista();
        assertNotNull(c1);
    }

    @Test
    public void atributosCorrentista (){
        Correntista c1 = new Correntista();
        c1.nome = "Guilherme";
        c1.codigo = "5459";
        c1.nome = "Guilherme";
        c1.email = "guisantana0204@gmail.com";
        c1.telefone = "11-112234";
        assertNotNull(c1.nome + c1.telefone + c1.email + c1.codigo);
    }
}
