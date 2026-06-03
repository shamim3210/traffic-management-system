public class Main {

    public static void main(String[] args) {


        Driver d1 = new Driver(
                "Rahim",
                1051,
                "DHAKA-1634",
                "Car"
        );

        System.out.println("\n--- Driver Information ---\n");
        d1.displayInfo();
        d1.registerVehicle();

        System.out.println();

        Admin a1 = new Admin(
                "Karim",
                20156
        );

        System.out.println("\n--- Admin Information ---\n");
        a1.displayInfo();
        a1.manageTraffic();
        a1.generateReport();
    }
}
