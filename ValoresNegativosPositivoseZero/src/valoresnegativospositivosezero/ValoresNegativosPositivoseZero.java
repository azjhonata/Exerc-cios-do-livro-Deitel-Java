//Exercicio 2.32 do livro Deitel
// Escreva um programa que insira cinco números, além de determinar e imprimir quantos negativos, 
// quantos positivos e quantos zeros foram inseridos.
package valoresnegativospositivosezero;
//O metodo principal inicia a aplicação

import java.util.Scanner;

public class ValoresNegativosPositivoseZero {

    public static void main(String[] args) {
        int num, positivo = 0, negativo = 0, zero = 0; // declaração da variavel que vai receber os valores
        //  e dos contadores de numeros positivos, negativos e zeros digitados pelo usuario
        Scanner lernumero = new Scanner(System.in); // Criação de um objeto Scanner para ler os valores digitados pelo usuario
        System.out.println("Digite 5 valores baixo"); // Imprime na tela uma mensagem para que o usuario digite os 5 valores abaixo
        for (int i = 1; i < 6; i++) { // Laço de repetição que vai repetir 5 vezes e verificar os valores digitados pelo usuario
            System.out.println("Valor " + i + ": "); // Imprime na tela o valor a ser digitado e sua respectiva posição com
            //  base no contador i
            num = lernumero.nextInt(); // A variavel num recebe o valor digitado pelo usuario
            if (num > 0) { // Verifica se o valor é maior que zero
                positivo++; // Acrescenta um ao contador positivo
            } // fim if 
            else { // Se não for maior que zero
                if (num == 0) { // Verifica se o valor é igual a zero
                    zero++; // Acrescenta um ao contador zero
                } // fim if 
                else { // Senão for maior que zero ou igual a zero
                    if (num < 0) { // Verifica se é menor que zero
                        negativo++; // Acrescenta um ao contador negativo
                    } // fim if
                } // fim else
            } // fim else
        } // fim for
System.out.println("Quantidade de valores positivos: "+positivo); //Imprime na tela uma mensagem informando a quantidade de valores positivos
System.out.println("Quantidade de valores negativos: "+negativo); //Imprime na tela uma mensagem informando a quantidade de valores negativos
System.out.println("Quantidade de valores zeros: "+zero); //Imprime na tela uma mensagem informando a quantidade de valores  nulos
    } // Fim do metodo principal

} // fim da classe ValoresNegativosPositivoseZero
