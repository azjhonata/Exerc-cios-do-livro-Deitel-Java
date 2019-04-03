//Exercibio 2.15 do livro Deitel 10 edição
package programasomaprodutodiferençaequocientededoisnumerosinteiros;

import java.util.Scanner; //O programa utiliza a classe Scanner 

public class ProgramaSomaProdutoDiferençaeQuocientedeDoisNumerosInteiros {
// O metodo principal inicia a execução do aplicativo Java

    public static void main(String[] args) {
        //Cria um objeto LerNumero para fazer a leitura da entrada de dados
        Scanner LerNumero = new Scanner(System.in);
        //Declaração das variaveis inteiras que receberão os valores da soma
        // produto e diferença
        int Soma, Pro, Dif1, Dif2, Pn1, Pn2;
        //Declaração das variaveis do tipo ponto flutuante que vão receber os 
        // valores da diferença 
        double Quo1, Quo2;
        //Pergunta ao usuário o primeiro numero
        System.out.println("Digite o primeiro número: ");
        Pn1 = LerNumero.nextInt(); //Faz a leitura do primeiro numero digitado pelo usuario
        System.out.println("Digite o segundo número: ");
        Pn2 = LerNumero.nextInt(); // Faz a leitura do segundo numero digitado pelo usuario
        Soma = Pn1 + Pn2; // Faz a soma do primeiro com o segundo numero
        Dif1 = Pn1 - Pn2; //Faz a diferença do primeiro menos o segundo numero
        Dif2 = Pn2 - Pn1; // Faz a diferença entre o segundo menos o primeiro numero
        //Converte a variaveis Pn1 e Pn2 inteiras para double e faz a divisão do primeiro
        Quo1 = (double) Pn1 / (double) Pn2; //Faz a divisão do primeiro pelo segundo
        Quo2 = (double) Pn2 / (double) Pn1; // Faz a divisão do segundo pelo primeiro
        Pro = Pn1 * Pn2; // Realiza o produto do primeiro pelo segundo
        System.out.println("A soma do primeiro com o Segundo: " + Soma); //Imprime na tela o resultado
        // da soma
        System.out.println("A diferença do primeiro pelo segundo: " + Dif1); // Imprime na tela o resultado
        // da diferença do primeiro pelo segundo
        System.out.println("A diferença do segundo pelo primeiro: " + Dif2); // Imprime na tela o resultado
        // da diferença do segundo pelo primeiro
        System.out.println("A divisão do primeiro pelo segundo: " + Quo1);  // Imprime na tela o resultado
        // da divisão do primeiro pelo segundo
        System.out.println("A divisão do segundo pelo primeiro: " + Quo2); // Imprime na tela o resultado
        // da divisão do segundo pelo primeiro
        System.out.println("O produto do primeiro pelo segundo: " + Pro); // Imprime na tela o resultado
        // do produto do primeiro pelo segundo

    }

}
