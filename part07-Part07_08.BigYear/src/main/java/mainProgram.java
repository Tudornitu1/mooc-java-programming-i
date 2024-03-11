
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scanner = new Scanner(System.in);
        ArrayList<Bird> birds=new ArrayList<>();
        while(true){
        System.out.println("?");
        String command=scanner.nextLine();
        if(command.equals("Quit")){
            break;
        }
        if(command.equals("Add")){
            System.out.println("Name:");
            String name=scanner.nextLine();
            System.out.println("Name in Latin:");
            String latin=scanner.nextLine();
            Bird bird=new Bird(name, latin);
            birds.add(bird);
        } else if(command.equals("Observation")){
            System.out.println("Bird?");
            String bird=scanner.nextLine();
            for(int i=0;i<birds.size();i++){
                if(birds.get(i).getName().equals(bird)){
                    birds.get(i).observation();
                }
            }

        } else if(command.equals("All")){
            System.out.println(birds);
        } else if(command.equals("One")){
            System.out.println("Bird?");
            String bird=scanner.nextLine();
            for(int i=0;i<birds.size();i++){
                if(birds.get(i).getName().equals(bird)){
                    System.out.println(birds.get(i));
                }
            }
        }
        }
    }

}
