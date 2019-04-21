//Exercicio 4.38 do livro Deitel
package criptografia;

import java.util.Scanner;  // Esta aplicação utiliza a classe Scanner

public class Criptografia {

    public static void main(String[] args) {
        //Criação dos objetos
        Scanner input = new Scanner(System.in);
        Cripto c = new Cripto(1000);
        //Solicita que o usuario digite um numero e imprime na tela o valor de retorno do objeto Cripto
        System.out.println("Digite o numero: ");
        c.setDigito(input.nextInt());
        System.out.println(c.cript());
    } // Fim do metodo principal
    
} // Fim da classe Criptografia
