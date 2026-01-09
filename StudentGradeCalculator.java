import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        // ---------- SAFE INPUT FOR NUMBER OF SUBJECTS ----------
        System.out.print("Enter number of subjects: ");
        while (!sc.hasNextInt()) {
            System.out.println("Please enter a number!");
            sc.next(); // clear wrong input
            System.out.print("Enter number of subjects: ");
        }
        n = sc.nextInt();

        int[] marks = new int[n];
        int total = 0;

        System.out.println("\nEnter marks for each subject (out of 100):");

        // ---------- SAFE INPUT FOR EACH SUBJECT ----------
        for (int i = 0; i < n; i++) {
            System.out.print("Subject " + (i + 1) + ": ");

            while (!sc.hasNextInt()) {
                System.out.println("Please enter a number!");
                sc.next();  // clear wrong input
                System.out.print("Subject " + (i + 1) + ": ");
            }

            marks[i] = sc.nextInt();
            total += marks[i];
        }

