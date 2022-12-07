package Q3;
//Has a RelationShip
//1> Classes collaboration with each other but all the classes  should be in the same path .
//2> A class as an instance member inside another class that it make a "Has a relationship" between two object.
public class HasRelation {
    String name;
    int age;
    Address address;

    public static void main(String[] args){
//        HasRelation hasRelation = new HasRelation();

        HasRelation hasRelation1=new HasRelation();
        hasRelation1.name="Pankaj";
        hasRelation1.age=25;

        hasRelation1.address= new Address();//object

        hasRelation1.address.city="Faridabad";
        hasRelation1.address.state="Haryana";
        hasRelation1.address.pinCode=121002;
        hasRelation1.address.Aclass();

        System.out.println( hasRelation1.name);
        System.out.println(  hasRelation1.age);
        System.out.println( hasRelation1.address.city);
        System.out.println( hasRelation1.address.state);
        System.out.println( hasRelation1.address.pinCode);

    }

}
