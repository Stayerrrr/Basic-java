public class Building {
  
    private String name;
    private String address;
    private int floors;

    public Building(String name, String address, int floors) {
        this.name = name;
        this.address = address;
        this.floors = floors;
    }

    public void showBuilding() {
        System.out.println("Building: " + name + " | Address: " + address + " | Floors: " + floors);
    }
}