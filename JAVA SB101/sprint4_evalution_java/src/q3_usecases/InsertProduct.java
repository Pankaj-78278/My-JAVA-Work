package q3_usecases;

import java.util.Scanner;

import q3_DAO.ProductDao;
import q3_DAO.productDaoImpl;
import q3_Exception.ProductException;
import q3_Model.Product;

public class InsertProduct {
	//create table Product
//	(
//	productId int primary key,
//	productName varchar(12) not null,
//	price int,
//	quantity int
//	);
	public static void main(String[] args) throws ProductException {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your ProductId");
		int id=sc.nextInt();
		
		System.out.println("Enter your Product Name");
		String name=sc.next();
		
		System.out.println("Enter your Product price");
		int price=sc.nextInt();
	
		System.out.println("Enter your Product quantity");
		int quantity=sc.nextInt();
		
		ProductDao dao= new productDaoImpl();
		
		Product product=new Product(id,name,price,quantity);
		
		String  result= dao.addProduct(product);
		
		System.out.println(result);
		
	}
}
