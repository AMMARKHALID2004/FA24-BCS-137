public class Department {
    private String name;
    private String address;
    private String city;
    private Lab[] labs;
    private Person departmentInCharge;

    public Department(String name, String address, String city, Lab[] labs, Person departmentInCharge) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.labs = labs;
        this.departmentInCharge = departmentInCharge;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public Lab[] getLabs() {
        return labs;
    }

    public Person getDepartmentInCharge() {
        return departmentInCharge;
    }
}
