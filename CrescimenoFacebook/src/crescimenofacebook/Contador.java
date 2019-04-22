package crescimenofacebook;

public class Contador {

    private double juros = 0.04;
    private double valorInicial = 200000000;
    private double valor;

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void contador() {
        for (int i = 1; i <= 10; i++) {
            this.valor = (this.valorInicial * (Math.pow(1 + this.juros, i)));
            this.valor = this.valor / 100;
            System.out.printf("%4d%,25.0f%n", i, this.valor);
        }
    }

}
