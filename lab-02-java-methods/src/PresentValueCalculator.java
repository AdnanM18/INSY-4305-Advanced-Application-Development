import java.util.Scanner;

public class PresentValueCalculator {

    // Method to calculate present value
    public static double presentValue(double futureValue, double annualInterestRate, int years) {
        return futureValue / Math.pow(1 + annualInterestRate, years);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the desired future value? ");
        double futureValue = scanner.nextDouble();

        System.out.print("What is the annual interest rate (as a decimal)? ");
        double interestRate = scanner.nextDouble();

        System.out.print("For how many years? ");
        int years = scanner.nextInt();

        // Calculate present value
        double presentValue = presentValue(futureValue, interestRate, years);
        System.out.printf("You need to invest $%.2f today.\n", presentValue);
    }
}