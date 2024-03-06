import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int max;
    private int we=0;
    public Suitcase(int maxi) {
        items=new ArrayList<>();
        this.max=maxi;
    } 
    public void addItem(Item item) {
        
        if(item.getWeight()+we<=max){
            we=we+item.getWeight();
            items.add(item);
        }
    }
    public String toString() {
        if(items.isEmpty()){
            return "no items (0 kg)";
        } else if(items.size()==1){
            return "1 item ("+we+" kg)";
        }
        return items.size()+" items ("+we+" kg)";
    }
    public void printItems(){
        for(Item pr:items){
            System.out.println(pr.getName()+" ("+pr.getWeight()+" kg)");
        }
    }
    public int totalWeight(){
        return we;
    }
    public Item heaviestItem(){
        if(items.isEmpty()){
            return null;
        }
        Item heavy=items.get(0);
        for(Item pr:items){
            if(pr.getWeight()>heavy.getWeight()){
                heavy=pr;
            }
        }
        return heavy;
    }
}
