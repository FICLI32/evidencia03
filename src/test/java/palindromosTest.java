import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class palindromosTest {
        @Test
        public void testEsPalindromo() {
            assertTrue(palindromos.esPalindromo("aaabccbaaa"));
            assertFalse(palindromos.esPalindromo("La tele letal"));
            assertFalse(palindromos.esPalindromo("ahabccbaaa"));
            assertFalse(palindromos.esPalindromo("200"));
            assertFalse(palindromos.esPalindromo(""));
        }
}

