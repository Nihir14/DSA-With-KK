public class Student {
    // Primitive Data Types
    byte age;             // Age in years (small range)
    short year;           // Academic year
    int rollNumber;       // Roll number
    long contactNumber;   // Contact number (long value)
    float percentage;     // Percentage with decimal values
    double gpa;           // GPA with higher precision
    char grade;           // Grade (A, B, C, etc.)
    boolean isPassed;     // Whether student passed or not

    // Non-Primitive Data Types
    String name;          // Name of the student
//    int[] marks;          // Array to store subject marks

    // Constructor
//    public Student(byte age, short year, int rollNumber, long contactNumber,
//                   float percentage, double gpa, char grade, boolean isPassed,
//                   String name, int[] marks) {
//        this.age = age;
//        this.year = year;
//        this.rollNumber = rollNumber;
//        this.contactNumber = contactNumber;
//        this.percentage = percentage;
//        this.gpa = gpa;
//        this.grade = grade;
//        this.isPassed = isPassed;
//        this.name = name;
//        this.marks = marks;
//    }

    // Method to display student details
    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Year: " + year);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Percentage: " + percentage);
        System.out.println("GPA: " + gpa);
        System.out.println("Grade: " + grade);
        System.out.println("Passed: " + isPassed);
//        System.out.print("Marks: ");
//        for (int mark : marks) {
//            System.out.print(mark + " ");
//        }
        System.out.println();
    }
}
