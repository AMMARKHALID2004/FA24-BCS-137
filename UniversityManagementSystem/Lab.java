public class Lab {
    private String labName;
    private int numberOfComputers;
    private String labAddress;
    private Computer[] computers;

    public Lab(String labName, int numberOfComputers, String labAddress, Computer[] computers) {
        this.labName = labName;
        this.numberOfComputers = numberOfComputers;
        this.labAddress = labAddress;
        this.computers = computers;
    }

    public String getLabName() {
        return labName;
    }

    public int getNumberOfComputers() {
        return numberOfComputers;
    }

    public String getLabAddress() {
        return labAddress;
    }

    public Computer[] getComputers() {
        return computers;
    }
}
