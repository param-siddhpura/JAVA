import java.util.Scanner;

/**
 * Student class demonstrating OOP principles:
 * - Encapsulation (private fields + getters/setters)
 * - Constructors (default + parameterized)
 * - Instance methods (inputDetails, displayDetails, updateDetails)
 */
public class Student {

    // ─── Private Instance Variables (Encapsulation) ───────────────────────────
    private String name;
    private String dateOfBirth;
    private String gender;
    private String department;
    private int year;
    private int semester;
    private String enrollmentNumber;

    // ─── Default Constructor ───────────────────────────────────────────────────
    public Student() {
        this.name           = "";
        this.dateOfBirth    = "";
        this.gender         = "";
        this.department     = "";
        this.year           = 0;
        this.semester       = 0;
        this.enrollmentNumber = "";
    }

    // ─── Parameterized Constructor ─────────────────────────────────────────────
    public Student(String name, String dateOfBirth, String gender,
                   String department, int year, int semester,
                   String enrollmentNumber) {
        this.name             = name;
        this.dateOfBirth      = dateOfBirth;
        this.gender           = gender;
        this.department       = department;
        this.year             = year;
        this.semester         = semester;
        this.enrollmentNumber = enrollmentNumber;
    }

    // ─── Getters ───────────────────────────────────────────────────────────────
    public String getName()             { return name; }
    public String getDateOfBirth()      { return dateOfBirth; }
    public String getGender()           { return gender; }
    public String getDepartment()       { return department; }
    public int    getYear()             { return year; }
    public int    getSemester()         { return semester; }
    public String getEnrollmentNumber() { return enrollmentNumber; }

    // ─── Setters ───────────────────────────────────────────────────────────────
    public void setName(String name)                       { this.name = name; }
    public void setDateOfBirth(String dateOfBirth)         { this.dateOfBirth = dateOfBirth; }
    public void setGender(String gender)                   { this.gender = gender; }
    public void setDepartment(String department)           { this.department = department; }
    public void setYear(int year)                          { this.year = year; }
    public void setSemester(int semester)                  { this.semester = semester; }
    public void setEnrollmentNumber(String enrollmentNumber) { this.enrollmentNumber = enrollmentNumber; }

    // ─── Instance Method: inputDetails() ──────────────────────────────────────
    /**
     * Prompts the user to enter all student details via Scanner.
     * Demonstrates instance method design — the object populates itself.
     *
     * @param scanner shared Scanner instance from the calling class
     */
    public void inputDetails(Scanner scanner) {
        System.out.println("\n  ┌─────────────────────────────────────┐");
        System.out.println("  │         Enter Student Details       │");
        System.out.println("  └─────────────────────────────────────┘");

        System.out.print("  Name              : ");
        this.name = scanner.nextLine().trim();

        System.out.print("  Date of Birth (DD/MM/YYYY) : ");
        this.dateOfBirth = scanner.nextLine().trim();

        System.out.print("  Gender (M/F/Other): ");
        this.gender = scanner.nextLine().trim();

        System.out.print("  Department        : ");
        this.department = scanner.nextLine().trim();

        System.out.print("  Year (1–4)        : ");
        this.year = parseIntSafely(scanner.nextLine().trim(), 1);

        System.out.print("  Semester (1–8)    : ");
        this.semester = parseIntSafely(scanner.nextLine().trim(), 1);

        System.out.print("  Enrollment Number : ");
        this.enrollmentNumber = scanner.nextLine().trim();

        System.out.println("\n  ✔  Student record created successfully!");
    }

    // ─── Instance Method: displayDetails() ────────────────────────────────────
    /**
     * Prints a formatted summary of the student's details to the console.
     */
    public void displayDetails() {
        System.out.println("  ┌──────────────────────────────────────────────┐");
        System.out.printf("  │  %-44s│%n", "STUDENT RECORD");
        System.out.println("  ├──────────────────────────────────────────────┤");
        System.out.printf("  │  %-20s : %-22s│%n", "Enrollment No",   enrollmentNumber);
        System.out.printf("  │  %-20s : %-22s│%n", "Name",            name);
        System.out.printf("  │  %-20s : %-22s│%n", "Date of Birth",   dateOfBirth);
        System.out.printf("  │  %-20s : %-22s│%n", "Gender",          gender);
        System.out.printf("  │  %-20s : %-22s│%n", "Department",      department);
        System.out.printf("  │  %-20s : %-22s│%n", "Year",            year);
        System.out.printf("  │  %-20s : %-22s│%n", "Semester",        semester);
        System.out.println("  └──────────────────────────────────────────────┘");
    }

    // ─── Instance Method: updateDetails() ─────────────────────────────────────
    /**
     * Allows the user to selectively update individual fields.
     * Pressing Enter without input keeps the existing value.
     *
     * @param scanner shared Scanner instance from the calling class
     */
    public void updateDetails(Scanner scanner) {
        System.out.println("\n┌─────────────────────────────────────────────────────┐");
        System.out.println("│   Update Student Details (press Enter to keep value)│");
        System.out.println("└─────────────────────────────────────────────────────┘");

        System.out.printf("  Name [%s]: ", name);
        String input = scanner.nextLine().trim();
        if (!input.isEmpty()) this.name = input;

        System.out.printf("  Date of Birth [%s]: ", dateOfBirth);
        input = scanner.nextLine().trim();
        if (!input.isEmpty()) this.dateOfBirth = input;

        System.out.printf("  Gender [%s]: ", gender);
        input = scanner.nextLine().trim();
        if (!input.isEmpty()) this.gender = input;

        System.out.printf("  Department [%s]: ", department);
        input = scanner.nextLine().trim();
        if (!input.isEmpty()) this.department = input;

        System.out.printf("  Year [%d]: ", year);
        input = scanner.nextLine().trim();
        if (!input.isEmpty()) this.year = parseIntSafely(input, this.year);

        System.out.printf("  Semester [%d]: ", semester);
        input = scanner.nextLine().trim();
        if (!input.isEmpty()) this.semester = parseIntSafely(input, this.semester);

        System.out.println("\n  ✔  Student record updated successfully!");
    }

    // ─── Private Helper ────────────────────────────────────────────────────────
    /**
     * Safely parses an integer string; returns defaultValue on failure.
     */
    private int parseIntSafely(String text, int defaultValue) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("  ⚠  Invalid number — keeping previous value.");
            return defaultValue;
        }
    }
}
