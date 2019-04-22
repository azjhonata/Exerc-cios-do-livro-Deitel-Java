package craps;

import java.security.SecureRandom;

public class Craps {

    public static void main(String[] args) {
        Dados c1 = new Dados(0, 0);
        SecureRandom random = new SecureRandom();
        c1.setDado1(1 + random.nextInt(6));
        c1.setDado2(1 + random.nextInt(6));
        c1.setSoma();
        if (c1.primeiroGanho() == true) {
            System.out.println("Venceu na primeira jogada" + "\nPontuaçao: ");
            System.out.printf("Primeiro dado: %d%nSegundo Dado: %d%nSoma: %d%n", c1.getDado1(), c1.getDado2(), c1.getSoma());
        } else {
            if (c1.primeiraPerda() == true) {
                System.out.println("Você perdeu na primeira rodada" + "\nPontuaçao:");
                System.out.printf("Primeiro dado: %d%nSegundo Dado: %d%nSoma: %d%n", c1.getDado1(), c1.getDado2(), c1.getSoma());
            } else {
                Boolean a = c1.getVerdade();
                while (a = !true) {
                    c1.setDado1(1 + random.nextInt(6));
                    c1.setDado2(1 + random.nextInt(6));
                    c1.lancesSeq(c1.getSoma());
                }

                if (c1.getSoma() == 7) {
                    c1.seteLance();
                } else {
                    System.out.println("Você venceu" + "\nPontuaçao: ");
                    System.out.printf("Primeiro dado: %d%nSegundo Dado: %d%nSoma: %d%n", c1.getDado1(), c1.getDado2(), c1.getSoma());
                }
            }
        }
    }

}
