// Calculator by Duck
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum, subtract, multiply, divide;

        System.out.println("Welcome to Duck's Calculator");
        System.out.println("Enter the first number:");
        int number_1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int number_2 = scanner.nextInt();
        
        System.out.println("Choose an operation: \n 1. Add \n 2. Subtract \n 3. Multiply \n 4. Divide");
        int operation = scanner.nextInt();
        
        if (operation == 1) {
            sum = number_1 + number_2;
            System.out.printf("%d + %d = %d", number_1, number_2, sum);
        } else if (operation == 2) {
            subtract = number_1 - number_2;
            System.out.printf("%d - %d = %d", number_1, number_2, subtract);
        } else if (operation == 3) {
            multiply = number_1 * number_2;
            System.out.printf("%d * %d = %d", number_1, number_2, multiply);
        } else if (operation == 4) {
            divide = number_1 / number_2;
            System.out.printf("%d / %d = %d", number_1, number_2, divide);
        } else {
            System.out.println("Invalid Number");
            System.out.println("Try using a number from the table");
        }
    }
}
