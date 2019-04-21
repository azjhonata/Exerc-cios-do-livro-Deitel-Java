package calculadorlimitedecredito;

public class Cliente {

    private String nome, sobrenome;
    private int numeroConta, saldoMes, totalItens, totalCredito, limiteCredito;

    public Cliente(
            String nome, String sobrenome, int numeroConta, int saldoMes,
            int totalItens, int totalCredito, int limiteCredito) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numeroConta = numeroConta;
        this.saldoMes = saldoMes;
        this.totalItens = totalItens;
        this.totalCredito = totalCredito;
        this.limiteCredito = limiteCredito;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldoMes(int saldoMes) {
        this.saldoMes = saldoMes;
    }

    public void setTotalItens() {
        this.totalItens++;
    }

    public void setTotalCredito(int totalCredito) {
        this.totalCredito = totalCredito;
    }

    public void setLimiteCredito(int limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public int getTotalCredito() {
        return this.totalCredito;
    }

    public int getLimiteCredito() {
        return this.limiteCredito;
    }

    public int getSaldoMes() {
        return this.saldoMes;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public String getNome() {
        return this.nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }
    public int getTotalItens(){
        return this.totalItens;
    }

    public String novoSaldo() {
        String valor = "";
        if (this.totalCredito > this.limiteCredito) {
            valor = "Limite excedido";
            this.totalCredito = 0;
        } else {
            this.limiteCredito = this.limiteCredito - this.totalCredito;
            this.saldoMes = this.saldoMes + this.limiteCredito;
            valor = String.valueOf(this.saldoMes);
        }
        return valor;
    }
}
