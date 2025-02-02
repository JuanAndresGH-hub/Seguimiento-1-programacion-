package Calificaciones;

import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.println("Ingrese tu nota de Fisica: ");
         double notaFisica = sc.nextDouble();

         System.out.println("Ingrese tu nota de Quimica: ");
         double notaQuimica = sc.nextDouble();

         System.out.println("Ingrese tu nota de biologia: ");
         double notaBiologia = sc.nextDouble();

         System.out.println("Ingrese tu nota de Matematicas: ");
         double notaMatematicas = sc.nextDouble();

         System.out.println("Ingrese tu nota de informatica: ");
         double notaInformatica = sc.nextDouble();

        double promedio = (notaFisica + notaQuimica + notaBiologia + notaMatematicas + notaInformatica) / 5;

        double porcentaje = (promedio * 100) / 10;

        System.out.println("El promedio es: " + promedio + ", y su porcentaje es: " + porcentaje);

        if (promedio >= 0 && promedio <= 5.99) {
            System.out.print("El promedio es malo");
        } else if (promedio >= 6.99 && promedio <= 8) {
            System.out.print("El promedio es bueno");
        } else if (promedio >= 9 && promedio <= 10) {
            System.out.print("El promedio es excelente");
        }
    }
}
