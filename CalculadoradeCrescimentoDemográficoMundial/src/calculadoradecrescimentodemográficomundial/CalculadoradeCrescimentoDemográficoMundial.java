//Exercicio 2.34 do livro Deitel
//Sem OO
package calculadoradecrescimentodemográficomundial;

import java.math.BigInteger; //Esta aplicação utiliza a classe BigInteger
import java.util.Scanner; //Esta aplicação utiliza  aclasse Scanner

public class CalculadoradeCrescimentoDemográficoMundial {
//Metodo principal inicia a aplicação

    public static void main(String[] args) {
        Scanner lerresposta = new Scanner(System.in); // Criação do objeto Scanner para ler os dados de input
        String num1 = "7694833668", num2 = "134683410", num3 = "62026705", ver, anos; // Criação e inicilização das variaveis com dados obtidos em pesquisa e contadores
        double txc; // Criação da variavel txc que é a taxa de crescimento populacional
        System.out.println("Informações atuais"); // Impreme na tela uma mensagem de informações
        System.out.println("Numero de nascimentos em 2018: 140.683.410 pessoas"); // Imprime na tela os nascimentos ocorridos em 2018
        System.out.println("Numero de mortes em 2018: 59.026.705 de pessoas");  // Imprime na tela as mortes ocorridas em 2018
        System.out.println("População atual: 7.694.833.668 de pessoas "); //Imprime na tela a população atual
        System.out.println("Dseja atualizar as informações? \n Digite sim para adicionar ou Presione enter para continuar"); // Imprime na tela uma mensagem informando ao usuario de deseja atualizar os dados
        ver = lerresposta.nextLine(); // criação da variavel que recebe os dados de entrada input
        if ("sim".equals(ver) || "Sim".equals(ver) || "SIM".equals(ver) || "SiM".equals(ver) || "SIm".equals(ver) || "siM".equals(ver) || "sIM".equals(ver)) { // Verifica se o usuario digitou sim
            System.out.println("Digite o numero de nascimento no ano: "); //Imprime na tela uma mensagem que pergunta ao usuario o numero de nascimento no ano
            num2 = lerresposta.nextLine(); // Faz a leitura dos dados input do numero de nascimentos
            System.out.println("Digite o numero de mortes no ano: "); // Imprime na tela uma mensagem que pergunta o numero de mortes ocorridas no ano
            num3 = lerresposta.nextLine(); // Faz a leitura dos dados input do numero de mortes
            System.out.println("Digite o numero da população atual: "); // Imprime na tela uma mensagem que pergunta o numero da população atual
            num1 = lerresposta.nextLine(); //Faz a leitura dos dados inputo do numero da população atual
        } // Fim if
            BigInteger n1 = new BigInteger(num1); // Criação de objeto Integer recebe o valor das variavel num1 como forma de backup
            BigInteger b1 = new BigInteger(num1); // Criação de objeto Integer recebe o valor das variavel num1 como forma de bakcup
            BigInteger b2 = new BigInteger(num1); // Criação de objeto Integer recebe o valor das variavel num1 como forma de bakcup
            BigInteger n2 = new BigInteger(num2); // Criação de objeto Integer recebe o valor das variavel num2
            BigInteger n3 = new BigInteger(num3); // Criação de objeto Integer recebe o valor das variavel num3
            BigInteger n4 = new BigInteger("1000"); // // Criação de objetosInteger que armazena uma referencia 1000 para realizar as contas
            BigInteger n5 = new BigInteger("1"); // Criação de um objeto Integer que armazena uma variavel de referencia 1 para o calculo
            n2 = (n2.multiply(n4)).divide(n1); // Faz a multiplicação do numero de nascimentos por 1000 e divide pelo numero populacional
            n3 = (n3.multiply(n4)).divide(n1); // Faz a multiplicação do numero de mortos por 1000 e divide pelo numero populacional
            n1 = n2.subtract(n3); // Subtrai a taxa de natalidade pela taxa de mortalidade ou seja n2 -3 n1
            txc = (b1.doubleValue()) * (n1.doubleValue() / n4.doubleValue()); // A população relativa no ano é o produto da população atual pela taxa de crescimento divido por 1000
            int txa = (int) txc; // Converte a taxa double para Inteiro
            System.out.println("Taxa de natalidade mundial: " + n2 + "%"); // Imprime na tela uma mensagem que informa a taxa de natalidade mundial
            System.out.println("Taxa de mortalidade mundial: " + n3 + "%"); // Imprime na tela uma mensagem que informa a taxa de mortalidade mundial
            System.out.println("Taxa de crescimento mundial: " + n1 + "%"); // Imprime na tela uma mensagem que informa a taxa  de crescimento mundial
            System.out.println("Especativa em anos! \nDigite a quantidade de anos e veja a espectativa ao decorrer dos anos: "); // Imprime na tela uma mensagem que informa ao usuario deve digitar a quantidades de anos para verificar o crescimento populacional ao longos dos anos
            anos = lerresposta.nextLine(); // Realiza a leitura dos dados input
            BigInteger ano = new BigInteger(anos); // Criação de um objeto Integer que recebe o valor digitado pelo usuario
            ano = ano.add(ano.valueOf(1)); // Adiciona um ano a mais para que desconsidere a casa 0 e alcance o decimal
            for (BigInteger a = BigInteger.valueOf(1); a.compareTo(ano) < 0; a = a.add(BigInteger.ONE)) { // Realiza um laço de repetição que inicializa o objeto integer em 1 e compara com objeto anos e faz o incremento até chegar a quantidade de anos informada
                if (a.compareTo(n5) == 0) { // Verifica se a posição atual é zero se for zero significa que é o primeiro ano entao ao invez de anos escreve ano
                    b2 = b2.add(b2.valueOf(txa)); // Atualiza o valor de b2 com a soma da população anual
                    System.out.println("População em " + a + " ano: \n" + b2 + "pessoas"); // Imprime ao usuario o ano e a respectiva previsão populacional para esse ano
                } // Fim if 
                else { // Se for diferente de zero entao imprime anos normalmente
                    b2 = b2.add(b2.valueOf(txa)); // Atualiza o valor de b2 com a soma da população anual
                    System.out.println("População em " + a + " anos: \n" + b2 + " pessoas"); // Imprime ao usuario o ano e a respectiva previsão populacional para esse ano
                } // Fim else
            } // Fim for
        } // Fim metodo principal
} // Fim classe CalculadoradeCrescimentoDemográficoMundial
