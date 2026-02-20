package inheritanceTask;

// Phone
// 이름, 브랜드, 가격
// 문자발신 sms()
// 전화 call()

class Phone {
	private String model;
	private String brand;
	private int price;

	public Phone() {;}

	public Phone(String model, String brand, int price) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}

class Phone2G extends Phone{
	public Phone2G() {;}
	
	public Phone2G(String model, String brand, int price) {
		super(model, brand, price);
	}

	public void internet(){
		System.out.println("Nate");
	}
	
}

class Phone3G extends Phone2G{
	public Phone3G() {;}

	public Phone3G(String model, String brand, int price) {
		super(model, brand, price);
	}
	
	@Override
	public void internet(){
		System.out.println("카카오톡 실행");
	}
	
	public void videoPhone() {
		System.out.println("요금 개많이 나옴");
	}
}

// Phone2G
// 인터넷

// Phone3G
// 인터넷, 영상통화

// Phone2G, Phone3G 객체화
// Phone2G: 인터넷 메서드를 호출
// Phone3G: 영상통화 메서드 호출

public class InheritanceTask3 {
	public static void main(String[] args) {
		Phone2G phone2G = new Phone2G();
		phone2G.setBrand("삼성");
		phone2G.setModel("애니콜");
		phone2G.setPrice(500000);
		
		System.out.println(phone2G.getBrand());
		phone2G.internet();
		
		
		Phone3G phone3G = new Phone3G();
		phone3G.setBrand("애플");
		phone3G.setModel("아이폰");
		phone3G.setPrice(700000);

		
		System.out.println(phone3G.getModel());
		phone3G.internet();
		phone3G.videoPhone();
	}
	
	
}
