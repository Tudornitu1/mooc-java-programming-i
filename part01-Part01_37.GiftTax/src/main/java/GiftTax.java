
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int x = Integer.valueOf(scan.nextLine());
        if (x < 5000) {
            System.out.println("No tax!");
        } else if (x < 25000) {
            System.out.println("Tax: " + (100 + 0.08 * (x - 5000)));
        } else if (x < 55000) {
            System.out.println("Tax: " + (1700 + 0.10 * (x - 25000)));
        } else if (x < 200000) {
            System.out.println("Tax: " + (4700 + 0.12 * (x - 55000)));
        } else if (x < 1000000) {
            System.out.println("Tax: " + (22100 + 0.15 * (x - 200000)));
        } else {
            System.out.println("Tax: " + (142100 + 0.17 * (x - 1000000)));
        }
    }
}
