package Q6;
//Write a function that takes a string “s” and an integer “i” as an
//        argument. It should return the first “i” characters.
//        E.g.
//        sample input (“abcde”, 3)
//        output “abc”
//        You can assume that the value of i is less than the size of the
//        String. You should not use any loop statement.

public class FirstCharacter {
    String s;
    int i;
    void Charfunc(String s, int i){
        System.out.println(s.substring(0,i));
    }
    public static void main(String[] args){
        FirstCharacter firstCharacter=new FirstCharacter();
        firstCharacter.Charfunc("abcde",3);
    }
}
