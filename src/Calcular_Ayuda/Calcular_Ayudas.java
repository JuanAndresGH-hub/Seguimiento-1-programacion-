package Calcular_Ayuda;

import java.util.Scanner;

public class Calcular_Ayudas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 1 si usted es mujer, digite 2 si usted es hombre: ");
        int genero = sc.nextInt();

        System.out.println("Digite su edad: ");
        int edad = sc.nextInt();

        int ayuda = 0;
        if (genero == 1) {
            if (edad > 50) {
                ayuda = 120000;
            } else if (edad >= 30 && edad <= 50) {
                ayuda = 100000;
            }
        } else if (genero == 2) {
            ayuda = 40000;
        }

        System.out.println("Su ayuda es de " + ayuda);
    }
}
