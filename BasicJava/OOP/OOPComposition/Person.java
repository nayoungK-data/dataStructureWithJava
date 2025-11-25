package OOPComposition;

public class Person {
    // field declaration (has-A relationship) 
    Address address; // Address is a new data type by user-defined class

    // Constructor of Address 
    public Person(Address address){
        this.address = address;
    }
}
