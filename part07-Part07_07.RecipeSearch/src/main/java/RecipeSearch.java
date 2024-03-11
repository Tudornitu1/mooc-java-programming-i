
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File to read:");
        String file;
        file=scan.nextLine();
        ArrayList<Recipe> recipes=new ArrayList<>();
        try(Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()){
                Recipe x;
                String name;
                int time;
                ArrayList<String> ingredients=new ArrayList<>();
                String ingredient;
                name=scanner.nextLine();
                time=Integer.valueOf(scanner.nextLine());
                
                while (scanner.hasNextLine() && !(ingredient = scanner.nextLine()).isEmpty()) {
                    ingredients.add(ingredient);
                    

                }
                x= new Recipe(name, time, ingredients);
                recipes.add(x);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("");
        System.out.println("Commands");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
        while(true) {
            System.out.println("Enter command: ");
            String command=scan.nextLine();
            if(command.equals("stop")){
                break;
            } else if(command.equals("list")) {
                System.out.println("");
                System.out.println("Recipes:");
                System.out.println(recipes);
            } else if(command.equals("find name")){
                System.out.println("Searched word: ");
                String searched=scan.nextLine();
                for(int i=0;i<recipes.size();i++){
                    Recipe x=recipes.get(i);
                    String name=x.getName();
                    if(name.contains(searched)){
                    System.out.println(recipes.get(i));
                    
                    }
                }
            } else if(command.equals("find cooking time")){
                System.out.println("Max cooking time: ");
                int max=Integer.valueOf(scan.nextLine());
                for(int i=0;i<recipes.size();i++){
                    Recipe x=recipes.get(i);
                    int time=x.getTime();
                    if(time<=max){
                    System.out.println(recipes.get(i));
                    
                    }
                }
            } else if(command.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String ingredient = scan.nextLine();
                for(int i=0;i<recipes.size();i++){
                    Recipe x=recipes.get(i);
                    ArrayList<String> ingredients = x.getIngredients();
                    for(int j=0;j<x.getIngredients().size();j++){
                        if(ingredient.equals(ingredients.get(j))){
                            System.out.println(recipes.get(i));
                        }
                    }
                    
                    
                    
                }
            }
        }
    }

}
