public class Hospital extends Building {
    private int numberOfBeds;

    public Hospital(String name, String address, int floors, int numberOfBeds) {
        super(name, address, floors);
        this.numberOfBeds = numberOfBeds;
    }

    @Override
    public void showBuilding() {
        super.showBuilding();
        System.out.println("Type: Hospital | Capacity: " + numberOfBeds + " beds");
    }
    
}
