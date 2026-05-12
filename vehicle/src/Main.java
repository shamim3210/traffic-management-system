import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Vehicle Owner Name:");
        String name = input.nextLine();

        System.out.println("Enter Owner ID:");
        int id = input.nextInt();
        input.nextLine();

        System.out.println("Enter Vehicle Number:");
        String vehicleNumber = input.nextLine();

        System.out.println("Enter Vehicle Type:");
        String vehicleType = input.nextLine();

        Vehicle v1 = new Vehicle(name, id, vehicleNumber, vehicleType);

        System.out.println("\n--- Vehicle Information ---");
        v1.displayInfo();

        v1.registerVehicle();
        v1.searchVehicle();

        System.out.println("\nEnter Admin Name:");
        String adminName = input.nextLine();

        System.out.println("Enter Admin ID:");
        int adminId = input.nextInt();

        Admin a1 = new Admin(adminName, adminId);

        System.out.println("\n--- Admin Information ---");
        a1.displayInfo();

        a1.manageTraffic();
        a1.generateReport();

        input.close();
    }
}