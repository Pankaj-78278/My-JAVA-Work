package q3_DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dbUtility.Utility;

import q3_Exception.ProductException;
import q3_Model.Product;

public class productDaoImpl implements ProductDao {

	@Override
	public String addProduct(Product product) throws ProductException {
	
			String result="Not inserted";
			
			try(Connection conn=Utility.provide_connection()) {

				PreparedStatement ps=conn.prepareStatement("insert into Product (productId,productName,price,quantity) values(?,?,?,?)");
				
				ps.setInt(1, product.getProductId());
				ps.setString(2, product.getName());
				ps.setInt(3, product.getPrice());
				ps.setInt(4, product.getQuantity());

				
				
				int x=ps.executeUpdate();			
				
				if(x>0) {
					result="Product register succesful";
				}
				
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			
			}
			

			return result;
		}

	@Override
	public List<Product> getAllProducts() throws ProductException { 
		List<Product> products = new ArrayList<>();
		try(Connection conn= Utility.provide_connection()) {
			
			PreparedStatement ps= conn.prepareStatement("select * from product");
					
			ResultSet rs= ps.executeQuery();
					
			while(rs.next()) {
							
				int r= rs.getInt("productId");
				String n= rs.getString("productName");
				int m= rs.getInt("price");
				int q= rs.getInt("quantity");
				
				Product product = new Product(r, n, m,q);
				
				products.add(product);
				
			
			}
		
		} catch (SQLException e) {
			//e.printStackTrace();
			//exception rethrowing
			throw new ProductException(e.getMessage());
		}

		if(products.size() == 0)
			throw new ProductException("No Student found...");
		
		return  products;

		
	}

	@Override
	public List<Product> getAllProductQuantityLessThan(int quantity) throws ProductException {
		List<Product> products = new ArrayList<>();
		try(Connection conn= Utility.provide_connection()) {
			
			PreparedStatement ps= conn.prepareStatement("select * from product where quantity<30");
					
			ResultSet rs= ps.executeQuery();
					
			while(rs.next()) {
							
				int r= rs.getInt("productId");
				String n= rs.getString("productName");
				int m= rs.getInt("price");
				int q= rs.getInt("quantity");
				
				Product product = new Product(r, n, m,q);
				
				products.add(product);
				
			
			}
		
		} catch (SQLException e) {
			//e.printStackTrace();
			//exception rethrowing
			throw new ProductException(e.getMessage());
		}

		if(products.size() == 0)
			throw new ProductException("No Student found...");
		
		return  products;

	}

	@Override
	public String addProductQuantity(int productId, int Quantity) throws ProductException {
		String result="Not inserted";
		
		try(Connection conn=Utility.provide_connection()) {

			PreparedStatement ps=conn.prepareStatement("insert productid,quantity from product");
			
			ps.setInt(1, productId);
			ps.setInt(2, Quantity);
		
			
			int x=ps.executeUpdate();			
			
			if(x>0) {
				result="Product register succesful";
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		
		}
		

		return result;
	}

	@Override
	public Product getProductByProductName(String pname) throws ProductException {
	
		try(Connection conn=Utility.provide_connection()) {

			PreparedStatement ps=conn.prepareStatement("insert productid,quantity from product");
			
			ps.setInt(1, productId);
			ps.setInt(2, Quantity);
		
			
			int x=ps.executeUpdate();			
			
			if(x>0) {
				result="Product register succesful";
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		
		}
		

		return result;
	}
	
	
	
	
}
