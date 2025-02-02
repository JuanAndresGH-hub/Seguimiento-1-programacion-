package Mensualidad_Gimnasio;

import java.util.Scanner;

public class Mensualidad_Gimnasio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tarifa1 = 18000;
        int tarifa2 = 35000;
        int tarifa3 = 86000;

        System.out.println("Digite 1 para la subscripcion de 15 dias, 2 para la de 30 dias o 3 para la de 90 dias: ");
        int tipo_subscripcion = sc.nextInt();

        int total;
        if (tipo_subscripcion == 1) {
            total = tarifa1;
        } else if (tipo_subscripcion == 2) {
            total = tarifa2;
        } else if (tipo_subscripcion == 3) {
            total = tarifa3;
        } else {
            System.out.println("Valor incorrecto, vuelva a intentarlo");
            sc.close();
            return;
        }

        System.out.println("El valor de la suscripcion es " + total);

    }
}
