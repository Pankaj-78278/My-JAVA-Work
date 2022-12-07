package Q5;
//What is the difference between final and finally. Write the code for
//        the same?
//Final>-1 Final It is the keyword
//2>- It is the access modifier which is used to apply restriction on a class method or variable

//Finally
//1>- it is the block in the java Exception Handling to execute the proper code whether the exception occur or not.
//2>- it alway related to the try and Catch block in Exception handling.

//public class Final_Finally {
//    final int num=100;
//    void number(){
//        num=121; ///its gives the compile time error;
//    }
//    public static void main(String[] args ){
//        Final_Finally final_finally=new Final_Finally();
//        final_finally.number();
//    }
//}

import java.net.StandardSocketOptions;

class Finally{
    public static void main(String[] args ){
        try{
           int age= 25/0;// it give the exception arithmetic Exception.
            System.out.println(age);
        }catch(ArithmeticException e){
            System.out.println("Exception handled");
            System.out.println(e);
        }
    }
}
