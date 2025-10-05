import java.util.ArrayList;
import java.util.Scanner;

public class UniversityClubManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Club> clubs = new ArrayList<>();
        int choice = 0;

        do {
            System.out.println("\n--- University Club & Organization Management ---");
            System.out.println("1. Add Club");
            System.out.println("2. View All Clubs");
            System.out.println("3. Show Total Number of Clubs");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number (1-4).");
                sc.nextLine();
                continue;
            }

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter club name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter president: ");
                    String president = sc.nextLine();
                    System.out.print("Enter number of members: ");

                    int members = 0;
                    if (sc.hasNextInt()) {
                        members = sc.nextInt();
                        sc.nextLine();
                    } else {
                        System.out.println("Invalid number of members. Setting to 0.");
                        sc.nextLine();
                    }

                    clubs.add(new Club(name, president, members));
                    System.out.println("Club added successfully!");
                    break;

                case 2:
                    if (clubs.isEmpty()) {
                        System.out.println("No clubs registered yet.");
                    } else {
                        System.out.println("\nList of Clubs:");
                        for (Club c : clubs) {
                            c.displayInfo();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Total clubs registered: " + Club.getTotalClubs());
                    break;

                case 4:
                    System.out.println("Exiting program... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
