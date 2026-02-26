package arrayListTask1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTask1 {
	public static void main(String[] args) {
		ArrayList<Integer> datas = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			datas.add((i + 1) * 10);
		}

		Collections.shuffle(datas);

		if (datas.contains(60)) {
			datas.add(datas.indexOf(50) + 1, 500);
		}

		if (datas.contains(80)) {
			datas.remove(datas.indexOf(80));
		}

		try {
			if (datas.contains(60)) {
//				datas.remove(Integer.valueOf(60));
				datas.remove(60);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(datas);

	}
}
