package employeetest;

public class Employee {

    private String nome, sobrenome; // Declaração das variaveis internas
    private double salMensal, salAnual, novoSal;  // Declaração das variaveis internas

    public Employee(String nome, String sobrenome, double salMensal) { // Metodo construtor
        this.salMensal = salMensal; // Pre definição  da variavel
        this.nome = nome; // Pre definição  da variavel
        this.sobrenome = sobrenome; // Pre definição  da variavel
        if (this.salMensal < 0.0) { // Condição para certificar que o salario é sempre positivo
            this.salMensal = 0.0;  // Define o salario mensal como 0.0
        } // fim if
    } // fim do metodo construtor Employee

    public void setNome(String nome) { // Metodo que define a variavel nome
        this.nome = nome; // Define um valor para nome
    } // Fim do metodo setNome

    public void setSobrenome(String sobrenome) { // Metodo que define a variavel sobrenome
        this.sobrenome = sobrenome; // Define um valor para sobrenome
    } // FIm do metodo setSobrenome

    public void setSalMensal(double salMensal) { // Metodo que define a variavel sobrenome
        this.salMensal = salMensal; // Define um valor para salMensal
    } // Fim do metodo setSalMensal

    public String geNome() { // Metodo que retorna o valor da instancia
        return this.nome; // retorna o valor da variavel nome de instancia 
    } // Fim do metodo getNome

    public String getSobrenome() { // Metodo que retorna o valor da instancia
        return this.sobrenome; // retorna o valor da variavel nome de instancia 
    } // Fim do metodo getSobrenome

    public double getSalMensal() { // Metodo que retorna o valor da instancia
        return this.salMensal; // retorna o valor da variavel salMensal de instancia
    } // Fim do metodo getSalMensal

    public double salAnual() { // Metodo que define o salAnual com base no salMensal
        this.salAnual = this.salMensal * 12; // salAnual passa a ser o salMensal vezes 12
        return this.salAnual; // Retorna o salAnual
    } // Fim do metodo salAnual

    public void salAumento(double salMensal) { //Atualiza o valor do salMensal com base em um dado input
        this.salMensal = this.salMensal + this.salMensal * (salMensal / 100); //salMensal passa a ser salMensal + salMensal vezes o porcentual de aumento

    } // Fim do metodo salAumento
} //Fim da classe Employee
