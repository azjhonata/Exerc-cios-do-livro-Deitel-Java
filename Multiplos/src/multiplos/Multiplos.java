// Exercio 2.26 do livre de Deitel 
// Escreva um aplicativo que leia dois inteiros, além de determinar se o primeiro é um múltiplo do segundo e imprimir o resul-
//  tado. [Dica: utilize o operador de resto.]
package multiplos;

import java.util.Scanner;

public class Multiplos {
//O metodo principal inicia a aplicação
    public static void main(String[] args) {
        //Cria um objeto do tipo Scanner para fazer a leitura do que vai ser digitado pelo usuario
        Scanner lernumero = new Scanner(System.in);
        int num1,num2; // Declara as variaveis que vão receber os dados digitados pelo usuario
        System.out.println("Digite o primeiro numero: "); // Imprime na tela uma mensagem que informa ao usuario para digitar o primeiro numero
        num1 = lernumero.nextInt(); // a variavel num1 recebe o primeiro numero digitado pelo usuario
        System.out.println("Digite o segundo numero: "); // Imprime na tela uma mensagem que informa ao usuario para digitar o segundo numero
        num2 = lernumero.nextInt(); // a variavel num2 recebe o segundo numero digitado pelo usuario
        if (num1%num2 == 0) {
            System.out.println("O primeiro numero e multiplo do segundo numero");
        } // fim if
        else{
            System.out.println("O primeiro numero nao e multiplo do segundo");
        } // fim else
        
    } // Fim do metodo principal
    
} // fim da classe Multiplos
