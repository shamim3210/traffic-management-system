public class Admin {
    private String name;
    private int id;

    public Admin(String name, int id) {
        this.name = name;
        this.id = id;
    }


    public void displayInfo() {
        System.out.println("Admin Name: " + name);
        System.out.println("Admin ID: " + id + "\n");
    }

    public void manageTraffic() {
        System.out.println("Traffic Managing");
    }

    public void generateReport() {
        System.out.println("Report Generated");
    }
}
