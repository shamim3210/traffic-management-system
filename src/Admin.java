package src;

public class Admin extends Person {
    public Admin(String name, int id) {
        super(name, id);
    }

    @Override
    public void displayInfo() {
        System.out.println("Admin Name: " + getName());
        System.out.println("Admin ID: " + getId() + "\n");
    }

    public void manageTraffic() {
        System.out.println("Traffic Managing");
    }

    public void generateReport() {
        System.out.println("Report Generated");
    }
}