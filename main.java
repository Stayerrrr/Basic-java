import java.util.Scanner;

public class main {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;

        while (loop) {
            // Display the menu
            System.out.println("Welcome to Smart City Management System");
            System.out.println("1. Add New Building");
            System.out.println("2. View All Buildings");
            System.out.println("3. Exit");
            System.out.print("Please select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the leftover newline character

            switch (choice) {
                case 1:
                    // Feature 1: Add New Building
                    System.out.print("Enter Building Name: ");
                    String name = scanner.nextLine();
                    
                    System.out.print("Enter Building Address: ");
                    String address = scanner.nextLine();
                    
                    System.out.print("Enter Number of Floors: ");
                    int floors = scanner.nextInt();
                    
                    // Display the details
                    System.out.println("\n========================================");
                    System.out.println("Building Name: " + name);
                    System.out.println("Building Address: " + address);
                    System.out.println("Number of Floors: " + floors);
                    System.out.println("========================================");
                    System.out.println("Building added successfully!\n");
                    break;

                case 2:
                    // Feature 2: View All Buildings (Dummy message)
                    System.out.println("Coming Soon\n");
                    break;

                case 3:
                    // Feature 3: Exit
                    System.out.println("Exited the program");
                    loop = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.\n");
            }
        }

        scanner.close();
    }
}
    
