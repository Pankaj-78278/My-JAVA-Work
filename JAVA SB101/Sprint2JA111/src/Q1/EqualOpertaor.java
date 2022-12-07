package Q1;

public class EqualOpertaor {
    public static void main(String[] args){
        String string1= new String("abc");
        String string2= new String("abc");
        System.out.println((string1== string2));// differnt memory location by its heap area so its check memory location as well as string;
        System.out.println(string2.equals(string1));// but its check string not memory location

        String str1="abc";
        String str2="abc";
        System.out.println(str1==str2); //same memory location by its  string pool area that why its give true;
        System.out.println(str2.equals(str2));// same string thats why its give true ;
    }
}

// please comment out whern you check this code//
//
//String is two type :-- String Literals  And New opertor;
//String literals :=== It is store in special type of memory is known as  string pool area.
//new operator :== it is belong to object so its store in heap area. thats why its store every single time
//        creating object it create a new memory in the heap area.
//
//so our QUESTION IS DIFF  BTW == AND EQUAL METHOD:=
//        (==) OPERTOR :== it check the memory location as well as continous string so in line no.7 .
//you see string is same but the memory is diffrent so that why its give false output.
//
//Equal() method :== it is only check the countinous string its not check the same memory location thats why its give the
//true answer as you in line no.8;