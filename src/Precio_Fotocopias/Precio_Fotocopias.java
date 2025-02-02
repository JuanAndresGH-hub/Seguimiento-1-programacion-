package Precio_Fotocopias;

import java.util.Scanner;

public class Precio_Fotocopias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de fotocopias que deseas imprimir: ");
        int cantidad = sc.nextInt();

        int precio = 0;
        if (cantidad >= 1 && cantidad <= 499) {
            precio = 120;
        } else if (cantidad >= 500 && cantidad <= 749) {
            precio = 100;
        } else if (cantidad >= 750 && cantidad <= 999) {
            precio = 80;
        } else if (cantidad >= 1000 && cantidad <= 9999) {
            precio = 50;
        }

        int suma_precio = precio * cantidad;

        System.out.println("Ya que desea imprimir " + cantidad + " de fotocopias, el precio de cada una es " + precio + ", y el total seria: " + suma_precio) ;
    }
}
