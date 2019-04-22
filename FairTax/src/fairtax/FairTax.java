package fairtax;

import java.util.Scanner;

public class FairTax {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cliente c1 = new Cliente("Paulo", "Fernandes", 0, 0, 0, 0, 0, 0, 0, 0);
        System.out.println("Calculadora de FairTax%nPreencha os dados solicitados abaixo: ");
        System.out.println("O valor da Alimentação: ");
        c1.setAlimentacao(input.nextDouble());
        System.out.println("Digite o valor da moradia: ");
        c1.setMoradia(input.nextDouble());
        System.out.println("Digite o valor do vestuario: ");
        c1.setVestuario(input.nextDouble());
        System.out.println("Digite o valor do transporte: ");
        c1.setTransporte(input.nextDouble());
        System.out.println("Digite o valor da educação: ");
        c1.setEducacao(input.nextDouble());
        System.out.println("Digite o valor da asistência mêdica: ");
        c1.setAssistenciaMedica(input.nextDouble());
        System.out.println("Digite o valor das ferias: ");
        c1.setFerias(input.nextDouble());
        System.out.printf("Fair Tax: %s%n", c1.fairTax());
    }
    
}
