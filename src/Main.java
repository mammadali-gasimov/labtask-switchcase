import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number:");
        int secondNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter operation sign:");
        String operation = scanner.nextLine();

        switch(operation) {
            case "*":
                System.out.println(firstNumber * secondNumber);
                break;
            case "-":
                System.out.println(firstNumber - secondNumber);
                break;
            case "+":
                System.out.println(firstNumber + secondNumber);
                break;
            case "/":
                System.out.println(firstNumber / secondNumber);
                break;
            case "%":
                System.out.println(firstNumber % secondNumber);
                break;
            default:
                System.out.println("False operation!");
        }
    }
}