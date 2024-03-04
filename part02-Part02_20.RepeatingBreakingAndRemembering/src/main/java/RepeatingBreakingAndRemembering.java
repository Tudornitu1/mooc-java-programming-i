
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is
        // gradually extended part by part.

        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about
        // the parts you haven't done, but you'll get points for the finished parts.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        int k = 0;
        int e = 0;
        int o = 0;
        while (true) {
            int x = Integer.valueOf(scanner.nextLine());
            if (x == -1) {
                break;
            }
            sum = sum + x;
            k++;
            if (x % 2 == 0) {
                e++;
            } else {
                o++;
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + k);
        System.out.println("Average: " + (double) sum / k);
        System.out.println("Even: " + e);
        System.out.println("Odd: " + o);
    }
}
