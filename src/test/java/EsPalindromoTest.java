import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EsPalindromoTest {

    @Test
    void esPalindromo() {
        assertTrue(EsPalindromo.esPalindromo("¿Acaso hubo buhos aca?"));
    }

}