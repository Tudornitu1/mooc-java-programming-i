
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter point totals, -1 stops:");
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int x = Integer.valueOf(scanner.nextLine());
            if (x == -1) {
                break;
            }
            if (x >= 0 && x <= 100) {
                numbers.add(x);
            }

        }
        int sum = 0;
        int k = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum = sum + numbers.get(i);
            k++;
        }
        System.out.println("Point average (all): " + (double) sum / k);
        int sum2 = 0;
        int k2 = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) >= 50) {
                sum2 = sum2 + numbers.get(i);
                k2++;
            }
        }
        if (k2 > 0) {
            System.out.println("Point average (passing): " + (double) sum2 / k2);
        } else {
            System.out.println("Point average (passing): -");
        }
        System.out.println("Pass percentage: " + (double) k2 / k * 100);
        System.out.println("Grade distribution:");
        int[] dist = new int[6];
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < 50) {
                dist[0]++;
            } else if (numbers.get(i) < 60) {
                dist[1]++;
            } else if (numbers.get(i) < 70) {
                dist[2]++;
            } else if (numbers.get(i) < 80) {
                dist[3]++;
            } else if (numbers.get(i) < 90) {
                dist[4]++;
            } else if (numbers.get(i) < 100) {
                dist[5]++;
            }

        }
        for(int j=5;j>=0;j--){
            String stars="";
            for(int x=0;x<dist[j];x++){
                stars= stars+"*";
            }
            System.out.println(j+": "+stars);
        }
    }

}
