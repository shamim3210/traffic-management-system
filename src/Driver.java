public class Driver {

    public static void main(String[] args) {

        TrafficService ts =
                new TrafficService();

        Vehicle v1 = new Vehicle(
                "Rakib",
                1,
                "Dhaka-1111",
                "Bus"
        );

        Vehicle v2 = new Vehicle(
                "Rahim",
                2,
                "CTG-2222",
                "Truck"
        );

        Vehicle v3 = new Vehicle(
                "Karim",
                3,
                "Sylhet-3333",
                "Car"
        );

        Vehicle v4 = new Vehicle(
                "Jamal",
                4,
                "Khulna-4444",
                "Bike"
        );

        try {

            ts.addVehicle(v1);
            ts.addVehicle(v2);
            ts.addVehicle(v3);
            ts.addVehicle(v4);

            System.out.println();

            Vehicle result =
                    ts.findVehicle("CTG-2222");

            System.out.println(
                    "Vehicle Found"
            );

            result.displayInfo();

            System.out.println();

            System.out.println(
                    "All Vehicle List"
            );

            ts.showAllVehicle();
        }

        catch (InvalidDataException e) {

            System.out.println(
                    "Error : "
                            + e.getMessage()
            );
        }
    }
}