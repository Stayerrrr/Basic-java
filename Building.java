public class Building {
    // Attributes
    private String name;
    private String address;
    private int floors;

    // Constructor to initialize attributes
    public Building(String name, String address, int floors) {
        this.name = name;
        this.address = address;
        this.floors = floors;
    }

    // Method to display data
    public void displayData() {
        System.out.println("\n========================================");
        System.out.println("Building Name: " + this.name);
        System.out.println("Building Address: " + this.address);
        System.out.println("Number of Floors: " + this.floors);
        System.out.println("========================================");
    }
}