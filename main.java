import java.util.Scanner;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Building> buildingList = new ArrayList<>();
        int option;

        do {
            System.out.println("Welcome to Smart City Management System");
            System.out.println("1. Add New Building");
            System.out.println("2. Add New Hospital");
            System.out.println("3. Add New Cinema");
            System.out.println("4. View All Buildings");
            System.out.println("5. Exit");
            System.out.print("Please select an option: ");
            
            option = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            switch (option) {
                case 1:
                    System.out.print("Enter Building Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Building Address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter Number of Floors: ");
                    int numberOfFloors = scanner.nextInt();

                    // Adding a regular building
                    buildingList.add(new Building(name, address, numberOfFloors));
                    System.out.println("Building added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Hospital Name: ");
                    String hospitalName = scanner.nextLine();
                    System.out.print("Enter Hospital Address: ");
                    String hospitalAddress = scanner.nextLine();
                    System.out.print("Enter Number of Floors: ");
                    int hospitalFloors = scanner.nextInt();
                    System.out.print("Enter Number of Beds: ");
                    int beds = scanner.nextInt();

                    buildingList.add(new Hospital(hospitalName, hospitalAddress, hospitalFloors, beds));
                    System.out.println("Hospital added successfully!");
                    break;

                case 3:
                    System.out.print("Enter Cinema Name: ");
                    String cinemaName = scanner.nextLine();
                    System.out.print("Enter Cinema Address: ");
                    String cinemaAddress = scanner.nextLine();
                    System.out.print("Enter Number of Floors: ");
                    int cinemaFloors = scanner.nextInt();
                    System.out.print("Enter Revenue: ");
                    int Revenue = scanner.nextInt();

                    buildingList.add(new Cinema(cinemaName, cinemaAddress, cinemaFloors, Revenue));
                    System.out.println("Cinema added successfully!");
                    break;

                case 4:
                    System.out.println("\n--- City Infrastructure List ---");
                    if (buildingList.isEmpty()) {
                        System.out.println("No data available.");
                    } else {
                        for (Building tio : buildingList) {
                            tio.showBuilding();
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option!");
            }
        } while (option != 5);

        scanner.close();
    }
}