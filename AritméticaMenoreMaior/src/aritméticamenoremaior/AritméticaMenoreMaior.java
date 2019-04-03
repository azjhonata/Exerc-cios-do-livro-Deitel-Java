//Exercibio 2.17 do livro Deitel
package aritméticamenoremaior;

import java.util.Scanner; // A aplicação utiliza a classe Scanner
//Inicia a aplicação java
public class AritméticaMenoreMaior {

    public static void main(String[] args) {
        int pn1, pn2, pn3, soma, media, produto; // Declara as variaveis que receberãos os dados de entrada
        // e irão fazer a média, soma e o produto dos numeros
        //Cria um objeto LerNumero para fazer a leitura da entrada de dados
        Scanner lernumero = new Scanner(System.in);
        System.out.println("Digite o primeiro número: "); //Imprime na tela a mensagem para o usuario digitar o primeiro numero
        pn1 = lernumero.nextInt(); // faz a leitura dos valores digitados pelo usuario e armazena na variavel pn1
        System.out.println("Digite o segundo número: "); //Imprime na tela a mensagem para o usuario digitar o segundo numero
        pn2 = lernumero.nextInt(); // faz a leitura dos valores digitados pelo usuario e armazena na variavel pn2
        System.out.println("Digite o terceiro número: "); //Imprime na tela a mensagem para o usuario digitar o terceiro numero
        pn3 = lernumero.nextInt(); // faz a leitura dos valores digitados pelo usuario e armazena na variavel pn3
        soma = pn1 + pn2 + pn3; // realiza a soma dos valores digitados pelo usuario
        media = soma / 3; // realiza a media da soma
        
        System.out.println("A media dos numeros e: "+media); //Imprime a soma dos numeros
        System.out.println("A soma dos numeros e: "+soma); // Imprime a media dos numeros

        if (pn1 > pn2 && pn1 > pn3) { // verifica se o primeiro numero e maior que o segundo e o terceiro numero
            System.out.println("O maior numero e: " + pn1); // Imprime na tela que o primeiro numero é maior que o segundo e o terceiro numero
        } // fim do if
        else { // Caso o primeiro numero não seja maior que o segundo numero e o terceiro numero faz a verificação
            // se o segundo é maior que o terceiro ou o terceiro é maior que o segundo numero
            if (pn2 > pn3) { // verifica se o segundo numero é maior
                System.out.println("O maior numero e: " + pn2); // se for maior imprime que o segundo numero é o maior numero

            } //fim do if
            else { // senão ele verifica se o terceiro é o maior numero
                System.out.println("O maior numero e: " + pn3); // se o terceiro for o maior numero então imprime na tela que o
                // terceiro é o maior numero
            } // fim do else

        } //fim do else

        if (pn1 < pn2 && pn1 < pn3) { // verifica se o primeiro numero e menor que o segundo e o terceiro numero
            System.out.println("O menor numero e: " + pn1); // Imprime na tela que o primeiro numero é maior que o segundo e o terceiro numero
        } // fim do if
        else { // Caso o primeiro numero não seja menor que o segundo numero e o terceiro numero faz a verificação
            if (pn2 < pn3) { // verifica se o segundo numero é o menor
                System.out.println("O menor numero e: " + pn2);

            } //fim do if
            else { // senão ele verifica se o terceiro é o menor numero
                System.out.println("O menor numero e: " + pn3); // se o terceiro for o menor numero então imprime na tela que o
                // terceiro é o menor numero
            } // fim do else

        } //fim do else

    } // fim do metodo principal 

} // Fim da classe AritméticaMenoreMaior
