package Numero_Positivo_Negativo;

import java.util.Scanner;

public class Numero_Positivo_Negativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt();

        if  (numero >= 0 ) {
            System.out.println(numero + " es positivo");
        }else if (numero <= -1) {
            System.out.println(numero + " es negativo");

        }

    }
}
