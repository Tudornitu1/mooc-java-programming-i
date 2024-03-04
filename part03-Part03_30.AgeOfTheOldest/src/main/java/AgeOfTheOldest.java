
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }
            String[] pieces = text.split(",");
            if (Integer.valueOf(pieces[1]) > age) {
                age = Integer.valueOf(pieces[1]);
            }
        }
        System.out.println("Age of the oldest: " + age);

    }
}
