public class Computer {
    private String ram;
    private String diskSize;
    private String core;

    public Computer(String ram, String diskSize, String core) {
        this.ram = ram;
        this.diskSize = diskSize;
        this.core = core;
    }

    public String getRam() {
        return ram;
    }

    public String getDiskSize() {
        return diskSize;
    }

    public String getCore() {
        return core;
    }
}
