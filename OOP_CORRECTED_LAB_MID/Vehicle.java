public class Vehicle {
    public String licensePlate;
    public String type;
    public Owner owner;

    public Vehicle(String licensePlate, String type, Owner owner) {
        this.licensePlate = licensePlate;
        this.type = type;
        this.owner = owner;
    }

    public Vehicle shallowCopy() {
        return this;
    }

    public Vehicle deepCopy() {
        Owner newOwner = new Owner(owner.name);
        return new Vehicle(licensePlate, type, newOwner);
    }
}