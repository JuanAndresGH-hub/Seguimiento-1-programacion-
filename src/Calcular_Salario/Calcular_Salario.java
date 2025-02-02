package Calcular_Salario;

import java.util.Scanner;

public class Calcular_Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingresa horas trabajadas: ");
        int horasTrabajadas = sc.nextInt();

        int tarifa1 = 30000;
        int tarifa2 = 33000;

        int salario;
        if (horasTrabajadas <= 10) {
            salario = horasTrabajadas * tarifa1;
        }else {
            salario = horasTrabajadas * tarifa2;
        }
        System.out.println("Señor(@)" + nombre + "su salario es: " + salario);
    }
}
