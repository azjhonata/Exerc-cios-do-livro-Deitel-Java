package calculadoradefrequênciacardíacaalvo;

import java.util.Calendar; // Esta aplicação utiliza a classe calendar

public class HeartRates {

    Calendar calendar = Calendar.getInstance(); // Chamada de uma classe do tipo calendar
    private String nome, sobrenome; // Declaração das variaveis do tipo String
    private int dia, mes, ano, idade; // Declaração das variaveis do tipo int
    private double fraqCM; // Declaração da variavel do tipo double

    public HeartRates(String nome, String sobrenome, int dia, int mes, int ano) { // Pre define as variaveis pelo metodo construtor
        this.nome = nome; // Atribui um valor ao nome
        this.sobrenome = sobrenome; // atribui um valor ao sobrenome
        this.dia = dia; // Atribui um valor ao nome
        this.mes = mes; // Atribui um valor ao mes
        this.ano = ano; // Atribui um valor ao ano

    } // Fim do metodo construtor HeartRates

    public void setNome(String nome) {
        this.nome = nome; // Atribui um valor ao nome
    } // Fim do metodo setNome

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome; // Atribui um valor ao sobrenome
    } // Fim do metodo setSobrenome

    public void setDia(int dia) {
        this.dia = dia; // Atribui um valor ao dia
    } // Fim do metodo setDia

    public void setMes(int mes) {
        this.mes = mes; // Atribui um valor ao mes
    } // Fim do metodo setMes

    public void setAno(int ano) {
        this.ano = ano; //Atribui um valor ao ano
    } // Fim do metodo setaAno

    public String getNome() {
        return this.nome; // Retorna o nome
    } // FIm do metodo getNome

    public String getSobrenome() {
        return this.sobrenome; // Retorna o sobrenome
    } // Fim do metodo getSogrenome

    public int getDia() {
        return this.dia; // Retorna o dia
    } // Fim do metodo getDia

    public int getMes() {
        return this.mes; // Retorna o mes
    } // Fim do metodo getMes 

    public int getAno() {
        return this.ano; // Retorna o ano
    } // Fim do metodo getAno

    public int calIdade() { // Calcula idade com base no relogio do computador
        this.idade = (calendar.get(Calendar.YEAR)) - this.ano; // Idade recebe ano atual do computador menos a variavel instanciada ano
        if ((calendar.get(Calendar.MONTH) + 1) >= this.mes) { // Se o mes do computador for maior que o instanciado
            if (calendar.get(Calendar.DATE) >= this.dia) { // Se o dia do computador for maior que o dia instanciado
            } // Fim if
            else { // Senão for maior
                idade--; // Diminui um ano na idade
            } // Fim else
        } // Fim if
        else { // Se não for maior
            idade--; // Diminui um ano na idade
        } // Fim else
        return idade;
    } // Fim do metodo calIdade

    public String dataTime() { // Formata o dia o mesm e o ano com / simples e retorna uma String
        return (this.dia + "/" + this.mes + "/" + this.ano);
    } // Fim do metodo dataTime 

    public String freqCAlvo() { // Realiza o calculo da frequencia cardiaca e retorna como String
        this.fraqCM = (220 - this.idade);
        return "Frequencia cardiaca maxima: " + this.fraqCM + "\nFrequencia cardiaca alvo entre: " + (this.fraqCM * (0.50)) + " e " + (this.fraqCM * (0.85));
    } // Fim do metodo FreqCAlvo
} // Fim da classe HeartRates
