package senha;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestSenha {
       
    @Test
    void deveAceitarSenhaValida() {
        Senha senha = new Senha("Abcde@123");
        boolean retornoEsperado = true;
        boolean retornoFeito = senha.eValida();
        assertEquals(retornoEsperado, retornoFeito);
    }

    @Test
    void deveRecusarSenhaComMenosDeOitoCaracteres() {
        Senha senha = new Senha("Abc@1");
        boolean retornoEsperado = false;
        boolean retornoFeito = senha.eValida();
        assertEquals(retornoEsperado, retornoFeito);        
    }

    @Test
    void deveRecusarSenhaSemMaiuscula() {
        Senha senha = new Senha("abcde@123");
        boolean retornoEsperado = false;
        boolean retornoFeito = senha.eValida();
        assertEquals(retornoEsperado, retornoFeito);
    }

    @Test
    void deveRecusarSenhaSemNumero() {
        Senha senha = new Senha("Abcde@xyz");
        boolean retornoEsperado = false;
        boolean retornoFeito = senha.eValida();
        assertEquals(retornoEsperado, retornoFeito);
    }

    @Test
    void deveRecusarSenhaSemCaractereEspecial() {
        Senha senha = new Senha("Abcdef123");
        boolean retornoEsperado = false;
        boolean retornoFeito = senha.eValida();
        assertEquals(retornoEsperado, retornoFeito);
    }

    @Test
    void deveRecusarSenhaNula() {
        Senha senha = new Senha(null);
        boolean retornoEsperado = false;
        boolean retornoFeito = senha.eValida();
        assertEquals(retornoEsperado, retornoFeito);
    }   
}