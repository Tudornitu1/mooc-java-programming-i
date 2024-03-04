
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = 0;
        while (true) {
            System.out.println("Give a number:");
            int x = Integer.valueOf(scanner.nextLine());
            if (x == 0) {
                break;
            }
            if (x < 0) {
                k++;
            }
        }
        System.out.println("Number of negative numbers: " + k);
    }
}
