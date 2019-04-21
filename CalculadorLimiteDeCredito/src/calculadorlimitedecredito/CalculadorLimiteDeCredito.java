
package calculadorlimitedecredito;

import java.util.Scanner;

public class CalculadorLimiteDeCredito {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cliente c1 = new Cliente("Maria","Eduarda",1,3000,0,0,4000);
        System.out.println("Limite de credito");
        System.out.println("Codigo do cliente: "+c1.getNumeroConta());
        System.out.printf("Nome: %s"+" %s%n", c1.getNome(),c1.getSobrenome());
        System.out.println("Saldo atual: "+c1.getSaldoMes());
        System.out.println("Limite de credito: "+c1.getLimiteCredito());
        System.out.println("Total de itens comprados: "+c1.getTotalItens());
        System.out.println("Digite o valor do item a ser comprado: ");
        c1.setTotalCredito(input.nextInt());
        c1.setTotalItens();
        System.out.println("Total de itens comprados: "+c1.getTotalItens());
        System.out.println("Saldo total: "+ c1.novoSaldo());
        System.out.println("Limite de credito: "+c1.getLimiteCredito());
    }
    
}
