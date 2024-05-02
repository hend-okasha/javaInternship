import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionT1 {
    public static void main(String[] args) {
        boolean validInput = false;
        int num1=0 , num2 =0;
        Scanner userInput= new Scanner(System.in);
        while (! validInput){
            try {
                System.out.println(" please enter first number: ");
                num1 = userInput.nextInt();
                System.out.println(" please enter second number: ");
                num2 = userInput.nextInt();
                validInput = true;

            } catch (InputMismatchException e){
                System.out.println("invalid value, please enter integer value ");
                userInput.nextLine();
            }
        }
        int sum = num1 + num2;
        System.out.println( "Sum of " + num1 + " and " + num2 + " is " + sum);
        userInput.close();
    }
}