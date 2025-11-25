class Student extends Person{
    // field declaration (has-A relationship)
    int studentId;

    // Constructor
    public Student(String name, int studentId){
        super(name);
        this.studentId = studentId;
    }

    @Override
    public String toString(){
        return "name: " + name + ", studentID: " + studentId;
    }
}