package hashMap.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, Object> userMap = new HashMap<>();
		userMap.put("name", "홍길동");
		userMap.put("age", "20");
		userMap.put("address", "서울시 강남구");
		userMap.put("name", "고길동");
		System.out.println(userMap);

		System.out.println(userMap.get("name"));

		System.out.println(userMap.size());

		Set<String> keys = userMap.keySet();
		Iterator<Entry<String, Object>> userIter = userMap.entrySet().iterator();

		while (userIter.hasNext()) {
			Entry<String, Object> userData = userIter.next();
			System.out.println(userData);

			if (userData.getKey().equals("name")) {
				System.out.println(userData.getValue());
			}
		}

	}
}
