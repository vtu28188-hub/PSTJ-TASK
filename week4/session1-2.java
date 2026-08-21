import java.util.*;

public class ConstraintDrivenSolution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] marks = new int[n];
        int[] attendance = new int[n];

        System.out.println("\nEnter student details:");

        for (int i = 0; i < n; i++) {
            System.out.print("\nStudent " + (i + 1) + " name: ");
            names[i] = sc.next();

            System.out.print("Marks (0-100): ");
            marks[i] = sc.nextInt();

            System.out.print("Attendance (0-100): ");
            attendance[i] = sc.nextInt();

            // Constraint validation
            if (marks[i] < 0 || marks[i] > 100 ||
                attendance[i] < 0 || attendance[i] > 100) {

                System.out.println("Invalid input! Values must be between 0 and 100.");
                i--;
            }
        }

        System.out.println("\n===== ELIGIBILITY RESULTS =====");

        int eligible = 0;

        for (int i = 0; i < n; i++) {

            // Constraints:
            // 1. Marks >= 50
            // 2. Attendance >= 75
            // 3. Both conditions must be satisfied

            if (marks[i] >= 50 && attendance[i] >= 75) {
                System.out.println(names[i] + " -> Eligible");
                eligible++;
            } else {
                System.out.println(names[i] + " -> Not Eligible");
            }
        }

        System.out.println("\nTotal Students: " + n);
        System.out.println("Eligible Students: " + eligible);
        System.out.println("Not Eligible Students: " + (n - eligible));

        sc.close();
    }
}




Enter number of students: 3

Enter student details:

Student 1 name: Mary
Marks (0-100): 85
Attendance (0-100): 80

Student 2 name: Deepu
Marks (0-100): 100
Attendance (0-100): 70

Student 3 name: Manju
Marks (0-100): 45
Attendance (0-100): 50

===== ELIGIBILITY RESULTS =====
Mary -> Eligible
Deepu -> Not Eligible
Manju -> Not Eligible

Total Students: 3
Eligible Students: 1
Not Eligible Students: 2
