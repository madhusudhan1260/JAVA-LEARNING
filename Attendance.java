// Amazon records employees' weekly attendance to monitor
//  workforce productivity and determine incentive eligibility. 
// Develop a Java program to:

// Store the Employee ID and Employee Name.
// Record attendance for seven working days.
// Calculate the attendance percentage.
// Count the number of absent days.
// Determine incentive eligibility based on attendance.
// Display the attendance report.
// Constraints
// Employee ID: int
// Employee Name: String
// Attendance: int[] of size 7
// Attendance values must be:
// 0 = Absent
// 1 = Present
// Attendance Percentage: double
// If attendance percentage ≥ 90%, the employee is eligible for incentive.



import java.util.Scanner;

public class Attendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Employee details
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        // Attendance for 7 days
        int[] attendance = new int[7];
        int present = 0;
        int absent = 0;

        System.out.println("Enter attendance for 7 days (1 = Present, 0 = Absent):");

        for (int i = 0; i < 7; i++) {
            attendance[i] = sc.nextInt();

            if (attendance[i] == 1) {
                present++;
            } else {
                absent++;
            }
        }

        // Calculate percentage
        double percentage = (present / 7.0) * 100;

        // Incentive eligibility
        boolean eligible = percentage >= 90;

        // Display report
        System.out.println("\n--- Attendance Report ---");
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Present Days: " + present);
        System.out.println("Absent Days: " + absent);
        System.out.println("Attendance Percentage: " + percentage + "%");

        if (eligible) {
            System.out.println("Incentive Eligibility: Eligible");
        } else {
            System.out.println("Incentive Eligibility: Not Eligible");
        }

        sc.close();
    }
}