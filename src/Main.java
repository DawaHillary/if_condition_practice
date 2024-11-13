import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //A program that takes two numbers and an operator (+, -, *, /)
        // and calculate the value using if conditions.

        Scanner number1 = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double num1 = number1.nextDouble();

        Scanner operator = new Scanner(System.in);
        System.out.println("Enter operator (+, -, *, /): ");
        char option = operator.next().trim().charAt(0);

        Scanner number2 = new Scanner(System.in);
        System.out.println("Enter second number: ");
        double num2 = number2.nextDouble();


        double result;


            if (option == '+') {
                result = num1 + num2;
                System.out.println(result);
            }
            else if (option == '-') {
            result = num1 - num2;
                System.out.println(result);
            }

            else if (option == '*') {
                result = num1 * num2;
                System.out.println(result);
            }

            else if (option == '/') {
                if (num2 == 0) {
                System.out.println("Error: Division by zero is not allowed.");
                return;
                }
            result = num1 / num2;
                System.out.println(result);
            }

            else {
                System.out.println("Error: Invalid operator. Please use (+, -, *, /).");
                return;

        }
    }
}