package Estado_Computadora;

import java.util.Scanner;

public class Estado_Computadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("La computadora emite un pitido? Digita 1 para Sí o 0 para No:");
        int pitido = sc.nextInt();

        System.out.println("El disco duro gira? Digita 1 para Sí o 0 para No:");
        int discoGira = sc.nextInt();

        if (pitido == 1 && discoGira == 1) {
            System.out.println("Pongase en contacto con el tecnico de apoyo");
        } else if (pitido == 1 && discoGira == 0) {
            System.out.println("Verifica los contactos de la unidad");
        } else if (pitido == 0 && discoGira == 0) {
            System.out.println("Traiga la computadora a repararla");
        } else if (pitido == 0 && discoGira == 1) {
            System.out.println("Verifica la conexiones de los altavoces");
        } else {
            System.out.println("Valor incorrecto, vuelva a intentarlo");
        }
        sc.close();
    }
}
