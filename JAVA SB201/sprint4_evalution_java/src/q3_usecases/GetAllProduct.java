package q3_usecases;

import java.util.List;
import java.util.Scanner;

import q3_DAO.ProductDao;
import q3_DAO.productDaoImpl;
import q3_Exception.ProductException;
import q3_Model.Product;

public class GetAllProduct {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s =sc.next();
		
//		ProductDao dao=  new productDaoImpl();
//		try {
//		 	List<Product> products =dao.getAllProducts();
//		 	products.forEach(s -> System.out.println(s));
//			 	
//		 	
//		} catch (ProductException e) {
//			System.out.println(e.getMessage());
//		}
	}
	
}
