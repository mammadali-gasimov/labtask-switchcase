import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ------- Task 1 --------
//        System.out.println("Enter first number:");
//        int firstNumber = scanner.nextInt();
//        System.out.println("Enter second number:");
//        int secondNumber = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Enter operation sign:");
//        String operation = scanner.nextLine();

//        switch(operation) {
//            case "*":
//                System.out.println(firstNumber * secondNumber);
//                break;
//            case "-":
//                System.out.println(firstNumber - secondNumber);
//                break;
//            case "+":
//                System.out.println(firstNumber + secondNumber);
//                break;
//            case "/":
//                System.out.println(firstNumber / secondNumber);
//                break;
//            case "%":
//                System.out.println(firstNumber % secondNumber);
//                break;
//            default:
//                System.out.println("False operation!");
//        }


        // ----- Task 2 -------
//        System.out.println("Enter the number of the month:");
//        int monthNumber = scanner.nextInt();
//        switch (monthNumber) {
//            case 12, 1, 2 -> System.out.println("Winter");
//            case 3, 4, 5 -> System.out.println("Spring");
//            case 6, 7, 8 -> System.out.println("Summer");
//            case 9, 10, 11 -> System.out.println("Autumn");
//            default -> System.out.println("Wrong month number!");
//        }


        // ----- Task 3 ------
//        System.out.println("Name of the month:");
//        String monthName = scanner.nextLine();
//
//        switch (monthName) {
//            case "january", "march", "may", "july", "august", "october", "december" -> System.out.println(31);
//            case "april", "june", "september", "november" -> System.out.println(30);
//            case "february" -> System.out.println("28 or 29");
//            default -> System.out.println("Wrong month name!");
//        }


        // ------ Task 4 -------
        System.out.println("Enter number bigger than 1:");
        int number = scanner.nextInt();

        while (number < 1) {
            System.out.println("Enter number bigger than 1:");
            number = scanner.nextInt();
        }

        switch (number) {
            case 1, 2, 3, 4, 5 -> System.out.println("1 - 5 arasindadir");
            case 6, 7, 8, 9, 10 -> System.out.println("6 - 10 arasindadir");
            default -> System.out.println("10 boyukdur");
        }
    }
}