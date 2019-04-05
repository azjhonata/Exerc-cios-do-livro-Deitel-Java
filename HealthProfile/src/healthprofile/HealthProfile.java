package healthprofile;

import java.util.Calendar; // Esta aplicação utiliza a classe calendar

public class HealthProfile {

    private String nome, sobrenome, sexo; // Declara as variaveis do tipo String
    private int dia, mes, ano, idade; // Declara as variaveis do tipo int
    private double altura, peso, freqCM, indiceM; // Declara as variaveis do tipo double
    Calendar calendar = Calendar.getInstance(); // Chama a classe Calendar e cria uma variavel de referencia para retirar os dados de Date do sistema
    //Predefinições na classe construtora para inicialização das variaveis
    public HealthProfile(String nome, String sobrenome, String sexo, int dia, int mes, int ano, double altura, double peso) { 
        this.nome = nome; // Atribui um valor a variavel nome
        this.sobrenome = sobrenome; // Atribui um valor a variavel sobrenome
        this.sexo = sexo; // Atribui um valor a variavel sexo
        this.dia = dia; // Atribui um valor a variavel dia
        this.mes = mes; // Atribui um valor a variavel mes
        this.ano = ano; // Atribui um valor a variavel ano
        this.altura = altura; // Atribui um valor a variavel altura
        this.peso = peso; // Atribui um valor a variavel peso
    } // Fim do metodo construtor HealthProfile

    public void setNome(String nome) { // Metodo setNome responsavel por atribuir um valor a variavel nome
        this.nome = nome; // Atribui um valor a variavel nome
    } // Fim da metodo  setNome

    public void setSobrenome(String sobrenome) { // Metodo setNome responsavel por atribuir um valor a variavel sobrenome
        this.sobrenome = sobrenome; // Atribui um valor a variavel sobrenome
    } // Fim da metodo  setSobrenome

    public void setSexo(String sexo) { // Metodo setNome responsavel por atribuir um valor a variavel sexo
        this.sexo = sexo; // Atribui um valor a variavel sexo
    } // Fim da metodo  setSexo

    public void setDia(int dia) { // Metodo setNome responsavel por atribuir um valor a variavel dia
        this.dia = dia; // Atribui um valor a variavel dia
    } // Fim da metodo  setDia

    public void setMes(int mes) { // Metodo setNome responsavel por atribuir um valor a variavel mes
        this.mes = mes; // Atribui um valor a variavel mes
    } // Fim da metodo  setMes

    public void setAno(int ano) { // Metodo setNome responsavel por atribuir um valor a variavel ano
        this.ano = ano; // Atribui um valor a variavel ano
    } // Fim da metodo  setAno

    public void setAltura(double altura) { // Metodo setNome responsavel por atribuir um valor a variavel altura
        this.altura = altura; // Atribui um valor a variavel altura
    } // Fim da metodo  setAltura

    public void setPeso(double peso) { // Metodo setNome responsavel por atribuir um valor a variavel peso
        this.peso = peso; // Atribui um valor a variavel peso
    } // Fim da metodo  setPeso

    public String getNome() { // Metodo responsavel por retornar o valor da variavel nome
        return this.nome; // Retorna o valor da variavel nome
    } // Fim da metodo getNome

    public String getSobrenome() { // Metodo responsavel por retornar o valor da variavel sobrenome
        return this.sobrenome; // Retorna o valor da variavel sobrenome
    } // Fim da metodo  getSobrenome

    public String getSexo() { // Metodo responsavel por retornar o valor da variavel sexo
        return this.sexo; // Retorna o valor da variavel sexo
    } // Fim da metodo getSexo

    public int getDia() { // Metodo responsavel por retornar o valor da variavel dia
        return this.dia; // Retorna o valor da variavel Dia
    } // Fim da metodo  getDia

    public int getMes() { // Metodo responsavel por retornar o valor da variavel mes
        return this.mes; // Retorna o valor da variavel Mes
    } // Fim da metodo  getMes

