
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first ;
        Container second;
        first = new Container();
        second = new Container();
        System.out.println("First: " + first.contains() + "/100");
        System.out.println("Second: " + second.contains() + "/100");
        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            int a = Integer.valueOf(parts[1]);
            if (parts[0].equals("add")) {
                first.add(a);
                } else if (parts[0].equals("remove")) {
                    second.remove(a);
                } else if (parts[0].equals("move")) {
                if (a > 0 && first.contains() >= a) {
                    first.remove(a);
                    second.add(a);
                } else if (a > 0 && first.contains() > 0){
                    second.add(first.contains());
                    first.remove(first.contains());
                }
                
            } 
            System.out.println("First: " + first );
            System.out.println("Second: " + second );
        }
}

}
