public class Student extends Person {
    private int rollNumber;

    public Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    public String toString() {
        return "Student: " + super.toString() + ", Roll No: " + rollNumber;
    }
}
