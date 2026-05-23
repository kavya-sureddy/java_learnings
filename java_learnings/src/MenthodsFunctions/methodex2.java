
package MenthodsFunctions;
import java.util.Scanner;

//2d array example

public class methodex2 {

    public static String getGrade(double score) {
        if (score >= 90) return "A";
        else if (score >= 80) return "B";
        else if (score >= 70) return "C";
        else if (score >= 60) return "D";
        else return "F";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int students = 3;
        int subjects = 5;
        String[] studentNames = {"kavya", "Neeru", "Sunny"};
        String[] subjectNames = {"Python", "Java", "C++", "JavaScript", "Typescript"};

        double[][] marks = new double[students][subjects];

        // --- Input ---
        for (int i = 0; i < students; i++) {
            System.out.println("\nEnter marks for " + studentNames[i] + ":");
            for (int j = 0; j < subjects; j++) {
                System.out.print("  " + subjectNames[j] + " (0-100): ");
                marks[i][j] = sc.nextDouble();
            }
        }

        // --- Header ---
        System.out.println("\n========== GRADE REPORT ==========");
        System.out.print("          ");
        for (int j = 0; j < subjects; j++) {
            System.out.print(subjectNames[j] + "         ");
        }
        System.out.println("Overall%       Grade");
        System.out.println("-------------------------------------------------------------------");

        // --- Results ---
        for (int i = 0; i < students; i++) {
            double total = 0;

            System.out.print(studentNames[i] + "    ");

            for (int j = 0; j < subjects; j++) {
                double score = marks[i][j];
                total += score;
                String grade = getGrade(score);
                System.out.print(score + "(" + grade + ")    ");
            }

            double percentage = total / subjects;
            String overallGrade = getGrade(percentage);
            System.out.println(percentage + "          " + overallGrade);
        }

        System.out.println("-------------------------------------------------------------------");
        sc.close();
    }
}