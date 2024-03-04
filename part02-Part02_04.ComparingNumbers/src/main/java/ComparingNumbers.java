
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.valueOf(scanner.nextLine());
        int y = Integer.valueOf(scanner.nextLine());
        if (x > y) {
            System.out.println(x + " is greater than " + y);
        } else if (x < y) {
            System.out.println(y + " is smaller than " + x);
        } else {
            System.out.println(x + " is equal to " + y);
        }
    }
}
