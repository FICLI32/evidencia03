package com.example;

import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        menu(scanner);
        scanner.close();
    }

    public static void menu(Scanner scanner) {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerOpcion(scanner);
            ejecutarOpcion(opcion, scanner);
        } while (opcion != 2);
    }

    public static void mostrarMenu() {
        System.out.println("\n--- Bienvenido al menu ---");
        System.out.println("1. Ingresar cadena para verificar si es palindromo");
        System.out.println("2. Salir");
        System.out.print("Seleccione una opcion: ");
    }

    public static int leerOpcion(Scanner scanner) {
        int opcion = 0;
        while (true) { 
            if(scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                if (opcion >= 1 && opcion <=2) {
                    break;
                } else {
                    System.out.println("Opcion invalida, ingrese nuevamente");
                    scanner.next();
                }
            } else {
                System.out.println("Entrada no valida, ingrese nuevamente");
                scanner.next();
            }
        } 
        scanner.nextLine();
        return opcion;
    }

    public static void ejecutarOpcion(int opcion, Scanner scanner) {
        switch (opcion) {
            case 1:
                System.out.println("Ingrese la cadena: ");
                String cadena = scanner.nextLine();
                boolean resultado = palindromo(cadena);
                System.out.println("Es palindromo? " + resultado);
                break;

            case 2:
                System.out.println("Saliendo del programa...");
                break;

            default:
                System.out.println("Opcion no valida, intente de nuevo");
        }
    } 

    public static boolean palindromo(String cadena) {
        //el codigo deberia convertir la cadena a minusculas para que no sea sensible con eso
        //quizas quitarle el espacio y otros caracteres no alfabeticos
        //invertir y otra para comparar la cadena
        cadena = cadena.toLowerCase();
        cadena = cadena.replaceAll("[^a-zA-Z0-9]","");

        StringBuilder resultado = new StringBuilder(cadena).reverse();

        return cadena.equals(resultado.toString());
    }
    
}
