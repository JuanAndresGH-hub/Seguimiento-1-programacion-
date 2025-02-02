package Par_Impar;

import java.util.Scanner;

public class Par_Impar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("el numero es par");
        } else {
            System.out.println("el numero es impar");
        }
    }
}
