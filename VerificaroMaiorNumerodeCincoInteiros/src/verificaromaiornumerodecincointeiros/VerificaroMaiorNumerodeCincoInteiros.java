//Exercio 2.24 do livro de Deitel
//Escreva um aplicativo que leia cinco inteiros, além de determinar e imprimir o maior e o menor inteiro
// no grupo. Utilize somente as técnicas de programação que você aprendeu neste capítulo.
package verificaromaiornumerodecincointeiros;

import java.util.Scanner;

public class VerificaroMaiorNumerodeCincoInteiros {

    public static void main(String[] args) {
        //Cria um objeto LernUmero do tipo Scanner
        Scanner LerNumero = new Scanner(System.in);
        int n1, n2, n3, n4, n5; // Declaração das variaveis que vão receber os valores que o usuario vai digitar
        System.out.println("Digite o primeiro numero"); //Imprime na tela uma mensagem para o usuario digitar o primeiro numero
        n1 = LerNumero.nextInt(); //Faz a leitura input do primeiro numero e armazena na variavel n1
        System.out.println("Digite o segundo numero");//Imprime na tela uma mensagem para o usuario digitar o segundo numero
        n2 = LerNumero.nextInt(); //Faz a leitura input do segundo numero e armazena na variavel n2
        System.out.println("Digite o terceiro numero");//Imprime na tela uma mensagem para o usuario digitar o terceiro numero
        n3 = LerNumero.nextInt(); //Faz a leitura input do terceiro numero e armazena na variavel n3
        System.out.println("Digite o quarto numero");//Imprime na tela uma mensagem para o usuario digitar o quarto numero
        n4 = LerNumero.nextInt(); //Faz a leitura input do quarto numero e armazena na variavel n4
        System.out.println("Digite o quinto numero");//Imprime na tela uma mensagem para o usuario digitar o quinto numero
        n5 = LerNumero.nextInt(); //Faz a leitura input do quinto numero e armazena na variavel n5
        if (n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5) { // Verifica se o primeiro numero(n1) é maior que os outros quatros numeros
            System.out.println("O maior numero e: " + n1); // Se for maior imprimena tela que o primeiro numero(n1) é o maior
        } // fim if
        else { // senão verifica qual é o maior numero dentre os restantes
            if (n2 > n3 && n2 > n4 && n2 > n5) { // verifica se o maior numero é o n2
                System.out.println("O maior numero e :" + n2); // se o n2 for o maior numero imprime na tela que o n2 é o maior numero
            } // fim if
            else { // senão faz a verificação dos numeros restantes
                if (n3 > n4 && n3 > n5) { // verifica se o numero n3 é o maior numero
                    System.out.println("O maior numero e:" + n3); // se for o maior numero então imprime na tela que o n3 é o maior numero

                } // fim if
                else { // se nenhum dos anteriores for o maior numero então faz a verificação dos ultimos dois numeros n4 e n5
                    if (n4 > n5) { // se n4 for o maior numero entao imprime na tela que n4 é o maior numero dentre todos os outros
                        System.out.println("O maior numero e: " + n4); // Imprime na tela o maior numero

                    } // fim if
                    else { // se nenhum dos anteriores for o maior numero o n5 é o maior numero
                        System.out.println("O maior numero e :" + n5); // imprime o valor de n5 como o maior numero
                    } // fim else
                } // fim else
            } // fim else
        } // fim else
        if (n1 < n2 && n1 < n3 && n1 < n4 && n1 < n5) { // Verifica se o primeiro numero(n1) é menor dentro os outros quatro numeros
            System.out.println("O menor numero e: " + n1); // Se for menor imprimena tela que o primeiro numero(n1) é o maior
        } // fim if
        else { // senão verifica qual é o menor numero dentre os restantes
            if (n2 < n3 && n2 < n4 && n2 < n5) { // verifica se o menor numero é o n2
                System.out.println("O menor numero e :" + n2); // se o n2 for o menor numero imprime na tela que o n2 é o menor numero
            } // fim if
            else { // senão faz a verificação dos numeros restantes
                if (n3 < n4 && n3 < n5) { // verifica se o numero n3 é o menor numero
                    System.out.println("O menor numero e:" + n3); // se for o menor numero então imprime na tela que o n3 é o menor numero

                } // fim if
                else { // se nenhum dos anteriores for o menor numero então faz a verificação dos ultimos dois numeros n4 e n5
                    if (n4 < n5) { // se n4 for o menor numero entao imprime na tela que n4 é o menor numero dentre todos os outros
                        System.out.println("O menor numero e: " + n4); // Imprime na tela o menor numero

                    } // fim if
                    else { // se nenhum dos anteriores for o menor numero o n5 é o menor numero
                        System.out.println("O menor numero e :" + n5); // imprime o valor de n5 como o menor numero
                    } // fim else
                } // fim else
            } // fim else
        } // fim else
    } // fim do método principal 

} // fim da classe VerificaroMaiorNumerodeCincoInteiros
