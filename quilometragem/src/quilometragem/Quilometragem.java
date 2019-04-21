//Exercicio 4.17 do livro Deitel
package quilometragem; // Pacote utilizado na aplicação

import java.util.Scanner; // Esta aplicação utilizada a classe Scanner

public class Quilometragem {

    public static void main(String[] args) {
        int x, y = 0; // Inicializa as variaveis
        Scanner input = new Scanner(System.in); // Cria um objeto Scanner
        Carro veiculo = new Carro(0, 0); // Cria um objeto carro
        System.out.println("Quilometragem de Gasolina"); // Imprime na tela uma mensagem
        System.out.println("Digite o numero de viagens realizadas: "); // Imprime na tela uma mensagem
        x = input.nextInt(); // Faz a leitura dos dados digitados pelo usuario
        while (y != x) { // Verificação de validação com repetição
            System.out.println("Digite a quilometragem da viagem " + (y + 1) + ": "); // Imprime na tela uma mensagem e a posição do contador
            veiculo.setQuilo(input.nextInt()); // Faz a leitura dos dados digitados pelo usuario
            System.out.println("Digite a gasolina utilizada na viagem " + (y + 1) + ": "); // Imprime na tela uma mensagem e a posição do contador
            veiculo.setGaso(input.nextInt()); // Faz a leitura dos dados digitados pelo usuario
            y++; // Incrementa 1 ao contador
        }
        System.out.printf("Quilometragem total: " + "\n%dkm%n",veiculo.getQuilo()); // Imprime na tela uma mensagem e o retorno do meotodo get
        System.out.printf("Gasolina total: " + "\n%d%n", veiculo.getCom());  // Imprime na tela uma mensagem e o retorno do meotodo get
        System.out.printf("Quilometragem : "+"\n%.2fkm/l%n",veiculo.quilome());  // Imprime na tela uma mensagem e o retorno do meotodo get
    } // Fim do metodo principal

} // Fim da classe Quilometragem
