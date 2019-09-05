 package dto;

import java.io.Serializable;
import dao.ProductRepository;
public class Product implements Serializable{
	

	private static final long serialVersionUID = -4274700572038677000L;
	
	private String c_id;
	private String c_name;
	private Integer c_price;
	private String c_description;
	private String c_manufacturer;
	private String c_category;
	private long c_unitsinstock;
	private String c_filename;
	private int quantity;
	
	public Product() {
		super();
	}
	
	public Product(String c_id, String c_name, Integer c_price) {
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_price = c_price;
	}
	
	public String getC_id() {
		return c_id;
	}

	public void setC_id(String c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public Integer getC_price() {
		return c_price;
	}

	public void setC_price(Integer c_price) {
		this.c_price = c_price;
	}

	public String getC_description() {
		return c_description;
	}

	public void setC_description(String c_description) {
		this.c_description = c_description;
	}

	public String getC_manufacturer() {
		return c_manufacturer;
	}

	public void setC_manufacturer(String c_manufacturer) {
		this.c_manufacturer = c_manufacturer;
	}

	public String getC_category() {
		return c_category;
	}

	public void setC_category(String c_category) {
		this.c_category = c_category;
	}

	public long getC_unitsinstock() {
		return c_unitsinstock;
	}

	public void setC_unitsinstock(long c_unitsinstock) {
		this.c_unitsinstock = c_unitsinstock;
	}

	public String getC_filename() {
		return c_filename;
	}

	public void setC_filename(String c_filename) {
		this.c_filename = c_filename;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
}
