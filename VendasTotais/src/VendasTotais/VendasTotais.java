package VendasTotais;

import java.util.Iterator;

public class VendasTotais {
	private static Gerador gerador = new Gerador("", 0);
	private static String[][][][] vendasTotais = new String[4][31][6][5];
	private static Vendedor vendedor = new Vendedor();

	public static void main(String[] args) {
		VendasTotais.gerarDados(31);
		VendasTotais.resgatarDados();
		VendasTotais.contagemTotalVendedor();
		VendasTotais.contaTotalVendedor();
		System.out.printf("Valor total de vendas: %d$%n", VendasTotais.contaTotal());
	}

	public static int contaTotal() {
		int op = 0;
		for (int i = 0; i < 4; i++) {
			for (int y = 1; y < 31; y++) {
				for (int z = 1; z < 6; z++) {
					for (int w = 1; w < 4; w++) {
						if (w == 3) {
							op = Integer.parseInt(VendasTotais.vendasTotais[i][y][z][w]) + op;
						}
					}
				}
			}
		}
		return op;
	}

	public static void contagemTotalVendedor() {
		int op = 0;
		for (int i = 0; i < 4; i++) {
			for (int y = 1; y < 31; y++) {
				for (int z = 1; z < 6; z++) {
					
							op = Integer.parseInt(VendasTotais.vendasTotais[i][y][z][3]) + op;
							VendasTotais.vendasTotais[i][0][0][4] = "" + op;
				}
			}
			op = 0;
		}
	}

	public static void contaTotalVendedor() {
		int op = 0;
		for (int i = 0; i < 4; i++) {

			op = Integer.parseInt(VendasTotais.vendasTotais[i][0][0][4]);
			System.out.printf("Nome do vendedor: %s%nTotal de vendas: %s%n", VendasTotais.vendasTotais[i][0][0][0], 
					""+op+"$");
		}
	}

	public static void gerarDados(int number) {
		for (int i = 0; i < 4; i++) {
			VendasTotais.vendedor.setNomeCompleto(VendasTotais.gerador.gerarString(20));
			VendasTotais.vendasTotais[i][0][0][0] = "" + VendasTotais.vendedor.getNomeCompleto();
			for (int z = 1; z < number; z++) {
				for (int w = 1; w < 6; w++) {
					for (int y = 1; y < 4; y++) {
						switch (y) {
						case 1:
							VendasTotais.vendedor.setNumeroProduto(gerador.gerarInt(20));
							VendasTotais.vendasTotais[i][z][w][y] = "Numero do produto: "
									+ VendasTotais.vendedor.getNumeroProduto();
							break;
						case 2:
							VendasTotais.vendedor.setNomeProduto(VendasTotais.gerador.gerarString(20));
							VendasTotais.vendasTotais[i][z][w][y] = "Nome do produto: "
									+ VendasTotais.vendedor.getNomeProduto();
							break;
						case 3:
							VendasTotais.vendedor.setValor(VendasTotais.gerador.gerarInt(1000));
							VendasTotais.vendasTotais[i][z][w][y] = "" + VendasTotais.vendedor.getValor();
							break;
						default:
							System.out.println("erro");
						}
					}
				}
			}
		}
	}

	public static void resgatarDados() {
		for (int i = 0; i < 4; i++) {
			System.out.println("Nome do vendedor: " + VendasTotais.vendasTotais[i][0][0][0]);
			for (int z = 1; z < 31; z++) {
				for (int p = 1; p < 6; p++) {
					for (int v = 1; v < 4; v++) {
						if (v == 3) {
							System.out.println(
									"Valor total vendido no dia: " + VendasTotais.vendasTotais[i][z][p][v] + "$");
						} else {
							System.out.println(VendasTotais.vendasTotais[i][z][p][v]);
						}
					}
					System.out.println();
				}
			}
		}
	}
}
