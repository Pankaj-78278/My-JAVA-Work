package Q2;
//What do you understand by “Java Strings are immutable”.
//        Explain the advantages and disadvantages of immutability of
//        Strings.

//java String are Immutable :==
//1>String literals :=== It is store in special type of memory is known as  string pool area.
//2> if you create one time string it cannot change that string in further. if we any modification in the  string object
//3> that method return a new object with new modified content.
//4>  advantage of String :==
// 5> there are very important data in the form of string just like password so its protection of data is very important.
//6>Security of the Data its never loose.
//7> its  easily is for class loading .
// 8> its is also used for caching .
//9>Disadvantage of String :==
//10>  its store the more space becoz of its immutable its present in the form of string .
public class StringImmutable {
    public static void main(String[] args){
        String name="vicky";
        String title= "Rai";
        String Name= name.concat(title);
        System.out.println(Name);
    }
}
