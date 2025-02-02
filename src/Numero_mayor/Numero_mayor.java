package Numero_mayor;

import java.util.Scanner;

public class Numero_mayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero1 = sc.nextInt();

        System.out.print("Ingrese un numero: ");
        int numero2 = sc.nextInt();

        System.out.print("Ingrese un numero: ");
        int numero3 = sc.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El numero mayor es: " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("El numero mayor es: " + numero2);
        } else if (numero3 > numero1 && numero3 > numero2) {
            System.out.println("El numero mayor es: " + numero3);
        }
    }
}
