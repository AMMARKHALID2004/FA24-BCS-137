public class PermitHolder extends Person {
    public int permitId;
    private static int count = 1000;

    public PermitHolder(String name) {
        super(name);
        this.permitId = count++;
    }
}