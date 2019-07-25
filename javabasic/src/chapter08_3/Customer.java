package chapter08_3;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint; // int bonusPoint;
	double bonusRatio;
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerGrade = "SILVER";
		this.bonusRatio = 0.01;
		System.out.println("Customer(int, String) 생성자 호출");
	}//end customer
	
	public int calcPrice(int price) {
		bonusPoint += price *  bonusRatio;
		return price;
	}//end calcrprice
	
	public String showCustomerInfo() {
		return customerName+"님의 등급은"+customerGrade
				+"이며, 보너스 포인트는"+bonusPoint+"입니다.";
	}//end show

	/**
	 * @return the customerID
	 */
	public int getCustomerID() {
		return customerID;
	}

	/**
	 * @param customerID the customerID to set
	 */
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the customerGrade
	 */
	public String getCustomerGrade() {
		return customerGrade;
	}

	/**
	 * @param customerGrade the customerGrade to set
	 */
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	/**
	 * @return the bonusPoint
	 */
	public int getBonusPoint() {
		return bonusPoint;
	}

	/**
	 * @param bonusPoint the bonusPoint to set
	 */
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	

}
