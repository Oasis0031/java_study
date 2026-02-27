package hashSet.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest2 {
	public static void main(String[] args) {
		HashSet<String> mbtiType = new HashSet<String>();
		mbtiType.add("ISTJ");
		mbtiType.add("ISFJ");
		mbtiType.add("INFJ");
		mbtiType.add("INTJ");
		mbtiType.add("ISTP");
		mbtiType.add("ISFP");
		mbtiType.add("INFP");
		mbtiType.add("INTP");
		mbtiType.add("ESTP");
		mbtiType.add("ESFP");
		mbtiType.add("ENFP");
		mbtiType.add("ENTP");
		mbtiType.add("ESTJ");
		mbtiType.add("ESFJ");
		mbtiType.add("ENFJ");
		mbtiType.add("ENTJ");
		
		System.out.println(mbtiType);
		
//		문법 혹은 iterator의 도움을 받아 처리한다.
//		for(String mbti:mbtiType) {
//			System.out.println(mbti);
//		}
		
		//순서가 없을 때 순서를 붙여주는 인터페이스
		Iterator<String> iter = mbtiType.iterator();
		while(iter.hasNext()) {
			String mbti = iter.next();
			if(mbti.equals("ESTJ")) {
			System.out.println(iter.next());
		}
	}
		
//      중복된 데이터 삭제 
      ArrayList<Integer> datas =new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 10, 20, 30, 40));
      datas = new ArrayList<Integer>(new HashSet<Integer>(datas));
      System.out.println(datas);
		
}
}
