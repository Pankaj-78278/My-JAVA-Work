package Q1;

//● productName: String
//● productPrice: double

public class Product {
    String ProductName;
    double ProductPrice;
    Product(String name, double price) {
        this.ProductName = name;
        this.ProductPrice = price;
    }



    @Override
    public   String toString(){
        return "{ name:"+ this.ProductName+
                " price:"+ this.ProductPrice+
                " }";

    }
}
