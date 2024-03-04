
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int max = 0;
        int sum = 0;
        int k = 0;
        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }
            String[] pieces = text.split(",");
            k++;
            sum = sum + Integer.valueOf(pieces[1]);
            if (pieces[0].length() > max) {
                max = pieces[0].length();
                name = pieces[0];
            }
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (double) sum / k);
    }
}
