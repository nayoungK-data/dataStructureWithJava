package SchoolSystem;

/**
 * Long Code #1 — Student / Teacher / School System (OOP Full Practice)

 Requirements:

 1. Create an interface Printable
    - Must include void printInfo();

 2. Create a class Person
    - Fields: String name, int age
    - Constructor: Person(String name, int age)
    - Implements Printable
    - printInfo(): print basic name and age

 3. Create a class Student
    - Extends Person (Student IS-A Person)
    - Field: int studentId
    - Constructor: Student(String name, int age, int studentId)
      -> must call super(name, age)
    - Override printInfo() to include studentId

 4. Create a class Teacher
    - Extends Person (Teacher IS-A Person)
    - Field: String subject
    - Constructor: Teacher(String name, int age, String subject)
      -> must call super(name, age)
    - Override printInfo() to include subject

 5. Create a class School
    - Has-A: ArrayList<Person> people
    - Constructor initializes the ArrayList
    - Method addPerson(Person p)
    - Method printAll()
      -> loops through all people and calls printInfo()

 6. In Main:
    - Create one Student object
    - Create one Teacher object
    - Create a School object
    - Add student and teacher to the school
    - Call school.printAll() to print everyone’s info
 */
public class SchoolSystemMain {
    public static void main(String[] args){

        Person p1 = new Person("Alice", 20);
        Person p2 = new Person("David", 30);
        Person p3 = new Person("Emma", 44);
        Person p4 = new Person("john", 55);


        Student s1 = new Student(p1, 3015222);
        Student s2 = new Student(p2, 3016333);
        Teacher t1 = new Teacher(p3, "CMPT225");
        Teacher t2 = new Teacher(p4, "STAT452");

        School school = new School();

        school.addPerson(s1);
        school.addPerson(s2);
        school.addPerson(t1);
        school.addPerson(t2);

        school.printAll();
    }
}
