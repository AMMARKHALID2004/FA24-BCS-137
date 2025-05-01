public class Owner extends Person {
    public String ownerId;
    private static int count = 1;

    public Owner(String name) {
        super(name);
        this.ownerId = String.format("%04d", count++);
    }
}