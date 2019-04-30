package JogoCraps;

import java.security.SecureRandom;

public class Craps {
	private static int[] array = new int[21];
	private static int[] array2 = new int[20];
	private static int t = 0;
	private static int porcento = 0;
	private static int contador1 = 0;
	private static final SecureRandom random = new SecureRandom();
	private static Dados c1 = new Dados(0, 0);

	public static void main(String[] args) {
		for (int s = 1; s < 30; s++) {

			for (int i = 1; i <= 20; i++) {
				Craps.c1.setDado1(1 + Craps.random.nextInt(6));
				Craps.c1.setDado2(1 + Craps.random.nextInt(6));
				Craps.c1.setSoma();
				Craps.deci(Craps.array, Craps.array2, i);
			}
		}
		Craps.contagem(array, array2);
		for (int i = 0; i < array.length; i++) {
			System.out.printf("Jogada %d%nPossibilidade de ganhar: %d", i + 1, Craps.porcentual(Craps.array, i));
			System.out.println("%");
		}
		System.out.println();
		System.out.printf("Possibilidade de perda: %d", Craps.porcentual(Craps.array2, 1));
		System.out.println("%");
	}

	private static void contagem(int[] array, int[] array2) {
		for (int v : array) {
			Craps.t = Craps.t + v;
		}
		for (int v : array2) {
			Craps.t = Craps.t + v;
		}
	}

	private static int porcentual(int[] array, int i) {
		int valor = 0;
		valor = (Craps.array[i] * 100) / Craps.t;
		Craps.contador1 = i + Craps.contador1;
		return valor;
	}

	private static void deci(int[] array, int[] array2, int i) {
		if (Craps.c1.primeiroGanho() == true) {
			++Craps.array[0];
		} else {
			if (Craps.c1.primeiraPerda() == true) {
				++Craps.array2[0];
			} else {
				int a = Craps.c1.getMn();
				while (a == 1) {
					Craps.c1.setDado1(1 + Craps.random.nextInt(6));
					Craps.c1.setDado2(1 + Craps.random.nextInt(6));
					Craps.c1.lancesSeq(Craps.c1.getSoma());
					++Craps.array[i];
					if (a == 5) {
						System.out.println("Você perdeu a partida");
						break;

					}
				}
				if (Craps.c1.getSoma() == 7) {
					Craps.c1.seteLance();
				} else {
					++Craps.array[i];
				}
			}
		}
	}

}