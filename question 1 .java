class Student {

    private int studentId;
    private String name;
    private int age;
    private String department;
    private double gpa;

    static String universityName = "just University";

    // Constructor
    public Student(int studentId, String name, int age,
                   String department, double gpa) {

        this.studentId = studentId;
        this.name = name;
        this.department = department;

        if (age >= 18) {
            this.age = age;
        } else {
            this.age = 18;
        }

        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            this.gpa = 0.0;
        }
    }

    // Display student information
    public void displayInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("GPA: " + gpa);
        System.out.println("University: " + universityName);
        System.out.println("Passed: " + hasPassed());
    }

    // Check whether student passed
    public boolean hasPassed() {
        return gpa >= 2.0;
    }
}


public class question1 {

    public static void main(String[] args) {

              201, "hothan", 18, "Computer Science", 3.5);

        Student student2 = new Student(
                202, "ahmed", 20, "Information Technology", 2.8);

        Student student3 = new Student(
                203, "abdulahi", 22, "publicadministration", 3.9);

        Student student4 = new Student(
                204, "maryama", 22, "Computer Science", 1.7);

        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        student4.displayInfo();
    }
}