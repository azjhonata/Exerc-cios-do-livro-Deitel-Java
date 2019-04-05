//Exercicio 3.17 do livro de Deitel
package healthprofile;

import java.util.Scanner; // Esta aplicação utiliza a classe Scanner

public class ApplicationHealthProfile {

    public static void main(String[] args) { //O meotodo main inicia a aplicação
        HealthProfile user = new HealthProfile("exemplo", "", "masculino/feminino", 23, 4, 1988, 1.70, 68); // Cria uma  instancia da classe HealthProfile
        Scanner input = new Scanner(System.in); // Chama a classe Scanner e cria uma variavel de referencia para fazer a leitura dos dados input
        System.out.println("Digite o seu nome: "); // Imprime na tela uma mensagem que solicita que o usuario digite o nome
        user.setNome(input.nextLine()); // Faz a leitura dos dados que o usuario digitou e coloca no metodo sobrenome
        System.out.println("Digite o seu sobrenome: "); // Imprime na tela uma mensagem que solicita que o usuario digite o sobrenome
        user.setSobrenome(input.nextLine()); // Faz a leitura dos dados que o usuario digitou e coloca no metodo sobrenome
        System.out.println("Digite seu sexo: "); // Imprime na tela uma mensagem que solicita que o usuario digite o sexo
        user.setSexo(input.nextLine()); // Faz a leitura dos dados que o usuario digitou e coloca no metodo sexo
        System.out.println("Digite a sua data de nascimento\nDia: "); // Imprime na tela a solicitação de data de nasicmento e quebra de linha com o dia
        user.setDia(input.nextInt()); // Faz a leitura dos dados que o usuario digitou e coloca no metodo dia
        System.out.println("Mes: "); //Imprime na tela mes 
        user.setMes(input.nextInt()); // Faz a leitura dos dados que o usuario digitou e coloca no metodo mes
        System.out.println("Ano: "); //Imprime na tela ano
        user.setAno(input.nextInt()); // Faz a leitura dos dados que o usuario digitou e coloca no metodo ano
        System.out.println("Digite sua altura: ");
        user.setAltura(input.nextDouble()); // Faz a leitura dos dados que o usuario digitou e coloca no metodo altura
        System.out.println("Digite seu peso: "); // Imprime na tela para digitar o peso
        user.setPeso(input.nextDouble()); //Faz a leitura de dados que o usuario digitou e coloca dentro do metodo peso
        System.out.println("RESULTADOS"); // Imprime na tela RESULTADOS
        System.out.println("IMC"); // Imprime na tela IMC
        System.out.println("Nome:   " + user.getNome() + " " + user.getSobrenome()); // Imprime na tela o nome  e o sobrenome
        System.out.println("Data de nascimento: " + user.getNascimento()); // Imprime na tela a data de nascimento
        System.out.println("Sexo:   " + user.getSexo()); // Imprime na tela o sexo
        System.out.println("Idade:  " + user.getIdade()); // Imprime na tela a idade
        System.out.println("Peso:   " + user.getPeso() + " " + user.indiceMCorporal() + "\nAltura: " + user.getAltura()); //Imprime na tela o peso, o estado de saude e a altura
        System.out.println("IMC:    " + user.getImc()); // Imprime na tela o imc
        System.out.println(user.getFreqCAlvo()); // Imprime na tela a frenquencia cardiaca alvo que varia de 50 a 85%
    } // Fim do metodo principal 
} // Fim da classe  ApplicationHealthProfile
