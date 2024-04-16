import java.util.Scanner;
public class T4 {
    public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.println("enter the number between 1 and 7");
    int numOfDay = userInput.nextInt();
        weekDays(numOfDay);
    }
    public static void weekDays(int numOfDay) {
        switch (numOfDay) {
            case 1:
                System.out.println("the day is sunday");
                break;
            case 2:
                System.out.println("the day is monday");
                break;
            case 3:
                System.out.println("the day is tuesday ");
                break;
            case 4:
                System.out.println("the day is wednesday");
                break;
            case 5:
                System.out.println("the day is thursday");
                break;
            case 6:
                System.out.println("the day is friday");
                break;
            case 7:
                System.out.println("the day is saturday");
                break;
            default:
                System.out.println("enter number between 1 and 7");
                break;
        }
    }
    }
