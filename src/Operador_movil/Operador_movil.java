package Operador_movil;

import java.util.Scanner;

public class Operador_movil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu operador: ");
        String operador = sc.nextLine();

        System.out.println("Ingresa la cantidad de minutos usados: ");
        int minutos = sc.nextInt();

        int ValorMinutos = 0;
        int cargoFijo = 0;
        int valorPaquete = 0;

        switch (operador) {
            case "Tigo":
                cargoFijo = 45000;
                operador = "Tigo";
                ValorMinutos = 200;
                valorPaquete = 12000;
                break;
            case "Claro":
                cargoFijo = 30000;
                operador = "Claro";
                ValorMinutos = 100;
                valorPaquete = 18000;
                break;
            case "Movistar":
                cargoFijo = 40000;
                operador = "Movistar";
                ValorMinutos = 250;
                valorPaquete = 8000;
                break;
            default:
                System.out.println("Operador no válido. Intente de nuevo.");
                sc.close();
                return;

        }

        int CosteMinutos = minutos * ValorMinutos;
        int total = cargoFijo + valorPaquete + CosteMinutos;

        System.out.println("Operador seleccionado: " + operador.toUpperCase());
        System.out.println("Cargo fijo: $" + cargoFijo);
        System.out.println("Costo minutos internacionales: $" + CosteMinutos);
        System.out.println("Valor paquete de datos: $" + valorPaquete);
        System.out.println("Total a pagar: $" + total);


    }
}
