package chapter08_3;

public class OverridengTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.setbonusPoint(10000);
		
		VIPcustomer customerKim = new VIPcustomer(10020, "김유신", 12345);
		customerKim.setbonusPoint(10000);
		
		int price = 10000;
		System.out.println(customerLee.getCustomerName()+"님이 지불하실 금액은 "
		+customerLee.calcPrice(price)+"원입니다.");
		
		System.out.println(customerKim.getCustomerName()+"님이 지불하실 금액은 "
		+customerLee.calcPrice(price)+"원입니다.");
		
		System.out.println(customerKim.bonusPoint);
		System.out.println(customerLee.bonusPoint);
	}

}
