//Exercicio 2.30 do livro Deitel
// Escreva um aplicativo que insira um número consistindo em cinco dígitos a partir do usuário,
// separe o número em seus dígitos individuais e imprima os dígitos separados uns dos outros por três espaços. Por exemplo, se o usuário 
// digitar o número 42339, o programa deve imprimir
// 4   2   3   3   9
package separandoosdígitosemuminteiro;

import java.util.Scanner; // Essa aplicação utiliza a classe Scanner

public class SeparandoOsDígitosEmUmInteiro {
//O metodo principal da inicio ao aplicativo
    public static void main(String[] args) {
        //Criação de um objeto Scanner para fazer a leitura dos dados input
        Scanner vernumero = new Scanner(System.in);
        //Declaração das variaveis inteiras respectivamente:
        //armazenar o numero digitado poer usuario
        //fazer o backup do numero
        //realizar a marcação do laço de repetição
        // e ponto de marcação para o divisor que começa em 10000.
        int num, x = 0, backup, v = 0, pot = 10000;
        System.out.println("Digite um numero inteiro com 5 digitos: "); // Imprime na tela a mensagem
        // que solicita ao usuario que digite um numero inteiro 
        num = vernumero.nextInt(); // armazena na variavel num o que foi digitado pelo usuario
        while (num < 10000 || num > 99999) { // Faz verificação se o numero que o usuario digitou tem 5 digitos
            System.out.println("Digite um numero inteiro com apenas 5 digitos: "); //Se não houver continua pedindo que digite 
            // um numero valido
            num = vernumero.nextInt(); // armazena na variavel num o que foi digitado pelo usuario
        }
        while (x != 5) { // Laço de repetição para isolar os digitos
            backup = num; // a variavel backup passa a ter o valor da variavel num
            num = (+num % pot); /* armazena na variavel num um novo valor que corresponde
            ao resto da divisão na base 10
            ex:    laço1 42339/10000 =  2339  laço2 2339/1000 = 339 etc... */
            backup = (backup - num); // Atualiza o valor da variavel backup com base no valor anterior
            // menos o valor atual do num ex: 42399 - 2399 = 40000 
            System.out.printf("   %d", backup / pot); // Imprime na tela o valor atual do backup divido pela base 10
            // ex: 40000/10000 = 4
            pot = (pot / 10); // Atualiza o marcador da base 10. ex: Laço 1 10000/10 = 1000 etc...
            x++; // Acrecenta 1 ao contador que inicia com 0 e vai até 4
        }
        System.out.println("\n"); // Imprime na tela uma quebra de linha
    } // fim do metodo principal

} // fim da classe SeparandoOsDígitosEmUmInteiro
