public class FahrenheitCelsiusTable {

    // Method to convert Fahrenheit to Celsius
    public static double celsius(int fahrenheit) {
        // Formula: C = 5 / 9 * (F - 32)
        return 5.0 / 9.0 * (fahrenheit - 32);
    }

    public static void main(String[] args) {
        // Print the table header
        System.out.println("Fahrenheit\tCelsius");
        System.out.println("======================");

        // Loop through Fahrenheit temperatures from 0 to 20
        for (int fahrenheit = 0; fahrenheit <= 20; fahrenheit++) {
            // Call the celsius method to get the Celsius equivalent
            double celsiusValue = celsius(fahrenheit);

            // Print the Fahrenheit and corresponding Celsius value
            System.out.printf("%d\t\t%.2f\n", fahrenheit, celsiusValue);
        }
    }
}