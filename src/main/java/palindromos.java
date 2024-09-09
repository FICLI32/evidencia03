public class palindromos {
    public static void main(String[] args) {
        String caso1 = "200";
        String caso2 = "";
        String caso3 = "aaabccbaaa";
        String caso4 = "ahabccbaaa";
        String caso5 = "La tele letal";
        esPalindromo(caso1);
        System.out.println(" '' es palindromo?" + esPalindromo(caso2));
        System.out.println("aaabccbaaa es palindromo?" + esPalindromo(caso3));
        System.out.println(" ahabccbaaa es palindromo?" + esPalindromo(caso4));
        System.out.println(" La tele letal es palindromo?" + esPalindromo(caso5));


    }

    public static boolean esPalindromo(String texto) {
        try {
            if (contieneNumeros(texto)) {
                System.out.println("Error: Los números no están permitidos");
                return false;
            }
            String textoInvertido = invertirTexto(texto);
            return texto.equals(textoInvertido);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public static String invertirTexto(String palindromo) {
        palindromo = palindromo.toLowerCase();
        String palindromoAlReves = "";
        for (int i = palindromo.length() - 1; i >= 0; i--) {
            palindromoAlReves += palindromo.charAt(i);
        }
        return palindromoAlReves;
    }
    public static boolean contieneNumeros(String texto) {
        return texto.matches(".*\\d.*");
    }

}