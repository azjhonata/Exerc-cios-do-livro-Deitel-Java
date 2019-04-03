// Exercicio 2.33 do livro de Deitel
// Crie um aplicativo de calculadora IMC que leia o peso do usuário em libras e a altura em polegadas (ou, se preferir, o peso em quilogra-
// mas e a altura em metros) e, então, calcule e exiba o índice de massa corporal dele. Além disso, que exiba as seguintes informações do De-
// partment of Health and Human Services/National Institutes of Health, assim o usuário pode avaliar o seu IMC:
package calculadoradeindicedemassacorporal;

import java.util.Scanner; // This application use class Scanner

public class CalculadoraDeIndiceDeMassaCorporal {

    //The metod main initiaze application
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creation the object Scanner for reading input data typed by the user
        double weight, height, bmi; //Declaration the variables of the type double for stored the data typed by user.
        System.out.println("      Attention\nOnly inches and pounds"); // This command prints in the display one message of attention
        System.out.println("Enter your Height: "); // This command print in the display one message for the user enter your Height
        height = input.nextDouble(); // This line is responsible for make reading the data typed by user
        System.out.println("Enter your Weight: "); // This line prints in the display one message for the user enter your weight
        weight = input.nextDouble(); // This line makes the reading of the data typed by user
        System.out.println("BMI"); // This line prints in the display one word that inform the user the begin of table BMI
        bmi = ((weight * 703) / ((height * height))); // This instruction makes the calculation BMI with data typed by user above
        if (bmi >= 30) { // This condicion check if bmi is  greater than 30
            System.out.printf("Your BMI\n%.2f  It's Obese", bmi); // If it's true then prints in the display your BMI and your health currently  that is Obese
        } else { // else the application check if bmi is among 25 or 30
            if (bmi >= 25 && bmi <= 30) {
                System.out.printf("Your BMI\n%.2f It's Overweight\n", bmi); // // If it's true then prints in the display your BMI and your health currently that is Overweight
            } else { // else the application check if bmi is among 18.5 or 24.9
                if (bmi >= 18.5 && bmi <= 24.9) {
                    System.out.printf("Your BMI\n%.2f It's Normal\n", bmi); // // If it's true then prints in the display your BMI and your health currently that is normal
                } else { //If not any conditions previous true
                    System.out.printf("Your BMI\n" + "%.2f It's Underweight\n", bmi); // This line prints in the diplay yout BMI and you health currently that is Underweight
                }
            }
        }

    } // Fim do metodo principal

} // Fim da classe CalculadoraDeIndiceDeMassaCorporal
