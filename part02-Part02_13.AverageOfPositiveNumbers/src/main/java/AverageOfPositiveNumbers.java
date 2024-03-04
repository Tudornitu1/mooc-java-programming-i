
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int k = 0;
        while (true) {
            int x = Integer.valueOf(scanner.nextLine());
            if (x == 0) {
                break;
            }
            if(x>0) {
                sum = sum + x;
                k++;

            }
        }
        if(sum == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((double)sum/k);
        }
    }
}
