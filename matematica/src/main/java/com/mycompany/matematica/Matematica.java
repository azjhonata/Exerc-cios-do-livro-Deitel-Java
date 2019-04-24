package com.mycompany.matematica;

import java.security.SecureRandom;
import java.util.Scanner;

public class Matematica {

    private static SecureRandom random = new SecureRandom();
    private static int numero1;
    private static int numero2;
    private static int multi;
    private static int valor;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Responda corretamente a seguinte pergunta: ");
        Matematica.gerador();
        do {
            System.out.printf("Quanto é %d vezes %d?  ", Matematica.numero1, Matematica.numero2);
            Matematica.valor = input.nextInt();
            if (Matematica.valor == Matematica.multi) {
                System.out.println("Muito bem!");
            } else {
                System.out.println("Não. Por favor, tente de novo.");
            }
        } while (Matematica.valor != Matematica.multi);

    }

    private static void gerador() {
        Matematica.numero1 = 1 + Matematica.random.nextInt(6);
        Matematica.numero2 = 1 + Matematica.random.nextInt(6);
        Matematica.multi = Matematica.numero1 * Matematica.numero2;

    }
}
