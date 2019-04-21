package descriptografia;

public class Decrypt { 
// Declaração das variaveis
    private int digito;
//Metodo construtor e pre-definição
    public Decrypt(int digito) {
        this.digito = digito;
        if (digito < 999 || digito > 9999) {
            this.digito = 1000;
        } // Fim do if

    } // Fim do metodo Decrypt
    //Define um valor a variavel digito
    public void setDigito(int digito) {
        this.digito = digito;
    } // Fim do metodo setDigito

    public String decript() {
        // Declaração e inicialização das variaveis
        String a, b = "";
        int pot = 1000;
        int c;
        //Converte e inverter a ordem dos numeros de 4 casas decimais
        a = (Integer.toString(this.digito % 100)) + (Integer.toString(this.digito / 100));
        //Metodo for de repetição para realizar a separação dos numeros com base nas casas decimais
        for (int i = 0; i < 4; i++) {
            
            this.digito = Integer.parseInt(a);
            c = (this.digito / pot);
            c = (c + 3) % 10;
            b = b + Integer.toString(c);
            this.digito = (this.digito % pot);
            pot = pot / 10;
        } // Fim do for
        return b; // Retorna o valor
    } // Fim do metodo decrypt
} // Fim da classe Decrypt