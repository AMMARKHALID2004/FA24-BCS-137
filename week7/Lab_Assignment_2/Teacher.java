public class Teacher extends Person {
    private String subject;
    private int teacherId;

    public Teacher(String name, int age, String subject, int teacherId) {
        super(name, age);
        this.subject = subject;
        this.teacherId = teacherId;
    }

    public String toString() {
        return "Teacher: " + super.toString() + ", Subject: " + subject;
    }
}