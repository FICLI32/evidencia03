package com.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class PalindromoTest {
    
    @Test
    public void testPalindromoCadenasBasicas() {
        assertTrue(Palindromo.palindromo("aca"));
        assertFalse(Palindromo.palindromo("acas"));
        assertTrue(Palindromo.palindromo("h"));
    }

    @Test
    public void testPalindromoCasosAdicionales() {
        assertFalse(Palindromo.palindromo("200"));
        assertTrue(Palindromo.palindromo(""));
        assertTrue(Palindromo.palindromo("aaabccbaaa"));
        assertFalse(Palindromo.palindromo("ahabccbaaa")); 
        assertTrue(Palindromo.palindromo("La tele letal"));
    }

}