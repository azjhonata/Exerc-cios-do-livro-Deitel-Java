//Exercicio 3.13 do livro Deitel
package employeetest;

public class EmployeeTest {

    public static void main(String[] args) { // O metodo principal inicia a aplicação
        Employee funcionario1 = new Employee("Jones", "Wineron", 0);  // Chamada da primeira instancia
        Employee funcionario2 = new Employee("Denis", "Manchert", 3400); // Chamada da segunda instancia
        System.out.println("Salario funcionarios: "); // Imprime na tela
        System.out.println(funcionario1.geNome() + " " + funcionario1.getSobrenome()); // Imprime na tela o nome  e o sobrenome
        System.out.println("Salario mensal: " + funcionario1.getSalMensal()); // Imprime na tela o salario mensal 
        System.out.println("Salario Anual: " + funcionario1.salAnual()); // Imprime na tela o salario anual
        System.out.println(funcionario2.geNome() + " " + funcionario2.getSobrenome()); // Imprime na tela o nome e o sobrenome
        System.out.println("Salario mensal: " + funcionario2.getSalMensal()); // Imprime na tela o salario mensal
        System.out.println("Salario anual: " + funcionario2.salAnual()); // Imprime na tela o salario anual
        System.out.println("Aumento salário dos funcionários em 10%"); // Imprime na tela a mensagem de aumento
        System.out.println(funcionario1.geNome() + " " + funcionario1.getSobrenome()); // Imprime na tela o nome e o sobrenome
        funcionario1.salAumento(10); // Chamada do metodo aumento que aumenta em 10% o salario 
        System.out.println("Salario mensal: " + funcionario1.getSalMensal()); // Imprime na tela o novo salario mensal
        System.out.println("Salario Anual: " + funcionario1.salAnual()); // Imprime na tela o novo salario anual
        System.out.println(funcionario2.geNome() + " " + funcionario2.getSobrenome()); // Imprime na tela o nome e o sobrenome
        funcionario2.salAumento(10); // Chama o metodo aumento que aumenta em 10% o salario 
        System.out.println("Salario mensal: " + funcionario2.getSalMensal()); // Imprime na tela o novo salario mensal
        System.out.println("Salario Anual: " + funcionario2.salAnual()); // Imprime na tela o novo salario anual

    } // Fim do metodo principal

} //Fim da classe EmployeeTest
