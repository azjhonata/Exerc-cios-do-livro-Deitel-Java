//Exercicio 4.38 do livro Deitel
package descriptografia;

import java.util.Scanner;  // Esta aplicação utiliza a classe Scanner

public class Descriptografia {

    public static void main(String[] args) {
        //Criação dos objetos
        Scanner input = new Scanner(System.in);
        Decrypt c = new Decrypt(1000);
        //Solicita que o usuario digite um numero e imprime na tela o valor de retorno do objeto Decrypt
        System.out.println("Digite o numero: ");
        c.setDigito(input.nextInt());
        System.out.println(c.decript());

    }// Fim do metodo principal

} // Fim da classe Descriptografia
