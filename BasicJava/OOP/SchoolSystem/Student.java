package SchoolSystem;

public class Student extends Person implements Printable {
    int studentID;
    

    public Student(Person person, int studentID){
        super(person.name, person.age);
        this.studentID = studentID;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Student ID: " + studentID);
    }
}
