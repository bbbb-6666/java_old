package dao;

import java.sql.*;
import java.util.ArrayList;

import javax.servlet.*;
import javax.servlet.http.*;
/*import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;*/

import dto.Product;

public class ProductRepository {
   
	// cartlist를 만들기 위한 코드만 남겨두기
   private ArrayList<Product> listOfProducts = new ArrayList<Product>();
   private static ProductRepository instance = new ProductRepository();

   public static ProductRepository getInstance(){
      return instance;
   } 

   public ProductRepository() {
	   
	   Connection conn = null;
	   String url = "jdbc:oracle:thin:@localhost:1521:xe";
	      
	   try {
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         conn = DriverManager.getConnection(url, "madang", "madang");
	      } catch (ClassNotFoundException e) {
	            System.out.println("드라이버 로드 실패");
	            e.printStackTrace();
	      } catch (SQLException e) {
	          System.out.println("DB연결 문제");
	          e.printStackTrace();
	      }
	   
	   // sql구문 실행
	      Statement stmt = null;
	      ResultSet rs = null;
	      String sql = "select * from cosmetic";
	      
	      try {
	         stmt = conn.createStatement();
	         rs = stmt.executeQuery(sql);
	         
	         while (rs.next()) {
					
	        	 	String c_id = rs.getString("c_id");
					String c_name = rs.getString("c_name");
					int c_price = rs.getInt("c_price");
					String c_description = rs.getString("c_description");
					String c_category = rs.getString("c_category");
					String c_manufacturer = rs.getString("c_manufacturer");
					long c_unitsinstock = rs.getLong("c_unitsinstock");
					String c_filename = rs.getString("c_filename");

					
					Product cosmetic = new Product();
					cosmetic.setC_id(c_id);
					cosmetic.setC_name(c_name);
					cosmetic.setC_price(c_price);
					cosmetic.setC_description(c_description);
					cosmetic.setC_category(c_category);
					cosmetic.setC_manufacturer(c_manufacturer);
					cosmetic.setC_unitsinstock(c_unitsinstock);
					cosmetic.setC_filename(c_filename);

					
					listOfProducts.add(cosmetic);
				} // end while
	         
	      } catch (SQLException e) {
	          e.printStackTrace();
	       }
	       
	    }


   public ArrayList<Product> getAllProducts() {
      return listOfProducts;
   }
     
   public Product getProductById(String c_id) {
      Product productById = null;

      for (int i = 0; i < listOfProducts.size(); i++) {
         Product product = listOfProducts.get(i);
         if (product != null && product.getC_id() != null && product.getC_id().equals(c_id)) {
            productById = product;
            break;
         }
      }
      return productById;
   }
   
   public void addProduct(Product product) {
      listOfProducts.add(product);
   }
}