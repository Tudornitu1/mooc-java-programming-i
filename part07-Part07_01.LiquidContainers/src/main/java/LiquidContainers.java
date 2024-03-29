
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
        System.out.println("First: " + first + "/100");
        System.out.println("Second: " + second + "/100");
        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            int a = Integer.valueOf(parts[1]);
            if (parts[0].equals("add")) {

                if (a > 0) {
                    first += a;
                    if (first > 100) {
                        first = 100;
                    }
                }
            } else if (parts[0].equals("move")) {
                if (a > 0 && first >= a) {
                    first -= a;
                    second += a;
                    if (second > 100) {
                        second = 100;
                    }
                } else if (a > 0 && first > 0) {
                    second += first;
                    first = 0;
                    if (second > 100) {
                        second = 100;
                    }
                }
            } else if (parts[0].equals("remove")) {
                if (a > 0) {
                    second -= a;
                    if (second < 0) {
                        second = 0;
                    }
                }
            }
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
        }
    }

}
