import java.util.Scanner;

public class DistanceConverter {

    // Method to convert meters to kilometers
    public static void showKilometers(double meters) {
        System.out.printf("%.2f meters is %.2f kilometers.\n", meters, meters * 0.001);
    }

    // Method to convert meters to inches
    public static void showInches(double meters) {
        System.out.printf("%.2f meters is %.2f inches.\n", meters, meters * 39.37);
    }

    // Method to convert meters to feet
    public static void showFeet(double meters) {
        System.out.printf("%.2f meters is %.2f feet.\n", meters, meters * 3.281);
    }

    // Method to display the menu
    public static void menu() {
        System.out.println("1. Convert to kilometers");
        System.out.println("2. Convert to inches");
        System.out.println("3. Convert to feet");
        System.out.println("4. Quit the program");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a distance in meters: ");
        double meters = scanner.nextDouble();

        int choice;
        do {
            menu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showKilometers(meters);
                    break;
                case 2:
                    showInches(meters);
                    break;
                case 3:
                    showFeet(meters);
                    break;
                case 4:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1-4.");
            }
        } while (choice != 4);
    }
}