package Q5;
//What is the difference between throw and throws. Write the code
//        for the same.
//Throw>- it is the keyword is used throw an exception explicit in the code,
//Throws>- it is the keyword is used in the method signature to declare an exception.

public class throw_throws {
    static void number(int age){
        if (age<18){
            throw new ArithmeticException("It is not valid for the vote");
        }
        else{
            System.out.println("it is valid for the vote");
        }
    }
    public static void main(String[] args){
       number(17);
    }
}
////////throws Example ////
//class throws{
//    static int Num(int m, int n)throws Arithmetic Exception {
//        int div =m/n;
//        return div;
//    }
//    public static void main (String[] args) {
//    try{
//        System.out.println(Num());
//    }catch(Arithmetic Exception e){
//        System.out.println("Num is not valid ");
//        }
//        }
//}
