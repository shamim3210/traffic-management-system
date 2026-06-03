public class TrafficOfficer extends Person
{

    public TrafficOfficer(String name, int id) {

        super(name, id);
    }

    public void manageTraffic() {

        System.out.println("Traffic is being managed");
    }

    @Override
    public void displayInfo() {

        System.out.println("Officer Name : " + getName());
        System.out.println("Officer ID : " + getId());
    }
}