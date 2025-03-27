public class SchoolManagementSystem {
    public static void main(String[] args) {
        Principal principal = new Principal("Dr. Asad Sohail", 50, 25);
        School school = new School("Muslim Model High School", "Main Ghang Road, Sheikhupura", principal, 10);

        Teacher teacher1 = new Teacher("Sir Abu bakar", 35, "Math", 101);
        Teacher teacher2 = new Teacher("Sir Jawad", 40, "Science", 102);

        ClassRoom class1 = new ClassRoom("Grade 10", "G10", teacher1, 5);
        ClassRoom class2 = new ClassRoom("Grade 11", "G11", teacher2, 5);

        school.addClassRoom(class1);
        school.addClassRoom(class2);

        class1.enrollStudent(new Student("Amir", 16, 1));
        class1.enrollStudent(new Student("Rumaan", 15, 2));
        class1.enrollStudent(new Student("Babar", 16, 3));
        class1.enrollStudent(new Student("Shahid", 15, 4));
        class1.enrollStudent(new Student("Ahmad", 16, 5));
        class2.enrollStudent(new Student("Hassan", 17, 7));
        class2.enrollStudent(new Student("Usman", 16, 8));
        class2.enrollStudent(new Student("Bilal", 17, 9));
        class2.enrollStudent(new Student("Zain", 16, 10));
        class2.enrollStudent(new Student("Faisal", 17, 11));

        System.out.println(school);
    }
}
