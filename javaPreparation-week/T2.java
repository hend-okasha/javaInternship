import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("please enter first number: ");
        int num1= userInput.nextInt();

        System.out.println("please enter second number: ");
        int num2= userInput.nextInt();

        calculate(num1,num2);

    }
    public static void calculate(int num1,int num2){
        int sum= num1 + num2;
        int difference= num1 - num2;
        int product= num1 * num2;
        int division= num1 / num2;

        System.out.println("result of sum = "+ sum);
        System.out.println("result of difference = "+ difference);
        System.out.println("result of product = "+ product);
        System.out.println("result of division = "+ division);

    }
}