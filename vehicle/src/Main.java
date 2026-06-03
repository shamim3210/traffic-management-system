public class Main {

    public static void main(String[] args) {

        Driver d1 = new Driver(
                "Rakib",
                1061,
                "DHAKA- 161319",
                " Car (BYD)"
        );

        TrafficOfficer t1 = new TrafficOfficer(
                "Arif  Hossan",
                2010
        );

        System.out.println("----- Driver Information -----");
        d1.displayInfo();

        d1.registerVehicle();

        System.out.println();

        System.out.println("----- Traffic Officer Information -----");
        t1.displayInfo();

        t1.manageTraffic();
    }
}