package object;

public class ObjectTest {

	//1. private
	private String name;
	
	//2. 기본 생성자
	public ObjectTest() {;}

	//3. 초기화 생성자
	public ObjectTest(String name) {
		super();
		this.name = name;
	}

	//4. getter
	public String getName() {
		return name;
	}

	//5. setter
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		ObjectTest ot = new ObjectTest();
		System.out.println(ot);
		System.out.println(ot.toString());
		
	}

	//6. toString 해당 객체의 필드를 확인하기 위한 용도
	@Override
	public String toString() {
		return "ObjectTest [name=" + name + "]";
	}
	
	
	
	//
	//
}
