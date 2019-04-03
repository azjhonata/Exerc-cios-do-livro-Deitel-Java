//Exercio 2.28 do livro Deitel
/*
*Eis uma prévia do que veremos mais adiante. Neste capítulo, você aprendeu sobre
*inteiros e o tipo int. O Java também pode representar números de pontos flutuantes que contêm pontos de fração decimal, como 3,14159.
*Escreva um aplicativo que leia a entrada a partir do usuário do raio de um círculo como um inteiro e imprima o diâmetro do círculo,
*circunferência e área utilizando o valor do ponto flutuante 3,14159 para S. Utilize as técnicas mostradas na Figura 2.7. [Observação: você
*também pode empregar a constante Math.PI predefinida para o valor de S. Essa constante é mais precisa que o valor 3,14159. A classe
*Math é definida no pacote java.lang. As classes nesse pacote são importadas automaticamente, portanto, você não precisa importar
*a classe Math para utilizá-la.] Adote as seguintes fórmulas (r é o raio):
*package diametrocircunferenciaareadeumcírculo;
 */
import static java.lang.Math.PI; //Essa aplicação utiliza a classe Math
import java.util.Scanner; // Essa aplicação utiliza a classe Scanner

public class DiametroCircunferenciaAreaDeUmCirculo {
//O metodo principal inicia a aplicação
    public static void main(String[] args) {
        //Criação de um objeto Scanner para fazer a leitura dos dados digitados pelo usuario
        Scanner lernumero = new Scanner(System.in);
        float raio; //Declaração da variavel raio
        System.out.println("Digite o raio do circulo: "); //Imprime na tela uma mensagem par ao usuario digitar o raio do circulo
        raio = lernumero.nextFloat(); // Realiza a leitura dos dados digitados pelo usuario
        System.out.println("Propriedades do circulo"); // Imprime na tela uma mensagem
        System.out.printf("Diametro: %.2f %n", raio * 2); // Imprime na tela o diametro com base na formula do diametro raio*2 e limita o resultado em duas casas decimais   
        System.out.printf("Circurferencia: %.2f  %n", (2 * raio * PI)); // Imprime na tela a circurferencia com base na formula 2*raio*PI e limita o resultado em duas casas decimais
        System.out.printf("Area: %.2f  %n", PI * raio); // Imprime na tela a area do circulo com base na formula PI*Raio e limita o resultado em duas casas decimais

    } // fim do metodo principal

} // fim da classe DiametroCircunferenciaAreaDeUmCírculo
