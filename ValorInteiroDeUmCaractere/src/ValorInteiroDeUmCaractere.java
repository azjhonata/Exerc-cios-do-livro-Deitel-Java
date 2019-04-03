//Exercicio 2.29 do livro de Deitel
/*
*Utilizando instruções semelhantes àquela mostrada anteriormente neste exercício, escreva um aplicativo que exiba os equivalentes
*nteiros de algumas letras maiúsculas, minúsculas, dígitos e símbolos especiais. Mostre os equivalentes inteiros do seguinte: A B C a b c 
*0 1 2 $ * + / e o caractere em branco.
* @author azjhonata(wineron)
*/
public class ValorInteiroDeUmCaractere {
//O metodo principal inicializa a aplicação
    public static void main(String[] args) {
           System.out.printf("Os valores dos caracteres respectivos %c %c %c %c %c %c são %d %d %d %d %d %d%n", 'A','B','C','a','b','c', ((int) 'A'), ((int) 'B'), ((int) 'C'), ((int) 'a'), ((int) 'b'), ((int) 'c')); //Imprime na tela os valores dos respectivos caracteres na ordem A B C a b c 
           System.out.printf("Os valores dos caracteres respectivos %c %c %c %c %c %c %c são %d  %d %d %d %d %d %d%n", '0','1','2','$','*','+','/', ((int) '0'), ((int) '1'), ((int) '2'), ((int) '$'), ((int) '*'), ((int) '+'),((int) '/')); //Iprime na tela os respectivos caracteres na ordem 0 1 2 * + /


    } // fim do metodo principal
    
} // fim da classe ValorInteiroDeUmCaractere
