import java.util.Scanner;

public class DetectorPalindromo {
    public static void main(String[] args) {
        while(true) {
            System.out.print("Menú \n");
            System.out.println("Option 1 = Consulta palíndromo");
            System.out.println("Option 2 = Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Choose an option: ");
            String option = scanner.nextLine();
            scanner.close();

            if (option.equals("1")) {
                Scanner scanner1 = new Scanner(System.in);
                System.out.print("Escribe alguna oración: ");
                String cadena = scanner1.nextLine();
                if (esPalindromo(cadena)) {
                    System.out.println("Is palíndromo");
                } else {
                    System.out.println("Not is palíndromo");
                    scanner.close();
                }
            } else if (option.equals("2")) {
                scanner.close();
                System.exit(0);
            } else {
                scanner.close();
                System.out.println("You need to choose another option");
            }
        }
    }

    public static boolean esPalindromo(String cadena) {
        String cadenaSinEspacios = cadena.replace(" ","").toLowerCase();
        String cadenaInvertida = invertidaSinEspacios(cadena).toLowerCase();
        return cadenaInvertida.equals(cadenaSinEspacios);

    }

    public static String invertidaSinEspacios(String cadena) {
        String sinEspacios = cadena.replace(" ", "");
        return new StringBuilder(sinEspacios).reverse().toString();
    }
}
