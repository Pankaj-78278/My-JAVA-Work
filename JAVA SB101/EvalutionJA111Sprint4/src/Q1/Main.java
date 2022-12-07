package Q1;
import java.util.*;
public class Main {
    public static void main(String[] args){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter any four products you want to store");

                List<Product>products=new ArrayList<>();
                for(int i=0;i<4;i++){
                    System.out.println("Enter the name of the product");
                    String name = scanner.next();

                    System.out.println("Enter the price of the product");
                    double price = scanner.nextDouble();

                    products.add(new Product(name,price));
                }

                Collections.sort(products,new Comparator_Class());
                for(int i=0;i<4;i++){
                    System.out.println(products.get(i));
                }
    }
}



