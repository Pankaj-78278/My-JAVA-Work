package Q1;

import java.util.Comparator;

public class Comparator_Class implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        if(p1.ProductPrice>p2.ProductPrice){
            return 1;
        }else if(p1.ProductPrice<p2.ProductPrice){
            return  -1;
        }
        return 0;
    }
}
