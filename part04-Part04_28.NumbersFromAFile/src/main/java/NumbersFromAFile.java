
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k=0;
        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        try (Scanner scanner2= new Scanner(Paths.get(file))){
            while(scanner2.hasNextLine()){
                int x= Integer.valueOf(scanner2.nextLine());
                if(x>=lowerBound&&x<=upperBound){
                    k++;
                }
            }
        } catch (Exception e) {
            System.out.println("failed");
        }
        System.out.println("Numbers: "+k);
    }

}
