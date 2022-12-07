package Q4;

// Write a function that asks the user to input his/her name and age
//         (use Scanner class) and prints the same on the console.

import  java.util.Scanner;
public class UseScanner{
    public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter your Name");
    String name= scanner.next();
    System.out.println("Enter Your Age");
    int age = scanner.nextInt();

    System.out.println("Welcome " +name + " and Your age is "+age);
    }
}
