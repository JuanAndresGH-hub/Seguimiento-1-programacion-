package Juego;

import java.util.Random;
import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int cartasJ1 = rand.nextInt(10) + 1;
        int cartasJ2 = rand.nextInt(10) + 1;
        int totalCartasJ = cartasJ1 + cartasJ2;

        int IAcartas1 = rand.nextInt(10) + 1;
        int IAcartas2 = rand.nextInt(10) + 1;
        int totalIAcartas = IAcartas1 + IAcartas2;

        int CartaOcultaJ = rand.nextInt(10) + 1;
        int CartaOcultaIA = rand.nextInt(10) + 1;

        System.out.println("Tus cartas: " + cartasJ1 + " y " + cartasJ2);
        System.out.println("Puntuacion total: " + totalCartasJ);

        System.out.println("Presiona 'S' para revelar tu tercera carta y continuar.");
        String respuesta = sc.nextLine();

        if (respuesta.equalsIgnoreCase("S")) {
            totalCartasJ += CartaOcultaJ;
            totalIAcartas += CartaOcultaIA;
            System.out.println("Tu tercera carta es: " + CartaOcultaJ);
            System.out.println("Tu puntuación final: " + totalCartasJ);
            System.out.println("La computadora revela su tercera carta: " + CartaOcultaIA);
            System.out.println("Puntuación final de la computadora: " + totalIAcartas);
        }

        if ((totalCartasJ > 21 && totalIAcartas > 21) || (totalCartasJ == totalIAcartas)){
            System.out.println("Empate");
        } else if (totalCartasJ > 21) {
            System.out.println("La IA gana");
        } else if (totalIAcartas > 21 || totalCartasJ > totalIAcartas) {
            System.out.println("Jugador gana");
        } else {
            System.out.println("La IA gana");
        }


    }
}
