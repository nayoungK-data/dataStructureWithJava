package SchoolSystem;

public class Person implements Printable {
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
