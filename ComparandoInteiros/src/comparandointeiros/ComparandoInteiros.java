//Exercibio 2.16 do livro Deitel 10 edição
package comparandointeiros;

import java.util.Scanner; // A aplicação utiliza a classe Scanner

public class ComparandoInteiros {
//Inicia a aplicação java por meio do metodo principal

    public static void main(String[] args) {
        //Cria um objeto LerNumero para fazer a leitura da entrada de dados
        Scanner LerNumero = new Scanner(System.in);
        //Declaração de duas variaveis inteiras para armazenas os numeros digitados pelo usuario
        int Pn1, Pn2;
        System.out.println("Digite o primeiro numero"); //Imprime na tela a mensagem para digitar
        // o primeiro numero
        Pn1 = LerNumero.nextInt(); // Faz  a leitura do que foi digitado pelo usuario
        System.out.println("Digite o segundo numero"); //Imprime na tela a mensagem para digitar
        // o primeiro numero
        Pn2 = LerNumero.nextInt(); // Faz a leitura do que foi digitado pelo usuario
        //Inicia a condição if
        if (Pn1 == Pn2) {  // Verifica se os numeros são iguais
            System.out.println("These numebers are equal"); // se forem iguais imprime na tela
            // These numebers are equal
        } // fim do if 
        else { // Caso contrário verifica o maior numero
            if (Pn1 > Pn2) { // Verifica se o primeiro numero é maior que o segundo numero
                // digitado pelo usuário
                System.out.println(Pn1 + " is larger"); // Se o primeiro numero for maior
                // A instrução imprime na tela o numero e a frase "is larger"

            } // fim do if
            else { // Caso o primeiro numero seja menor que o segundo numero digitado pelo usuário
                System.out.println(Pn2 + " is larger"); // A instrução imprime na tela o segundo
                // numero seguido da frase "is larger"
            } // fim do else
        } // fim do else

    } // fim do método principal

} // fim da classe ComparandoInteiros
