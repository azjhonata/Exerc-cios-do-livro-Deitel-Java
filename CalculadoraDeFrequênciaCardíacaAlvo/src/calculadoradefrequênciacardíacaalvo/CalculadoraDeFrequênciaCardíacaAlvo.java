//Exercicio 3.16 do livro Deitel
package calculadoradefrequênciacardíacaalvo;

import java.util.Scanner; // Esta aplicação utiliza a classe Scanner

public class CalculadoraDeFrequênciaCardíacaAlvo {

    public static void main(String[] args) { // O metodo principal inicializa a aplicação
        HeartRates user = new HeartRates("Exemplo", "", 23, 4, 1988); // Chamada da classe HeartRates
        Scanner input = new Scanner(System.in); // Chamada da classe Scanner
        System.out.println("Digite seu nome: "); // Imprime na tela 
        user.setNome(input.nextLine()); // Leitura dos dados input do usuario
        System.out.println("Digite seu sobre nome: "); // Imprime na tela
        user.setSobrenome(input.nextLine()); // Leitura dos dados input do usuario
        System.out.println("Digite a sua data de nascimento" + "\nDia: "); // Imprime na tela
        user.setDia(input.nextInt()); // Leitura dos dados input do usuario
        System.out.println("Mes: "); // Imprime na tela
        user.setMes(input.nextInt()); // Leitura dos dados input do usuario
        System.out.println("Ano: "); // Imprime na tela
        user.setAno(input.nextInt()); // Leitura dos dados inputo do usuario
        System.out.println("Nome: " + user.getNome() + " " + user.getSobrenome()); // Imprime na tela o nome e o sobre nome instanciados da classe HeartRates
        System.out.println("Nascimento: " + user.dataTime()); // Imprime na tela as variaveis datas instanciados da classe HeartRates
        System.out.println("Idade: " + user.calIdade()); // Imprime na tela a idade do metodo instanciado da classe HeartRates
        System.out.println(user.freqCAlvo()); // Imprime na tela um retorno string do metodo instanciado da classe HeartRates
    } // Fim do metodo principal

} // Fim da classe CalculadoraDeFrequênciaCardíacaAlvo
