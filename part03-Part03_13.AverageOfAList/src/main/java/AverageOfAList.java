
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int x = Integer.valueOf(scanner.nextLine());
            if (x == -1) {
                break;
            }
            numbers.add(x);

        }
        int sum = 0;
        int k = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum = sum + numbers.get(i);
            k++;
        }
        System.out.println("Average: " + (double) sum / k);

    }
}
