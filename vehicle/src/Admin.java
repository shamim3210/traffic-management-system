public class Admin extends User {

    public Admin(String name, int id) {

        super(name, id);
    }

    public void manageTraffic() {

        System.out.println("Traffic Managing");
    }

    public void generateReport() {

        System.out.println("Report  is Generated");
    }

    @Override
    void displayInfo() {

        System.out.println(
                "Admin Name : " + getName()
        );

        System.out.println(
                "Admin ID : " + getId()
        );
    }
}
