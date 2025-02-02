package Sandwich_Orden;

import java.util.Scanner;

public class Sandwich_Orden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el tamaño del sandwich, pequeño o grande: ");
        String tamaño = sc.nextLine();

        int precioBase = tamaño.equals("grande") ? 12000 : 6000;

        System.out.println("¿Agregar jalapeño? (si/no):");
        if (sc.nextLine().equalsIgnoreCase("si"));

        System.out.println("¿Agregar tocineta? (si/no):");
        if (sc.nextLine().equalsIgnoreCase("si")) precioBase += 3000;

        System.out.println("¿Agregar pavo? (si/no):");
        if (sc.nextLine().equalsIgnoreCase("si")) precioBase += 3000;

        System.out.println("¿Agregar queso? (si/no):");
        if (sc.nextLine().equalsIgnoreCase("si")) precioBase += 2500;

        System.out.println("Total a pagar: $" + precioBase);

        sc.close();


    }
}
