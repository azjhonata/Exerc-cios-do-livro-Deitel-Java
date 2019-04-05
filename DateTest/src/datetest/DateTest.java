//Exercicio do livro Deitel 3.14
package datetest;

import java.util.Scanner;

public class DateTest {

    public static void main(String[] args) { // O metodo principal inicia a aplicacao
        Date dataTime = new Date(25, 5, 2019); // Chamada de uma nova instancia Date
        Scanner input = new Scanner(System.in); // Chamada de uma nova instancia Scanner
        System.out.println("Data cadastrada no sistema: " + dataTime.displayDate()); // Imprime na tela a data atual
        System.out.println("Atualize a data\n"); // Imprime na tela para atualizar a data
        System.out.println("Digite o dia abaixo: "); // Imprime na tela para digitar o dia
        dataTime.setDia(input.nextInt()); // Atualiza a data com metodo setDia
        System.out.println("Dia atualizado com sucesso para: " + dataTime.getDia()); //Imprime na tela mensagem de sucesso
        System.out.println("Digite o mes abaixo: "); // Imprime na tela para digitar o mes
        dataTime.setMes(input.nextInt()); // Atualiza o mes com o metodo setMes
        System.out.println("Mes atualizado com sucesso para: " + dataTime.getMes()); // Imprime na tela mensagem de  sucesso
        System.out.println("Digite o ano abaixo: "); // Imprime na tela para digitar o ano
        dataTime.setAno(input.nextInt()); // Atualiza o ano com o metodo setAno
        System.out.println("Ano atualizado com sucesso para: " + dataTime.getAno()); // Imprime na tela mensagem de sucesso
        System.out.println("Data atualizada: " + dataTime.displayDate()); //Imprime na tela a data atualizada
    } // Fim do metodo principal

} // Fim da classe DataTes
