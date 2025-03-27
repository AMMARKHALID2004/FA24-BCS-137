public class School {
    private String name;
    private String address;
    private Principal principal;
    private ClassRoom[] classrooms;
    private int classCount = 0;

    public School(String name, String address, Principal principal, int maxClasses) {
        this.name = name;
        this.address = address;
        this.principal = principal;
        this.classrooms = new ClassRoom[maxClasses];
    }

    public void addClassRoom(ClassRoom classroom) {
        if (classCount < classrooms.length) {
            classrooms[classCount++] = classroom;
        }
    }

    public String toString() {
        String result = "School: " + name + "\nAddress: " + address + "\n" + principal + "\nClasses:\n";
        for (int i = 0; i < classCount; i++) {
            result += classrooms[i] + "\n";
        }
        return result;
    }
}
