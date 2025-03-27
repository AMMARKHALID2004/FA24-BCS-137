public class ClassRoom {
    private String className;
    private String classCode;
    private Teacher teacher;
    private Student[] students;
    private int studentCount = 0;

    public ClassRoom(String className, String classCode, Teacher teacher, int maxStudents) {
        this.className = className;
        this.classCode = classCode;
        this.teacher = teacher;
        this.students = new Student[maxStudents];
    }

    public void enrollStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount++] = student;
        } else {
            System.out.println("Cannot enroll student " + student + ". Class " + className + " is full.");
        }
    }



    public String toString() {
        String result = "Class: " + className + " (" + classCode + ")\n" + teacher + "\nStudents:\n";
        for (int i = 0; i < studentCount; i++) {
            result += students[i] + "\n";
        }
        return result;
    }
}