package Q4;
//a. What are the benefits of using an abstract method?
//        b. Explain with an appropriate code example.

//iN JAVA Abstraction is one the pradigmn in java in which to hiding the the complex details from the user 
//and to focus on the functionality its provide only fuctionality to the user not the functionality how its work
//
//its increase the efficiency of the code and the reduces of the complexity;

abstract  class Animal {
    abstract void bark();
    public void eat(){
        System.out.println("I eat");
    }


   
}
