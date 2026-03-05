package fileTask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileTaskEx {
   public static void main(String[] args) throws IOException {
      String[] foods = {"잔치국수", "피자", "한우", "스테이크"};
//      음식 4가지를 메모장으로 만들고 콘솔에 출력
      
      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("./food.txt", true));
      
      Arrays.asList(foods).stream().forEach(food -> {
////         bufferedWriter.newLine() 비추 
         try {
            bufferedWriter.write(food + "\n");
         } catch (IOException e) {
            e.printStackTrace();
         }
      });
      
      bufferedWriter.close();
      System.out.println("food.txt 생성 완료.");
      
      BufferedReader bufferedReader = new BufferedReader(new FileReader("food.txt"));
      bufferedReader.lines().forEach(System.out::println);
      
      
   }
}



