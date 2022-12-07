package Q2;

//b. Create a Main class and perform the following operation in it’s main method:
//        Get the number of students from the user and store the students in some data
//        structure.
//. Initialise all the student objects by taking details from the user, use
//        parameterized constructors (and not the setters).
//        d. Print all the Student objects (use the toString() method).
//        e. Print the average of all the Student marks.
import java.util.Scanner;
public class Main {

    private static int marks;
    private static String name;

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of Student ");
        int noOfStudent= scanner.nextInt();
        StudentJavaBean[] arr = new StudentJavaBean[noOfStudent];
        
        for(int i=0;i<noOfStudent;i++) {
            System.out.println("Enter the Student Name");
            String name = scanner.next();

            System.out.println("Enter the Student marks");
            int marks = scanner.nextInt();

            

            StudentJavaBean studentJavaBean = new StudentJavaBean(name,marks);
//            System.out.println("here is the student detail " + studentJavaBean);
            arr[i]= studentJavaBean;
//           String a=studentJavaBean.getName();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            System.out.println("Name : "+ arr[i].getName());
            System.out.println("Mark : "+ arr[i].getMarks());
            sum+=arr[i].getMarks();
        }

    int avg=sum/ arr.length;
        System.out.println("Sum of Student Marks is: "+ sum);
        System.out.println("Average of Student Marks is: "+avg);
    }

}
