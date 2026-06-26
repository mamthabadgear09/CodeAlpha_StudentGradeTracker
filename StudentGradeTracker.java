import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    static class Student {

        String name;
        int marks;

        Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students =
                new ArrayList<>();

        System.out.print(
                "Enter Number of Students: "
        );

        int n = sc.nextInt();
        sc.nextLine();

        int total = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            System.out.println(
                    "\nStudent " + (i + 1)
            );

            System.out.print(
                    "Enter Name: "
            );

            String name =
                    sc.nextLine();

            System.out.print(
                    "Enter Marks: "
            );

            int marks =
                    sc.nextInt();

            sc.nextLine();

            students.add(
                    new Student(
                            name,
                            marks
                    )
            );

            total += marks;

            if (marks > highest)
                highest = marks;

            if (marks < lowest)
                lowest = marks;
        }

        double avg =
                (double) total / n;

        System.out.println(
                "\n===== REPORT ====="
        );

        for (Student s : students) {

            System.out.println(
                    s.name +
                            " -> " +
                            s.marks
            );

        }

        System.out.println(
                "\nAverage: " + avg
        );

        System.out.println(
                "Highest: " + highest
        );

        System.out.println(
                "Lowest: " + lowest
        );

        sc.close();

    }
}