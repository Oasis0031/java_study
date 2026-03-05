package fileTask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileTask {
   public static void main(String[] args) throws IOException {
      String[] foods = {"잔치국수", "피자", "한우", "스테이크"};
//      음식 4가지를 메모장으로 만들고 콘솔에 출력
      
      
   //파일 생성
      BufferedWriter bufferedWriter = null;
      try {
    	  bufferedWriter = new BufferedWriter(new FileWriter("./menus.txt", true));
//    	  Arrays.asList(foods).stream().forEach(food -> {
////    		  bufferedWriter.newLine() 비추
//    		  try {
//				bufferedWriter.write(food + "\n");
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//    	  });
    	  for(int i = 0; i < foods.length; i++) {
    		  bufferedWriter.write(foods[i] + "\n");
    	  }
    	  bufferedWriter.flush();
    	  System.out.println("파일 생성 됨.");
      } catch (IOException e) {
    	  e.printStackTrace();
      } finally {
    	  try {
    		  bufferedWriter.close();
    	  } catch (IOException e) {
    		  e.printStackTrace();
    	  }
      }
   
    //파일 읽기

      BufferedReader bufferedReader = null;
      
      try {
    	  bufferedReader = new BufferedReader(new FileReader("./menus.txt"));
    	  String line = null;
    	  
    	  while((line = bufferedReader.readLine()) != null) {
    		  System.out.println(line);
    	  }
    	  
//    	  bufferedReader.lines().forEach(System.out::println);
	} catch (FileNotFoundException e) {
		System.out.println("파일이 없습니다.");
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		try	{
			if(bufferedReader != null) {
				bufferedReader.close();
			}
		}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
      
   }

