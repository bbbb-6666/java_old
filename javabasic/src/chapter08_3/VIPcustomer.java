package chapter08_3;

public class VIPcustomer extends Customer {
	
	private int agentID;
	double saleRatio;
	
	public VIPcustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio=0.1;
		System.out.print("VIPCustomer() 생성자 호출");
	}//end 생성자
	
	
	public int getAgentID() {
		return agentID;
	}//end getagentid
	
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
		}
		
		

	
	public String showCustomerInfo() {
		return customerName+"님의 등급은"+customerGrade
				+"이며, 보너스 포인트는"+this.getBonusPoint()+"입니다.";
	}//end showinfo

}
