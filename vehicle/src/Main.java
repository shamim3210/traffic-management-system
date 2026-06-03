public class Main {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle(
                "Rahim",
                1051,
                "DHAKA-1634",
                "Car"
        );

        System.out.println("--- Vehicle Information ---");
        v1.displayInfo();
        v1.registerVehicle();
        v1.searchVehicle();

        System.out.println();

        Admin a1 = new Admin(
                "Karim",
                20156
        );

        System.out.println("--- Admin Information ---");
        a1.displayInfo();
        a1.manageTraffic();
        a1.generateReport();
    }
}