public class Vehicle extends User {

    private String vehicleNumber;
    private String vehicleType;

    public Vehicle(String name,
                   int id,
                   String vehicleNumber,
                   String vehicleType) {

        super(name, id);

        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {

        return vehicleNumber;
    }

    public String getVehicleType() {

        return vehicleType;
    }

    public void registerVehicle() {

        System.out.println("Vehicle Added");
    }

    public void searchVehicle() {

        System.out.println("Searching Vehicle");
    }

    @Override
    void displayInfo() {

        System.out.println("Name : " + getName());
        System.out.println("ID : " + getId());
        System.out.println("Vehicle Number : "
                + vehicleNumber);
        System.out.println("Vehicle Type : "
                + vehicleType);
    }
}