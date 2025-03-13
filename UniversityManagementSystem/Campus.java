public class Campus {
    private String campusName;
    private Department[] departments;

    public Campus(String campusName, Department[] departments) {
        this.campusName = campusName;
        this.departments = departments;
    }

    public String getCampusName() {
        return campusName;
    }

    public Department[] getDepartments() {
        return departments;
    }
}
