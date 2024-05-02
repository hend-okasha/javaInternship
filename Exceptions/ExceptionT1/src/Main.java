import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        boolean isValidInput = false;
        while (!isValidInput) {
            try {
                System.out.print("Enter the first integer: ");
                num1 = userInput.nextInt();
                System.out.print("Enter the second integer: ");
                num2 = userInput.nextInt();
                isValidInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter integers only.");
                userInput.nextLine();
            }
        }

        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);

        userInput.close();

    }
}