package Q7;
// Concept of Static in Java :==
//1>Static belongs to the class its means you can access by the class name just like line no 6 and 9 its not need any
//2> creation of object by the calling of static method.
//3> Static before running (demoPrint) get memory at the time of class loading .
//4> it is stored same method copy just example :- Bank Name , IFSC code , BANK Address
//5>It is loaded to the RAM first .
//6> So they available for the C.P.U Execution .
//7> Static variable and Static method are called class level members.

public class StaticJava {
    static void demoPrint(){
        System.out.println("Inside the static method");
    };
    public static void main(String[] args){
        StaticJava.demoPrint();
    }
//    StaticJava.a;
}
