package ch01_extends;

public class VIPCustomer extends Customer{


	private int agentID;
	double salesRatio;
	
	/**
	 * 생성자 호출 시 상위클래스의 디폴트생성자 자동 호출(super();)
	 * 상위클래스에 디폴트 생성자가 없을 경우 에러발생.
	 * 디폴트 없을 경우 명시적으로 상위클래스 생성자를 적어줘야함.
	 * */
	
	/*public VIPCustomer() {
		customerGrade = "VIP";    //오류 발생
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer() 생성자 호출");
	}
	*/
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer(int, String) 생성자 호출");
	}
	public int getAgentID() {
		return agentID;
	}
}