import java.util.ArrayList;
import java.util.Scanner;

/**
 * StudentApp — Main driver class for the Student Management System.
 *
 * Demonstrates:
 *  - ArrayList for storing multiple Student objects
 *  - Menu-driven console interaction via Scanner
 *  - Delegation to Student instance methods (OOP modularity)
 *  - Search by enrollment number
 */
public class StudentApp {

    // ─── Shared Resources ──────────────────────────────────────────────────────
    private static final ArrayList<Student> studentList = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    // ─── Entry Point ───────────────────────────────────────────────────────────
    public static void main(String[] args) {
        printBanner();

        boolean running = true;
        while (running) {
            printMenu();
            int choice = readMenuChoice();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewAllStudents();
                case 3 -> updateStudent();
                case 4 -> {
                    running = false;
                    printGoodbye();
                }
                default -> System.out.println("\n  ⚠  Invalid option. Please enter 1–4.\n");
            }
        }

        scanner.close();
    }

    // ─── Menu: Add Student ─────────────────────────────────────────────────────
    /**
     * Creates a new Student object and calls inputDetails() on it,
     * then appends it to the shared ArrayList.
     */
    private static void addStudent() {
        Student newStudent = new Student();      // default constructor
        newStudent.inputDetails(scanner);        // instance method populates fields
        studentList.add(newStudent);             // store in collection
    }

    // ─── Menu: View All Students ───────────────────────────────────────────────
    /**
     * Iterates over the ArrayList and calls displayDetails() on each Student.
     */
    private static void viewAllStudents() {
        System.out.println();
        if (studentList.isEmpty()) {
            System.out.println("  ℹ  No student records found. Add a student first.\n");
            return;
        }

        System.out.println("  ═══════════════════════════════════════════════════");
        System.out.printf("  ALL STUDENTS  (%d record%s)%n",
                studentList.size(), studentList.size() == 1 ? "" : "s");
        System.out.println("  ═══════════════════════════════════════════════════\n");

        for (int i = 0; i < studentList.size(); i++) {
            System.out.printf("  [ Record %d of %d ]%n", i + 1, studentList.size());
            studentList.get(i).displayDetails();   // instance method on each object
            System.out.println();
        }
    }

    // ─── Menu: Update Student ──────────────────────────────────────────────────
    /**
     * Searches the ArrayList by enrollment number (linear search),
     * then delegates update logic to the Student's updateDetails() method.
     */
    private static void updateStudent() {
        if (studentList.isEmpty()) {
            System.out.println("\n  ℹ  No records to update. Add a student first.\n");
            return;
        }

        System.out.print("\n  Enter Enrollment Number to search: ");
        String enrollmentNo = scanner.nextLine().trim();

        Student found = findByEnrollment(enrollmentNo);

        if (found == null) {
            System.out.println("\n  ✘  No student found with enrollment number: " + enrollmentNo + "\n");
        } else {
            System.out.println("\n  ✔  Student found:");
            found.displayDetails();
            found.updateDetails(scanner);           // delegate to instance method
            System.out.println("\n  Updated record:");
            found.displayDetails();
        }
    }

    // ─── Helper: Linear Search by Enrollment Number ───────────────────────────
    /**
     * Returns the first Student whose enrollment number matches,
     * or null if not found.
     *
     * @param enrollmentNo the target enrollment number
     * @return matching Student object, or null
     */
    private static Student findByEnrollment(String enrollmentNo) {
        for (Student s : studentList) {
            if (s.getEnrollmentNumber().equalsIgnoreCase(enrollmentNo)) {
                return s;
            }
        }
        return null;
    }

    // ─── Helper: Read Menu Choice ──────────────────────────────────────────────
    private static int readMenuChoice() {
        System.out.print("  Your choice: ");
        try {
            int choice = Integer.parseInt(scanner.nextLine().trim());
            return choice;
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    // ─── UI Helpers ────────────────────────────────────────────────────────────
    private static void printBanner() {
        System.out.println();
        System.out.println("  ╔══════════════════════════════════════════════════╗");
        System.out.println("  ║        STUDENT MANAGEMENT SYSTEM  v1.0          ║");
        System.out.println("  ║          Built with OOP in Java                 ║");
        System.out.println("  ╚══════════════════════════════════════════════════╝");
        System.out.println();
    }

    private static void printMenu() {
        System.out.println("  ┌──────────────────────────────────┐");
        System.out.println("  │           MAIN MENU              │");
        System.out.println("  ├──────────────────────────────────┤");
        System.out.println("  │  1. Add Student                  │");
        System.out.println("  │  2. View All Students            │");
        System.out.println("  │  3. Update Student Details       │");
        System.out.println("  │  4. Exit                         │");
        System.out.println("  └──────────────────────────────────┘");
    }

    private static void printGoodbye() {
        System.out.println();
        System.out.println("  ╔══════════════════════════════════════╗");
        System.out.println("  ║   Thank you for using SMS v1.0  👋  ║");
        System.out.println("  ╚══════════════════════════════════════╝");
        System.out.println();
    }
}
