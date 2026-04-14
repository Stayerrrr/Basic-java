import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;

        while (loop) {
            System.out.println("Welcome to Smart City Management System");
            System.out.println("1. Add New Building");
            System.out.println("2. View All Buildings");
            System.out.println("3. Exit");
            System.out.print("Please select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Building Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Building Address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter Number of Floors: ");
                    int floors = scanner.nextInt();

                    // Create the object using the input
                    Building gedung = new Building(name, address, floors);

                    System.out.println("Building added successfully!");

                    // Display details using the class method
                    gedung.tampil();
                    break;

                case 2:
                    System.out.println("Coming Soon\n");
                    break;

                case 3:
                    loop = false;
                    break;

                default:
                    System.out.println("Invalid option.\n");
            }
        }
        scanner.close();
    }
}