    public int getAno() { // Metodo responsavel por retornar o valor da variavel ano
        return this.ano; // Retorna o valor da variavel ano
    } // Fim da metodo  getAno

    public double getAltura() { // Metodo responsavel por retornar o valor da variavel altura
        return this.altura; // Retorna o valor da variavel altura
    } // Fim da metodo  getAltura

    public double getPeso() { // Metodo responsavel por retornar o valor da variavel peso
        return this.peso; // Retorna o valor da variavel peso
    } // Fim da metodo  getPeso

    public String getImc() { // Metodo responsavel por retornar o valor da variavel indiceM com 2 casas decimais
        String indiceMCs = String.format("%.2f", this.indiceM); // Declara-se uma variavel do tipo String e nela armazena o valor da variavel indiceM com 2 casas decimais
        return indiceMCs; // Retorna a variavel MCs
    } // Fim da metodo  getImc

    public int getIdade() { // Metodo responsavel por realizar a conta da idade com base nos dados atuais do sistema
        this.idade = calendar.get(Calendar.YEAR) - this.ano; // Armazena na variavel idade o ano atual do sistema menos a variavel ano
        if (calendar.get(Calendar.MONTH) + 1 >= this.mes) {  // Se a variavel mês do sistema for maior ou igual a variavel mes não realiza o calculo
            if (calendar.get(Calendar.DATE) >= this.dia) { // Se a variavel dia do sistema for maior que a variavel dia não realiza o calculo
            } // Fim if
            else { // Senão for maior ou igual desconta 1 ano de idade
                idade--; // desconta 1 na idade
            } // fim else
        } // Fim if
        else { // Senão for maior ou igual desconta 1 ano de idade
            idade--; // desconta 1 na idade
        } // Fim else
        return idade; // Retorna a idade
    } // Fim do metodo  getIdade

    public String getNascimento() { // retorna a data de nascimento no formato / / /
        return this.dia + "/" + this.mes + "/" + this.ano; // retorna as variaveis dia, mes, ano em um formato / / /
    } // Fim do metodo getNascimento

    public String getFreqCAlvo() { // Realiza o calculo da frequencia cardiaca e retorna como String 
        this.freqCM = (220 - this.idade); // Calculo da frequencia cardiaca 220 menos a variavel idade
        return "Frequencia cardica maxima:      " + freqCM + "\nFrequencia cardiaca alvo entre: " + (freqCM * (0.50)) + " e " + (freqCM * (0.85)); // Realiza o calculo da
        // Da frequencia cardiaca alvo com base na variavel freqC que deve ficar no intervalo 50 e 85 e retorna como String
    } // Fim da metodo  getFreqCAlvo

    public String indiceMCorporal() { // Realiza o calculo do indce corporal e define o estado de saude
        String estado = ""; // inicializa a variavel estado
        this.indiceM = this.peso / (this.altura * this.altura);  // Realiza o calculo peso divido por altura ao quadrado
        if (this.indiceM >= 30) { // Se o indice for maior ou igual a 30
            estado = "obeso"; // a variavel estado recebe obeso
        } // Fim if 
        else if (this.indiceM >= 25 && this.indiceM < 30) { // se o indice for maior ou igual 25 e menor que 30
            estado = "Acima do peso"; // a variavel estado recebe acima do peso
        } // Fim else if 
        else if (this.indiceM >= 18.5 && this.indiceM < 25) { // se o indice for maior ou igual a 18.5 ou menor que 25
            estado = " Normal"; // a variavel estado recebe normal
        } // FIm else if 
        else if (this.indiceM < 18.5) { // se o indice for menor que 18.5
            estado = "Abaixo do peso"; // a variavel recebe abaixo do peso
        } // Fim else if
        return estado; // retorna a variavel estado
    } // Fim do metodo indiceMCorporal

} // Fim da classe HealthProfile
