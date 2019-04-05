package datetest;

public class Date {

    private int dia, mes, ano; // Declaração das variaveis de instancia

    public Date(int dia, int mes, int ano) { // Pre definição das variaveis com metodo construtor
        this.dia = dia; // Define um valor para a variavel dia
        this.mes = mes; // Define um valor para a variavel dia
        this.ano = ano; // Define um valor para a variavel dia
        if (this.dia < 1 || this.dia > 31) {  // Certifica que o dia não deve ser menor que 1 e maior que 31
            this.dia = 1; // Atribui 1 ao dia
        } // fim if
        else if (this.mes < 1 || this.mes > 12) { // Certifica que o mes não deve ser menor que 1 ou mairo que 12
            this.mes = 1; // Atribui 1 ao mes
        }// fim else if
        else if (this.ano < 1) { // Certifica que o ano não deve ser menor que 1
            this.ano = 1; // Atribui  1 ao ano
        }// fim else if
    } // Fim do metodo construtor Date

    public void setDia(int dia) {
        this.dia = dia;  // Define uma valor para o dia
    } // Fim do metodo setDia

    public void setMes(int mes) {
        this.mes = mes;  // Define uma valor para o mes
    } // Fim do metodo setMes

    public void setAno(int ano) {
        this.ano = ano;  // Define uma valor para o ano
    } // Fim do metodo setAno

    public int getDia() {
        return this.dia; // Retorna o valor do dia
    }//Fim do metodo getDia

    public int getMes() {
        return this.mes; // Retorna o valor do mes
    } //Fim do metodo getMes

    public int getAno() {
        return this.ano; // Retorna o valor do ano
    } // Fim do metodo getAno

    public String displayDate() { // exibe o dia o mes e ano separados por / 
        return (this.dia + "/" + this.mes + "/" + this.ano);
    } // Fim do metodo displayDate

} // Fim da classe Date
