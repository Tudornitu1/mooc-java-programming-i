
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int index = Integer.valueOf(scanner.nextLine());
            if (index == 9999) {
                break;
            }
            list.add(index);
        }

        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        System.out.println("Smallest number: " + min);
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j) == min) {
                System.out.println("Found at index: " + j);
            }
        }

    }
}
