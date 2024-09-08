

public class EsPalindromo {

    public static void main(String[] args) {
        esPalindromo("Amo la pacifica paloma");
    }

    public static String invertirCadena (String cadena) {
        String cadenaInvertida;
        StringBuilder sb = new StringBuilder(cadena);
        cadenaInvertida = sb.reverse().toString();
        return cadenaInvertida;
    }

    public static String eliminarCaracteresEspeciales (String cadena){
        String cadenaProcesada = cadena.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return cadenaProcesada;
    }

    public static boolean esPalindromo (String cadena){
        String cadenaProcesada = eliminarCaracteresEspeciales(cadena);
        String cadenaInvertida = invertirCadena(cadenaProcesada);
        if (cadenaProcesada.equals(cadenaInvertida)){
            return true;
        }else{
            return false;
        }
    }
}


/*
    public static boolean esPalindromo (String cadena){

        String resultado = new StringBuilder(cadena).reverse().toString();

        return cadena.equals(resultado);
    }
*/
