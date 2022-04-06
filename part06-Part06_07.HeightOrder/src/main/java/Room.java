
import java.util.ArrayList;

public class Room {
    
    private ArrayList<Person> personsInRoom;
    
    public Room() {
        this.personsInRoom = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.personsInRoom.add(person);
    }
    
    public boolean isEmpty() {
        return personsInRoom.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return personsInRoom;
    }
    
    public Person shortest() {
        if (this.personsInRoom.isEmpty()) {
            return null;
        }
        
        Person shortest = this.personsInRoom.get(0);
        for (Person person : this.personsInRoom) {
            if (person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }
        }
        return shortest;
    }
    
    public Person take() {
        if (this.personsInRoom.isEmpty()) {
            return null;
        }
        
        Person shortest = this.personsInRoom.get(0);
        int shortestIndex = 0;
        for (int i = 1; i <= this.personsInRoom.size()-1; i++) {
            Person compared = this.personsInRoom.get(i);
            if (compared.getHeight() < shortest.getHeight()) {
                shortest = compared;
                shortestIndex = i;
            }
        }
        this.personsInRoom.remove(shortestIndex);
        return shortest;
    }
}