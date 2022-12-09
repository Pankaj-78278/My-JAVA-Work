package Java_Bean1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("The number of students he wants to add.");
        int addStudent = scanner.nextInt();


        for(int i=0; i<addStudent;i++){
            System.out.println("Enter your RollNumber");
            int roll_Number = scanner.nextInt();
            System.out.println("Enter your StudentName");
            String studentName = scanner.next();
            System.out.println("Enter your marks here");
            int marks_ = scanner.nextInt();

//            int rollNumber = 0;
//            int marks=0;
            Student student = new Student( roll_Number,studentName ,marks_);
            System.out.println("Enter the Roll Number "+student.getRollNumber());
            System.out.println("Enter the Name :"+student.getStudentName());
            System.out.println("Enter the marks : "+student.getMarks());

            System.out.println("===========================");

        }
    }
}
