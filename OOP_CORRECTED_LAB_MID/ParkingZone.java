public class ParkingZone {
    public String zoneId;
    private static int count = 1;
    private Vehicle[] vehicles = new Vehicle[10];
    private int vehicleCount = 0;

    public ParkingZone() {
        this.zoneId = "Z" + count++;
    }

    public void addVehicle(Vehicle v) {
        if (vehicleCount < vehicles.length) {
            vehicles[vehicleCount++] = v;
        }
    }

    public String toString() {
        String s = "Zone ID: " + zoneId + ", Vehicles: [";
        for (int i = 0; i < vehicleCount; i++) {
            Vehicle v = vehicles[i];
            s += "License Plate: " + v.licensePlate + ", Type: " + v.type +
                    ", Owner: [Name: " + v.owner.name + ", Owner ID: " + v.owner.ownerId + "], ";
        }
        s += "]";
        return s;
    }
}