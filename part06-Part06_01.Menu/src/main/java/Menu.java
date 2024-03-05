
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal){
        if(!(meals.contains(meal))){
        meals.add(meal);
        }
    }
    
    public void printMeals(){
        for(int i=0;i<meals.size();i++){
            System.out.println(meals);
        }
    }

    public void clearMenu(){
        meals.clear();
    }
}
