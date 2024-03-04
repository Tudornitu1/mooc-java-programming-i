
public class HealthStation {
private int k=0;

    public int weigh(Person person) {
        
        k++;// return the weight of the person passed as the parameter
        return person.getWeight();
        
    }

    public void feed(Person person){
        person.setWeight(person.getWeight()+1);
    }

    public int weighings(){
    return k;
    }
}
