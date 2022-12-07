package Q5;
//Object Downcasting :--there is two type of typecasting
//Upcasting in Parent to child ;
//Downcasting in Child to parent
public class Downcast { //this is the parent class
    public void  Object(){
        System.out.println("Im m Object and i m parent ");
    }

    public static void main(java.lang.String[] args){
        Downcast downcast=new String();
        String p1= (String) downcast; //downcasting
        p1.sing ();//Parrot is sing
        p1.Object();//Im, child of oBject


    }
}
