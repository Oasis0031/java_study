package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException {

//		new FileWriter(경로(+파일), 이어쓰기 여부)
		BufferedWriter bufferedWriter = null;
		try {
			bufferedWriter = new BufferedWriter(new FileWriter("./test.txt", true));
			bufferedWriter.write("난 세상을 모르는 바보\n");
			bufferedWriter.write("그런 눈빛으로 날 보지 말아요\n");
			bufferedWriter.write("처음부터 잘 알 수는 없었지\n");
			bufferedWriter.write("있는 그대로의 난 통하지 않아\n");
			bufferedWriter.flush();
			System.out.println("파일 생성");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				bufferedWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	
//		파일 읽기
		
		BufferedReader bufferedReader = null;
		
		try {
			//파일이 없을 수도 있으니 try catch 강제
			bufferedReader = new BufferedReader(new FileReader("./test.txt"));
			String line = null;
			
//			while((line = bufferedReader.readLine()) != null) {
//				System.out.println(line);
//			}
			
			bufferedReader.lines().forEach(System.out::println);
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
			e.printStackTrace();
		} finally {
		 try {
		 	if(bufferedReader != null) {
			 bufferedReader.close();
		 }
			
		} catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		}
		
	}
}
