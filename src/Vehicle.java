public class Vehicle {

    private String ownerName;
    private int vehicleId;
    private String vehicleNumber;
    private String vehicleType;

    // Constructor
    public Vehicle(
            String ownerName,
            int vehicleId,
            String vehicleNumber,
            String vehicleType) {

        this.ownerName = ownerName;
        this.vehicleId = vehicleId;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    // Getter Methods
    public String getOwnerName() {
        return ownerName;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    // Display Method
    public void displayInfo() {

        System.out.println(
                "Owner Name : " + ownerName
        );

        System.out.println(
                "Vehicle ID : " + vehicleId
        );

        System.out.println(
                "Vehicle Number : " + vehicleNumber
        );

        System.out.println(
                "Vehicle Type : " + vehicleType
        );
    }
}