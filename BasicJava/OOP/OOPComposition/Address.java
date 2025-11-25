package OOPComposition;

// it's a part of Person class -> composition relationship (has a)
public class Address {
    String city;
    String street;

    // Constructor (create a constructor in class that has more detailed fields variables)
    public Address(String city, String street){
        this.city = city;
        this.street = street;
    }
}
