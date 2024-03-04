
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a year:");
        int y = Integer.valueOf(scan.nextLine());
        if (y % 4 != 0) {
            System.out.println("The year is not a leap year");
        } else if (y % 100 == 0 && y % 400 != 0) {
            System.out.println("The year is not a leap year");
        } else if (y % 4 == 0) {
            System.out.println("The year is a leap year");
        }

    }
}
