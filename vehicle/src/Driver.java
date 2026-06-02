public class Driver extends Person {

    private String vehicleNumber;
    private String vehicleType;

    public Driver(String name,
                  int id,
                  String vehicleNumber,
                  String vehicleType) {

        super(name, id);

        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }
    public String getVehicleNumber() { return vehicleNumber; }
    public String getVehicleType()   { return vehicleType; }

    public void registerVehicle() {

        System.out.println("Vehicle Registered Successfully");
    }

    @Override
    public void displayInfo() {

        System.out.println("Driver Name : " + getName());
        System.out.println("Driver ID : " + getId());
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Vehicle Type : " + vehicleType);
    }
}