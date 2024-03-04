
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        while(true) {
            int x = Integer.valueOf(scanner.nextLine());
            if(x==4) {
                break;
            }
            System.out.println("Give a number:");

        }
    }
}
