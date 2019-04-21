package quilometragem;  // Pacote utilizado na aplicação

public class Carro { 

    private int quiloRod;  // Declaração da variavel para quilometragem
    private int gasoCom;   // Decleração da variavel para quantidade de galosina usada

    public Carro(int valor1, int valor2) {
        this.quiloRod = valor1;  // Inicializando as variaveis com construtor
        this.gasoCom = valor2;   // Inicializando a variavel com o construtor
    } // Fim da classe construtora 

    public void setQuilo(int valor) {
        this.quiloRod = valor + this.quiloRod;  // Definindo  o valor para quilometragem com atualização
    } // Fim do metodo setQuilo

    public void setGaso(int valor) {
        this.gasoCom = valor + this.gasoCom;  // Definindo o valor para gasolina com atualização
    } // Fim do metodo setGaso

    public int getQuilo() {
        return this.quiloRod; // Retornando o valor da variavel privada quiloRod
    } // Fim do metodo getQuilo

    public int getCom() {
        return this.gasoCom;  // Retornando o valor da variavel privada gasoCom
    } // Fim do metodo getCOm

    public double quilome() {
        double var = ((double)this.quiloRod/(double)this.gasoCom); // Realizando a conta a quilometragem por litro de gasolina rodados 
        return var; // Retorna a variavel resultante
    } // Fim do metodo quilome

} // Fim da classe Carro
