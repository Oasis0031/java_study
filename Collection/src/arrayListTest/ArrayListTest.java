package arrayListTest;

import java.util.ArrayList;

public class ArrayListTest<T> {

	// <?>: 제네릭 - 포괄적인 즉 이름이 없는 이라는 뜻
	// 지금 당장 무슨 타입일지 알 수 없을때 사용한다.
	// 또한 사용자가 어떤 타입의 데이터를 넣을 지 모르기 떄문에
	// 객체화를 시킬 때 정해준다.
	
	T data;
	
	public static void main(String[] args) {
		ArrayList<String> datas = new ArrayList<String>();
		datas.add("이규학");
		datas.add("이규학");
		datas.add("이규학");
		datas.add("이규학");
		datas.add("이규학");

		System.out.println(datas);
		System.out.println(datas.get(3));

		System.out.println(datas.set(3, "이재명"));
		System.out.println(datas);
		datas.remove(4);

		
	}
	
}
