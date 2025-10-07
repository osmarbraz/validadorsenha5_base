package senha;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestSenha {
       
    @Test
    void testDeveAceitarSenhaValida() {
        Senha senha = new Senha("Abcde@123");
        boolean retornoEsperado = true;
        boolean retornoFeito = senha.eValida();
        assertEquals(retornoEsperado, retornoFeito);
    }

    @Test
    void testDeveRecusarSenhaComMenosDeOitoCaracteres() {
        Senha senha = new Senha("Abc@1");
        boolean retornoEsperado = false;
        boolean retornoFeito = senha.eValida();
        assertEquals(retornoEsperado, retornoFeito);        
    }

    @Test
    void testDeveRecusarSenhaSemMaiuscula() {
        Senha senha = new Senha("abcde@123");
        boolean retornoEsperado = false;
        boolean retornoFeito = senha.eValida();
        assertEquals(retornoEsperado, retornoFeito);
    }

    @Test
    void testDeveRecusarSenhaSemNumero() {
        Senha senha = new Senha("Abcde@xyz");
        boolean retornoEsperado = false;
        boolean retornoFeito = senha.eValida();
        assertEquals(retornoEsperado, retornoFeito);
    }

    @Test
    void testDeveRecusarSenhaSemCaractereEspecial() {
        Senha senha = new Senha("Abcdef123");
        boolean retornoEsperado = false;
        boolean retornoFeito = senha.eValida();
        assertEquals(retornoEsperado, retornoFeito);
    }

    @Test
    void testDeveRecusarSenhaNula() {
        Senha senha = new Senha(null);
        boolean retornoEsperado = false;
        boolean retornoFeito = senha.eValida();
        assertEquals(retornoEsperado, retornoFeito);
    }   
}