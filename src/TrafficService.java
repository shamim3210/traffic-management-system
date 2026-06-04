package src;
import java.util.ArrayList;

public class TrafficService {
    private ArrayList<Vehicle> vehicleList = new ArrayList<>();

    public void addVehicle(Vehicle v) throws InvalidDataException {
        validateInput(v.getVehicleNumber(), v.getVehicleType());

        for (Vehicle existing : vehicleList) {
            if (existing.getVehicleId() == v.getVehicleId()) {
                throw new InvalidDataException("Vehicle ID '" + v.getVehicleId() + "' already exists.");
            }
        }

        for (Vehicle existing : vehicleList) {
            if (existing.getVehicleNumber().equalsIgnoreCase(v.getVehicleNumber())) {
                throw new InvalidDataException("Vehicle Number '" + v.getVehicleNumber() + "' already registered.");
            }
        }

        vehicleList.add(v);
        System.out.println("Vehicle Added Successfully");
    }

    public Vehicle findVehicle(String number) throws InvalidDataException {
        if (number.equals("")) {
            throw new InvalidDataException("Vehicle Number Empty");
        }

        for (Vehicle v : vehicleList) {
            if (v.getVehicleNumber().equalsIgnoreCase(number)) {
                return v;
            }
        }

        throw new InvalidDataException("Vehicle Not Found");
    }

    public void validateInput(String number, String type) throws InvalidDataException {
        if (number.equals("") || type.equals("")) {
            throw new InvalidDataException("Input Cannot Be Empty");
        }

        if (number.length() < 5) {
            throw new InvalidDataException("Wrong Vehicle Number");
        }
    }

    public void showAllVehicle() {
        for (Vehicle v : vehicleList) {
            v.displayInfo();
            System.out.println();
        }
    }
}