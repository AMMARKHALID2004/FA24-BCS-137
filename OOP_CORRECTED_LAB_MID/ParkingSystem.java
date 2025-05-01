public class ParkingSystem {
    private static ParkingSystem instance;
    public String campusName;
    public Supervisor supervisor;

    private ParkingZone[] zones = new ParkingZone[2];
    private int zoneCount = 0;

    private PermitHolder[] permits = new PermitHolder[10];
    private int permitCount = 0;

    private String[] usedPlates = new String[20];
    private int plateCount = 0;

    private ParkingSystem(String name, Supervisor sup) {
        this.campusName = name;
        this.supervisor = sup;
    }

    public static ParkingSystem getInstance(String name, Supervisor sup) {
        if (instance == null) {
            instance = new ParkingSystem(name, sup);
        } else {
            System.out.println("Warning: ParkingSystem instance already exists. Returning existing instance.");
        }
        return instance;
    }

    public void addZone(ParkingZone z) {
        if (zoneCount < zones.length) {
            zones[zoneCount++] = z;
        }
    }

    public void addVehicle(ParkingZone z, Vehicle v) {
        for (int i = 0; i < plateCount; i++) {
            if (usedPlates[i].equals(v.licensePlate)) {
                System.out.println("Error: Duplicate license plate '" + v.licensePlate + "' is not allowed.");
                return;
            }
        }
        z.addVehicle(v);
        usedPlates[plateCount++] = v.licensePlate;
    }

    public void addPermitHolder(PermitHolder p) {
        if (permitCount < permits.length) {
            permits[permitCount++] = p;
        }
    }

    public String toString() {
        String s = "Campus: " + campusName + "\n";
        s += "Supervisor: Name: " + supervisor.name + ", Experience: " + supervisor.experience + " years\n";
        s += "Zones: [";
        for (int i = 0; i < zoneCount; i++) {
            s += zones[i].toString() + "\n";
        }
        s += "]\nPermit Holders: ";
        for (int i = 0; i < permitCount; i++) {
            PermitHolder p = permits[i];
            s += "[Name: " + p.name + ", Permit ID: " + p.permitId + "], ";
        }
        return s;
    }
}