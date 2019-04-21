package criptografia;

public class Cripto {
// Declaração das variaveis
    private int digito;  
//Metodo construtor e pre-definição
    public Cripto(int digito) {
        this.digito = digito;
        if (this.digito < 999 || this.digito > 9999) {
            this.digito = 1000;
        } // Fim do if
    } // Fim do metodo construtor

    //Define um valor a variavel digito
    public void setDigito(int digito) {
        this.digito = digito;
    } // Fim do metodo setDigito

    public String cript() {
        // Declaração e inicialização das variaveis
        String a = "", b;
        int c;
        int pot = 1000;
        //Metodo for de repetição para realizar a separação dos numeros com base nas casas decimais
        for (int i = 0; i < 4; i++) {
            c = (this.digito / pot);
            c = (c + 7) % 10;
            a = a + Integer.toString(c);
            this.digito = (this.digito % pot);
            pot = pot / 10;
            
        } // Fim do metodo cript
        //Converte e inverter a ordem dos numeros de 4 casas decimais
        a = Integer.toString(Integer.parseInt(a) % 100) + Integer.toString(Integer.parseInt(a) / 100);
        return a; //Retorna o valor
    } // Fim metodo cript
} // Fim da classe Cripto
