package Q3;
//Final keyword in Java is a non-accessible, it is used to restrict a class, variable and method
//if we initialize with the final keyword then you cannot modify, overwrite .class
//
//if we initialize final keyword with variable is create constants variable; it just like a constant.
//if we initialize final keyword with classes so it is prevent the inheritence
//        if we initialize final keyword with methods  so it is prevent for the method overriding
//
//we can use this final keyword in special situation to restrict
public class FinalKeyword {//
            final double pie=3.14;// final variable to restrict the change
            final void final_mehod(){
                System.out.println(pie); // final method to restrict the overide
            }
}
