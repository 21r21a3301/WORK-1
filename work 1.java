import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        ArrayList<Double> gradeList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student grades (type -1 to finish):");

        double grade;
        while (true) {
            System.out.print("Grade: ");
            grade = input.nextDouble();
            if (grade == -1) break;
            gradeList.add(grade);
        }

        if (gradeList.isEmpty()) {
            System.out.println("No grades were entered.");
        } else {
            double sum = 0, max = gradeList.get(0), min = gradeList.get(0);

            for (double g : gradeList) {
                sum += g;
                if (g > max) max = g;
                if (g < min) min = g;
            }

            System.out.println("Average grade: " + (sum / gradeList.size()));
            System.out.println("Highest grade: " + max);
            System.out.println("Lowest grade: " + min);
        }

        input.close();
    }
}
