package SistemaDeReservaAerea;

public class Assentos {
	private int[] assentos = new int[11];

	public int[] getAssentos() {
		return assentos;
	}

	public void verificarAssentoPrimeira() {
		for (int i = 1; i <= ((this.assentos.length) - 4); i++) {
			if (this.assentos[i] == 0) {

				switch (i) {
				case 1:
					System.out.printf("Cadeira %d disponivel %n", i);
					break;
				case 2:
					System.out.printf("Cadeira %d disponivel %n", i);
					break;
				case 3:
					System.out.printf("Cadeira %d disponivel %n", i);
					break;
				case 4:
					System.out.printf("Cadeira %d disponivel %n", i);
					break;
				case 5:
					System.out.printf("Cadeira %d disponivel %n", i);
					break;
				}
			} else {
				switch (i) {
				case 1:
					System.out.printf("Cadeira %d indisponivel %n", i);
					break;
				case 2:
					System.out.printf("Cadeira %d indisponivel %n", i);
					break;
				case 3:
					System.out.printf("Cadeira %d indisponivel %n", i);
					break;
				case 4:
					System.out.printf("Cadeira %d indisponivel %n", i);
					break;
				case 5:
					System.out.printf("Cadeira %d indisponivel %n", i);
					break;
				}
			}

		}
	}

	public void verificarAssentoEconomica() {
		for (int i = 6; i < ((this.assentos.length)); i++) {
			if (this.assentos[i] == 0) {
				switch (i) {
				case 6:
					System.out.printf("Cadeira %d disponivel %n", i);
					break;
				case 7:
					System.out.printf("Cadeira %d disponivel %n", i);
					break;
				case 8:
					System.out.printf("Cadeira %d disponivel %n", i);
					break;
				case 9:
					System.out.printf("Cadeira %d disponivel %n", i);
					break;
				case 10:
					System.out.printf("Cadeira %d disponivel %n", i);
					break;
				}
			} else {
				switch (i) {
				case 6:
					System.out.printf("Cadeira %d indisponivel %n", i);
					break;
				case 7:
					System.out.printf("Cadeira %d indisponivel %n", i);
					break;
				case 8:
					System.out.printf("Cadeira %d indisponivel %n", i);
					break;
				case 9:
					System.out.printf("Cadeira %d indisponivel %n", i);
					break;
				case 10:
					System.out.printf("Cadeira %d indisponivel %n", i);
					break;
				}
			}

		}
	}

	public String setAssentos(int i) {
		String valor = "";
		if (this.assentos[i] != 0) {
			valor = "Este assento esta indisponivel escolha outro";
		} else {
			this.assentos[i] = 1;
			valor = "Assento " + i + " escolhida";
		}
		return valor;
	}
}
