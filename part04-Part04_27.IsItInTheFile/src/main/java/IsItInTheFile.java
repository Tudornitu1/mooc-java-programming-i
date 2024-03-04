
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        int k = 0;
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try (Scanner scanner2 = new Scanner(Paths.get(file))) {
            while (scanner2.hasNextLine()) {
                String x = scanner2.nextLine();
                if (x.equals(searchedFor)) {
                    System.out.println("Found!");
                    k = 1;
                }

            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed");
        }
        if (k == 0) {
            System.out.println("Not found");
        }
    }
}
