public class palindromos {

    public static boolean esPalindromo(String texto) {
        try {
            if (contieneNumeros(texto)) {
                System.out.println("Error: Los números no están permitidos");
                return false;
            }
            if (esVacio(texto)) {
                System.out.println("Texto vacio no permitido");
                return false;
            }
            String textoInvertido = invertirTexto(texto);
            return texto.equals(textoInvertido);

        }catch (IllegalArgumentException e) {
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
    private static boolean esVacio(String texto) {
        return texto == null || texto.isEmpty();
    }

}