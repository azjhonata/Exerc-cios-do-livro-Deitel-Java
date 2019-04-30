package SistemaDeReservaAerea;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int referencia = 0;
		Assentos assentos = new Assentos();
		Cliente cliente = new Cliente("", "", "", "", "", 0, "", 0);
		System.out.println("Digite o seu primeiro nome: ");
		cliente.setNome(input.nextLine());
		System.out.println("Digite o seu sobrenome: ");
		cliente.setSobrenome(input.nextLine());
		System.out.println("Digite a sua data de nascimento: ");
		cliente.setNascimento(input.nextLine());
		System.out.println("Digite sua orientação sexual: ");
		cliente.setSexo(input.nextLine());
		System.out.println("Digite sua nação: ");
		cliente.setPais(input.nextLine());
		System.out.println("Digite seu telefone: ");
		cliente.setTelefone(input.next());
		System.out.println("Digite o numero do seu passaporte: ");
		cliente.setPassaporte(input.nextInt());
		System.out.println("Digite o nome da sua mãe: ");
		input.nextLine();
		cliente.setNomeMae(input.nextLine());
		System.out.println("Digite o nome do seu pai: ");
		cliente.setNomePai(input.nextLine());
		System.out.println("Se possuir filho(a)(s) digite 1 se não possuir digite 2");
		
		switch (input.nextInt()) {
		case 1:
			referencia = 1;
			System.out.println("Digite a quantidade: ");
			cliente.setQuantiFilhos(input.nextInt());
			input.nextLine();
			for (int i = 0; i < cliente.getQFilhos().length; i++) {
				System.out.printf("Digite o nome do %d filho(a)%n", 1 + i);
				cliente.setFilhos(input.nextLine(), i);
			}
		case 2:
			break;
		default:
			System.out.println("Opção invalida!");
			break;
		}

		cliente.setId();
		System.out.println("Digite 1 para primeira classe ou digite 2 para classe economica: ");
		switch (input.nextInt()) {
		case 1:
			assentos.verificarAssentoPrimeira();
			System.out.printf("Deseja prosseguir? %nDigite 1 para prosseguir ou 2 para finalizar: %n");
			switch (input.nextInt()) {
			case 1:
				System.out.println("Digite o numero do assento desejado:\n ");
				cliente.setAssento(input.nextInt());
				System.out.println(assentos.setAssentos(cliente.getAssento()));
				break;
			case 2:
				System.out.println("Cadastro não finalizado!");
				break;
			default:
				System.out.printf("Opção invalida!%nReinicie o cadastro novamente");
				break;
			}
			break;
		case 2:
			assentos.verificarAssentoEconomica();
			System.out.printf("Deseja prosseguir? %nDigite 1 para prosseguir ou 2 para finalizar: %n");
			switch (input.nextInt()) {
			case 1:
				System.out.println("Digite o numero do assento desejado:\n ");
				cliente.setAssento(input.nextInt());
				System.out.println(assentos.setAssentos(cliente.getAssento()));
				break;
			case 2:
				System.out.println("Cadastro não finalizado!");
				break;
			default:
				System.out.printf("Opção invalida!%nReinicie o cadastro novamente");
				break;
			}
			break;
		default:
			System.out.printf("Opção invalida!%nReinicie o cadastro novamente");
			break;
		}
		System.out.printf(
				"Dados do cliente: %n" + "Nome: %s %s Sexo: %s Data de nascimento: %s Nação: %s%n"
						+ "Telefone: %s Passaporte: %d%nNome da mãe: %s%nNome do pai: %s%n",
				cliente.getNome(), cliente.getSobrenome(), cliente.getSexo(), cliente.getNascimento(),
				cliente.getPais(), cliente.getTelefone(), cliente.getPassaporte(), cliente.getNomeMae(), cliente.getNomePai());
		if (referencia == 1) {
			cliente.getFilhos();
		}
		System.out.printf("Assento escolhido: %d%n", cliente.getAssento());
		System.out.println();
	}

}
