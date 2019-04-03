//Exercio 2.25 do livro Deitel 10 edição
//Escreva um aplicativo que leia um inteiro, além de determinar e imprimir se ele é ímpar ou par. [Dica: utilize o operador
// de resto. Um número par é um múltiplo de 2. Qualquer múltiplo de 2 deixa um resto 0 quando dividido por 2.]
package imparoupar;

import java.util.Scanner; // Essa aplicação utiliza a classe Scanner

public class ImparOuPar {
//O metodo principal inicia a aplicação
    public static void main(String[] args) { 
        Scanner lernumero = new Scanner(System.in); // Cria um objeto lernumero para fazer a leitura do que e digitado pelo usuario
        int num; // declara uma variavel do tipo inteiro que vai receber o numero digitado pelo usuario
        System.out.println("Digite um numero inteiro: "); // imprime na tela uma mensagem para que o usuario digite um numero
        num = lernumero.nextInt(); // leitura input digitado pelo usuario
        if(num%2 == 0){
            System.out.println("O numero :"+num+" e um numero par");
        } // fim do if
        else{
             System.out.println("O numero :"+num+" e um numero impar");
        } // fim do else
        
    } // fim do metodo principal
    
} // fim da classe ImparOuPar
