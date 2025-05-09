import java.util.Scanner;

class Student {
    // Declare the fields of the student
    private String name;
    private int age;
    private String rollNumber;
    private String course;

    // Constructor to initialize the fields
    public Student(String name, int age, String rollNumber, String course) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.course = course;
    }

    // Getter methods to access the fields
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public String getCourse() {
        return course;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for student details
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // To consume the newline character

        System.out.print("Enter student roll number: ");
        String rollNumber = scanner.nextLine();

        System.out.print("Enter student course: ");
        String course = scanner.nextLine();

        // Create a student object with the provided details
        Student student = new Student(name, age, rollNumber, course);

        // Display the student details
        student.displayStudentDetails();

        scanner.close();
    }
}

