import java.util.Scanner;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inputUser= new Scanner(System.in);
        int[] numbers = { 2, 4, 6, 8, 10, 4, 12, 14 };
        System.out.println("enter the number you search for");
        int target = inputUser.nextInt();

        int firstOccurrenceIndex = findFirstOccurrence(numbers, target);

        if (firstOccurrenceIndex != -1) {
            System.out.println("First occurrence of " + target + " found at index " + firstOccurrenceIndex);
        } else {
            System.out.println("Number " + target + " not found in the array.");
        }
    }

    public static int findFirstOccurrence(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (i < 5) {
                    continue; // Skip if position < 5
                } else {
                    return i + 1; // Found first occurrence
                }
            }
        }
        return -1; // Number not found
    }
}
