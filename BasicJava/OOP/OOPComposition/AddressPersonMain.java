package OOPComposition;

public class AddressPersonMain {
    public static void main(String[] args){
        Address a = new Address("Vancouver", "Main St");
        Address a1 = new Address("Burnaby","Kingsway");
        Person p1 = new Person(a1);
        Person p = new Person(a);
        
        System.out.print(p.address.city + ", ");
        System.out.println(p.address.street);
        System.out.print(p1.address.city + ", ");
        System.out.println(p1.address.street);
    }
    
}