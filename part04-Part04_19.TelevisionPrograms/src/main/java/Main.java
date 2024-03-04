import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Name: ");
            String name=scanner.nextLine();
            if(name.equals(""))
            {
                break;
            }
            System.out.println("Duration:");
            int d = Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(name, d));
        }
        System.out.println("Program's maximum duration?");
        int maxi=Integer.valueOf(scanner.nextLine());
        for(TelevisionProgram tv:programs){
            if(tv.getDuration()<=maxi){
                System.out.println(tv.getName()+", "+tv.getDuration()+" minutes");
            }
        }
    }
}
