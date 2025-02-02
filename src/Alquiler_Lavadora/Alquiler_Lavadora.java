package Alquiler_Lavadora;

import java.util.Scanner;

public class Alquiler_Lavadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tarifa1 = 4000;
        int tarifa2 = 3000;
        double descuento = 0.03;

        System.out.print("Digite 1 para lavadora grande, o 2 para lavadora pequeña: ");
        int tipo_lavadora = sc.nextInt();

        System.out.print("Ingrese la cantidad de lavadoras a alquilar: ");
        int lavadoras = sc.nextInt();

        System.out.print("Ingrese la cantidad de horas que va a alquilar la lavadora: ");
        int horasAlquiladas = sc.nextInt();

        int precioHora;
        if (tipo_lavadora == 1) {
            precioHora = tarifa1;
        } else if (tipo_lavadora == 2) {
            precioHora = tarifa2;
        } else {
            System.out.println("El dato ingresado no es correcto, vuelva a intentarlo");
            sc.close();
            return;
        }

        double total = lavadoras * horasAlquiladas * precioHora;

        if (lavadoras > 3) {
            total -= total * descuento;
        }

        System.out.println("El costo total es: $" + total);

        sc.close();
    }
}
