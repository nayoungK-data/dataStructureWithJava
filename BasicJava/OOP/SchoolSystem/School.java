package SchoolSystem;
import java.util.ArrayList;

public class School {
    ArrayList<Person> people;

    // Constructor
    public School(){
        // this.people instead of people
        this.people = new ArrayList<>();
    }
    
    void addPerson(Person p){
        people.add(p);
    }

    void printAll(){
        for(Person p : people){
            p.printInfo();
        }
    }

}
