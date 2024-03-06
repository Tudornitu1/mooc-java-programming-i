import java.util.ArrayList;

public class Room {
    ArrayList<Person> room;

    public Room() {
        this.room = new ArrayList<>();
    }

    public void add(Person person) {
        this.room.add(person);
    }

    public boolean isEmpty() {
        if (room.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Person> getPersons() {
        return this.room;
    }

    public Person shortest() {
        if(room.isEmpty()){
            return null;
        }
        Person sh=room.get(0);
        for(Person prs: this.room){
            if(sh.getHeight()>prs.getHeight()){
                sh=prs;
            }
        }
        return sh;
    }
    public Person take(){
        if(room.isEmpty()){
            return null;
        }
        Person x=shortest();
        room.remove(x);
        return x;
    }
}
