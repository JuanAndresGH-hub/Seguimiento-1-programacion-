package Calcular_Lados;

import java.util.Scanner;

public class Calcular_Lados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer angulo del triangulo: ");
        int lado = sc.nextInt();

        System.out.println("Ingrese el segundo angulo triangulo: ");
        int lado2 = sc.nextInt();

        System.out.println("Ingrese el tercer angulo del triangulo: ");
        int lado3 = sc.nextInt();

        int suma_lados = lado + lado2 + lado3;

        if (suma_lados == 180) {
            System.out.println("El triangulo es correcto");
        } else {
            System.out.println("El triangulo es incorrecto");
        }
    }
}
