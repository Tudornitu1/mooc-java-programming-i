
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int k = 0;
        while (true) {
            System.out.println("Give a number:");
            int x = Integer.valueOf(scanner.nextLine());
            if (x == 0) {
                break;
            }
            k++;
            sum = sum + x;
        }
        System.out.println("Number of numbers: " + k);
        System.out.println("Sum of the numbers: " + sum);
    }
    
}
