package src;

public class Owner extends Person {
    private String vehicleNumber;
    private String vehicleType;

    public Owner(String name, int id, String vehicleNumber, String vehicleType) {
        super(name, id);
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getVehicleType()   { return vehicleType; }

    public void registerVehicle() {
        System.out.println("Vehicle Registered Successfully\n");
    }

    @Override
    public void displayInfo() {
        System.out.println("Owner Name: " + getName());
        System.out.println("Owner ID: " + getId());
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType + "\n");
    }
}