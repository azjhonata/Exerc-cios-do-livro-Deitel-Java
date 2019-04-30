package VendasTotais;

import java.security.SecureRandom;

public class Gerador {
	private String stringGerada = "";
	private final SecureRandom random = new SecureRandom();
	private int intGerado = 0;
	public Gerador(String stringGerada, int intGerado) {
		this.stringGerada = stringGerada;
		this.intGerado = intGerado;
	}
	public String gerarString(int num) {
		this.stringGerada = "";
		for (int i = 1; i < num; i++) {
			char v = (char) (1 + this.random.nextInt(24) + 65);
			this.stringGerada = v + this.stringGerada ;
		}
		return this.stringGerada;
	}
	
	public int gerarInt(int valor) {
		this.intGerado = 1+random.nextInt(valor);
		return this.intGerado;
	}
}
