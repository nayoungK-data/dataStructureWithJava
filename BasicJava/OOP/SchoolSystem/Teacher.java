package SchoolSystem;

public class Teacher extends Person {
    String subject;

    public Teacher(Person person, String subject){
        super(person.name, person.age);
        this.subject = subject;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Subject: " + subject);
    }
}
