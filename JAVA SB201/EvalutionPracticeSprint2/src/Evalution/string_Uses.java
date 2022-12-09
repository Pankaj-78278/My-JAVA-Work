package Evalution;

public class string_Uses {
    public static void main (String[] args){
        System.out.println("String is joining of character");
        String s1 = new String("abc");

        String s2 = new String("abc");
        System.out.println(s1.equals(s2));

        StringBuilder sb1 = new StringBuilder("abc");
        StringBuilder sb2 = new StringBuilder("abc");
        System.out.println(sb1.equals(sb2));

        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println(s3==s4);


    }
}
