import java.util.Scanner;

public class GradeCalculator {

    // Method to calculate the average of 5 scores
    public static double calcAverage(int score1, int score2, int score3, int score4, int score5) {
        return (score1 + score2 + score3 + score4 + score5) / 5.0;
    }

    // Method to determine the letter grade for a score
    public static char determineGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[5];

        // Input 5 test scores
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter test score " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }

        // Calculate the average
        double average = calcAverage(scores[0], scores[1], scores[2], scores[3], scores[4]);

        // Display the grade for each test
        for (int i = 0; i < 5; i++) {
            char grade = determineGrade(scores[i]);
            System.out.println("Test " + (i + 1) + ": " + grade);
        }

        // Display the average score and letter grade
        System.out.printf("Average score: %.2f\n", average);
        System.out.println("Average letter grade: " + determineGrade((int) average));
    }
}