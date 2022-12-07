package q3_DAO;

import java.util.List;

import q3_Exception.ProductException;
import q3_Model.Product;

public interface ProductDao {

	public String addProduct(Product product) throws ProductException;
	
	public List<Product> getAllProducts() throws ProductException;

	public List<Product> getAllProductQuantityLessThan(int quantity)throws
	ProductException;
	
	public String addProductQuantity(int productId, int Quantity)throws
	ProductException;
	
//	Public String deleteProductByProductName(String pname)throws
//	ProductException;
	
	public Product getProductByProductName(String pname)throws
	ProductException;
	

}
