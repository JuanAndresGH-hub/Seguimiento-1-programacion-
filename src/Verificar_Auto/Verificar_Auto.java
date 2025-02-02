package Verificar_Auto;

import java.util.Scanner;

public class Verificar_Auto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero de modelo de su auto: ");
        int modelo = sc.nextInt();

        if (modelo == 119 || modelo == 179 || modelo == 189 || modelo == 195 || modelo == 221 || modelo == 780) {
            System.out.println("el automóvil esta defectuoso, llevar a garantía ");
        } else {
            System.out.println("Su automóvil no esta defectuoso");
        }
    }
}
