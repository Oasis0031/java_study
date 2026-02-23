package classTask4;

public class Shopper extends Market {
	private String name;
	private String phoneNumber;
	private int money;
	private double point;
	private int coupon;
	private double discount;
	
	
	public Shopper() {;}
	
	public Shopper(String name, String phoneNumber, int money, int point, int coupon) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.money = money;
		this.point = point;
		this.coupon = coupon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		this.point = point;
	}

	public int getCoupon() {
		return coupon;
	}

	public void setCoupon(int coupon) {
		this.coupon = coupon;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public void discount() {
		System.out.println("할인률은 " + this.discount + "입니다.");
	}

	public void freeCoupon() {
		if(getCoupon() == 10) {
			
	}

	
}

}